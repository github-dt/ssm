/**   
* @Title: SecondInterceptor.java 
* @Package cn.itheima.ssm.interceptor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-6-28 下午3:22:16 
* @version V1.0   
*/
package com.dt.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 * @ClassName: SecondInterceptor 
 *
 */
public class SecondInterceptor implements HandlerInterceptor {

	/**
	 * preHandle
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("SecondInterceptor-preHandle方法执行中。");
		
		return false;
	}

	/**
	 * postHandle
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {


		System.out.println("SecondInterceptor-postHandle方法执行中。");

	}

	/**
	 * afterCompletion
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("SecondInterceptor-afterCompletion方法执行中。");

	}

}
