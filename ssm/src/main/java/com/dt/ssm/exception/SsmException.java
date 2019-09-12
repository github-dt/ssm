/**   
* @Title: SsmException.java 
* @Package cn.itheima.ssm.exception 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-6-28 上午10:49:14 
* @version V1.0   
*/
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
