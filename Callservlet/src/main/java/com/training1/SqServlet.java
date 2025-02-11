package com.training1;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest Req, HttpServletResponse Res) throws IOException {
		
		Res.getWriter().println("SqServlet Called....");
		
		int k = (int)Req.getAttribute("k");
		Res.getWriter().println("Square of values sum is "+k*k);
	}
}
