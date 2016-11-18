package com.psr.git.base.api.logs.appender;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Iterator;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.jdbc.JDBCAppender;
import org.apache.log4j.spi.ErrorCode;
import org.apache.log4j.spi.LoggingEvent;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.psr.git.base.api.logs.bean.Logbean;
import com.psr.git.base.api.logs.configure.LoadClassField;
import com.psr.git.base.api.utils.DateUtil;

public class JDBCPoolAppender extends JDBCAppender{

	private static ComboPooledDataSource cpds = new ComboPooledDataSource();
	
	private Logbean logbean;

	@Override
	protected void execute(String sql) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		// sql = sql.toLowerCase();
		if(sql.indexOf("INSERT INTO") == -1){
			return;
		}
		try {
			sql = LoadClassField.getreplaceField(sql, logbean);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
		try {
			con = getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw e;
		}finally {
			if(stmt != null){
				stmt.close();
			}
			closeConnection(con);
		}
	}
	
	@Override
	protected void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				con = null;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void flushBuffer() {
		// String s=this.getSql();
		removes.ensureCapacity(buffer.size());
		for (Iterator<?> i = buffer.iterator(); i.hasNext();)
			try {
				LoggingEvent logEvent = (LoggingEvent) i.next();
				String sql = getLogStatement(logEvent);
				if (logEvent.getMessage() instanceof Logbean) {
					this.setLogbean((Logbean) logEvent.getMessage());
					this.execute(sql);
					removes.add(logEvent);
				}
			} catch (SQLException e) {
				super.errorHandler.error("Failed to excute sql", e, ErrorCode.FLUSH_FAILURE);
			}

		buffer.removeAll(removes);
		buffer.clear();
		removes.clear();
	}
	
	@SuppressWarnings("deprecation")
	public String getLogStatement(LoggingEvent event) {
		String sql = this.getSql();
		String sqllog4jreplace = "";
		if (!"".equals(sql)) {
			sqllog4jreplace = sql.replaceAll("@LOGLEVEL@", "'" + event.level.toString() + "'");
			sqllog4jreplace = sqllog4jreplace.replaceAll("@CLASSNAME@", "'" + event.categoryName + "'");
		}
		sqllog4jreplace = sqllog4jreplace.replaceAll("@CREATETIME@", "'" + DateUtil.date2String(new Date()) + "'");
		return sqllog4jreplace;
	}

	@Override
	protected Connection getConnection() throws SQLException {
		return cpds.getConnection();
	}

	public void setSql(String s) {
		if (null == s || "".equals(s)) {
			return;
		}
		sqlStatement = s;
		if (getLayout() == null) {
			this.setLayout(new PatternLayout(s));
		} else {
			((PatternLayout) getLayout()).setConversionPattern(s);
		}
	}

	/**
	 * @return the logbean
	 */
	public Logbean getLogbean() {
		return logbean;
	}

	/**
	 * @param logbean the logbean to set
	 */
	public void setLogbean(Logbean logbean) {
		this.logbean = logbean;
	}
	
}
