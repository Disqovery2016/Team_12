package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.text.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title> MySQL Connectivity</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");

// JDBC driver name and database URL
String JDBC_DRIVER = "com.mysql.jdbc.Driver";
String DB_URL = "jdbc:mysql://localhost/disq";//java database connectivity
// Database credentials
String USER = "root";
String PASS = "1100";
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
String sql=null;
int uid=0;
int status=0;
try{
//STEP 2: Register JDBC driver
Class.forName("com.mysql.jdbc.Driver");
//STEP 3: Open a connection
System.out.println("Connecting to database...");
conn = DriverManager.getConnection(DB_URL,USER,PASS);
//System.out.println("Hi");
//STEP 4: Execute a query
stmt = conn.createStatement();

int u_id=Integer.parseInt(request.getParameter("u_id"));
String pwd=request.getParameter("pwd");
sql = "select * from log";
rs = stmt.executeQuery(sql);
System.out.println("query executed");
//STEP 5: Extrata result set
while(rs.next())
{
//Retrieve by column name
uid = rs.getInt(1);
String s_name= rs.getString("pwd");
if(u_id==uid)
{
    if(pwd.equals(s_name));
    status=1;
}
}

}
catch(Exception e)
{
e.printStackTrace();
}

System.out.println(status);
if(status==1)
{
    System.out.println("Passsword successful");
    stmt = conn.createStatement();
    rs=null;
    rs= stmt.executeQuery("select * from register");
    
      out.write("\n");
      out.write("    \n");
      out.write(" <table title=\"End User Details\" cellpadding=\"1\" cellspacing=\"1\" border=\"true\">\n");
      out.write("<tr>\n");
      out.write("<td> Name </td>\n");
      out.write("<td> email </td>\n");
      out.write("<td> uid </td>\n");
      out.write("<td> gen</td>\n");
      out.write("<td>address</td>\n");
      out.write("<td>mob</td>\n");
      out.write("\n");
      out.write("</tr>\n");

    System.out.println("Passsword successful 22");
    
while(rs.next())
{

String name= rs.getString("name");
String email = rs.getString("email");
 uid=rs.getInt("uid");
String gen = rs.getString("gender");
String address=rs.getString("address");

String mob = rs.getString("phone");

System.out.println(mob);

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td> ");
      out.print(name);
      out.write(" </td><br><br>\n");
      out.write("<td> ");
      out.print(email);
      out.write(" </td>\n");
      out.write("<td> ");
      out.print(uid);
      out.write(" </td>\n");
      out.write("<td> ");
      out.print(gen);
      out.write(" </td>\n");
      out.write("<td> ");
      out.print(address);
      out.write(" </td>\n");
      out.write("<td> ");
      out.print(mob);
      out.write(" </td>\n");
      out.write("\n");
      out.write("</tr>\n");
   
}
}
    if(status==0)
{
    response.sendRedirect("cust.jsp");
}

      out.write("\n");
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
