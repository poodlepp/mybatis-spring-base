package com.webDemo.listen;

import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.HashMap;

@WebListener
public class AppListener implements ServletContextListener{

	/**
	 * 添加监听器分3部
	 * 1 创建类，实现接口，实现方法
	 * 2 添加注解或者配置listener标签
	 * 3 javaee-api 依赖不能少
	 * @param servletContextEvent
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext context = servletContextEvent.getServletContext();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ca","Canada");
		map.put("us","United States");
		context.setAttribute("countries",map);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

	}
}
