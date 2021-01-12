package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SgpaServlet")
public class SgpaServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
                DAOgpalogic check = new DAOgpalogic();
                Student s = new Student();   
                StudentDao dao = new StudentDao();

                
                
                float marks= 0;
                int ch;
                int total_ch = 0;
                float total_p = 0;
                String sub,grade;
                String mbgb;
                
                
                HttpSession session = request.getSession();
                int checkSubs = Integer.parseInt(session.getAttribute("subs").toString());
                int rollno = Integer.parseInt(session.getAttribute("roll").toString());
                
                mbgb = request.getParameter("mbgb"); 
                
                if("mb".equals(mbgb)){

                for (int i = 1; i <= checkSubs; i++) {
                  ch = Integer.parseInt(request.getParameter("ch" + i ));
                  marks = Float.parseFloat(request.getParameter("marks" + i ));
                  float sub1point = check.checkByMarks(marks) * ch;
                  total_p = total_p + sub1point;
                  total_ch = total_ch + ch;
                  s.marks = marks;
                  s.ch = ch;
                  s.grade = "o";
                  s.sem = request.getParameter("sem");
                  s.roll = rollno;
                  s.sub = request.getParameter("sub" + i);
                  dao.sgpaSave(s);
                  
                  
                }
                float sgpa = total_p/total_ch;
                out.print(sgpa);
                session.setAttribute("sgpa", sgpa);

                s.sgpa = sgpa;
                s.roll = rollno;
                s.sem = request.getParameter("sem");
                dao.saveSgpa(s);
                response.sendRedirect("ShowSgpa.jsp");
                
                }
                else if ("gb".equals(mbgb)){
                  for (int i = 1; i <= checkSubs; i++) {
                  ch = Integer.parseInt(request.getParameter("ch" + i ));
                  grade = request.getParameter("grade" + i );
                  float sub1point = check.checkByGrades(grade) * ch;
                  total_p = total_p + sub1point;
                  total_ch = total_ch + ch;
                  s.marks = 100;
                  s.ch = ch;
                  s.grade = grade;
                  s.sem = request.getParameter("sem");
                  s.roll = rollno;
                  s.sub = request.getParameter("sub" + i);
                  dao.sgpaSave(s);

                }
                float sgpa = total_p/total_ch;
                out.print(sgpa);
                session.setAttribute("sgpa", sgpa);
                s.sgpa = sgpa;
                s.roll = rollno;
                s.sem = request.getParameter("sem");
                dao.saveSgpa(s);
                response.sendRedirect("ShowSgpa.jsp");
                
                }
                
	
		out.close();
	}

}

//
//ResultSet rs = dao.singleStudent(rollNo);
//            try{
//                while(rs.next()){
//                    if(semester == rs.getInt("semester")){
//                        exists=true;
////                       out.print("<div class='bg-danger'>You already have SGPA for this semester!</div>");
//                        response.sendRedirect("semester_exists.jsp");
//                    }
//                }
//            }
//            catch(Exception ex){
//                System.out.println(ex.toString());
//            }