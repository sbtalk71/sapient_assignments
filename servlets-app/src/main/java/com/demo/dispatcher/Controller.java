package com.demo.dispatcher;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import collections.app.Person;
import collections.app.PersonApp;

@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String data=request.getParameter("data");
		String url=request.getServletPath();
		System.out.println(url);
		
		switch (url) {
		case "/j":
			//forward to JohnServlet
			RequestDispatcher rd= request.getRequestDispatcher("/john");
			rd.forward(request, response);
			break;
		case "/p":
			//forward to PeterServlet
			RequestDispatcher rd1= request.getRequestDispatcher("/peter");
			rd1.forward(request, response);
			break;
		case "/redirect":
			System.out.println("Google reached..");
			response.sendRedirect("https://www.google.com");
			break;
		case "/list":
			PersonApp app=new PersonApp();
			List<String> list=app.listPersonByCity("Hyderabad");
			HttpSession session= request.getSession(true);
			session.setAttribute("data", list);
			request.getRequestDispatcher("emplist.jsp").forward(request, response);
			break;
		default:
			response.sendError(404);
			break;
		}
	}

}
