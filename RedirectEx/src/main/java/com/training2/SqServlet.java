package com.training2;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest Req, HttpServletResponse Res) throws IOException {
		
		Res.getWriter().println("SqServlet Called....");
		
		
		int k = Integer.parseInt(Req.getParameter("k"));
		Res.getWriter().println("Square of values sum is "+k*k);
		
		System.out.println("SqServlet called...!!");
//		Res.getWriter().println(Req.toString());
	}
}
