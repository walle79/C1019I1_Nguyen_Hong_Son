<%--
  Created by IntelliJ IDEA.
  User: HT
  Date: 2/11/2020
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Money Convert</title>
</head>
<body>
<h1>Money Convert</h1>
<form method="get" action="/convert">
Rate:
  <input type="text" name="rate" placeholder="23000">
  <br>
USD:
  <input type="text" name="usd" placeholder="1">
  <br>
  <input type="submit" name="convert" value="Convert">
</form>
</body>
</html>
