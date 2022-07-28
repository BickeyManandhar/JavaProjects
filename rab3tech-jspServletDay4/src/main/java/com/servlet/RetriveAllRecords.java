package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDto;


@WebServlet("/getrecords")
public class RetriveAllRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String dbURL = "jdbc:mysql://localhost:3306/login";
	static String username = "root";
	static String password = "Bickey@123";
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//read data from login.jsp -- data coming from client side// this part is not required here since we aRE LOGGED IN ALREADY
	/*	String uemail=request.getParameter("email");
		String pass=request.getParameter("password");*/
		
		try {
			//1. Load/Register driver class
			Class.forName("com.mysql.jdbc.Driver");

			try {
				//2. Create a connection
				Connection conn = DriverManager.getConnection(dbURL, username, password);
				//3. Create a statement - two interface available, PreparedStatement and Statement
				PreparedStatement ps = conn.prepareStatement("select * from userlogin"); 
																					
				/*ps.setString(1, uemail);
				ps.setString(2, pass);*/

				//4. Execute queries
				// executeQuery() --> only for select operation. (It returns ResultSet)
				// executeUpdate() --> for all operations except select operation.(It returns
				// int type value)
				ResultSet rs = ps.executeQuery();
				
				List<UserDto> userList= new ArrayList<>();
				while (rs.next()) {
					String email=rs.getString(1);
					String password=rs.getString(2);
					String name=rs.getString(3);
					
					/*
					 * System.out.println(rs.getInt("id") + "   " + rs.getString("name") + "   " +
					 * rs.getString("country") + "   " + rs.getString("email")); OR we can do
					 */
					/*request.setAttribute("email", email);
					request.setAttribute("password", password);
					request.setAttribute("name", name);*/
					
					
					UserDto userDto= new UserDto(email,password,name); // here we are creating object of class UserDto
					userList.add(userDto);							// reference of the object i.e. userDto is holding one value at a time and adding it to the arraytlist
											//in first iteration, first object will be added and in next iteration another will be added
					
					
				}
				request.setAttribute("userList", userList);
				request.getRequestDispatcher("allrecords.jsp").forward(request, response);
				/*else {
					request.setAttribute("msg","Re-try...login again!!!");
					request.getRequestDispatcher("login.jsp").forward(request,response);
				}*/
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
