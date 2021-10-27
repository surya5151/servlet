package com.xworkz.gym.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GymServlet extends HttpServlet {
	
	
	public GymServlet(){
		System.out.println("GymServlet Created");		
	}
	
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	System.out.println("Invoked service in gym servlet "); 
	
	String gymName = request.getParameter("gymName" );
	System.out.println("GymName :".concat(gymName));
	
	String location =request.getParameter("location");
	System.out.println("Location :".concat(location));
	
	String fees =request.getParameter("fees");
	System.out.println("Fees :".concat(fees));
	
	String rating =request.getParameter("Rating");
	System.out.println("Rating :".concat(rating));
	
	String review = request.getParameter("Reviews");
	System.out.println("Reviews :".concat(review));
	
	String contact =request.getParameter("contact");
	System.out.println("Contact :".concat(contact));
	
	System.out.println("Starting to response");
	
	response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	out.print("<html>");
	out.print("<body>");	
	out.print("<h1 style='color:Green'>");
	out.print("Details Saved for ".concat(gymName));
	out.print("<br>");
	out.print("Location :".concat(location));
	out.print("<br>");
	out.print("Fees :".concat(fees));
	out.print("<br>");
	out.print("Rating :".concat(rating));
	out.print("<br>");
	out.print("Reviews :".concat(review));
	out.print("<br>");
	out.print("Contact :".concat(contact));
	
	out.print("</h1>");	
	out.print("</body>");	
	out.print("</html>");
	
	
}	

}
