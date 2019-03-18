package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> About Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin-left:0em; margin-right:0em;margin-top:0em;\">\n");
      out.write("<font size=\"6em\" face=\"arial\"><pre style=\"background-color:rgb(21,26,37);color:rgb(255,255,255);\">\n");
      out.write("<img src =\"logo2.png\" alt=\"icon\" style=\"width:220px;height:180px;\"> <b>Quora</b>                                <a href =\"about.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> About </a>   <a href =\"login.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> Login </a>   <a href =\"signup.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> SignUp </a>   <a href =\"addque.jsp\" target=\"_blank\" style=\"color:rgb(255,255,255); text-decoration:none;\"> AddQuestion </a>\n");
      out.write("</pre></font>\n");
      out.write("    <center>\n");
      out.write("<fieldset>\n");
      out.write("    <legend><h1><b><center><font color=\"Red\">Why Quora Exists?</font></center></b></h1></legend>\n");
      out.write("    <p>    \n");
      out.write("                 Quora’s mission is to share and grow the world’s knowledge.\n");
      out.write("                   A vast amount of the knowledge that would be valuable to many \n");
      out.write("                  people is currently only available to a few — either locked \n");
      out.write("                  in people’s heads, or only accessible to select groups. We \n");
      out.write("                   want to connect the people who have knowledge to the people \n");
      out.write("                  who need it, to bring together people with different \n");
      out.write("                   perspectives so they can understand each other better, and \n");
      out.write("                   to empower everyone to share their knowledge for the benefit\n");
      out.write("                   of the rest of the world.</p>\n");
      out.write("</fieldset></center>\n");
      out.write("     <center>\n");
      out.write("<fieldset>\n");
      out.write("    <legend>      <h1><b><center><font color=\"Red\"> Gather Around A Question</font> </center></b></h1></legend>\n");
      out.write("                       <p>\n");
      out.write("                           The heart of Quora is questions — questions that affect \n");
      out.write("                           the world, questions that explain recent world events, \n");
      out.write("                          questions that guide important life decisions, and questions \n");
      out.write("                          that provide insights into why other people think differently.\n");
      out.write("                          Quora is a place where you can ask questions you care about \n");
      out.write("                          and get answers that are amazing.\n");
      out.write("\n");
      out.write("                         Quora has only one version of each question. It doesn’t have \n");
      out.write("                         a left wing version, a right wing version, a western version, \n");
      out.write("                         and an eastern version. Quora brings together people from \n");
      out.write("                         different worlds to answer the same question, in the same\n");
      out.write("                         place — and to learn from each other. We want Quora to be \n");
      out.write("                         the place to voice your opinion because Quora is where the \n");
      out.write("                         debate is happening. We want the Quora answer to be the \n");
      out.write("                         definitive answer for everybody forever.\n");
      out.write("</p></fieldset></center>\n");
      out.write("\n");
      out.write("       <center>\n");
      out.write("           <fieldset> <legend><h1><b><center><font color=\"Red\">Understand The World and The People In It </font></center></b></h1> </legend>\n");
      out.write("       <p>\n");
      out.write("           Quora has content you will feel good about having read. \n");
      out.write("           Quora helps you understand why the world works the way it does,\n");
      out.write("           why people behave the way they do, and what we can all do to make the world better.\n");
      out.write("           Quora provides a personalized feed of insightful answers to questions you hadn’t realized you should ask.\n");
      out.write("\n");
      out.write("Quora’s answers come from people who really understand the issues and have first-hand knowledge. \n");
      out.write("Quora is the place to read Barack Obama on the Iran deal, prisoners on life in prison, scientists \n");
      out.write("on global warming, police officers on how to deter burglars, and TV producers on\n");
      out.write("how their shows are made. Quora is the place to read inspiring people such as Gloria Steinem, \n");
      out.write("Stephen Fry, Hillary Clinton, Glenn Beck, Sheryl Sandberg, Vinod Khosla, and Gillian Anderson\n");
      out.write("directly answering the questions people most wanted them to answer. Quora is where you can \n");
      out.write("read important insights that have never been shared anywhere else, from people \n");
      out.write("you could never reach any other way.\n");
      out.write("       </p></fieldset></center>\n");
      out.write("      \n");
      out.write("    <footer>\n");
      out.write("<font size=\"4em\" face=\"arial\"><pre style=\"background-color:rgb(21,26,37); color:rgb(255,255,255);\">        \n");
      out.write("\t <h2 style=\"margin-left:6em;\">QUORA CLONE</h2><ul style=\"list-style-type:none; width:30%; float:left;\">\n");
      out.write("             <pre>\n");
      out.write(" <li style=\"margin-left:7em;\">Challenges</a></li>\n");
      out.write(" <li style=\"margin-left:6em;\">Privacy Policy</li>\n");
      out.write("       </pre>\n");
      out.write("         </ul>\n");
      out.write("<ul style=\"list-style-type:none; display: inline-block;\">\n");
      out.write("\t <li>Conduct Policy</li>\n");
      out.write("         <li>Contact Us</li>\n");
      out.write("\t <li>Terms Of Service</li>\n");
      out.write("\t </ul>\n");
      out.write("\n");
      out.write("<marquee direction = \"right\" behavior=\"alternate\" scrollamount=\"10\">\n");
      out.write("Thank YOU | Visit Again\n");
      out.write("</marquee>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   \t© 2018 Doctor 'D' DD</address>\n");
      out.write("</pre>\n");
      out.write("<footer/>\n");
      out.write("\n");
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
