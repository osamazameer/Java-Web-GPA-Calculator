<%@include file="header.jsp" %>
<div class="container">
    <h1>Login</h1>  
    <form action="LoginServlet" method="post">  
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" name="name" id="name">
        </div>
       <div class="form-group">
                <label for="age">Roll No</label>
                <input type="text" class="form-control" name="roll" id="roll">
            </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
        <div class="form-group">
          Not Registered?  <a href="RegJsp.jsp" type="submit">SignUp</a>
        </div>
    </form>  
    <br/>  
</div>
<%@include file="footer.html" %>