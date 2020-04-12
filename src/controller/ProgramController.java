package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.*;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProgramModel;


@WebServlet("/listCourses")
public class ProgramController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//value coming from the form
		String program = request.getParameter("program");
		
		//pass information to the model
		ProgramModel model = new ProgramModel();
		List <String> courses = model.getCourses(program);
		
		// in order to share information among different components of the app, we use attributes
		// since we are on the request, we set the attribute on the request
		request.setAttribute("courses", courses);
		
		//get model response and send it back to the view
		RequestDispatcher dispatcher = request.getRequestDispatcher("courses.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

}
