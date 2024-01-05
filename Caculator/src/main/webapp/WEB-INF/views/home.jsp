<%@ page import="com.example.caculator.controller.CaculatorController" %><%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 26/12/2023
  Time: 09:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h2>Caculator</h2>
<form method="post" action="caculator">
    <input type="number" name="number1" placeholder="enter your number1">
    <input type="number" name="number2" placeholder="enter your number2">
    <p></p>
    <input type="submit" name="addition" value="addition">
    <input type="submit" name="subtraction" value="subtraction">
    <input type="submit" name="multiplication" value="multiplication">
    <input type="submit" name="division" value="division">
</form>
<label>Result: ${result} </label>
</body>
</html>
