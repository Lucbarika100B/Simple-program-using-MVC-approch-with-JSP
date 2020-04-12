<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "java.util.List" %>;
    <%@ page import= "java.util.ArrayList" %>;
    <%@ page import= " javax.servlet.http.HttpServletRequest" %>; 
    
<!DOCTYPE html>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
		<title>JSP page</title>
	</head>

	<body>
		<h1> 
		Program:
		
			<% 
			out.println(request.getParameter("program"));
			%>
		</h1>
		
			<% 
			List<String> courses =(List<String>)request.getAttribute("courses");
			for(String course : courses){ 
			%>
			
				<p> <% out.println(course);%> </p>
			<% }
		
			%>
		
	</body>


</html>