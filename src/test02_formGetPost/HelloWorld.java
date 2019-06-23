package test02_formGetPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		doPost(req,res);
	}
	
	//run this program without doGet method will occur HTTP Status 405 – Method Not Allowed 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//not set charset will produce garbled Chinese text
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<HTML>");
		out.print("<HEAD><TITLE></TITLE></HEAD>");
		out.print("<BIG>Hello World ,世界你好 !</BIG>");
		
		out.print("<BODY></HTML>");
	
	}

}
