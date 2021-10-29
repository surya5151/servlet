package com.xworkz.hospital.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HospitalServlet extends HttpServlet {

	public HospitalServlet() {

		System.out.println("Hosptial servlet created");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("invoked service in hospital servlet");
		
		String hospitalName =request.getParameter("Hospital Name");
		System.out.println("Hospital Name :".concat(hospitalName));
		
		String founder =request.getParameter("Founder");
		System.out.println("Hospital Founder :".concat(founder));
		
		String establisedDate =request.getParameter("EstablisedDate");
		System.out.println("Hospital EstablisedDate :".concat(establisedDate));
		
		String specilization =request.getParameter("Specilization");
		System.out.println("Hospital Specilization :".concat(specilization));
		
		String chiefDoctor =request.getParameter("ChiefDoctor");
		System.out.println("Hospital ChiefDoctor :".concat(chiefDoctor));
		
		String noOFNurse =request.getParameter("noOFNurse");
		System.out.println("Hospital noOFNurse :".concat(noOFNurse));
		
		String noOFBeds =request.getParameter("noOFBeds");
		System.out.println("Hospital noOFBeds :".concat(noOFBeds));
		
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("<html>");
		out.print("<body>");	
		out.print("<h1 style='color:Green'>");
		out.print("Details Saved for ".concat(hospitalName));
		out.print("<br>");
		out.print("Founder :".concat(founder));
		out.print("<br>");
		out.print("EstablisedDate :".concat(establisedDate));
		out.print("<br>");
		out.print("Specilization :".concat(specilization));
		out.print("<br>");
		out.print("ChiefDoctor :".concat(chiefDoctor));
		out.print("<br>");
		out.print("noOFNurse :".concat(noOFNurse));
		out.print("<br>");
		out.print("noOFBeds :".concat(noOFBeds));
		
		out.print("</h1>");	
		out.print("</body>");	
		out.print("</html>");
		
	}
}
