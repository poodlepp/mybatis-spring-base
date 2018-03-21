package com.webDemo.filter;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.xml.rpc.ServiceException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * 可以添加一些公共的逻辑，打印一些公共的日志
 */
@WebFilter(filterName = "LoggingFilter",urlPatterns = {"/*"},initParams = {@WebInitParam(name="logFileName",value = "log.txt"),@WebInitParam(name="prefix",value = "URI:")})
public class LoggingFilter implements Filter{
	private PrintWriter logger;
	private String prefix;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		prefix = filterConfig.getInitParameter("prefix");
		String logFileName = filterConfig.getInitParameter("logFileName");
		String appPath = filterConfig.getServletContext().getRealPath("/");//在编译文件的根目录
		System.out.println("logFileName:"+logFileName);
		try {
			logger = new PrintWriter(new File(appPath, logFileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new ServletException(e.getMessage());
		}

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("loggingFilter.dofilter");
		HttpServletRequest request1 = (HttpServletRequest) request;
		logger.println(new Date() + ""+prefix + ((HttpServletRequest) request).getRequestURI());
		logger.flush();
		chain.doFilter(request1,response);
	}

	@Override
	public void destroy() {
		System.out.println("destorying filter");
		if(logger != null){
			logger.close();
		}
	}
}
