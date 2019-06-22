package test01_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns ="/myCounter3",
		loadOnStartup=2,
		initParams={
				@WebInitParam(name="initCount1",value="10"),
				@WebInitParam(name="initCount2",value="20")
		}
)
public class MyCounter3_initParam extends HttpServlet{
	private static final long serialVersionUID = 1L;
	int count;
	
	@Override
	public void init() throws ServletException {
		System.out.println("MyCounter3 initParam");
		try {
			count = Integer.parseInt(getInitParameter("initCount1"));
		} catch (NumberFormatException e) {
			count =0;
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out = resp.getWriter();
		 out.print("MyServlet3_initParam test Count :"+ ++count);
	}
	
}
