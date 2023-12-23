<%@ page import="org.example.demo1.model.Customer" %>
<%@ page import="org.example.demo1.service.CustomerService" %><%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 21/12/2023
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    fieldset{
        width: 467px;
        height: 149px;
    }
</style>
<body>
<%
    CustomerService customerService = new CustomerService();
    int id = Integer.parseInt(request.getParameter("id"));
    Customer customer = customerService.findCustomer(id);

%>
<%--<form action="/customers" method="post">--%>
    <fieldset>
        <legend>Customer Information</legend>
        <input type="hidden" name="id" value="<%= customer.getId() %>">
        <table>
            <tr>
                <td>Id</td>
                <td>
                    <%= customer.getId() %>
                </td>
            </tr>
            <tr>
                <td>Name</td>
                <td>
                    <input type="text" name="name" value="<%= customer.getName() %>">
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <input type="text" name="email" value="<%= customer.getEmail() %>">
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td>
                    <input type="text" name="address" value="<%= customer.getAddress() %>">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Update">
                </td>
            </tr>
        </table>
    </fieldset>
<%--</form>--%>
<a href="/customers">Back to list</a>.
</body>
</html>
