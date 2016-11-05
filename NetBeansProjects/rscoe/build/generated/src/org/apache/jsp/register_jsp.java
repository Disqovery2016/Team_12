package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Details</title>\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body background=\"blue\" bgcolor=\"#D3D3D3\">\n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("<div id=\"horizontalmenu\">\n");
      out.write("        <ul><li><a href=\"db.jsp\">click_here </a> </li>\n");
      out.write("       \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<form action=\"db.jsp\" method=\"GET\">\n");
      out.write("<h1>Fill your details</h1>\n");
      out.write("\n");
      out.write("Name:     <input type=\"text\" name=\"name\"><br><br>\n");
      out.write("Email_ID:      <input type=\"text\" name=\"email\"> <br><br>\n");
      out.write("UID:<input type=\"text\" name=\"uid\"><br> <br>\n");
      out.write("Gander:<br> <input type=\"radio\" name=\"gen\" value=\"Male\" >Male<br><input type=\"radio\" name=\"gender\" value=\"Female\">Female<br><br>\n");
      out.write("Address:<input type=\"text\" name=\"address\"> <br><br>\n");
      out.write("Mob NO:<input type=\"text\" name=\"mob\"> <br>\n");
      out.write("<input type=\"submit\"/>\n");
      out.write("<input type=\"reset\">\n");
      out.write("</form>\n");
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
