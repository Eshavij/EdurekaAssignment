package com.edureka.servlet;


import java.io.IOException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("uid");
		String password=request.getParameter("pass");
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
			Cookie cUser =new Cookie("Username",username);
			Cookie cPass =new Cookie("Password",password);
			cUser.setMaxAge(30*30*24);
			cPass.setMaxAge(30*30*24);
			response.addCookie(cUser);
			response.addCookie(cPass);
			out.print("Welcome Admin");
		}else{

			out.println("<body><h3>Username/Password incorrect</h3></body>");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.forward(request, response);
		}
		
		System.out.println(username + password);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
//		String username=request.getParameter("uid");
//		String password=request.getParameter("pass");
//		
//		System.out.println(username + password);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
