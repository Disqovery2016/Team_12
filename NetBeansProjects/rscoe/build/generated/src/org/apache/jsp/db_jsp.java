package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.text.*;

public final class db_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title> saving</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   <br><br>\n");
      out.write("<div id=\"horizontalmenu\">\n");
      out.write("        <ul><li><a href=\"register.jsp\">Home </a> </li>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("</div>\n");

    System.out.println("redirected");
// JDBC driver name and database URL
String JDBC_DRIVER = "com.mysql.jdbc.Driver";
String DB_URL = "jdbc:mysql://localhost/disq";//java database connectivity
// Database credentials
String USER = "root";
String PASS = "1100";
Connection conn = null;
Statement stmt = null;
PreparedStatement ps=null;
ResultSet rs = null;
String sql=null;
int s_roll=0;
int status=0;
try
{
//STEP 2: Register JDBC driver
Class.forName("com.mysql.jdbc.Driver");
//STEP 3: Open a connection
System.out.println("Connecting to database...");
conn = DriverManager.getConnection(DB_URL,USER,PASS);

System.out.println("Connected to database...");

sql="Insert into register values(?,?,?,?,?,?)";

ps = conn.prepareStatement(sql);

String name=request.getParameter("name");
System.out.println(name);


String email=request.getParameter("email");

int uid=Integer.parseInt(request.getParameter("uid"));
System.out.println(uid);

String gen=request.getParameter("gen");
System.out.println(gen);

String address=request.getParameter("address");

int mob=Integer.parseInt(request.getParameter("mob"));

System.out.println(mob);
ps.setString(1,name);
ps.setString(2,email);
ps.setInt(3,uid);
ps.setString(4,gen);
ps.setString(5,address);
ps.setInt(6,mob);

ps.execute();
System.out.println("query executed");
System.out.println("done");
response.sendRedirect("admin.jsp");
}
catch(Exception e)
{
e.printStackTrace();
}
 
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
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
