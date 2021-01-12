<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
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
.background{background-color: #dedede;margin: 0px;}
header{margin: 0px;}
.head{margin-top:30px;}

</style>

<body>

<!-- !PAGE CONTENT! -->
<!--<div class="w3-content" style="max-width:1500px">-->

<!-- Header -->
<header class="w3-panel background w3-center w3-opacity">
   <%
    String name = session.getAttribute("name").toString();
   %> 
   
   <h1 class="head">Welcome To NUML GPA Calculator, <span style="color:red;"><%= name %></span></h1>
  
  <div class="w3-padding-32">
    <div class="w3-bar w3-border">
      <a href="mainjsp.jsp" class="w3-bar-item w3-button">Home</a>
      <a href="login.jsp" class="w3-bar-item w3-button">Login</a>
      <a href="ViewRecords.jsp" class="w3-bar-item w3-button">View</a>
      <a href="#" class="w3-bar-item w3-button">Register</a>
      <a href="Logout.java" class="w3-bar-item w3-button">Logout</a>

    </div>
  </div>
</header>