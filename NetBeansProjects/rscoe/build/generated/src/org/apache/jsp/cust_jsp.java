package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cust_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Login</title>\n");
      out.write("<style>\n");
      out.write("html { height: 100% }\n");
      out.write("::-moz-selection { background: #fe57a1; color: #fff; text-shadow: none; }\n");
      out.write("\n");
      out.write("::selection { background: #fe57a1; color: #fff; text-shadow: none; }\n");
      out.write("\n");
      out.write("body { background-color: lightblue; }\n");
      out.write("\n");
      out.write(".login {\n");
      out.write("  background: #eceeee;\n");
      out.write("  border: 1px solid #42464b;\n");
      out.write("  border-radius: 6px;\n");
      out.write("  height: 257px;\n");
      out.write("  margin: 20px auto 0;\n");
      out.write("  width: 298px;\n");
      out.write("}\n");
      out.write(".login h1 {\n");
      out.write("   border-bottom: 1px solid #a6abaf;\n");
      out.write("  border-radius: 6px 6px 0 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #727678;\n");
      out.write("  display: block;\n");
      out.write("  height: 43px;\n");
      out.write("  font: 600 14px/1 'Open Sans', sans-serif;\n");
      out.write("  padding-top: 14px;\n");
      out.write("  margin: 0;\n");
      out.write("  text-align: center;\n");
      out.write("  text-shadow: 0 -1px 0 rgba(0,0,0,0.2), 0 1px 0 #fff;\n");
      out.write("}\n");
      out.write("input[type=\"password\"], input[type=\"text\"] {\n");
      out.write("   border: 1px solid #a1a3a3;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-shadow: 0 1px #fff;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  color: #696969;\n");
      out.write("  height: 39px;\n");
      out.write("  margin: 31px 0 0 29px;\n");
      out.write("  padding-left: 37px;\n");
      out.write("  transition: box-shadow 0.3s;\n");
      out.write("  width: 240px;\n");
      out.write("}\n");
      out.write("input[type=\"password\"]:focus, input[type=\"text\"]:focus {\n");
      out.write("  box-shadow: 0 0 4px 1px rgba(55, 166, 155, 0.3);\n");
      out.write("  outline: 0;\n");
      out.write("}\n");
      out.write(".show-password {\n");
      out.write("  display: block;\n");
      out.write("  height: 16px;\n");
      out.write("  margin: 26px 0 0 28px;\n");
      out.write("  width: 87px;\n");
      out.write("}\n");
      out.write("input[type=\"checkbox\"] {\n");
      out.write("  cursor: pointer;\n");
      out.write("  height: 16px;\n");
      out.write("  opacity: 0;\n");
      out.write("  position: relative;\n");
      out.write("  width: 64px;\n");
      out.write("}\n");
      out.write("input[type=\"checkbox\"]:checked {\n");
      out.write("  left: 29px;\n");
      out.write("  width: 58px;\n");
      out.write("}\n");
      out.write(".toggle {\n");
      out.write("  display: block;\n");
      out.write("  height: 16px;\n");
      out.write("  margin-top: -20px;\n");
      out.write("  width: 87px;\n");
      out.write("  z-index: -1;\n");
      out.write("}\n");
      out.write("input[type=\"checkbox\"]:checked + .toggle { background-position: 0 -16px }\n");
      out.write(".forgot {\n");
      out.write("  color: #7f7f7f;\n");
      out.write("  display: inline-block;\n");
      out.write("  float: right;\n");
      out.write("  font: 12px/1 sans-serif;\n");
      out.write("  left: -19px;\n");
      out.write("  position: relative;\n");
      out.write("  text-decoration: none;\n");
      out.write("  top: 5px;\n");
      out.write("  transition: color .4s;\n");
      out.write("}\n");
      out.write(".forgot:hover { color: #3b3b3b }\n");
      out.write("input[type=\"submit\"] {\n");
      out.write("  width:240px;\n");
      out.write("  height:35px;\n");
      out.write("  display:block;\n");
      out.write("  font-family:Arial, \"Helvetica\", sans-serif;\n");
      out.write("  font-size:16px;\n");
      out.write("  font-weight:bold;\n");
      out.write("  color:#fff;\n");
      out.write("  text-decoration:none;\n");
      out.write("  text-transform:uppercase;\n");
      out.write("  text-align:center;\n");
      out.write("  text-shadow:1px 1px 0px #37a69b;\n");
      out.write("  padding-top:6px;\n");
      out.write("  margin: 29px 0 0 29px;\n");
      out.write("  position:relative;\n");
      out.write("  cursor:pointer;\n");
      out.write("  border: none;  \n");
      out.write("  background-color: #37a69b;\n");
      out.write("  background-image: linear-gradient(top,#3db0a6,#3111);\n");
      out.write("  border-top-left-radius: 5px;\n");
      out.write("  border-top-right-radius: 5px;\n");
      out.write("  border-bottom-right-radius: 5px;\n");
      out.write("  border-bottom-left-radius:5px;\n");
      out.write("  box-shadow: inset 0px 1px 0px #2ab7ec, 0px 5px 0px 0px #497a78, 0px 10px 5px #999;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".shadow {\n");
      out.write("  background: #000;\n");
      out.write("  border-radius: 12px 12px 4px 4px;\n");
      out.write("  box-shadow: 0 0 20px 10px #000;\n");
      out.write("  height: 12px;\n");
      out.write("  margin: 30px auto;\n");
      out.write("  opacity: 0.2;\n");
      out.write("  width: 270px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:active {\n");
      out.write("  top:3px;\n");
      out.write("  box-shadow: inset 0px 1px 0px #2ab7ec, 0px 2px 0px 0px #31524d, 0px 5px 3px #999;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"login\">\n");
      out.write("    <h1>User Login</h1>\n");
      out.write("    <input type=\"text\" placeholder=\"Username\" id=\"username\">  \n");
      out.write("  <input type=\"password\" placeholder=\"password\" id=\"password\">  \n");
      out.write("  <a href=\"#\" class=\"forgot\">forgot password?</a>\n");
      out.write("  <input type=\"submit\" value=\"Sign In\">\n");
      out.write("</div>\n");
      out.write("<div class=\"shadow\"></div>\n");
      out.write("</body>\n");
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
