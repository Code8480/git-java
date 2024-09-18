package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String id = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		if(id.equalsIgnoreCase("Name") && pwd.equals("Password"))
			out.println("Login Successful");
		else
			out.println("Invalid Credentials");
		
//		HttpSession session = req.getSession();
//		session.setAttribute(id, pwd);
		
	}

}
