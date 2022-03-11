package com.demo.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {

		System.out.println("destroy method called...");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method is called...");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Service/DoGet called in thread " + Thread.currentThread().getName());
	}

}
