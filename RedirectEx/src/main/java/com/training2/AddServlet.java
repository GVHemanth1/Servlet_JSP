package com.training2;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	
	
	public void doGet(HttpServletRequest Req, HttpServletResponse Res) throws IOException, ServletException {
		//only we can use service () method
		
		int i = Integer.parseInt(Req.getParameter("a"));
		int j = Integer.parseInt(Req.getParameter("b"));
		int k = i+j;
		
//		Session manager is used to add the additional values to req while sending 
		
//		Req.setAttribute("k", k);
//		
//		//Res.getWriter().println("Sum of two values is : "+k);
//		//Request dispatcher is used to forward the request to another servlet
//		//create an object for request dispatcher
//		RequestDispatcher rd = Req.getRequestDispatcher("sq");
//		rd.forward(Req, Res);
//		
		Res.sendRedirect("sq?k="+k); //URL rewriting
	}
}
