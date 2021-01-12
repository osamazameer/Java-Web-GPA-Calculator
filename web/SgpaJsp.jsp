<%-- 
    Document   : RegJsp
    Author     : Ocama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<div class="container">
    <h1 class="text-center pb-4">Calculate SGPA</h1>  
    <form action="SgpaServlet" >    
       
        <div class="form-row col-md-12 text-center">
             
             <div class="form-group text-center">
                 <label class="switch">Marks Based or Grades Based?</label>
                 <select onchange="hideMarks()" id="mbgb" name="mbgb" class="form-control">
                 <option value="mb">Marks Based</option>
                 <option value="gb">Grades Based</option>
               </select>

             </div>           
            </div>
        
            <%
            int checkSub = Integer.parseInt(session.getAttribute("subs").toString());
            %>

           
            <%
            for (int i = 0; i < checkSub; i++) {
            %>
            <div class="form-row">
             <div class="form-group col-md-3">
               <label>Subject <%=i+1 %></label>
                <input type="text" class="form-control" id="sub<%=i+1 %>" name="sub<%=i+1 %>">
             </div>
             <div class="form-group col-md-3">
               <label>Credit Hours</label>
               <select id="ch<%=i+1 %>" name="ch<%=i+1 %>" class="form-control">
                 <option selected>Choose...</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 <option value="4">4</option>

               </select>
             </div>
             <div class="form-group col-md-3">
               <label>Marks</label>
               <input type="text" class="form-control" id="marks<%=i+1 %>" name="marks<%=i+1 %>">
             </div>
            <div class="form-group col-md-3">
               <label>Grades</label>
               <input type="text" class="form-control" id="grade<%=i+1 %>" name="grade<%=i+1 %>">
             </div>
           </div>
            <%
            }            
            %>
                        
            <div class="form-group m-auto text-center">
                <button type="submit" class="btn btn-primary">Calculate</button>
            </div
 
    </form>  
    <br/>  

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

