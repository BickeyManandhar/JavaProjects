 package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDto;


@WebServlet("/PreEditServlet")
public class PreEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String dbURL = "jdbc:mysql://localhost:3306/login";
	static String username = "root";
	static String password = "Bickey@123";
	static Connection conn = null;    
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");

	

			try {
				//1. Load/Register driver class
				Class.forName("com.mysql.jdbc.Driver");

				try {
					//2. Create a connection
					conn = DriverManager.getConnection(dbURL, username, password);
					//3. Create a statement - two interface available, PreparedStatement and Statement
					PreparedStatement ps = conn.prepareStatement("select * from userlogin where email=?"); // retrieve particular
																										// record from db
					ps.setString(1, email); // ?=2

					//4. Execute queries
					// executeQuery() --> only for select operation. (It returns ResultSet)
					// executeUpdate() --> for all operations except select operation.(It returns
					// int type value)
					ResultSet rs = ps.executeQuery();
					if (rs.next()) {
						
						// System.out.println(rs.getInt("id") + "   " + rs.getString("name") + "   " +rs.getString("country") + "   " + rs.getString("email")); //OR we can do
						 
						String emaill=rs.getString(1);
						String pass=rs.getString(2);
						String namee=rs.getString(3);
						System.out.println(rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3));
//						request.setAttribute("email", emaill);
//						request.setAttribute("password", pass);
//						request.setAttribute("name", namee);
						UserDto ud=new UserDto(emaill,pass,namee);
						request.setAttribute("ud", ud);
						request.getRequestDispatcher("edit.jsp").forward(request, response);
						
					}
					
					
					
					//5. Close the connection
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
