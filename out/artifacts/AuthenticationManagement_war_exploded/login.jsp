<%--
  Created by IntelliJ IDEA.
  User: Kaushik
  Date: 01-Feb-19
  Time: 12:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>

</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post" target="_self">

    ENTER USERNAME:<input type="text" name="ctext"/><br>
    ENTER PASSWORD:<input type="password" name="cpassword"/><br>
    <center><input type="submit" value="LOGIN"></center><br><br><br>

</form>

</body>
</html>
