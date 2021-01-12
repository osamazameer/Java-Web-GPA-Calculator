<%-- 
    Document   : RegJsp
    Author     : Ocama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<div class="container">
    <h1>Add New Student</h1>  
    <form action="RegServlet" method="post">  
        <table>  
           
            <div class="form-group">
                <label for="name">Username:</label>
                <input type="text" class="form-control" name="name" id="name">
            </div>
            <div class="form-group">
                <label for="age">Roll No</label>
                <input type="text" class="form-control" name="roll" id="age">
            </div>
            <div class="form-group">
                <label for="cnic">Password :</label>
                <input type="text" class="form-control" name="pass" id="cnic">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div
 
        </table>  
    </form>  
    <br/>  
    Already Registered?<a href="LoginJsp.jsp">Login</a>  
</div>
<%@include file="footer.html" %>

