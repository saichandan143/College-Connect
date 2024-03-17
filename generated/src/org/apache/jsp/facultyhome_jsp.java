package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class facultyhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("        <title>Faculty Homepage</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"sidebar.css\">\n");
      out.write("        <style>\n");
      out.write("            /* Body styles */\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("                background-color: #ccffcc; \n");
      out.write("            }\n");
      out.write("            .maincontent{\n");
      out.write("                width: 1180px;\n");
      out.write("                height: 115%;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 330px;\n");
      out.write("                /*background-color: yellowgreen;*/\n");
      out.write("                /*border: 3px solid black;*/\n");
      out.write("            }\n");
      out.write("            .maincontent h1{\n");
      out.write("                text-align: center;\n");
      out.write("                /*text-decoration: underline;*/\n");
      out.write("                /*background-color: yellowgreen;*/\n");
      out.write("                /*width: 1100px;*/\n");
      out.write("            }\n");
      out.write("            .sub1{\n");
      out.write("                font-size: 30px;\n");
      out.write("                /*position: absolute;*/\n");
      out.write("                margin-left: 20px;\n");
      out.write("                margin-top: 25px;\n");
      out.write("            }\n");
      out.write("            .notice1{\n");
      out.write("                /*border: 2px solid black;*/\n");
      out.write("                text-align: left;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 140px;\n");
      out.write("                left: 440px;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 190px;\n");
      out.write("                padding-bottom: 30px 0px;\n");
      out.write("                font-size: 22px;\n");
      out.write("                background-color: rgba(22,34,57,0.95);\n");
      out.write("            }\n");
      out.write("            .noticeicon{\n");
      out.write("                margin-top: 15px;\n");
      out.write("                margin-left: 15px;\n");
      out.write("            }\n");
      out.write("            .notice1 a{\n");
      out.write("                /*border: 1px solid black;*/\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                left: 65px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: whitesmoke;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .notice1 a:hover{\n");
      out.write("                /*border: 1px solid black;*/\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                left: 65px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #FC3;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .notes1{\n");
      out.write("                /*border: 2px solid black;*/\n");
      out.write("                text-align: left;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 140px;\n");
      out.write("                left: 760px;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 190px;\n");
      out.write("                padding-bottom: 30px 0px;\n");
      out.write("                font-size: 22px;\n");
      out.write("                background-color: rgba(22,34,57,0.95);\n");
      out.write("            }\n");
      out.write("            .notesicon{\n");
      out.write("                margin-top: 15px;\n");
      out.write("                margin-left: 15px;\n");
      out.write("            }\n");
      out.write("            .notes1 a{\n");
      out.write("                /*border: 1px solid black;*/\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                left: 65px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: whitesmoke;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .notes1 a:hover{\n");
      out.write("                /*border: 1px solid black;*/\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                left: 65px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #FC3;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .assignment1{\n");
      out.write("                /*border: 2px solid black;*/\n");
      out.write("                text-align: left;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 140px;\n");
      out.write("                left: 1100px;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 280px;\n");
      out.write("                padding-bottom: 30px 0px;\n");
      out.write("                font-size: 22px;\n");
      out.write("                background-color: rgba(22,34,57,0.95);\n");
      out.write("            }\n");
      out.write("            .assignmenticon{\n");
      out.write("                margin-top: 15px;\n");
      out.write("                margin-left: 15px;\n");
      out.write("            }\n");
      out.write("            .assignment1 a{\n");
      out.write("                /*border: 1px solid black;*/\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                left: 65px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: whitesmoke;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .assignment1 a:hover{\n");
      out.write("                /*border: 1px solid black;*/\n");
      out.write("                position: absolute;\n");
      out.write("                top: 20px;\n");
      out.write("                left: 65px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #FC3;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            div.facultynotice{\n");
      out.write("                margin:4px, 4px;\n");
      out.write("                padding:4px;\n");
      out.write("                background-color: grey;\n");
      out.write("                width: 450px;\n");
      out.write("                height: 210px;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                overflow-y: auto;\n");
      out.write("                text-align:justify;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 450px;\n");
      out.write("                top: 350px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            .facultynotice h2{\n");
      out.write("               margin-left: 130px;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .adminnotice table tr td{\n");
      out.write("                padding: 15px 15px;\n");
      out.write("            }\n");
      out.write("            .facultynotice table tr td{\n");
      out.write("                padding: 15px 15px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String username = (String) session.getAttribute("emailid");
            rst = stmt.executeQuery("select * from facultyregister where emailid='"+username+"'");
            if (rst.next()) {
        
      out.write("\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <div class=\"admin\"><h3><u>Faculty</u></h3></div>\n");
      out.write("            <h1><u>SmartUni</u></h1><ul class=\"slidecontent\">\n");
      out.write("                <li class=\"sub1\"><u>Main</u></li><br/>\n");
      out.write("                <li><a href=\"facultyhome.jsp\"><svg class=\"notice\" xmlns=\"http://www.w3.org/2000/svg\" height=\"1.5em\" viewBox=\"0 0 576 512\"><style>svg{fill:#f7f7f7}</style><path d=\"M575.8 255.5c0 18-15 32.1-32 32.1h-32l.7 160.2c0 2.7-.2 5.4-.5 8.1V472c0 22.1-17.9 40-40 40H456c-1.1 0-2.2 0-3.3-.1c-1.4 .1-2.8 .1-4.2 .1H416 392c-22.1 0-40-17.9-40-40V448 384c0-17.7-14.3-32-32-32H256c-17.7 0-32 14.3-32 32v64 24c0 22.1-17.9 40-40 40H160 128.1c-1.5 0-3-.1-4.5-.2c-1.2 .1-2.4 .2-3.6 .2H104c-22.1 0-40-17.9-40-40V360c0-.9 0-1.9 .1-2.8V287.6H32c-18 0-32-14-32-32.1c0-9 3-17 10-24L266.4 8c7-7 15-8 22-8s15 2 21 7L564.8 231.5c8 7 12 15 11 24z\"/></svg> Dashboard</a></li>\n");
      out.write("                <li><a href=\"publishfacultynotice.jsp\"><svg class=\"notice\" xmlns=\"http://www.w3.org/2000/svg\" height=\"1.25em\" viewBox=\"0 0 640 512\"><style>svg{fill:#ffffff}</style><path d=\"M160 64c0-35.3 28.7-64 64-64H576c35.3 0 64 28.7 64 64V352c0 35.3-28.7 64-64 64H336.8c-11.8-25.5-29.9-47.5-52.4-64H384V320c0-17.7 14.3-32 32-32h64c17.7 0 32 14.3 32 32v32h64V64L224 64v49.1C205.2 102.2 183.3 96 160 96V64zm0 64a96 96 0 1 1 0 192 96 96 0 1 1 0-192zM133.3 352h53.3C260.3 352 320 411.7 320 485.3c0 14.7-11.9 26.7-26.7 26.7H26.7C11.9 512 0 500.1 0 485.3C0 411.7 59.7 352 133.3 352z\"/></svg> Publish Notice</a></li>\n");
      out.write("                <li><a href=\"uploadnotes.jsp\"><svg class=\"notice\" xmlns=\"http://www.w3.org/2000/svg\" height=\"1.25em\" viewBox=\"0 0 640 512\"><!--! Font Awesome Free 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. --><style>svg{fill:#fafafa}</style><path d=\"M144 480C64.5 480 0 415.5 0 336c0-62.8 40.2-116.2 96.2-135.9c-.1-2.7-.2-5.4-.2-8.1c0-88.4 71.6-160 160-160c59.3 0 111 32.2 138.7 80.2C409.9 102 428.3 96 448 96c53 0 96 43 96 96c0 12.2-2.3 23.8-6.4 34.6C596 238.4 640 290.1 640 352c0 70.7-57.3 128-128 128H144zm79-217c-9.4 9.4-9.4 24.6 0 33.9s24.6 9.4 33.9 0l39-39V392c0 13.3 10.7 24 24 24s24-10.7 24-24V257.9l39 39c9.4 9.4 24.6 9.4 33.9 0s9.4-24.6 0-33.9l-80-80c-9.4-9.4-24.6-9.4-33.9 0l-80 80z\"/></svg> Upload Notes</a></li>\n");
      out.write("                <li><a href=\"uploadtt.jsp\"><svg class=\"notice\" xmlns=\"http://www.w3.org/2000/svg\" height=\"1.25em\" viewBox=\"0 0 512 512\"><!--! Font Awesome Free 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. --><style>svg{fill:#ffffff}</style><path d=\"M184 24c0-13.3-10.7-24-24-24s-24 10.7-24 24V64H96c-35.3 0-64 28.7-64 64v16 48V448c0 35.3 28.7 64 64 64H416c35.3 0 64-28.7 64-64V192 144 128c0-35.3-28.7-64-64-64H376V24c0-13.3-10.7-24-24-24s-24 10.7-24 24V64H184V24zM80 192H432V448c0 8.8-7.2 16-16 16H96c-8.8 0-16-7.2-16-16V192zm176 40c-13.3 0-24 10.7-24 24v48H184c-13.3 0-24 10.7-24 24s10.7 24 24 24h48v48c0 13.3 10.7 24 24 24s24-10.7 24-24V352h48c13.3 0 24-10.7 24-24s-10.7-24-24-24H280V256c0-13.3-10.7-24-24-24z\"/></svg> Timetable</a></li>\n");
      out.write("                <!--<li><a href=\"markattendence.jsp\"><svg class=\"notice\" xmlns=\"http://www.w3.org/2000/svg\" height=\"1.25em\" viewBox=\"0 0 448 512\">! Font Awesome Free 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. <style>svg{fill:#ffffff}</style><path d=\"M438.6 105.4c12.5 12.5 12.5 32.8 0 45.3l-256 256c-12.5 12.5-32.8 12.5-45.3 0l-128-128c-12.5-12.5-12.5-32.8 0-45.3s32.8-12.5 45.3 0L160 338.7 393.4 105.4c12.5-12.5 32.8-12.5 45.3 0z\"/></svg> Mark Attendence</a></li>-->\n");
      out.write("                <li><a href=\"addassignment.jsp\"><svg class=\"notice\" xmlns=\"http://www.w3.org/2000/svg\" height=\"1.25em\" viewBox=\"0 0 448 512\"><!--! Font Awesome Free 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. --><style>svg{fill:#ffffff}</style><path d=\"M64 80c-8.8 0-16 7.2-16 16V416c0 8.8 7.2 16 16 16H384c8.8 0 16-7.2 16-16V96c0-8.8-7.2-16-16-16H64zM0 96C0 60.7 28.7 32 64 32H384c35.3 0 64 28.7 64 64V416c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V96zM200 344V280H136c-13.3 0-24-10.7-24-24s10.7-24 24-24h64V168c0-13.3 10.7-24 24-24s24 10.7 24 24v64h64c13.3 0 24 10.7 24 24s-10.7 24-24 24H248v64c0 13.3-10.7 24-24 24s-24-10.7-24-24z\"/></svg> Assignment</a></li>\n");
      out.write("                <li><a href=\"homepage.jsp\"><svg class=\"notice\" xmlns=\"http://www.w3.org/2000/svg\" height=\"1.25em\" viewBox=\"0 0 512 512\"><!--! Font Awesome Free 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. --><style>svg{fill:#ffffff}</style><path d=\"M377.9 105.9L500.7 228.7c7.2 7.2 11.3 17.1 11.3 27.3s-4.1 20.1-11.3 27.3L377.9 406.1c-6.4 6.4-15 9.9-24 9.9c-18.7 0-33.9-15.2-33.9-33.9l0-62.1-128 0c-17.7 0-32-14.3-32-32l0-64c0-17.7 14.3-32 32-32l128 0 0-62.1c0-18.7 15.2-33.9 33.9-33.9c9 0 17.6 3.6 24 9.9zM160 96L96 96c-17.7 0-32 14.3-32 32l0 256c0 17.7 14.3 32 32 32l64 0c17.7 0 32 14.3 32 32s-14.3 32-32 32l-64 0c-53 0-96-43-96-96L0 128C0 75 43 32 96 32l64 0c17.7 0 32 14.3 32 32s-14.3 32-32 32z\"/></svg> Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"maincontent\">\n");
      out.write("            <h1>Welcome ");
      out.print(rst.getString("name"));
      out.write(", You have successfully logged In</h1> \n");
      out.write("        </div>\n");
      out.write("        <div class=\"notice1\">\n");
      out.write("            <svg class=\"noticeicon\" xmlns=\"http://www.w3.org/2000/svg\" height=\"2em\" viewBox=\"0 0 448 512\"><!--! Font Awesome Free 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. --><style>svg{fill:#ffffff}</style><path d=\"M64 80c-8.8 0-16 7.2-16 16V416c0 8.8 7.2 16 16 16H384c8.8 0 16-7.2 16-16V96c0-8.8-7.2-16-16-16H64zM0 96C0 60.7 28.7 32 64 32H384c35.3 0 64 28.7 64 64V416c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V96zM200 344V280H136c-13.3 0-24-10.7-24-24s10.7-24 24-24h64V168c0-13.3 10.7-24 24-24s24 10.7 24 24v64h64c13.3 0 24 10.7 24 24s-10.7 24-24 24H248v64c0 13.3-10.7 24-24 24s-24-10.7-24-24z\"/></svg><a href=\"publishfacultynotice.jsp\"><b> Notice</b></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"notes1\">\n");
      out.write("            <svg class=\"notesicon\" xmlns=\"http://www.w3.org/2000/svg\" height=\"2em\" viewBox=\"0 0 448 512\"><!--! Font Awesome Free 6.4.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license (Commercial License) Copyright 2023 Fonticons, Inc. --><style>svg{fill:#ffffff}</style><path d=\"M64 80c-8.8 0-16 7.2-16 16V416c0 8.8 7.2 16 16 16H384c8.8 0 16-7.2 16-16V96c0-8.8-7.2-16-16-16H64zM0 96C0 60.7 28.7 32 64 32H384c35.3 0 64 28.7 64 64V416c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V96zM200 344V280H136c-13.3 0-24-10.7-24-24s10.7-24 24-24h64V168c0-13.3 10.7-24 24-24s24 10.7 24 24v64h64c13.3 0 24 10.7 24 24s-10.7 24-24 24H248v64c0 13.3-10.7 24-24 24s-24-10.7-24-24z\"/></svg><a href=\"uploadnotes.jsp\"><b> Notes</b></a>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("        </body>\n");
      out.write("        </html>");
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
