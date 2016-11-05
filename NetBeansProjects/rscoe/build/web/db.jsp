
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
   <br><br>
<div id="horizontalmenu">
        <ul><li><a href="register.jsp">Home </a> </li>
          
            
        </ul>
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
 %> 
</body>

</html>
