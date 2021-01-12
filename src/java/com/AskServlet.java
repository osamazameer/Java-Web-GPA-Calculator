package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AskServlet")
public class AskServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int sub= Integer.parseInt(request.getParameter("subs"));
		
		HttpSession session = request.getSession();
                session.setAttribute("subs", sub);
             
                
		
                response.sendRedirect("SgpaJsp.jsp");
                request.getRequestDispatcher("ViewRecords.jsp").include(request, response);
		
		
		out.close();
	}

}
