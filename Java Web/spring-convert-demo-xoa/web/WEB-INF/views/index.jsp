<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HT
  Date: 2/12/2020
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Convert</title>
  </head>
  <body>
  <h1>Convert</h1>
  <form method="post" action="/convert1">
    <div>
  <label>Rate: </label>
  <input type="text" name="rate" placeholder="23000">
  <br>
  <label>USD: </label>
  <input type="text" name="usd" placeholder="1">
  <br>
  <br>
  <input type="submit" value="Submit">
    </div>
  </form>
  </body>
</html>
