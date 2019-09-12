/**   
* @Title: FirstInterceptor.java 
* @Package cn.itheima.ssm.interceptor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-6-28 下午2:38:13 
* @version V1.0   
*/
package com.dt.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 * @ClassName: FirstInterceptor 
 *
 */
public class FirstInterceptor implements HandlerInterceptor {

	/**
	 * preHandle
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("FirstInterceptor-preHandle方法执行中。");
		
		return true;
	}

	/**
	 * postHandle
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("FirstInterceptor-postHandle方法执行中。");
		
		modelAndView.addObject("message", "拦截器postHandle方法");

	}

	/**
	 * afterCompletion
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("FirstInterceptor-afterCompletion方法执行中。");

	}

}
