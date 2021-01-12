<%-- 
    Document   : RegJsp
    Author     : Ocama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<div class="container">
    <h1 class="text-center pb-4">Calculate SGPA</h1>  
    <form action="AskServlet" method="post" class="text-center">    
        <div class="form-row col-md-12 text-center">
             <div class="form-group text-center">
                 <label>Subjects</label>
               <select id="subs" name="subs" class="form-control">
                 <option selected>Choose...</option>
                 <option value="3">3</option>
                 <option value="4">4</option>
                 <option value="5">5</option> 
                 <option value="6">6</option>

               </select>

             </div>
            
                      
        </div> 
  
           
            
            <div class="form-group m-auto text-center">
                <button type="submit" class="btn btn-primary">Go</button>
            </div
   </form>  

<script>
function hideMarks() {
//  var x1 = document.getElementById("marks1");
document.getElementById("marks1").setAttribute("disabled", "disabled");
document.getElementById("marks2").setAttribute("disabled", "disabled");
document.getElementById("marks3").setAttribute("disabled", "disabled");
document.getElementById("marks4").setAttribute("disabled", "disabled");
document.getElementById("marks5").setAttribute("disabled", "disabled");
document.getElementById("marks6").setAttribute("disabled", "disabled");

}
function hideGrades() {
document.getElementById("grade1").setAttribute("disabled", "disabled");
document.getElementById("grade2").setAttribute("disabled", "disabled");
document.getElementById("grade3").setAttribute("disabled", "disabled");
document.getElementById("grade4").setAttribute("disabled", "disabled");
document.getElementById("grade5").setAttribute("disabled", "disabled");
document.getElementById("grade6").setAttribute("disabled", "disabled");
  }
</script>
</div>


<%@include file="footer.html" %>

