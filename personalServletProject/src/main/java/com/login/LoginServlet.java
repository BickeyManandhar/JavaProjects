package com.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		Connection con=null;
		//RequestDispatcher rd=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personalServletProject","root","Bickey@123");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				PreparedStatement ps = con.prepareStatement("select * from user where username=? and password=?");
				ps.setString(1, name);
				ps.setString(2, pass);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					System.out.println("Hitting if statement");
					String username=rs.getString(1);
					String email=rs.getString(2);
					String password=rs.getString(3);
					String contactnum=rs.getString(4);
					
					/*
					 * System.out.println(rs.getInt("id") + "   " + rs.getString("name") + "   " +
					 * rs.getString("country") + "   " + rs.getString("email")); OR we can do
					 */
					request.setAttribute("username", username);
					request.setAttribute("email", email);
					request.setAttribute("password", password);
					request.setAttribute("name", name);
					request.setAttribute("contactnum", contactnum);
					request.getRequestDispatcher("index.jsp").forward(request, response);
					//rd = request.getRequestDispatcher("index.jsp");
					//rd.forward(request, response);
				}
				else {
					System.out.println("Hitting else statement");
					request.setAttribute("msg","Re-try...login again!!!");
					request.getRequestDispatcher("login.jsp").forward(request, response);
					//rd = request.getRequestDispatcher("login.jsp");
					//rd.forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
