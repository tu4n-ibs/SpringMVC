<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 22/12/2023
  Time: 09:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Conversion</title>
</head>
<body>
<form action="/money" method="get">
    money number
    <input type="number" name="money" placeholder="enter your money">
    rate
    <input type="number" name="rate" value="23000"/>
    <input type="submit" value="doi">
</form>
<span>
    ${result}
</span>
</body>
</html>
