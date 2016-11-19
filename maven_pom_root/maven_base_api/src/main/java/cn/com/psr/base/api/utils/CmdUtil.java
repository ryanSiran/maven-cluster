package cn.com.psr.base.api.utils;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.log4j.Logger;

/**
 * <B> Function : </B> CmdUtil <br>
 * <B> Description : </B> cmd工具类 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月17日 下午2:53:20 <br>
 * @version v1.0
 *
 */
public class CmdUtil {

	private static Logger LOGGER = Logger.getLogger(CmdUtil.class);
	
	/**
	 * 无参构造器
	 */
	private CmdUtil(){
	}
	
	/**
	 * 执行cmd
	 * @param cmd
	 * @return
	 */
	public static Object execute(String cmd){
		try {
			// String[] cmdA = { "/bin/sh", "-c", cmd };
			Process process = Runtime.getRuntime().exec(cmd);
			LineNumberReader br = new LineNumberReader(new InputStreamReader(process.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line;
			while((line = br.readLine()) != null){
				LOGGER.debug("read result line : ----------------> " + line);
				sb.append(line).append("\n");
			}
			return sb.toString();
		} catch (Exception e) {
			LOGGER.error(ExceptionUtils.getFullStackTrace(e));
		}
		return null;
	}
	
}
