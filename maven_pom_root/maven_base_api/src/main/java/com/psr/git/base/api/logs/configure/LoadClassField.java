package com.psr.git.base.api.logs.configure;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.psr.git.base.api.logs.bean.Logbean;

public class LoadClassField {

	protected static String classurl;
	private static int guidLoop = 0;
	
	private static String[] getClassField(String classurl){
		String[] classField = null;
		Class<?> cls = null;
		try {
			cls = Class.forName(classurl);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Field fieldlist[] = cls.getDeclaredFields();
		classField = new String[fieldlist.length];
		for(int i = 0; i < fieldlist.length; i++){
			classField[i] = fieldlist[i].getName();
		}
		return classField;
	}
	
	public static String getreplaceField(String sql, Logbean logbean)
			throws Exception {
		String fields[] = LoadClassField.getClassField(classurl);
		List<String> sqlvalues = new ArrayList<String>();
		for (int i = 0; i < fields.length; i++) {
			if (sql.indexOf("@" + fields[i].toUpperCase() + "@") != -1) {
				sqlvalues.add(fields[i]);
			}
		}
		for (int i = 0; i < sqlvalues.size(); i++) {
			if (("BK21".equals(sqlvalues.get(i).toUpperCase())
					|| "BK22".equals(sqlvalues.get(i).toUpperCase())
					|| "BK23".equals(sqlvalues.get(i).toUpperCase())
					|| "BK24".equals(sqlvalues.get(i).toUpperCase())
					|| "BK25".equals(sqlvalues.get(i).toUpperCase())
					|| "BK26".equals(sqlvalues.get(i).toUpperCase())
					|| "BK27".equals(sqlvalues.get(i).toUpperCase())
					|| "BK28".equals(sqlvalues.get(i).toUpperCase())
					|| "BK29".equals(sqlvalues.get(i).toUpperCase()) || "BK30"
						.equals(sqlvalues.get(i).toUpperCase()))
					&& (logbean.getValue(sqlvalues.get(i).toLowerCase()) == null || logbean
							.getValue(sqlvalues.get(i).toLowerCase()) == "")) {
				sql = sql.replaceAll(
						"@" + sqlvalues.get(i).toUpperCase() + "@", "NULL");
				continue;

			}
			sql = sql.replaceAll(
					"@" + sqlvalues.get(i).toUpperCase() + "@",
					"'"
							+ java.util.regex.Matcher
									.quoteReplacement(LoadClassField
											.getisNullString(logbean
													.getValue(sqlvalues.get(i)
															.toLowerCase())))
							+ "'");
		}
		return sql;
	}

	private static String getisNullString(String value) {
		if (null == value) {
			return "";
		} else {
			return value;
		}
	}
	
	/**
	 * 创建全局唯一号
	 */
	public synchronized static String createGUID() {
		String guid;

		guidLoop++;
		if (guidLoop > 9999) {
			guidLoop = 0;
		}

		guid = String.valueOf(System.currentTimeMillis())
				+ (new java.text.DecimalFormat("0000").format(guidLoop));

		return guid;
	}
	
}
