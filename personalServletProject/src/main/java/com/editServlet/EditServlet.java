package com.editServlet;
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
	static String dbURL = "jdbc:mysql://localhost:3306/personalServletProject";
    Connection conn=null; 
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usernamee=request.getParameter("name");
		String emaill=request.getParameter("email");;
		String passwordd=request.getParameter("pass");
		String contactnumm=request.getParameter("contact");
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(dbURL, "root", "Bickey@123");
		PreparedStatement ps = conn.prepareStatement("update user set email=?, password=?, contactnum=? where username=?"); 
		ps.setString(1, emaill);
		ps.setString(2, passwordd);
		ps.setString(3, contactnumm);
		ps.setString(4, usernamee);
		ps.executeUpdate();
		
		int numOfInsertedRecord=ps.executeUpdate();
		System.out.println("Before if statement.");
		if(numOfInsertedRecord>0) {
			System.out.println("edit servlet working");
			UserDto udto=new UserDto(usernamee,emaill);
			request.setAttribute("udto", udto);
			request.setAttribute("success", "Editing Successful. Please login again and check if it is working.");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
		else {
			System.out.println("edit servlet not working");
			request.setAttribute("unsuccess", "Editing Unsuccessful. Please do not edit username since it is not editable.");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
