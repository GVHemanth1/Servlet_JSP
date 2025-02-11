package com.training;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest Req, HttpServletResponse Res) throws IOException {
		//only we can use service () method
		
		int i = Integer.parseInt(Req.getParameter("a"));
		int j = Integer.parseInt(Req.getParameter("b"));
		int k = i+j;
		
		System.out.println("Sum of two values is : "+k);
		//to display the value
		
		Res.getWriter().println("Sum of two values is : "+k);
		
	}
	public void doGet(HttpServletRequest Req, HttpServletResponse Res) throws IOException {
		//only we can use service () method
		
		int i = Integer.parseInt(Req.getParameter("a"));
		int j = Integer.parseInt(Req.getParameter("b"));
		int k = i+j;
		
		System.out.println("Sum of two values is : "+k);
		//to display the value
		
		Res.getWriter().println("Sum of two values is : "+k);
		
	}
}
