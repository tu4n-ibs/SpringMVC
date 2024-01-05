<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 25/12/2023
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset style="width: 500px">
    <legend>Customer add</legend>
    <form action="/customer" method="post">
        <table>
            <tr>
                <td>Id</td>
                <td><input type="number" name="id" ></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" ></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" ></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>
                    <button type="submit">add</button>
                </td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>
