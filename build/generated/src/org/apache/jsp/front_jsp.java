package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class front_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            pre{margin:0;\n");
      out.write("            padding:0;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("        <title>front page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin-left:0em; margin-right:0em;margin-top:0em;\">\n");
      out.write("<font size=\"6em\" face=\"arial\"><pre style=\"background-color:rgb(21,26,37);color:rgb(255,255,255);\">\n");
      out.write("<img src =\"logo2.png\" alt=\"icon\" style=\"width:220px;height:180px;\"> <b>Quora</b>                                <a href =\"about.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> About </a>   <a href =\"login.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> Login </a>   <a href =\"signup.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> SignUp </a>   <a href =\"addque.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> AddQuestion </a>\n");
      out.write("</pre></font><br>\n");
      out.write("<pre>\n");
      out.write("<img src =\"logo3.jpg\" alt=\"quora\" style=\"width:1518px;height:530px;\"> \n");
      out.write("</pre>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<h1 style =\"text-align:center;\">\" True knowledge exists in knowing that you know nothing.\" </h1>\n");
      out.write("<br>\n");
      out.write("<marquee direction =\"up\" scrollamount=\"10\">\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    <img src =\"image2.jpg\" alt=\"quoralogo\" style=width:455px;height:455px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<img src =\"image4.jpg\" alt=\"quoraupvote\" style=width:455px;height:455px;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<img src =\"image5.jpg\" alt=\"quoraanswer\" style=width:455px;height:455px;\">\n");
      out.write("</marquee>\n");
      out.write("    <footer>\n");
      out.write("<font size=\"4em\" face=\"arial\"><pre style=\"background-color:rgb(21,26,37); color:rgb(255,255,255);\">     \n");
      out.write("\t <h2 style=\"margin-left:6em;\">QUORA CLONE</h2>\n");
      out.write("<marquee direction = \"right\" behavior=\"alternate\" scrollamount=\"10\">\n");
      out.write("\"Live as if you were to die tomorrow.  Learn as if you were to live forever.\" \n");
      out.write("</marquee>\n");
      out.write("<font size=2><address>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   \t© 2018 Doctor 'D' DD</address>\n");
      out.write("</pre>\n");
      out.write("</footer\n");
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
