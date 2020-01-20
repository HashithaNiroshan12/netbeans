package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title> Mentoring System </title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("</head><!--/head-->\n");
      out.write("<body>\n");
      out.write("    <header class=\"navbar navbar-inverse navbar-fixed-top wet-asphalt\" role=\"banner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("              <!--  <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>-->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li ><a href=\"Admin.jsp\">Admin</a></li>\n");
      out.write("                    <li><a href=\"mlogin.jsp\">Mentor</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Student</a></li>\n");
      out.write("                     <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                     <li><a href=\"search.jsp\">Search</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header><!--/header-->\n");
      out.write("\n");
      out.write("    <!--section id=\"title\" class=\"emerald\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <h1>About Us</h1>\n");
      out.write("                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <ul class=\"breadcrumb pull-right\">\n");
      out.write("                        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                        <li class=\"active\">About Us</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section--><!--/#title-->\n");
      out.write('\n');
      out.write('\n');

if(request.getParameter("reg")!=null){
	  out.println("<script>alert('Registered Successfully')</script>");
}

 if(request.getParameter("atrbt")!=null){
	  out.println("<script>alert('Admin Cannot Approve Your Permission To Login')</script>");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form method=\"post\" action=\"mlogincheck.jsp\">\n");
      out.write(" ");

String msg1 =request.getParameter("msg1");
if(msg1!=null){
out.println("<script>alert('Incorrect user name and password')</script>");
}

      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("<div id=\"main\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<h3 style=\"color: green;\" align=\"center\"><B>Mentors (Seniors) Login Form</B></h3>\t\n");
      out.write("\n");
      out.write("\n");
      out.write(" <table>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<tr><td><br></td></tr>\n");
      out.write("\t\t\t\t\t<tr><td>Email:</td><td><input type=\"email\" class=\"form-control\" name=\"email\"placeholder=\"123@gmail.com\" required></td></tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td><br></td></tr>\n");
      out.write("\t\t\t\t\t<tr><td>Password:</td><td><input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"********\" required></td></tr>\t\n");
      out.write("\t\t\t\t\t\t\t<tr><td><br></td></tr>\n");
      out.write("\t\t\t\t\t<tr><td>      </td><td>&nbsp;&nbsp;&nbsp;&nbsp;<button type=\"submit\" class=\"btn btn-primary btn-lg\">Login</td></tr>\n");
      out.write("\t\t\t\t\t<tr><td></td><td>Yet Not Registered ?<a href=\"mregistration.jsp\" ><img src=\"images//reg.png\" style=\"width:85px;height:75px\"></a></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div></div>\n");
      out.write("  </table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("    <footer id=\"footer\" class=\"midnight-blue\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    Developed By: <a target=\"_blank\" >Sandeep Pandit & Gautam Malik</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <ul class=\"pull-right\">\n");
      out.write("                      \n");
      out.write("                        <li><a id=\"gototop\" class=\"gototop\" href=\"#\"><i class=\"icon-chevron-up\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer><!--/#footer-->\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("             ");
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
