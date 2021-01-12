package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/CgpaServlet")
public class CgpaServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
                
                int sem = Integer.parseInt(request.getParameter("sem"));
                float gpa = Float.parseFloat(request.getParameter("gpa"));

                DAOcgpalogic obj = new DAOcgpalogic();
//                float answer = Float.parseFloat(result.getText());
                //float calculatedgpa = obj.calCgpa(sem,gpa,answer);
                //result.setText(""+calculatedgpa);
                
                
                
                //  }
//		Student s=new Student();
		
//		StudentDao dao = new StudentDao();
//		int status=dao.InsertRecord(s);
//		if(status>0){
//			out.print("<p>Record saved successfully!</p>");
//                        response.sendRedirect("LoginJsp.jsp");
//			request.getRequestDispatcher("ViewRecords.jsp").include(request, response);
//		}else{
//			out.println("Sorry! unable to save record");
//		}
//		
		//out.close();
	}

}
