<%@include file="header.jsp" %>
<div class="container">
    <h1>Login</h1>  
    <form action="LoginServlet" method="post">  
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" class="form-control" name="name" id="name">
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" name="password" id="password">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
        <div class="form-group">
            <a href="SignUpJsp.jsp" type="submit" class="btn btn-primary">SignUp</a>
        </div>
    </form>  
    <br/>  
</div>
<%@include file="footer.html" %>