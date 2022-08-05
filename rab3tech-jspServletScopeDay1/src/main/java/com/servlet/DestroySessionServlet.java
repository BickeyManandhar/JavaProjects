package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DestroySessionServlet
 */
@WebServlet("/DestroySessionServlet")
public class DestroySessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//this is to destroy existing session	
		
		HttpSession currentSession=request.getSession(false);//writing false means don't create new session. share the session that is available
		//so this means we are asking for the existing session, if any. DONOT create new session if there is no session
		
		if(currentSession!=null) {
			//if currentSession is not null that means there exist a session and hence this statement will be executed
			currentSession.invalidate();//this is destroying the session
		}
		RequestDispatcher rd=request.getRequestDispatcher("factorial.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
