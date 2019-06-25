package test03_advanced_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInfo extends GenericServlet{
	private static final long serialVesionUID =1L;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		out.println("InitParams as follow :");
		Enumeration en = getInitParameterNames();
		//enumeration is disorder maybe display 3 2 1 that initParams setting in web.xml
		while(en.hasMoreElements()){
			String name = (String) en.nextElement();
			out.println("name : "+name +" value : "+getInitParameter(name));
		}
		out.println("=================");
		out.println("getServletConfig() :"+	getServletConfig());
		out.println("getServletInfo() :"+	getServletInfo());
	}
	
}
