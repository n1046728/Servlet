package test02_formGetPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html; charset=UTF-8");
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		out.print("<HTML>");
		out.print("<HEAD><TITLE></TITLE></HEAD>");
		out.print("<BIG>Hello "+ name +"....</BIG>");
		
		out.print("<BODY></HTML>");
	
	}

}
