<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: HT
  Date: 2/10/2020
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    List<Customer> listCustomer = Customer.getList();
    request.setAttribute("CusList", listCustomer);
  %>
  <div class="container">
    <h2 id="h2">Danh Sách Khách Hàng</h2>
    <br/>
    <table border="1" class="table">
      <thead>
      <tr>
        <th class="th">Họ Tên</th>
        <th class="th">Ngày Sinh</th>
        <th class="th">Địa Chỉ</th>
        <th class="th">Hình Ảnh</th>
      </tr>
      </thead>
      <tbody class="body">
      <c:forEach var="cus" items="${CusList}">
        <tr>
          <td><c:out value="${cus.name}"/></td>
          <td><c:out value="${cus.birthday}"/></td>
          <td><c:out value="${cus.address}"/></td>
          <td class="td"><c:out value="${cus.image}" />"</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
  </body>
</html>
