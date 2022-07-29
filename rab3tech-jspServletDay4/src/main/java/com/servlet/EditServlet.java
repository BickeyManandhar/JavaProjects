package com.servlet;
//postedit servlet
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UserDto;


@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String dbURL = "jdbc:mysql://localhost:3306/login";
	static String username = "root";
    Connection conn=null; 
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");;
		String password=request.getParameter("password");
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(dbURL, username, "Bickey@123");
		PreparedStatement ps = conn.prepareStatement("update userlogin set password=?, name=? where email=?"); 
		ps.setString(1, password);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.executeUpdate();
		
		int numOfInsertedRecord=ps.executeUpdate();
		
		if(numOfInsertedRecord>0) {
			UserDto usrdto=new UserDto(email,password,name);
			request.setAttribute("usrdto", usrdto);
			request.setAttribute("success", "Editing Successfully");
			request.getRequestDispatcher("getrecords").forward(request,response);
		}
		else {
			request.setAttribute("unsuccess", "Editing Unsuccessfully");
			request.getRequestDispatcher("getrecords").forward(request,response);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
