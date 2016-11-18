package com.psr.git.base.api.exception;

public class BaseClientException extends Exception{

	private static final long serialVersionUID = -8927344444770260104L;

	public BaseClientException() {
		super();
	}

	public BaseClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaseClientException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseClientException(String message) {
		super(message);
	}

	public BaseClientException(Throwable cause) {
		super(cause);
	}

}
