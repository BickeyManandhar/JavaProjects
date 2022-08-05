package com.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getting values from client from registration.jsp
		String usrname=request.getParameter("name");
		String uemail=request.getParameter("email");		
		String upswrd=request.getParameter("pass");
		String ucontact=request.getParameter("contact");
		RequestDispatcher dispatcher= null;
		Connection con=null;
		try {
			//1. Load/Register driver class
			Class.forName("com.mysql.jdbc.Driver");
			//2. Create a connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personalServletProject","root","Bickey@123");
			//3. Create a statement - two interface available, PreparedStatement and Statement
			PreparedStatement ps= con.prepareStatement("insert into user(username, email, password, contactnum) values(?,?,?,?) ");
			ps.setString(1, usrname);
			ps.setString(2, uemail);
			ps.setString(3, upswrd);
			ps.setString(4, ucontact);
			
			//4. Execute queries
			// executeUpdate() --> for all operations except select operation.(It returns
			// int type value)
			int rowCount=ps.executeUpdate();
			dispatcher= request.getRequestDispatcher("registration.jsp");
			if(rowCount>0) {
				request.setAttribute("status", "success");
			}
			else {
				request.setAttribute("status", "failed");
			}
			dispatcher.forward(request,response);
		} catch (Exception e) {
			e.printStackTrace();		
			}
		finally {
			try {
				//5. Close the connection
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
