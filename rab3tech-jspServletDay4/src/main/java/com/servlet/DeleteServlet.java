package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String dbURL = "jdbc:mysql://localhost:3306/login";
	static String username = "root";
	static String password = "Bickey@123";
    Connection conn=null; 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		try {
			//1. Load/Register driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Create a connection
			conn = DriverManager.getConnection(dbURL, username, password);
			//3. Create a statement - two interface available, PreparedStatement and Statement
			PreparedStatement ps = conn.prepareStatement("delete from userlogin where email=?"); // retrieve particular
																								// record from db
			ps.setString(1, email);
			//4. Execute queries
			// executeQuery() --> only for select operation. (It returns ResultSet)
			// executeUpdate() --> for all operations(insert, update, delete) except "select" operation.(It returns
			// int type value)
			int numOfDeletedRecord = ps.executeUpdate();//it returns int value
			if(numOfDeletedRecord>0) {
				System.out.println("Number of recorded deleted = "+numOfDeletedRecord);
				request.setAttribute("msg", "Record deleted successfully");
				request.getRequestDispatcher("getrecords").forward(request, response);
			}
			else {
				System.out.println("Record failed to delete. ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
