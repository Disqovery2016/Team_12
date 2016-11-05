package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amgmt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<head>\n");
      out.write("      \n");
      out.write("  \n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write(" <title>JSP Page</title>\n");
      out.write("  \n");
      out.write("<style>\n");
      out.write("html { height: 100% }\n");
      out.write("::-moz-selection { background: #fe57a1; color: #fff; text-shadow: none; }\n");
      out.write("\n");
      out.write("::selection { background: #fe57a1; color: #fff; text-shadow: none; }\n");
      out.write("\n");
      out.write("body { background-color: lightblue; }\n");
      out.write("h1 {\n");
      out.write("    font-family: Georgia, serif;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: #006600;\n");
      out.write("    letter-spacing: 1.4px;\n");
      out.write("    border-bottom: solid 1px #006600;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}\n");
      out.write("h2 {\n");
      out.write("    font-family: Georgia, serif;\n");
      out.write("    font-size: 14px;\n");
      out.write("    font-weight: normal;\n");
      out.write("    letter-spacing: 1.2px;\n");
      out.write("    color: #009900;\n");
      out.write("}\n");
      out.write("button, input[type=\"button\"], input[type=\"submit\"]{\n");
      out.write("  padding: 5px 5px 5px 25px;\n");
      out.write("  border: 1px solid #666;\n");
      out.write("  color:#000;\n");
      out.write("  text-decoration:none;\n");
      out.write("  background: #dcdcdc url(icon.png) no-repeat scroll 5px center;\n");
      out.write("   border-top: 1px solid #96d1f8;\n");
      out.write("   background: #65a9d7;\n");
      out.write("   background: -webkit-gradient(linear, left top, left bottom, from(#3e779d), to(#65a9d7));\n");
      out.write("   background: -webkit-linear-gradient(top, #3e779d, #65a9d7);\n");
      out.write("   background: -moz-linear-gradient(top, #3e779d, #65a9d7);\n");
      out.write("   background: -ms-linear-gradient(top, #3e779d, #65a9d7);\n");
      out.write("   background: -o-linear-gradient(top, #3e779d, #65a9d7);\n");
      out.write("   padding: 5px 10px;\n");
      out.write("   -webkit-border-radius: 8px;\n");
      out.write("   -moz-border-radius: 8px;\n");
      out.write("   border-radius: 8px;\n");
      out.write("   -webkit-box-shadow: rgba(0,0,0,1) 0 1px 0;\n");
      out.write("   -moz-box-shadow: rgba(0,0,0,1) 0 1px 0;\n");
      out.write("   box-shadow: rgba(0,0,0,1) 0 1px 0;\n");
      out.write("   text-shadow: rgba(0,0,0,.4) 0 1px 0;\n");
      out.write("   color: white;\n");
      out.write("   font-size: 14px;\n");
      out.write("   font-family: Georgia, serif;\n");
      out.write("   text-decoration: none;\n");
      out.write("   vertical-align: middle;\n");
      out.write("   }button:hover {\n");
      out.write("   border-top-color: #28597a;\n");
      out.write("   background: #28597a;\n");
      out.write("   color: #ccc;\n");
      out.write("   }\n");
      out.write("button, input[type=\"button\"], input[type=\"submit\"]:active {\n");
      out.write("   border-top-color: #1b435e;\n");
      out.write("   background: #1b435e;\n");
      out.write("   }\n");
      out.write("\n");
      out.write("\n");
      out.write("</style> \n");
      out.write(" </head>\n");
      out.write("    \n");
      out.write("<body bgcolor=\"red\" align =\"center\">\n");
      out.write("      \n");
      out.write(" \n");
      out.write("<h1 align=\"center\">Admin Control Page</h1>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<button type=\"button\">Potter</button>\n");
      out.write("         \n");
      out.write("<button type=\"button\">Carpainter</button>\n");
      out.write("          \n");
      out.write("<button type=\"button\">Plumber</button> \n");
      out.write("          \n");
      out.write("<button type=\"button\">Field Labor</button> \n");
      out.write("<p>\n");
      out.write("\n");
      out.write("<form action=\"http://www.html.am/html-codes/textboxes/submitted.cfm\">\n");
      out.write("<textarea name=\"myTextBox\" cols=\"50\" rows=\"50\">\n");
      out.write("</textarea>\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
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
