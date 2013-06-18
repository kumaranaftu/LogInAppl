package com.adpt;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletLoginProgram extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException 
	{
		//Added a comment line
		//Added on master branch
		//Added from gitHub
		resp.setContentType("text/html");
		String usrName = req.getParameter("username");
		String pwd  = req.getParameter("password");
		//obj.println("<html>");
		//obj.println("<head>");
		//obj.println("<title>" + "LogIn Page" + "</title>" );
		//obj.println("</head>");
		//obj.println("<body>");
		RequestDispatcher reqSuccess = req.getRequestDispatcher("/pages/success.jsp");
		RequestDispatcher reqFailure = req.getRequestDispatcher("/pages/failure.jsp");
		if(usrName.equalsIgnoreCase(pwd))
		{
			//obj.println("hi" + usrName + "," + "You have successfully logged in....");
			req.setAttribute("username", usrName);
			reqSuccess.forward(req,resp);
		}
		else
		{
			//req.setAttribute("username", usrName);
			reqFailure.forward(req,resp);
		}
			//obj.println("Username And Password are incorrect");
		//obj.println("</body>");
		//obj.println("</html");
		//obj.close();
	}
}
