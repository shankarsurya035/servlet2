

import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/sur" })
public class LoginForm extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String u=request.getParameter("t1");
		String p=request.getParameter("t2");
		if(u.equals(p))
		{
			out.println("VALID USER");
		}
		else
		{
			out.println("INVALID USER");
		}
	}
}
