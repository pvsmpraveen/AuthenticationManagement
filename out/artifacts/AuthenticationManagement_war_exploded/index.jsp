<%--
  Created by IntelliJ IDEA.
  User: Kaushik
  Date: 01-Feb-19
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <head>
    <title>Registration Page</title>
    <link rel="stylesheet" href="abc.css">
  </head>

  <body>
  <center><h1>REGISTRATION PAGE</h1></center>

  <form method="post" target="_self" action="${pageContext.request.contextPath}/register">
  <b><i>NEW USER? PLEASE REGISTER BELOW</i></b><br><br><br>
  ENTER USERNAME: <input type="text" name="ctext"/><br><br><br>
  ENTER PASSWORD: <input type="password" name="cpassword"/><br><br><br>
  ENTER ROLE:<br>
  1.DOCTOR<input type="radio" value="doctor" name="abc"><br>
  2.PATIENT<input type="radio" value="patient" name="abc"><br><br><br>

   <center><input type="submit" value="REGISTER"></center><br><br><br>

  </form>

  <center><b><i><a href="login.jsp">EXISTING USER? CLICK HERE TO LOGIN</a> </i></b></center>


  </body>
</html>
