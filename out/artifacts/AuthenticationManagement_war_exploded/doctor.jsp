<%--
  Created by IntelliJ IDEA.
  User: Kaushik
  Date: 01-Feb-19
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Doctor details</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/doctor" method="post" target="_self">

<center><b><i>Welcome Doctor ${username}</i></b></center><br>

    ENTER AREA OF SPECIALISATION<input type="text" name="special"><br>
    <center><input type="submit" value="submit"></center>


</form>



</body>
</html>
