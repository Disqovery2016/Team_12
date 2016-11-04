
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
String DB_URL = "jdbc:mysql://localhost/rscoe";//java database connectivity
// Database credentials
String USER = "root";
String PASS = "1100";
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
String sql=null;
int s_roll=0;
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

int user_id=Integer.parseInt(request.getParameter("userid"));
String pass=request.getParameter("pwd");
sql = "select * from login";
rs = stmt.executeQuery(sql);
System.out.println("query executed");
//STEP 5: Extrata result set
while(rs.next())
{
//Retrieve by column name
s_roll = rs.getInt(1);
String s_name= rs.getString("pwd");
if(user_id==s_roll)
{
    if(pass.equals(s_name));
    status=1;
}
}

}
catch(Exception e)
{
e.printStackTrace();
}
if(status==1)
{
    System.out.println("Passsword successful");

    //sql=;
    System.out.println("Passsword successful 1");
    rs= stmt.executeQuery("select * from student where roll_no="+s_roll);
    System.out.println("Passsword successful 2");
 %> 
 <table title="Student Details" cellpadding="1" cellspacing="1" border="true">
<tr>
<td> Rollno </td>
<td> Class </td>
<td> PNR Number </td>
<td> StudentName</td>
<td>Gender</td>
<td>PhoneNo</td>
<td>Addresss</td>
</tr>
<%
while(rs.next())
{
//Retrieve by column name
int roll = rs.getInt("roll_no");
String c= rs.getString("class");
int pnr = rs.getInt("pnr_no");
String name = rs.getString("std_name");
String gender = rs.getString("gender");
String phone = rs.getString("phone");
String address=rs.getString("address");
%>
<tr>
    <td> <%=roll%> </td><br><br>
<td> <%=c%> </td>
<td> <%=pnr%> </td>
<td> <%=name%> </td>
<td> <%=gender%> </td>
<td> <%=phone%> </td>
<td> <%=address%> </td>
</tr>
<%   
}
}
    if(status==0)
{
    response.sendRedirect("index.html");
}
%>
</body>

</html>
