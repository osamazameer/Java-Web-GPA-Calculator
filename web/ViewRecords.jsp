
<%@page import="java.util.*,com.Student,com.StudentDao" contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.html" %>

<div class="container">
    <h1>Student List</h1>
<%
    StudentDao dao = new StudentDao();
    ArrayList<Student> list = dao.selectAll();
%>
<div class="table-responsive">
     <table class="table">
         <thead>
        <tr>
        <th>Name</th>
        <th>Roll No</th>
        </tr>
        </thead>
        <tbody>
    
        </tbody>
        <% for (Student s : list) {%>
        <tr>

            <td><%=s.name%></td>
            <td><%=s.roll%></td>
        </tr>
        <% }%>
    </table>
</div>
<!--<div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>#</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Age</th>
        <th>City</th>
        <th>Country</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>1</td>
        <td>Anna</td>
        <td>Pitt</td>
        <td>35</td>
        <td>New York</td>
        <td>USA</td>
      </tr>
    </tbody>
  </table>
  </div>-->
</div>

<%@include file="footer.html" %>
