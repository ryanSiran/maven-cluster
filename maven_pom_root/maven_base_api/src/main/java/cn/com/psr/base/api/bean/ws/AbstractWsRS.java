package cn.com.psr.base.api.bean.ws;

import java.io.Serializable;

/**
 * <B> Function : </B> AbstractWsRS <br>
 * <B> Description : </B> Ws 服务返回接口调用类 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月17日 下午2:42:11 <br>
 * @version v1.0
 *
 */
public abstract class AbstractWsRS implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -357421298038119128L;

	/**
	 * 调用接口是否成功
	 */
	private boolean success;
	
	/**
	 * 错误信息
	 */
	private String errorMessage;

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
