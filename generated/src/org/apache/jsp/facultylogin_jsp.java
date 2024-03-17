package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facultylogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("        <title>Faculty Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"navstyle.css\">\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("                background-color: #ccffcc;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .std{\n");
      out.write("                border: 3px solid #FC3;\n");
      out.write("                border-radius: 30px;\n");
      out.write("                padding: 20px 20px;\n");
      out.write("                font-size: 30px;\n");
      out.write("                background-color: rgba(22,34,57,0.95);\n");
      out.write("                color: #FC3;\n");
      out.write("                height: 440px;\n");
      out.write("                width: 600px;\n");
      out.write("                margin-top: 1.3in;\n");
      out.write("                margin-left: 4.4in;\n");
      out.write("            }\n");
      out.write("            input[type=text],[type=password]{\n");
      out.write("                height: 40px;\n");
      out.write("                width: 300px;\n");
      out.write("                border-radius:5px;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            input[type=submit]{\n");
      out.write("                height: 40px;\n");
      out.write("                width: 110px;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                background-color: #FC3;  \n");
      out.write("                color: rgba(22,34,57,0.95);\n");
      out.write("                font-size: 25px;\n");
      out.write("                transition: 1s;\n");
      out.write("            }\n");
      out.write("            input[type=submit]:hover{\n");
      out.write("                height: 60px;\n");
      out.write("                width: 150px;\n");
      out.write("                transition: 1s;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                background-color: rgba(22,34,57,0.95);\n");
      out.write("                color: #FC3;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            table tr td h2{\n");
      out.write("                letter-spacing: 0.06em;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            table tr td{\n");
      out.write("                padding: 7px 7px;\n");
      out.write("                /*               text-shadow: 1px 1px 5px;*/\n");
      out.write("            }\n");
      out.write("            .icon{\n");
      out.write("                height:40px;\n");
      out.write("                width:40px;\n");
      out.write("                padding: 10px 0px;\n");
      out.write("                margin-top: 2px;\n");
      out.write("            }\n");
      out.write("            table tr td a{\n");
      out.write("                font-size: 20px;\n");
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
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
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
      out.write("        <div class=\"std\">\n");
      out.write("            <form method=\"POST\" action=\"facultylogincheck.jsp\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\"><h2>Faculty Login</h2></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><img src=\"images/email.png\" class=\"icon\" /></td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" placeholder=\"     Enter email address\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><img src=\"images/password.png\" class=\"icon\" /></td>\n");
      out.write("                        <td><input type=\"password\" name=\"password\" placeholder=\"     Enter password\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Login\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\"><a href=\"facultyforgotpass.jsp\">forgot password ?</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>");
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
