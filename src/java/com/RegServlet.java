package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String sem=request.getParameter("sem");
		
		String roll=request.getParameter("roll");
		
		Student s=new Student();
		s.name=name;	
                s.sem=sem;
                s.roll = Integer.parseInt(roll);
		StudentDao dao = new StudentDao();
		int status=dao.InsertRecord(s);
		if(status>0){
			//out.print("<p>Record saved successfully!</p>");
                        response.sendRedirect("LoginJsp.jsp");
			//request.getRequestDispatcher("ViewRecords.jsp").include(request, response);
		}else{
			out.println("Sorry! unable to save record");
		}
		
		out.close();
	}

}
