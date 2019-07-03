package test03_advanced_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="/ServerInfo")
public class ServerInfo extends GenericServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/plain");
		PrintWriter out = res.getWriter();
		
		ServletContext context = getServletContext(); 
		out.println(req.getServerName());
		out.println(req.getServerPort());
		out.println("==================");
		out.println("context.get");
		Enumeration en = context.getAttributeNames();
		while(en.hasMoreElements()){
			String name =(String) en.nextElement();
			out.println( "context.getAttribute("+name+") :" + context.getAttribute(name));
		}
	}

}
