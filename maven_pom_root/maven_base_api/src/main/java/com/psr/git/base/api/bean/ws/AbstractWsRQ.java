package com.psr.git.base.api.bean.ws;

import java.io.Serializable;

/**
 * <B> Function : </B> AbstractWsRQ <br>
 * <B> Description : </B> Ws 服务返回结果抽象类  <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月17日 下午2:31:12 <br>
 * @version v1.0
 *
 */
public abstract class AbstractWsRQ implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8675798630434952501L;

	/**
	 * 接口ID
	 */
	private String requestId;
	
	/**
	 * 签名信息
	 */
	private String sign;
	
	/**
	 * unix时间戳
	 */
	private String unixTimestamp;
	
	/**
	 * 项目密钥
	 */
	private String appKey;

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @param sign the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * @return the unixTimestamp
	 */
	public String getUnixTimestamp() {
		return unixTimestamp;
	}

	/**
	 * @param unixTimestamp the unixTimestamp to set
	 */
	public void setUnixTimestamp(String unixTimestamp) {
		this.unixTimestamp = unixTimestamp;
	}

	/**
	 * @return the appKey
	 */
	public String getAppKey() {
		return appKey;
	}

	/**
	 * @param appKey the appKey to set
	 */
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}


}
