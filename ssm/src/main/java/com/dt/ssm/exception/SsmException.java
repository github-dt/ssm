package com.dt.ssm.exception;

/** 
 * @ClassName: SsmException 
 *
 */
public class SsmException extends Exception {
	
	// 异常消息
	private String message;
	
	public SsmException(){
		
	}

	/**
	 * @param message
	 */
	public SsmException(String message) {
		super();
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
