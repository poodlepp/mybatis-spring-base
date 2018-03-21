package com.webDemo.listen;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.concurrent.atomic.AtomicInteger;

/*


@WebListener
 */
public class SessionListener implements HttpSessionListener,ServletContextListener{
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext context = session.getServletContext();
		AtomicInteger counter = (AtomicInteger) context.getAttribute("userCounter");
		int i = counter.incrementAndGet();
		System.out.println("userCount incremented to :"+i);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		ServletContext context = session.getServletContext();
		AtomicInteger counter = (AtomicInteger) context.getAttribute("userCounter");
		int i = counter.decrementAndGet();
		System.out.println("------ userCount decremented to : "+i);
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();
		servletContext.setAttribute("userCounter",new AtomicInteger());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
