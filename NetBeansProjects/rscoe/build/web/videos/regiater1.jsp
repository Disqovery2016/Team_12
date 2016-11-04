<%-- 
    Document   : regiater1
    Created on : 4 Nov, 2016, 2:07:41 PM
    Author     : jaydip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        <body bgcolor="#ff4040">
        <div class="container">
  <h2>Registration</h2>
  
  <form action="reg.jsp" method="GET"> 
      <label for="email">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name">
    </div>
     
    <div class="form-group">
      <label for="dob">Date Of Birth:</label>
      <input type="date" class="form-control" id="dob">
    </div>
    <div class="form-group">
      <label for="email">E-mail:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter E-mail">
    </div>
      
      <label for="email">Adhar Card:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter UID">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter Password">
    </div>
    <div class="form-group">
      <label for="Gender">Gender:</label>
      <input type="radio" id="female" name="gender" value="male" checked>Male
      <input type="radio" id="female" name="gender" value="female">Female
    </div>
    <div class="form-group">
      <label for="add">Address:</label>
      <textarea class="form-control" id="add" rows="5" cols="10"></textarea>  
    </div>
    <div class="form-group">
      <label for="phno">Phone no:</label>
      <input type="number" class="form-control" id="pwd" placeholder="Enter Mob No">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>


    </body>
</html>
