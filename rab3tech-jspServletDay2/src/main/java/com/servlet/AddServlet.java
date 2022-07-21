package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read the data which is coming from client side
		String numb1 = request.getParameter("num1");
		String numb2 = request.getParameter("num2");

		// converting String type of data into int type
		int number1 = Integer.parseInt(numb1);
		int number2 = Integer.parseInt(numb2);

		int sum = number1 + number2;

		request.setAttribute("sumoftwonum", sum);//we are using sumoftwonum in result.jsp to take value of sum

		// we are using RequestDispatcher class to forward the result of the request in
		// the form of HTML/JSP/JS/angular/typescript/servlet
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
