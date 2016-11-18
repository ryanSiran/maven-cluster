package com.psr.git.base.api.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * <B> Function : </B> DateUtil <br>
 * <B> Description : </B> 日期工具类 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月18日 下午7:33:23 <br>
 * @version v1.0
 *
 */
public class DateUtil {

	/**
	 * 日期转化为Unix时间
	 * 
	 * @param date
	 *            转化的日期
	 * @return
	 */
	public static long date2Unixtimestamp(Date date) {
		return date.getTime();
	}

	/**
	 * Unix时间戳转化为字符
	 * 
	 * @param epoch
	 *            - 转化的日期戳
	 * @param format
	 *            -转化的格式，默认:yyyy/MM/dd
	 * @return
	 */
	public static String unixtimestamp2String(long epoch, String format) {
		if (format == null || format.equals(""))
			format = "yyyy/MM/dd";
		String dateStr = new SimpleDateFormat(format).format(new Date(epoch));
		return dateStr;
	}

	/**
	 * unix时间戳转化为日期
	 * 
	 * @param epoch
	 *            - 转化的日期戳
	 * @param format
	 *            - 转化的格式，默认:yyyy/MM/dd
	 * @return
	 */
	public static Date unixtimestamp2Date(long epoch, String format) {
		if (format == null || format.equals(""))
			format = "yyyy/MM/dd";
		String dateStr = new SimpleDateFormat(format).format(new Date(epoch));
		return string2Date(dateStr, format);
	}

	/**
	 * 获取当前日期的前几天或后几天日期
	 * 
	 * @param monthid
	 * @return date
	 */
	public static String getTheSpecifiedDate(int days, String format) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (format != null && !format.equals("")) {
			df = new SimpleDateFormat(format);
		}
		Calendar C = Calendar.getInstance();// 得到当前时间
		Date dNow = new Date(); // 当前时间
		C.setTime(dNow);// 把当前时间赋给日历
		C.add(Calendar.DAY_OF_MONTH, days); // 设置为前一
		return df.format(C.getTime());
	}

	/**
	 * 字符串转化为日期
	 * 
	 * @param str
	 *            - 转化的日期格
	 * @param format
	 *            - 转化的格式，默认:yyyy/MM/dd
	 * @return
	 */
	public static Date string2Date(String str, String format) {
		if (format == null || format.equals(""))
			format = "yyyy/MM/dd";
		try {
			DateFormat df = new SimpleDateFormat(format);
			return df.parse(str);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 字符串转化为Unix时间
	 * 
	 * @param str
	 *            -转化的日期字符串
	 * @param format
	 *            -转化的格式，默认:yyyy/MM/dd
	 * @return
	 */
	public static long string2Unixtimestamp(String str, String format) {
		if (format == null || format.equals(""))
			format = "yyyy/MM/dd";
		return date2Unixtimestamp(string2Date(str, format));
	}

	/**
	 * 将时间转换成String
	 * 
	 * @param date
	 *            - 转化的日期对
	 * @param format
	 *            - 转化的格式，默认:yyyy/MM/dd
	 * @return
	 */
	public static String date2String(Date date) {
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return df.format(date);
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * 将时间转换成String
	 * 
	 * @param date
	 *            - 转化的日期字符串
	 * @param format
	 *            - 转化的格式，默认:yyyy/MM/dd
	 * @return
	 */
	public static String date2String(String date, String format) {
		if (format == null || format.equals(""))
			format = "yyyy/MM/dd";
		try {
			long l = Long.parseLong(date);
			DateFormat df = new SimpleDateFormat(format);
			return df.format(new Date(l));
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * 日期对象转化为字符串
	 * 
	 * @param date
	 *            - 转化的日期对
	 * @param format
	 *            - 转化的格式，默认:yyyy/MM/dd
	 * @return
	 */
	public static String dateToString(Date date, String format) {
		if (format == null || format.equals(""))
			format = "yyyy/MM/dd";
		try {
			if (date == null)
				return "";
			DateFormat df = new SimpleDateFormat(format);
			return df.format(date);
		} catch (Exception e) {
			return null;
		}

	}

	/**
	 * 将yyyy-MM-dd hh:mm:ss.ms化为标准的yyyy-MM-dd hh:mm:ss格式，即去除日期的毫秒位
	 * 
	 * @param date
	 * @return
	 */
	public static String date2Standard(String date) {
		String standard = date.substring(0, 19);
		return standard;
	}

	/**
	 * 月转换成YYYY-MM
	 * 
	 * @param monthid
	 * @return
	 */
	public static String monthID2Str(int monthid) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {

			Date date = sdf.parse("2003-12-01");

			C.setTime(date);

			C.add(C.MONTH, monthid);

			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 月转换成YYYY-MM
	 * 
	 * @param monthid
	 * @return
	 */
	public static String monthID2Str(int monthid, String mark) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		SimpleDateFormat sdf2 = new SimpleDateFormat(mark);
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {

			Date date = sdf.parse("2003-12-01");

			C.setTime(date);

			C.add(C.MONTH, monthid);

			return sdf2.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 获取当周开始日期,周一
	 * 
	 * @param weekid
	 * @author will
	 * @return
	 */
	public static String weekID2BeginDate2(int weekid) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {
			int id = weekid * 7;

			Date date = sdf.parse("2003-12-22");

			C.setTime(date);

			C.add(C.DATE, id);

			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 获取当周结束日期。周日为结束时间
	 * 
	 * @param weekid
	 * @author will
	 * @return
	 */
	public static String weekID2EndDate2(int weekid) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {
			int id = weekid * 7 + 6;

			Date date = sdf.parse("2003-12-22");

			C.setTime(date);

			C.add(C.DATE, id);

			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * ID 转换成日期
	 * 
	 * @param dateid
	 * @return
	 */
	public static String dayID2Date(int dateid, String mark) {
		SimpleDateFormat sdf = new SimpleDateFormat(mark);
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf2.parse("2003-12-31");

			C.setTime(date);

			C.add(C.DATE, dateid);

			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * ID 转换成日期
	 * 
	 * @param dateid
	 * @return
	 */
	public static String hourID2Date(int hourId, String mark) {
		SimpleDateFormat sdf = new SimpleDateFormat(mark);
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf2.parse("2004-01-01");

			C.setTime(date);

			C.add(C.HOUR, hourId);
			C.add(C.DAY_OF_YEAR, -1);
			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * ID 转换成日期
	 * 
	 * @param dateid
	 * @return
	 */
	public static String dayID2Date(int dateid) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {

			Date date = sdf.parse("2003-12-31");

			C.setTime(date);

			C.add(C.DATE, dateid);

			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * dayid 转化为weekid
	 * 
	 * @param dayid
	 * @author will
	 * @return weekid
	 */
	public static int dayID2WeekID2(int dayid) {
		return date2WeekID2(dayID2Date(dayid, "yyyy-MM-dd"));
	}

	/**
	 * 日期转换为周id
	 * 
	 * @param date
	 * @author will
	 * @return
	 */
	public static int date2WeekID2(String date) {
		return (getBetweenDayNumber("2003-12-22", date) / 7);
	}

	/**
	 * 日期转换为月id
	 * 
	 * @param date
	 * @return
	 */
	public static int date2MonthID(String date, String mark) {
		SimpleDateFormat sdf = new SimpleDateFormat(mark);
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {
			// System.out.println(date);
			Date date1 = sdf.parse(date);
			C.setTime(date1);
			// System.out.println(date1.toLocaleString()+"->"+C.YEAR+"->"+C.MONTH);
			int monthid = (C.get(C.YEAR) - 2004) * 12 + C.get(C.MONTH) + 1;
			return monthid;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * ID 转换成日期
	 * 
	 * @param dateid
	 * @return
	 */
	public static int date2HourID(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date;
		try {
			date = sdf.parse(dateStr);
			Calendar C = Calendar.getInstance();// 得到当前时间

			C.setTime(date);
			//
			// int hourId=(C.get(C.YEAR) - 2004) * 8760 + C.get(C.MONTH)*720 +
			// C.get(C.DAY_OF_MONTH-1)*24+C.get(C.HOUR_OF_DAY);

			return (getBetweenDayNumber("2003-12-31", dateStr) - 1 + 1) * 24 + C.get(C.HOUR_OF_DAY);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static int date2LocalHourID(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date;
		try {
			date = sdf.parse(dateStr);
			Calendar C = Calendar.getInstance();// 得到当前时间

			C.setTime(date);
			//
			// int hourId=(C.get(C.YEAR) - 2004) * 8760 + C.get(C.MONTH)*720 +
			// C.get(C.DAY_OF_MONTH-1)*24+C.get(C.HOUR_OF_DAY);

			return C.get(C.HOUR_OF_DAY);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 根据两个日期，取得相隔的天數
	 * 
	 * @param dateA
	 * @param dateB
	 * @return
	 */
	public static int getBetweenDayNumber(String dateA, String dateB) {
		long dayNumber = 0;

		long DAY = 24L * 60L * 60L * 1000L;

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (dateB.length() < 8)
			dateB += "-30";
		try {

			java.util.Date d1 = df.parse(dateA);
			java.util.Date d2 = df.parse(dateB);
			dayNumber = (d2.getTime() - d1.getTime()) / DAY;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return (int) dayNumber;
	}

	public static int getBetweenHourNumber(String dateA, String dateB) {
		long dayNumber = 0;
		long HOUR = 60L * 60L * 1000L;

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH");
		if (dateB.length() < 8)
			dateB += "-30";
		try {

			java.util.Date d1 = df.parse(dateA);
			java.util.Date d2 = df.parse(dateB);
			dayNumber = (d2.getTime() - d1.getTime()) / HOUR;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (int) dayNumber;
	}

	/**
	 * 日期转换成，天ID
	 * 
	 * @param date
	 * @return
	 */
	public static int date2DayID(String date) {
		return getBetweenDayNumber("2003-12-31", date);
	}

	public static String weekID2Str3(int weekid) {

		String begin = weekID2BeginDate2(weekid);
		String end = weekID2EndDate2(weekid);
		begin = begin.replaceAll("-", ".");
		end = end.replaceAll("-", ".");
		begin = begin + "~" + end;
		return begin;
	}

	/**
	 * 月转换成开始日期
	 * 
	 * @param monthid
	 * @return
	 */
	public static String monthID2BeginDate(int monthid) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {

			Date date = sdf.parse("2003-12-01");

			C.setTime(date);

			C.add(C.MONTH, monthid);

			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 月转换成结束日期
	 * 
	 * @param monthid
	 * @return
	 */
	public static String monthID2EndDate(int monthid) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar C = Calendar.getInstance();// 得到当前时间
		try {

			Date date = sdf.parse("2003-12-01");

			C.setTime(date);

			C.add(C.MONTH, monthid + 1);
			C.add(C.DATE, -1);

			return sdf.format(C.getTime());

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 比较日期的大小
	 * 
	 * */
	public static long dateCompare(Date date1, Date date2) {
		// Calendar c1 = Calendar.getInstance();
		// Calendar c2 = Calendar.getInstance();
		// c1.setTime(date1);
		// c2.setTime(date2);
		return ((date1.getTime() / 1000 / 60 / 60 / 24 - date2.getTime() / 1000 / 60 / 60 / 24) + 1);
	}

	public static int dayId2Weekday(int dayId) {
		return (dayId + 2) % 7 + 1;
	}

	public static String getYearMonth(String dateStr) {

		String[] arrays = dateStr.split("-");
		String year = "0000";
		String month = "00";
		if (arrays.length >= 2) {
			year = arrays[0];
			month = arrays[1];
		}

		return String.format("%s%02d", year, Integer.parseInt(month));
	}

	public static String getYear(String dateStr) {

		String[] arrays = dateStr.split("-");
		String year = "0000";
		if (arrays.length >= 1) {
			year = arrays[0];
		}

		return String.format("%s", year);
	}

	/**
	 * [hourL,hourR)
	 * 
	 * @param hourL
	 * @param hourR
	 * @param date
	 * @return
	 */
	public static boolean isBetweenHour(int hourL, int hourR, Date date) {
		if (date == null || hourL >= hourR)
			return false;
		int hour = date.getHours();
		if (hour < hourL || hour >= hourR)
			return false;
		return true;
	}

	public static int getBetweenMsNumber(Date dateA, Date dateB) {
		long dayNumber = 0;
		if (dateA == null || dateB == null) {
			return 0;
		}
		try {

			dayNumber = (dateB.getTime() - dateA.getTime());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return (int) dayNumber;
	}
}
