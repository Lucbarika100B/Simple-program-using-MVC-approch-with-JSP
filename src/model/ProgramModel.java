package model;


import java.util.ArrayList; 
import java.util.List; 


public class ProgramModel {
	
	public List<String> getCourses(String program) {
		
		List <String> courses = new ArrayList<>();
		switch(program) {
			
			case"Java":
			 	courses.add("Kotlin"); 
			 	courses.add("Servlet JSP");
			 	courses.add("HTML, CSS, JS");
			 	courses.add("Spring, Hibernate");
			 	break;
			case "Web-Development":
				courses.add("Node JS");
				courses.add("HTML, CSS, JS");
				courses.add("React, Angular");
				courses.add("MySQL, PHP");
				break;
			case "Business-Intelligence":
				courses.add("Data Scrapping");
				courses.add("Data engineering");
				courses.add("Apache Spark");
				courses.add("SQL, Tableau");
				break;
		}
		
		
		return courses;
	}
	
	

}
