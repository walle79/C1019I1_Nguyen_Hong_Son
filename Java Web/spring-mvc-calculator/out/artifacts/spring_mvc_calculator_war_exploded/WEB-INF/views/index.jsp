<%--
  Created by IntelliJ IDEA.
  User: HT
  Date: 2/13/2020
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="cal" method="post">
    <input type="text" name="first" placeholder="0">
    <input type="text" name="second" placeholder="0">
    <br>
    <br>
    <input type="submit" name="button" value="Addition(+)">
    <input type="submit" name="button" value="Subtraction(-)">
    <input type="submit" name="button" value="Multiplication(x)">
    <input type="submit" name="button" value="Division(/)">
</form>
<h1> result = ${result}</h1>
</body>
</html>
