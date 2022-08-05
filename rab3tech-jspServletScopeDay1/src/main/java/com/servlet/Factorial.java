package com.servlet;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Factorial
 */
@WebServlet("/Factorial")
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int factorial(int num1) {
		int result = 1;
		for(int i=1;i<=num1;i++) {
			result=result*i;//if input is 6, in first iteration: 1*1=1,second iteration: 1*2=2, 
							//third iteration: 2*3=6,fourth iteration: 6*4=24, fifth iteration: 24*5=120, sixth iteration: 120*6=70 and end of iteration
		}
		return result;
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String st=request.getParameter("num");
		int num=Integer.parseInt(st);
		int num1=factorial(num);
		
		//request scope//
//		request.setAttribute("num1", num1);
//		request.setAttribute("num",num);
//		request.getRequestDispatcher("factorial.jsp").forward(request, response);
		
		//session scope//
		HttpSession session=request.getSession(false);
		//so this means we are asking for the existing session, if any. Create new session if there is no session
//		HttpSession session=request.getSession(false); //writing false means don't create new session. share the session that is available
		//so this means we are asking for the existing session, if any. DONOT create new session if there is no session
		session.setAttribute("num1", num1);
		session.setAttribute("num",num);
//		request.getRequestDispatcher("factorial.jsp").forward(request, response);
		//using session scope we can get our data in another page too other than factorial.jsp until the session is not expired
		
		//application scope
		ServletContext appScope=getServletContext(); // for getting application scope
		appScope.setAttribute("email", "manandharbickey@gmail.com");
		request.getRequestDispatcher("factorial.jsp").forward(request, response);
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
