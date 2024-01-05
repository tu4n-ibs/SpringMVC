<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 26/12/2023
  Time: 08:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiment</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">

    <input type="checkbox" name="condiment" value="Lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="condiment" value="Tomato">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Mustard">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Sprouts">
    <label>Sprouts</label>
    <hr>
    <input type="submit" value="save">
</form>
</body>
</html>
