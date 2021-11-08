package com.xworkz.hacker;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {

	public LifeCycleServlet() {
		System.out.println("Executed no-org constructor of lifeCycleServlet");

	} 

	@Override
	public void init() throws ServletException {
		System.out.println("invoked init from lifeCycleServlet");
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("invoked init from lifeCycleServlet with Servletconfig as parameter");
		super.init(config);
	} 
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("invoked service method in lifeCycleServlet with http");
		super.service(arg0, arg1);
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("invoked service method in lifeCycleServlet without http");
		super.service(arg0, arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet method in lifeCycleServlet");
		super.doGet(req, resp);
	}
	
		
	@Override
	public void destroy() {
		System.out.println("invoked destroy method in lifeCycleServlet");
		super.destroy();
	}
	
	
}
