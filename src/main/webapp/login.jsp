<%--Created by IntelliJ IDEA.
  User: rouna
  Date: 8/5/2021
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<%------------------------------------------------%>
<form method="post" action="login" >
    <table>
        <tr>
            <td>User Name: </td>
            <td><input type="text" name="usname" placeholder="enter username"></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td><input type="password" name="uspass" placeholder="enter password"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="login"></td>
        </tr>
    </table>
</form>
<%------------------------------------------------%>
</body>
</html>
