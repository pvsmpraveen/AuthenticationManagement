<%--
  Created by IntelliJ IDEA.
  User: Kaushik
  Date: 01-Feb-19
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient details</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/patient" target="_self" method="post">
    <center><b><i>Welcome Patient ${username}</i></b></center><br>
    ENTER AGE:<input type="text" name="cage"/><br>
    ENTER SEX
    1.MALE<input type="radio" value="MALE" name="abc"/><br>
    2.FEMALE<input type="radio" value="FEMALE" name="abc"/><br>
    <center><input type="submit" value="submit"></center>

</form>

</body>
</html>
