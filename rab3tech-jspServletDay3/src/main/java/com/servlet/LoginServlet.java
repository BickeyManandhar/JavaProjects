package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// business logic
		String username = request.getParameter("uname");
		String password = request.getParameter("upassword");

		if ("Bickey".equals(username) && "12345".equals(password)) {
			RequestDispatcher rd = request.getRequestDispatcher("congrats.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("message", "User not found. Try Again.");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response); // this works within a server and perform response based on request.
			
			/* response.sendRedirect("www.facebook.com");*/ //this does not care about
														// request. it may work on same server as well as different server.
			//response.sendRedirect("login.jsp");//this is an example that this can work on same server as well
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
