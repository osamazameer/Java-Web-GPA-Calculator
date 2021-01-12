<!DOCTYPE html>
<html>
<title>Numl GPA Calc</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

  <style>
body{margin: 0px !important;font-family: "Raleway", Arial, sans-serif; }
h1 {letter-spacing: 6px}
.w3-row-padding img {margin-bottom: 12px}
.background{margin: 0px;}
header{margin: 0px;}
.head{margin-top:30px;}

</style>

<body>

<!-- !PAGE CONTENT! -->
<!--<div class="w3-content" style="max-width:1500px">-->

<!-- Header -->
<header style="background-color:#555a61 !important; color:white !important;" class="w3-panel background w3-center">
   <%
       String name= null;
       if(session.getAttribute("name") !=  null){
        name = session.getAttribute("name").toString();
       }
   %> 
   <% if(name != null){ %>
   <h1 class="head">Welcome To NUML GPA Calculator, <span style="color:red;"><%=name %></span></h1>
   <%} else {%>
   <h1 class="head">You're Not Logged In,  <a href="LoginJsp.jsp">Log In</span></h1>
   <%}%>
   
     <% if(name != null){ %>
  <div class="w3-padding-32">
    <div class="w3-bar w3-border">
      <a href="askjsp.jsp" class="w3-bar-item w3-button">Calculate GPA</a>
      <a href="ViewRecords.jsp" class="w3-bar-item w3-button">My Data</a>
      <a href="CgpaJsp.jsp" class="w3-bar-item w3-button">My CGPA</a>
        <a href="Logout" class="w3-bar-item w3-button">Logout</a>
        

    </div>
  </div>
   <%} else {%>
     <div class="w3-padding-32">
    <div class="w3-bar w3-border">

        <a href="LoginJsp.jsp" class="w3-bar-item w3-button">Login</a>
        

    </div>
  </div>
   <%}%>
  
</header>