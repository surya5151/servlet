package com.xworkz.hacker;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerServlet extends HttpServlet {

	public registerServlet() {
		System.out.println("Create Registor servlet");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("Send data only from button click...");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		
	}
	
	//doGet
	//doPost
	//doDelete
	//service method to do method

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("invoked service in register servlet");

		// request parameters

		String fastname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String pass = request.getParameter("password");

		System.out.println(fastname.concat(" ").concat(lastname).concat(" ").concat(email).concat(" ").concat(phone)
				.concat(" ").concat(pass));

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("Register sucess....");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

	}

}
