package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>University Campus Automation</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"navstyle.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .img{\n");
      out.write("                margin-top:1in;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <header class=\"main-header clearfix\" role=\"header\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"#\"><em>University </em> Campus <em>Automation</em></a>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#menu\" class=\"menu-link\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <nav id=\"menu\" class=\"main-nav\" role=\"navigation\">\n");
      out.write("                    <ul class=\"main-menu\">\n");
      out.write("                        <li><a href=\"homepage.jsp\">Home</a></li>\n");
      out.write("                        <li class=\"has-submenu\"><a href=\"#\">Login</a>\n");
      out.write("                            <ul class=\"sub-menu\">\n");
      out.write("                                <li><a href=\"stdlogin.jsp\">Student Login</a></li>\n");
      out.write("                                <li><a href=\"facultylogin.jsp\">Faculty Login</a></li>\n");
      out.write("                                <li><a href=\"adminlogin.jsp\">Admin Login</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#section6\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"img\">\n");
      out.write("            <img src=\"images/home.jpg\"/>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
