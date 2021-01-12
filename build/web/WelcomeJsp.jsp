<%-- 
    Document   : index_jsp
    Created on : Dec 23, 2020, 2:50:12 PM
    Author     : Ocama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.html" %>
<div class="container">
    <h1>Welcome</h1>  
    <%
        if (session.getAttribute("name") != null) {
            out.print(session.getAttribute("name").toString());
        } else {
            response.sendRedirect("LoginJsp.jsp");
        }
    %>
    <br/>
    <a href="index_jsp.jsp"></a>
</div>
<%@include file="footer.html" %>

