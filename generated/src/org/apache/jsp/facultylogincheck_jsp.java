package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class facultylogincheck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connfile.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String driver="com.mysql.jdbc.Driver";
    Class.forName(driver).newInstance();
    
    Connection con=null;
    ResultSet rst=null;
    Statement stmt=null;
    
    try{
        String url="jdbc:mysql://localhost/uca?user=root&password=root";
        con=DriverManager.getConnection(url);
        stmt=con.createStatement();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }

      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <script>\n");
      out.write("        function UserAlert()\n");
      out.write("        {\n");
      out.write("//            alert(\"Login Succesful!\");\n");
      out.write("            window.location.href=\"loading1.jsp\";\n");
      out.write("        }\n");
      out.write("        function AdminAlert()\n");
      out.write("        {\n");
      out.write("//            alert(\"Login Succesful!\");\n");
      out.write("            window.location.href=\"loading1.jsp\";\n");
      out.write("        }\n");
      out.write("        function InvalidAlert()\n");
      out.write("        {\n");
      out.write("            alert(\"Invalid Credentials!\");\n");
      out.write("            window.location.href=\"facultylogin.jsp\";\n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<center>\n");
 
        String userid = request.getParameter("email");
        String password = request.getParameter("password");
        rst = stmt.executeQuery("select * from facultyregister where emailid='" +userid+ "' and password='"+password+"'");
        if(rst.next())
        { 
            out.println("<script>AdminAlert();</script>");
        }
        rst = stmt.executeQuery("select * from facultyregister where emailid='" +userid+ "' and password='"+password+"'");
        if(rst.next())
        {
            session.setAttribute("emailid",userid);
//            session.setAttribute("course",rst.getString("course"));
            out.println("<script>UserAlert();</script>");
        }
               else
        {
            out.println("<script>InvalidAlert();</script>");
        }
        
      out.write("\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
