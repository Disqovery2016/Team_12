<%-- 
    Document   : reg
    Created on : 4 Nov, 2016, 6:09:50 PM
    Author     : jaydip
--%>

<%--
--%>
<%@page import = "java.sql.*" %>
<%@page import = "java.io.*" %>
<%@page import = "java.text.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> saving</title>

</head>

<body>
 <div id="horizontalmenu">
          <li><a href="register1.jsp"> </a></li>
      <br><br>

</div>
      
<%
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
{System.out.println("Connecting to database...");
//STEP 2: Register JDBC driver
Class.forName("com.mysql.jdbc.Driver");
//STEP 3: Open a connection
System.out.println("Connecting to database...");
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1100");
//System.out.println("Hi");
//STEP 4: Execute a query
sql="insert into register values(?,?,?,?,?,?,?)";
System.out.println("Preparing");
ps = conn.prepareStatement(sql);

System.out.println("hello");

String name=request.getParameter("name");
System.out.println(name);
System.out.println("fo");
String dob=request.getParameter("dob");
System.out.println(dob);

String email=request.getParameter("email");
System.out.println(email);

int uid=Integer.parseInt(request.getParameter("uid"));
System.out.println(uid);

String gen=request.getParameter("gen");
System.out.println(gen);

String address=request.getParameter("address");
System.out.println(address);

int mob=Integer.parseInt(request.getParameter("year"));
System.out.println(mob);

System.out.println("prepared");


ps.setString(1,name);
ps.setString(2,dob);
ps.setString(3,email);
ps.setInt(4,uid);
ps.setString(5,gen);
ps.setString(6,address);
ps.setInt(7,mob);
System.out.println("ready");
ps.execute();

System.out.println("query executed");
System.out.println("done");
response.sendRedirect("register1.jsp");
}
catch(Exception e)
{
e.printStackTrace();
}
 %> 
</body>

</html>
