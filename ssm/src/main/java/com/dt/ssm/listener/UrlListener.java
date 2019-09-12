package com.dt.ssm.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 配置项目名称  ssm
 *
 * 项目启动加载这个类初始化   contextPath=ssm
 */


public class UrlListener implements ServletContextListener {


    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();

        String contextPath = servletContext.getContextPath();

        servletContext.setAttribute("contextPath", contextPath);


    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
