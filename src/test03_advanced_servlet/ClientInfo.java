package test03_advanced_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ClientInfo")
public class ClientInfo extends HttpServlet{
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("Query String:");
		out.println(req.getQueryString());
		out.println();
		
		out.println("Request Parameters:");
		Enumeration<String> en = req.getParameterNames();
		while(en.hasMoreElements()){
			String name = (String)en.nextElement();
			String values[] = req.getParameterValues(name);
			if(values!= null){
				for (int i = 0; i < values.length; i++) {
					out.println(name + " [" + i + "]: " + values[i]);
					System.out.println(name + " [" + i + "]: " + values[i]);
				}
			}
		
		}
		}
		
	
}
