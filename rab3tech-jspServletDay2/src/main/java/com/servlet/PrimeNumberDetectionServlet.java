package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/primenumber")
public class PrimeNumberDetectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static boolean isPrimenumber(int n) {//lets say n=11
		if(n<=1) {//11<=1?? No so skip
		return false;
		}
		for(int i=2;i<=n/2;i++) {         //i) 2<=11/2??yes so enter the loop, 11%2==0? No.
			if((n%i)==0) {				//ii) 3<=11/3?? yes so enter the loop, 11%3==0? No.
				return false;			// iii) 4<=11/4?? no so exit the loop.
			}							
				
		}
		return true;//finally return true
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number=request.getParameter("pnumber");
		int num=Integer.parseInt(number);
		boolean answer= isPrimenumber(num);
		request.setAttribute("numb", num);
		request.setAttribute("ans", answer);
		
		RequestDispatcher rd= request.getRequestDispatcher("primeresult.jsp");
		rd.forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
