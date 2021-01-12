<%@include file="header.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.StudentDao" contentType="text/html" pageEncoding="UTF-8"%>
<h1></h1>
<% 
            if(session.getAttribute("roll") == null){
                response.sendRedirect("LoginJsp.jsp");
            }
            
            StudentDao dao = new StudentDao();
            int rollNo = Integer.parseInt(session.getAttribute("roll").toString());
            ResultSet res = dao.sgpaCal(rollNo);
            try{
            while(res.next()){
            %>
            
        <div class="w3-container d-block m-auto">

        <div class="container w3-card-4 text-center" >
        <header class="w3-container">
        <h3>Roll No : <%=rollNo%></h3>
        </header>

        <div class="w3-container">
        <h4> Your CGPA  = <%= res.getFloat(1) %> </h4>

        </div>


        </div>
        </div>
        <br><br><br>
        
            
        <div class="container mt-4 pt-4">     
   <table class="table container">
    <thead class="thead-dark">
        <tr>
            <th scope="col">Roll#</th>
            <th scope="col">Subject</th>
            <th scope="col">CHOURS</th>
            <th scope="col">Marks</th>
            <th scope="col">Grade</th>
            <th scope="col">Semester</th>
        </tr>
    </thead>
    <tbody>
        <%
            ResultSet rs = dao.indStudent(rollNo);
            while (rs.next()) {
        %>
        <tr>
            <th scope="row"> <%= rs.getInt("roll")%> </th>
            <td><%= rs.getString("subject")%></td>
            <td><%= rs.getInt("credit")%></td>
            <td><%= rs.getFloat("marks")%></td>
            <td><%= rs.getString("grade")%></td>
            <td><%= rs.getString("semester")%></td>
        </tr>
        <% } %>
    </tbody>
</table>
        </div>
    
            <% }} catch(Exception ex) { System.out.println(ex.toString()); } 
            %>
            
            
            
            
