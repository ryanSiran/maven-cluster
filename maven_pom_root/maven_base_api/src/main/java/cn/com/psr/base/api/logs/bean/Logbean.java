package cn.com.psr.base.api.logs.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Logbean implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3553761051853304685L;

	private String method;
	
	private String bk1;
	private String bk2;
	private String bk3;
	private String bk4;
	private String bk5;
	private String bk6;
	private String bk7;
	private String bk8;
	private String bk9;
	private String bk10;
	private String bk11;
	private String bk12;
	private String bk13;
	private String bk14;
	private String bk15;
	private String bk16;
	private String bk17;
	private String bk18;
	private String bk19;
	private String bk20;
	private String bk21;
	private String bk22;
	private String bk23;
	private String bk24;
	private String bk25;
	private String bk26;
	private String bk27;
	private String bk28;
	private String bk29;
	private String bk30;
	private String bk31;
	private String bk32;
	private String bk33;
	private String bk34;
	private String bk35;
	private String bk36;
	private String bk37;
	private String bk38;
	private String bk39;
	private String message;

	public String getValue(String filed) {
		// if ("Id".equals(filed)) {
		// return this.getId();
		// }
		// if ("LogLevel".equals(filed)) {
		// return this.getLogLevel();
		// }
		// if ("ClassName".equals(filed)) {
		// return this.getClassName();
		// }
		if ("bk1".equals(filed)) {
			return this.bk1;
		}
		if ("bk2".equals(filed)) {
			return this.bk2;
		}
		if ("bk3".equals(filed)) {
			return this.bk3;
		}
		if ("bk4".equals(filed)) {
			return this.bk4;
		}
		if ("bk5".equals(filed)) {
			return this.bk5;
		}
		if ("bk6".equals(filed)) {
			return this.bk6;
		}
		if ("bk7".equals(filed)) {
			return this.bk7;
		}
		if ("bk8".equals(filed)) {
			return this.bk8;
		}
		if ("bk9".equals(filed)) {
			return this.bk9;
		}
		if ("bk10".equals(filed)) {
			return this.bk10;
		}

		if ("bk11".equals(filed)) {
			return this.bk11 == null ? "0" : this.bk11;
		}

		if ("bk12".equals(filed)) {
			return this.bk12 == null ? "0" : this.bk12;
		}
		if ("bk13".equals(filed)) {
			return this.bk13 == null ? "0" : this.bk13;
		}
		if ("bk14".equals(filed)) {
			return this.bk14 == null ? "0" : this.bk14;
		}
		if ("bk15".equals(filed)) {
			return this.bk15 == null ? "0" : this.bk15;
		}
		if ("bk16".equals(filed)) {
			return this.bk16 == null ? "0" : this.bk16;
		}
		if ("bk17".equals(filed)) {
			return this.bk17 == null ? "0" : this.bk17;
		}
		if ("bk18".equals(filed)) {
			return this.bk18 == null ? "0" : this.bk18;
		}
		if ("bk19".equals(filed)) {
			return this.bk19 == null ? "0" : this.bk19;
		}
		if ("bk20".equals(filed)) {
			return this.bk20 == null ? "0" : this.bk20;
		}

		if ("bk21".equals(filed)) {
			return this.bk21;
		}

		if ("bk22".equals(filed)) {
			return this.bk22;
		}
		if ("bk23".equals(filed)) {
			return this.bk23;
		}
		if ("bk24".equals(filed)) {
			return this.bk24;
		}
		if ("bk25".equals(filed)) {
			return this.bk25;
		}

		if ("bk26".equals(filed)) {
			return this.bk26;
		}

		if ("bk27".equals(filed)) {
			return this.bk27;
		}

		if ("bk28".equals(filed)) {
			return this.bk28;
		}

		if ("bk29".equals(filed)) {
			return this.bk29;
		}

		if ("bk30".equals(filed)) {
			return this.bk30;
		}

		if ("bk31".equals(filed)) {
			return this.bk31 == null ? "0" : this.bk31;
		}

		if ("bk32".equals(filed)) {
			return this.bk32 == null ? "0" : this.bk32;
		}

		if ("bk33".equals(filed)) {
			return this.bk33 == null ? "0" : this.bk33;
		}
		
		if ("bk34".equals(filed)) {
			return this.bk34 == null ? "0" : this.bk34;
		}
		if ("bk35".equals(filed)) {
			return this.bk35 == null ? "0" : this.bk35;
		}
		if ("bk36".equals(filed)) {
			return this.bk36 == null ? "0" : this.bk36;
		}
		if ("bk37".equals(filed)) {
			return this.bk37 == null ? "0" : this.bk37;
		}
		if ("bk38".equals(filed)) {
			return this.bk38 == null ? "0" : this.bk38;
		}
		if ("bk39".equals(filed)) {
			return this.bk39 == null ? "0" : this.bk39;
		}

		if ("message".equals(filed)) {
			return this.message;
		}
		if ("method".equals(filed)) {
			return this.method;
		}

		return filed;
	}

	private String getDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		SimpleDateFormat dataformat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		return dataformat.format(calendar.getTime());
	}

	public String getCreatetime() {
		return this.getDate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(getMessage());
		return result.toString();
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method
	 *            the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @return the bk1
	 */
	public String getBk1() {
		return bk1;
	}

	/**
	 * @param bk1
	 *            the bk1 to set
	 */
	public void setBk1(String bk1) {
		this.bk1 = bk1;
	}

	/**
	 * @return the bk2
	 */
	public String getBk2() {
		return bk2;
	}

	/**
	 * @param bk2
	 *            the bk2 to set
	 */
	public void setBk2(String bk2) {
		this.bk2 = bk2;
	}

	/**
	 * @return the bk3
	 */
	public String getBk3() {
		return bk3;
	}

	/**
	 * @param bk3
	 *            the bk3 to set
	 */
	public void setBk3(String bk3) {
		this.bk3 = bk3;
	}

	/**
	 * @return the bk4
	 */
	public String getBk4() {
		return bk4;
	}

	/**
	 * @param bk4
	 *            the bk4 to set
	 */
	public void setBk4(String bk4) {
		this.bk4 = bk4;
	}

	/**
	 * @return the bk5
	 */
	public String getBk5() {
		return bk5;
	}

	/**
	 * @param bk5
	 *            the bk5 to set
	 */
	public void setBk5(String bk5) {
		this.bk5 = bk5;
	}

	/**
	 * @return the bk6
	 */
	public String getBk6() {
		return bk6;
	}

	/**
	 * @param bk6
	 *            the bk6 to set
	 */
	public void setBk6(String bk6) {
		this.bk6 = bk6;
	}

	/**
	 * @return the bk7
	 */
	public String getBk7() {
		return bk7;
	}

	/**
	 * @param bk7
	 *            the bk7 to set
	 */
	public void setBk7(String bk7) {
		this.bk7 = bk7;
	}

	/**
	 * @return the bk8
	 */
	public String getBk8() {
		return bk8;
	}

	/**
	 * @param bk8
	 *            the bk8 to set
	 */
	public void setBk8(String bk8) {
		this.bk8 = bk8;
	}

	/**
	 * @return the bk9
	 */
	public String getBk9() {
		return bk9;
	}

	/**
	 * @param bk9
	 *            the bk9 to set
	 */
	public void setBk9(String bk9) {
		this.bk9 = bk9;
	}

	/**
	 * @return the bk10
	 */
	public String getBk10() {
		return bk10;
	}

	/**
	 * @param bk10
	 *            the bk10 to set
	 */
	public void setBk10(String bk10) {
		this.bk10 = bk10;
	}

	/**
	 * @return the bk11
	 */
	public String getBk11() {
		return bk11;
	}

	/**
	 * @param bk11
	 *            the bk11 to set
	 */
	public void setBk11(String bk11) {
		this.bk11 = bk11;
	}

	/**
	 * @return the bk12
	 */
	public String getBk12() {
		return bk12;
	}

	/**
	 * @param bk12
	 *            the bk12 to set
	 */
	public void setBk12(String bk12) {
		this.bk12 = bk12;
	}

	/**
	 * @return the bk13
	 */
	public String getBk13() {
		return bk13;
	}

	/**
	 * @param bk13
	 *            the bk13 to set
	 */
	public void setBk13(String bk13) {
		this.bk13 = bk13;
	}

	/**
	 * @return the bk14
	 */
	public String getBk14() {
		return bk14;
	}

	/**
	 * @param bk14
	 *            the bk14 to set
	 */
	public void setBk14(String bk14) {
		this.bk14 = bk14;
	}

	/**
	 * @return the bk15
	 */
	public String getBk15() {
		return bk15;
	}

	/**
	 * @param bk15
	 *            the bk15 to set
	 */
	public void setBk15(String bk15) {
		this.bk15 = bk15;
	}

	/**
	 * @return the bk16
	 */
	public String getBk16() {
		return bk16;
	}

	/**
	 * @param bk16
	 *            the bk16 to set
	 */
	public void setBk16(String bk16) {
		this.bk16 = bk16;
	}

	/**
	 * @return the bk17
	 */
	public String getBk17() {
		return bk17;
	}

	/**
	 * @param bk17
	 *            the bk17 to set
	 */
	public void setBk17(String bk17) {
		this.bk17 = bk17;
	}

	/**
	 * @return the kb18
	 */
	public String getBk18() {
		return bk18;
	}

	/**
	 * @param kb18
	 *            the kb18 to set
	 */
	public void setBk18(String bk18) {
		this.bk18 = bk18;
	}

	/**
	 * @return the bk19
	 */
	public String getBk19() {
		return bk19;
	}

	/**
	 * @param bk19
	 *            the bk19 to set
	 */
	public void setBk19(String bk19) {
		this.bk19 = bk19;
	}

	/**
	 * @return the bk20
	 */
	public String getBk20() {
		return bk20;
	}

	/**
	 * @param bk20
	 *            the bk20 to set
	 */
	public void setBk20(String bk20) {
		this.bk20 = bk20;
	}

	/**
	 * @return the bk21
	 */
	public String getBk21() {
		return bk21;
	}

	/**
	 * @param bk21
	 *            the bk21 to set
	 */
	public void setBk21(String bk21) {
		this.bk21 = bk21;
	}

	/**
	 * @return the bk22
	 */
	public String getBk22() {
		return bk22;
	}

	/**
	 * @param bk22
	 *            the bk22 to set
	 */
	public void setBk22(String bk22) {
		this.bk22 = bk22;
	}

	/**
	 * @return the bk23
	 */
	public String getBk23() {
		return bk23;
	}

	/**
	 * @param bk23
	 *            the bk23 to set
	 */
	public void setBk23(String bk23) {
		this.bk23 = bk23;
	}

	/**
	 * @return the bk24
	 */
	public String getBk24() {
		return bk24;
	}

	/**
	 * @param bk24
	 *            the bk24 to set
	 */
	public void setBk24(String bk24) {
		this.bk24 = bk24;
	}

	/**
	 * @return the bk25
	 */
	public String getBk25() {
		return bk25;
	}

	/**
	 * @param bk25
	 *            the bk25 to set
	 */
	public void setBk25(String bk25) {
		this.bk25 = bk25;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the bk26
	 */
	public String getBk26() {
		return bk26;
	}

	/**
	 * @param bk26
	 *            the bk26 to set
	 */
	public void setBk26(String bk26) {
		this.bk26 = bk26;
	}

	/**
	 * @return the bk27
	 */
	public String getBk27() {
		return bk27;
	}

	/**
	 * @param bk27
	 *            the bk27 to set
	 */
	public void setBk27(String bk27) {
		this.bk27 = bk27;
	}

	/**
	 * @return the bk28
	 */
	public String getBk28() {
		return bk28;
	}

	/**
	 * @param bk28
	 *            the bk28 to set
	 */
	public void setBk28(String bk28) {
		this.bk28 = bk28;
	}

	/**
	 * @return the bk29
	 */
	public String getBk29() {
		return bk29;
	}

	/**
	 * @param bk29
	 *            the bk29 to set
	 */
	public void setBk29(String bk29) {
		this.bk29 = bk29;
	}

	/**
	 * @return the bk30
	 */
	public String getBk30() {
		return bk30;
	}

	/**
	 * @param bk30
	 *            the bk30 to set
	 */
	public void setBk30(String bk30) {
		this.bk30 = bk30;
	}

	/**
	 * @return the bk31
	 */
	public String getBk31() {
		return bk31;
	}

	/**
	 * @param bk31
	 *            the bk31 to set
	 */
	public void setBk31(String bk31) {
		this.bk31 = bk31;
	}

	/**
	 * @return the bk32
	 */
	public String getBk32() {
		return bk32;
	}

	/**
	 * @param bk32
	 *            the bk32 to set
	 */
	public void setBk32(String bk32) {
		this.bk32 = bk32;
	}

	/**
	 * @return the bk33
	 */
	public String getBk33() {
		return bk33;
	}

	/**
	 * @param bk33
	 *            the bk33 to set
	 */
	public void setBk33(String bk33) {
		this.bk33 = bk33;
	}

	/**
	 * @return the bk34
	 */
	public String getBk34() {
		return bk34;
	}

	/**
	 * @param bk34 the bk34 to set
	 */
	public void setBk34(String bk34) {
		this.bk34 = bk34;
	}

	/**
	 * @return the bk35
	 */
	public String getBk35() {
		return bk35;
	}

	/**
	 * @param bk35 the bk35 to set
	 */
	public void setBk35(String bk35) {
		this.bk35 = bk35;
	}

	/**
	 * @return the bk36
	 */
	public String getBk36() {
		return bk36;
	}

	/**
	 * @param bk36 the bk36 to set
	 */
	public void setBk36(String bk36) {
		this.bk36 = bk36;
	}

	/**
	 * @return the bk37
	 */
	public String getBk37() {
		return bk37;
	}

	/**
	 * @param bk37 the bk37 to set
	 */
	public void setBk37(String bk37) {
		this.bk37 = bk37;
	}

	/**
	 * @return the bk38
	 */
	public String getBk38() {
		return bk38;
	}

	/**
	 * @param bk38 the bk38 to set
	 */
	public void setBk38(String bk38) {
		this.bk38 = bk38;
	}

	/**
	 * @return the bk39
	 */
	public String getBk39() {
		return bk39;
	}

	/**
	 * @param bk39 the bk39 to set
	 */
	public void setBk39(String bk39) {
		this.bk39 = bk39;
	}
	
}
