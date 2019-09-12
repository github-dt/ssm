/**   
* @Title: SsmExceptionResolver.java 
* @Package cn.itheima.ssm.exception 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-6-28 上午10:51:31 
* @version V1.0   
*/
package com.dt.ssm.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 * @ClassName: SsmExceptionResolver 
 *
 */
public class SsmExceptionResolver implements HandlerExceptionResolver {

	/**
	 * 实现异常逻辑处理
	 */
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		
		// 判断是否是系统异常
		SsmException ssme = null;
		if(ex instanceof SsmException){
			ssme = (SsmException) ex;
		}else{
			// 提示是未知的异常
			ssme = new SsmException("未知异常！");
		}
		
		// 包装异常页面
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", ssme.getMessage());
		mav.setViewName("error/error");
		
		return mav;
	}

}
