package com.xworkz.hacker;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class PlanateHttpServlet extends HttpServlet {
	
	String totalPlanets="8";
	
	public PlanateHttpServlet(){
		
		System.out.println("invoked no-org const from ".concat(this.getClass().getSimpleName()));
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("invoked init servleConfiguration.....");
		System.out.println(totalPlanets);
		String totalPlanet =config.getInitParameter("totalPlanets");
		System.out.println(totalPlanet);
		
		String galaxyName =config.getInitParameter("galaxy");
		System.out.println(galaxyName);
		
		String phoneNumber =config.getInitParameter("suryaPhNo");
		System.out.println(phoneNumber);
		
		
		
	}
	
}
