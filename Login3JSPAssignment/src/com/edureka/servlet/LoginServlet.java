package com.edureka.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	Connection con;
	Statement state;
	ResultSet rs;

	@Override
	public void init() throws ServletException {

		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/SHOPPING_CART";
		final String DB_PASSWORD = "password";
		final String DB_HOST = "root";
		int ch;

		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection(DB_URL, DB_HOST, DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {

		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");

		try {
			state = con.createStatement();
			String sql = "select * from USER where uid=" + username + " and pass=" + password;
			rs = state.executeQuery(sql);
			if (rs.next()) {
				out.print("Welcome Admin");
				Cookie cUser = new Cookie("Username", username);
				Cookie cPass = new Cookie("Password", password);
				cUser.setMaxAge(30 * 30 * 24);
				cPass.setMaxAge(30 * 30 * 24);
				response.addCookie(cUser);
				response.addCookie(cPass);

			} else {
				out.println("<body><h3>Username/Password incorrect</h3></body>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(username + password);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
