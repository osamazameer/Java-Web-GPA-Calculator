
<%@page import="java.util.*,com.Student,com.StudentDao" contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<div class="container">
    <h1>My Data</h1>
<%
    int roll = Integer.parseInt(session.getAttribute("roll").toString());
    StudentDao dao = new StudentDao();
    ArrayList<Student> list = dao.selectAll(roll);
%>
<div class="table-responsive">
     <table class="table">
         <thead>
        <tr>
        <th>Roll No</th>
        <th>Semester</th>
        <th>SGPA</th>

        </tr>
        </thead>
        <tbody>
    
        </tbody>
        <% for (Student s : list) {%>
        <tr>

            <td><%=s.roll%></td>
            <td><%=s.sem%></td>  
            <td><%=s.sgpa%></td>

        </tr>
        <% }%>
    </table>
</div>
        
<%@include file="footer.html" %>
