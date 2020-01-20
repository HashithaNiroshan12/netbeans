package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String email = request.getParameter("email");
if(email != null){
out.println("<script>alert('The Email is Already Existed')</script>");
}

String msg = request.getParameter("msg");
if(msg != null){
out.println("<script>alert('Registration Unsuccessfully..Please check once again..')</script>");
}

String msg1 = request.getParameter("msg1");
if(msg1 != null){
out.println("<script>alert('Registration successfully..Thank you for Register..')</script>");
}

      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("<div id=\"content\">\n");
      out.write("        <div class=\"content_item\">\n");
      out.write("\t\t<br><br>\t\t<br>\n");
      out.write("<form action=\"reginsert.jsp\" method=\"post\">\n");
      out.write("<table align=\"center\" cellpadding = \"10\">\n");
      out.write("<div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr><td colspan=\"3\"><font size=\"6\" color=\"orange\"><b><u style=\"text-align: center\";> Student Registration Form</u></b></font></td></tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>ROLL NO.</td>\n");
      out.write("<td><input type=\"text\" class=\"form-control\" name=\"rno\"   required/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>PASSWORD</td>\n");
      out.write("<td><input type=\"password\" class=\"form-control\" name=\"password\"  required/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<!----- First Name ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>NAME</td>\n");
      out.write("<td><input type=\"text\" class=\"form-control\" name=\"name\" maxlength=\"30\" required=\"required\"/>\n");
      out.write("(max 30 characters a-z and A-Z)\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>FATHER NAME</td>\n");
      out.write("<td><input type=\"text\" class=\"form-control\" name=\"mother_name\" maxlength=\"30\" required=\"required\"/>\n");
      out.write("(max 30 characters a-z and A-Z)\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>MOTHER NAME</td>\n");
      out.write("<td><input type=\"text\" class=\"form-control\" name=\"father_name\" maxlength=\"30\" required=\"required\"/>\n");
      out.write("(max 30 characters a-z and A-Z)\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!----- Date Of Birth -------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>DATE OF BIRTH</td>\n");
      out.write(" \n");
      out.write("<td>\n");
      out.write("<select name=\"birthday_day\" id=\"Birthday_Day\" required=\"required\">\n");
      out.write("<option value=\"-1\">Day:</option>\n");
      out.write("<option value=\"1\">1</option>\n");
      out.write("<option value=\"2\">2</option>\n");
      out.write("<option value=\"3\">3</option>\n");
      out.write(" \n");
      out.write("<option value=\"4\">4</option>\n");
      out.write("<option value=\"5\">5</option>\n");
      out.write("<option value=\"6\">6</option>\n");
      out.write("<option value=\"7\">7</option>\n");
      out.write("<option value=\"8\">8</option>\n");
      out.write("<option value=\"9\">9</option>\n");
      out.write("<option value=\"10\">10</option>\n");
      out.write("<option value=\"11\">11</option>\n");
      out.write("<option value=\"12\">12</option>\n");
      out.write(" \n");
      out.write("<option value=\"13\">13</option>\n");
      out.write("<option value=\"14\">14</option>\n");
      out.write("<option value=\"15\">15</option>\n");
      out.write("<option value=\"16\">16</option>\n");
      out.write("<option value=\"17\">17</option>\n");
      out.write("<option value=\"18\">18</option>\n");
      out.write("<option value=\"19\">19</option>\n");
      out.write("<option value=\"20\">20</option>\n");
      out.write("<option value=\"21\">21</option>\n");
      out.write(" \n");
      out.write("<option value=\"22\">22</option>\n");
      out.write("<option value=\"23\">23</option>\n");
      out.write("<option value=\"24\">24</option>\n");
      out.write("<option value=\"25\">25</option>\n");
      out.write("<option value=\"26\">26</option>\n");
      out.write("<option value=\"27\">27</option>\n");
      out.write("<option value=\"28\">28</option>\n");
      out.write("<option value=\"29\">29</option>\n");
      out.write("<option value=\"30\">30</option>\n");
      out.write(" \n");
      out.write("<option value=\"31\">31</option>\n");
      out.write("</select>\n");
      out.write(" \n");
      out.write("<select id=\"Birthday_Month\" name=\"birthday_month\" required=\"required\">\n");
      out.write("<option value=\"-1\">Month:</option>\n");
      out.write("<option value=\"January\">Jan</option>\n");
      out.write("<option value=\"February\">Feb</option>\n");
      out.write("<option value=\"March\">Mar</option>\n");
      out.write("<option value=\"April\">Apr</option>\n");
      out.write("<option value=\"May\">May</option>\n");
      out.write("<option value=\"June\">Jun</option>\n");
      out.write("<option value=\"July\">Jul</option>\n");
      out.write("<option value=\"August\">Aug</option>\n");
      out.write("<option value=\"September\">Sep</option>\n");
      out.write("<option value=\"October\">Oct</option>\n");
      out.write("<option value=\"November\">Nov</option>\n");
      out.write("<option value=\"December\">Dec</option>\n");
      out.write("</select>\n");
      out.write(" \n");
      out.write("<select name=\"birthday_year\" id=\"Birthday_Year\" required=\"required\">\n");
      out.write(" \n");
      out.write("<option value=\"-1\">Year:</option>\n");
      out.write("<option value=\"2012\">2012</option>\n");
      out.write("<option value=\"2011\">2011</option>\n");
      out.write("<option value=\"2010\">2010</option>\n");
      out.write("<option value=\"2009\">2009</option>\n");
      out.write("<option value=\"2008\">2008</option>\n");
      out.write("<option value=\"2007\">2007</option>\n");
      out.write("<option value=\"2006\">2006</option>\n");
      out.write("<option value=\"2005\">2005</option>\n");
      out.write("<option value=\"2004\">2004</option>\n");
      out.write("<option value=\"2003\">2003</option>\n");
      out.write("<option value=\"2002\">2002</option>\n");
      out.write("<option value=\"2001\">2001</option>\n");
      out.write("<option value=\"2000\">2000</option>\n");
      out.write(" \n");
      out.write("<option value=\"1999\">1999</option>\n");
      out.write("<option value=\"1998\">1998</option>\n");
      out.write("<option value=\"1997\">1997</option>\n");
      out.write("<option value=\"1996\">1996</option>\n");
      out.write("<option value=\"1995\">1995</option>\n");
      out.write("<option value=\"1994\">1994</option>\n");
      out.write("<option value=\"1993\">1993</option>\n");
      out.write("<option value=\"1992\">1992</option>\n");
      out.write("<option value=\"1991\">1991</option>\n");
      out.write("<option value=\"1990\">1990</option>\n");
      out.write(" \n");
      out.write("<option value=\"1989\">1989</option>\n");
      out.write("<option value=\"1988\">1988</option>\n");
      out.write("<option value=\"1987\">1987</option>\n");
      out.write("<option value=\"1986\">1986</option>\n");
      out.write("<option value=\"1985\">1985</option>\n");
      out.write("<option value=\"1984\">1984</option>\n");
      out.write("<option value=\"1983\">1983</option>\n");
      out.write("<option value=\"1982\">1982</option>\n");
      out.write("<option value=\"1981\">1981</option>\n");
      out.write("<option value=\"1980\">1980</option>\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Email Id ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>EMAIL ID</td>\n");
      out.write("<td><input type=\"email\" class=\"form-control\" name=\"email\" maxlength=\"100\" required=\"required\"/></td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<!----- Mobile Number ---------------------------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>CONTACT</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\"  class=\"form-control\"name=\"contact\" maxlength=\"12\" required=\"required\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>COURSE<br />APPLIED FOR</td>\n");
      out.write("<td>\n");
      out.write("<select id=\"opt\" class=\"form-control\" name=\"course\" required=\"required\">\n");
      out.write("<option value=\"None\">Course:</option>\n");
      out.write("<option value=\"BTECH\">BTECH</option>\n");
      out.write("<option value=\"BCA\">BCA</option>\n");
      out.write("<option value=\"BBA\">BBA</option>\n");
      out.write("<option value=\"BCOM\">BCOM</option>\n");
      out.write("<option value=\"MBA\">MBA</option>\n");
      out.write("<option value=\"BSC\">BSC</option>\n");
      out.write("<option value=\"BPT\">BPT</option>\n");
      out.write("<option value=\"BDS\">BDS</option>\n");
      out.write("<option value=\"MBBS\">MBBS</option>\n");
      out.write("<option value=\"MTECH\">MTECH</option>\n");
      out.write("<option value=\"BA\">BA</option>\n");
      out.write("<option value=\"PHD\">PHD</option>\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>BRANCH</td>\n");
      out.write("<td><input type=\"text\" required=\"required\"  class=\"form-control\" name=\"branch\" maxlength=\"30\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\">\n");
      out.write("<button type=\"submit\" class=\"btn btn-primary btn-lg\">Register</button>&nbsp;&nbsp;\n");
      out.write("<button type=\"reset\" class=\"btn btn-primary btn-lg\">Reset</button>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</div>\n");
      out.write("</table>\n");
      out.write(" \n");
      out.write("</form>\n");
      out.write("\t\t</div><!--close content_text-->  \t\t\n");
      out.write("\t</div><!--close content-->\t    \n");
      out.write("</div>\n");
      out.write(" ");
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
