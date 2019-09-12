/**   
* @Title: LoginInterceptor.java 
* @Package cn.itheima.ssm.interceptor 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2018-6-28 下午3:09:46 
* @version V1.0   
*/
package com.dt.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/** 
 * @ClassName: LoginInterceptor 
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	/**
	 * preHandle
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
//		1.用户要访问商品列表数据，判断用户是否登录
//		2.如果用户已经登录，直接访问商品列表数据
//		3.如果用户未登录，跳转登录页面进行登录，成功登录以后，再访问商品列表数据
		
		// 获取session对象
		HttpSession session = request.getSession();
		
		// 获取用户数据
		Object user = session.getAttribute("user");
		
		// 判断用户是否为空，确定是否有登录
		if(user != null){
			System.out.println("用户【"+user+"】已经登录，放行。");
			return true;
		}
		
		System.out.println("用户【"+user+"】未登录，先去登录页面执行登录。");
		response.sendRedirect(request.getContextPath()+"/user/toLogin.do");

		return false;
	}

	/**
	 * postHandle
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * afterCompletion
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
