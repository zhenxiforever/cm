package com.cm.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.smile.wechat.WechatInitApplication;

/**
 * 初始化监听类
 * 
 */
@WebListener
public class InitServletContextListener implements ServletContextListener {


	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		WebApplicationContext context=WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
		WechatInitApplication.contextInitialized(context);
	}

}

