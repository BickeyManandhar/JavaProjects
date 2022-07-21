package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
//every servlet should have unique name so that we can call it when required
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //request will capture data from client
	//request is blank
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		System.out.println("hello");//here we are printing something in console
		PrintWriter pw= response.getWriter();
		//PrintWriter -- print text data to character stream
		//getWriter() -- Returns a PrintWriter object that can send character text to the client
		//It is going to work like a pencil/pen to write something on browser
		
		//writing data inside 
		
		pw.println("Goodmorning everyone!!! First day of learning Servlet");
		pw.println("<h1> Heading1 </h1>");
		pw.println("<h2> Heading2 </h2>");
		pw.println("<h3> Heading3 </h3");
		pw.println("<h4> Heading4 </h4>");
		pw.println("<h5> Heading5 </h5>");
		pw.println("<h6> Heading6 </h6>");
		pw.println("<a href=\'first.html\'>click here to go to first.html</a>");
		pw.println("<br>");
		pw.println("<a href=\'second.html\'>click here to go to second.html</a>");
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response); //doPost method internally call doGet method
	}

}
