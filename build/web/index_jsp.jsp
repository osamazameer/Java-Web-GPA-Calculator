<%-- 
    Document   : index_jsp
    Created on : Dec 23, 2020, 2:50:12 PM
    Author     : Muneeb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.html" %>
<div class="container">
    <h1>Add New Student</h1>
    <%
            if (session.getAttribute("rollno") != null) {
                out.print(session.getAttribute("rollno").toString());
            } else {
                response.sendRedirect("LoginJsp.jsp");
            }
        %>
    <form action="SaveServlet" method="post">  
        <div class="form-group">
                <label for="ID">ID:</label>
                <input type="text" class="form-control" name="id" id="ID">
            </div>
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" name="name" id="name">
            </div>
            <div class="form-group">
                <label for="age">Age:</label>
                <input type="text" class="form-control" name="age" id="age">
            </div>
            <div class="form-group">
                <label for="cnic">Cnic:</label>
                <input type="text" class="form-control" name="cnic" id="cnic">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div

    </form>  
    <br/>  
    <a href="ViewRecords.jsp">View Students</a>  
</div>
<%@include file="footer.html" %>

