package com.mywebapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GetDateTime
 */
//@WebServlet("/GetDateTime")
public class GetDateTime extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			int n = Integer.parseInt(request.getParameter("t1"));
			System.out.println(n + out.toString());
			out.print("<center>");
			if(n%2==0) 
				out.print("<h2>Given number " +n + " is an even number</h2>");
			else 
				out.println("<h2>Given number " +n + " is an odd number</h2>");
		}
		catch (Exception e) {
			out.println("Error: "+e.getMessage());
		}
		finally {
			out.println("<i><a href=index.html>click here</a> to go back to home page</i>");
		}
	}

}
