package com.xworkz.country.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {

	public CountryServlet() {
		System.out.println("country servlet created");

	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("invoked service Country Servlet");
		
		String name =request.getParameter("Name");
		System.out.println("Name ".concat(name));
		
		String code =request.getParameter("Code");
		System.out.println("Name ".concat( code));
		
		String population =request.getParameter("Population");
		System.out.println("Name ".concat(population));
		
		String primeMinister =request.getParameter("PrimeMinister");
		System.out.println("Name ".concat(primeMinister));
		
		String president =request.getParameter("President");
		System.out.println("Name ".concat(president));
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>");
		out.print("Detals of the Country :".concat(name));
		out.print("<br>");
		out.print("Code :".concat(code));
		out.print("<br>");
		out.print("Papulation :".concat(population));
		out.print("<br>");
		out.print("PrimeMinister :".concat(primeMinister));
		out.print("<br>");
		out.print("President :".concat(president));
	
		out.print("</h1>");		
		out.print("</body>");	
		out.print("</html>");
		
	}
}
