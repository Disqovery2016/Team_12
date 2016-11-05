
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
<title> MySQL Connectivity</title>
</head>

<body>
<%
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
    %>
    
 <table title="End User Details" cellpadding="1" cellspacing="1" border="true">
<tr>
<td> Name </td>
<td> email </td>
<td> uid </td>
<td> gen</td>
<td>address</td>
<td>mob</td>

</tr>
<%
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
%>
<tr>
<td> <%=name%> </td><br><br>
<td> <%=email%> </td>
<td> <%=uid%> </td>
<td> <%=gen%> </td>
<td> <%=address%> </td>
<td> <%=mob%> </td>

</tr>
<%   
}
}
    if(status==0)
{
    response.sendRedirect("cust.jsp");
}
%>
</body>

</html>
