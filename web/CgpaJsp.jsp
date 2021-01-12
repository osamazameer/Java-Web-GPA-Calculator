<%@include file="header.jsp" %>
<div class="container">
    <h1>Login</h1>  
    <form action="CgpaServlet" method="post">  
        <div class="form-group">
            <label>Semester</label>
            <input type="text" class="form-control" name="sem" id="name">
        </div>
        <div class="form-group">
            <label>GPA</label>
            <input type="text" class="form-control" name="gpa" id="password">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Calculate</button>
        </div>
        
    </form>  
    <br/>  
</div>
<%@include file="footer.html" %>