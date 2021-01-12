package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.Student;
import com.StudentDao;

public final class ViewRecords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>W3.CSS Template</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body,h1 {font-family: \"Raleway\", Arial, sans-serif}\n");
      out.write("h1 {letter-spacing: 6px}\n");
      out.write(".w3-row-padding img {margin-bottom: 12px}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<!--<div class=\"w3-content\" style=\"max-width:1500px\">-->\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<header class=\"w3-panel w3-center w3-opacity\" style=\"padding:128px 16px\">\n");
      out.write("  <h1 class=\"w3-xlarge\">PHOTOGRAPHER</h1>\n");
      out.write("  <h1>John Doe</h1>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-padding-32\">\n");
      out.write("    <div class=\"w3-bar w3-border\">\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\">Home</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-light-grey\">Portfolio</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\">Contact</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small\">Weddings</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("        <h1>Student List</h1>\n");
      out.write("        ");

            StudentDao dao = new StudentDao();
            ArrayList<Student> list = dao.selectAll();

        
      out.write("\n");
      out.write("        <table border='1' width='100%'>\n");
      out.write("            <tr><th>Id</th><th>Name</th><th>Age</th><th>CNIC</th><th>Edit</th><th>Delete</th></tr>\n");
      out.write("                    ");
                    
                        for (Student s : list) {
                    
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(s.id);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.name);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.Age);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.CNIC);
      out.write("</td>\n");
      out.write("                <td><a href='EditServlet?id=");
      out.print(s.id);
      out.write("'>edit</a></td><td><a href='DeleteServlet?id=");
      out.print(s.id);
      out.write("'>delete</a></td></tr>\n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("                ");
      out.write("<!--</div>-->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-padding-64 w3-light-grey w3-center w3-large\"> \n");
      out.write("  <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("  <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\" class=\"w3-hover-text-green\">w3.css</a></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
