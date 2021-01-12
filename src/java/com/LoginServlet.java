
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String username = request.getParameter("name");
            String roll = request.getParameter("roll");

           Student s = new Student();
            s.name= username;
            
            
            StudentDao dao = new StudentDao();
            String passcode = null;
            ResultSet rs = dao.login(s);
            try {
                while (rs.next()) {
                    passcode = rs.getString(1);
                }
                if (passcode.equals(username)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("name", username); 
                    session.setAttribute("roll", roll);


                    response.sendRedirect("askjsp.jsp");
                } else {
                    response.sendRedirect("ErrorPage.jsp");
                    out.print("Error");
                }
            } catch (Exception ex) {
                out.close();
            }
        }
    }
}
