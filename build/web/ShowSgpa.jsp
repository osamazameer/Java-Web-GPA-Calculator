<%-- 
    Document   : index_jsp
    Created on : Dec 23, 2020, 2:50:12 PM
    Author     : Ocama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<div class="container">
    
    <%
        if (session.getAttribute("name") != null) {
            //out.print(session.getAttribute("name").toString());
        } else {
            response.sendRedirect("LoginJsp.jsp");
        }
    %>
    <div class="w3-container d-block m-auto">

        <div class="container w3-card-4 text-center" >
        <header class="w3-container">
        <h3>Roll No : <%=session.getAttribute("roll")%></h3>
        </header>

        <div class="w3-container">
        <h4> Your GPA is  = <%=session.getAttribute("sgpa") %> </h4>

        </div>


        </div>
        </div>
        <br><br><br>
</div>
<%@include file="footer.html" %>

