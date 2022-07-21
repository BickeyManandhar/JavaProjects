package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")

public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static int factorial(int num1) {
		int result = 1;
		for (int i = 1; i <= num1; i++) {
			result = result * i;
		}
		return result;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read data from client side
		String numval = request.getParameter("facnum");
		int num = Integer.parseInt(numval);
		int fact = factorial(num);
		request.setAttribute("input", num);
		request.setAttribute("factorial", fact);// we are using factorial in factorialresult.jsp to take value of fact

		// we are using RequestDispatcher class to forward the result of the request in
		// the form of HTML/JSP/JS/angular/typescript/servlet
		RequestDispatcher rd = request.getRequestDispatcher("factorialresult.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
