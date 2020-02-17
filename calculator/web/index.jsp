<%--
  Created by IntelliJ IDEA.
  User: HT
  Date: 2/7/2020
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator Simple</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
  <h2>Calculator Simple</h2>
  <form method="post" action="/calculate">
  <label>First Operand: </label>
    <input type="text" name="firstOperand" size="30" placeholder="0">
    <br>
    <label>Operator</label>
    <select name="operator">
      <option value="+">Add</option>
      <option value="-">Sub</option>
      <option value="*">Mul</option>
      <option value="/">Div</option>
    </select>
    <br>
    <label>Second Operand: </label>
    <input type="text" name="secondOperand" size="30" placeholder="0">
    <br>
    <input type="submit" value="Calculate">

  </form>
  </body>
</html>
