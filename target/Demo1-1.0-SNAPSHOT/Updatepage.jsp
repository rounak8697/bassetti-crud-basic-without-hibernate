<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Page</title>
</head>
<%--------------------------------------------------------------------------%>
<body>
<%
    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Cache-Control","no-store");
    response.setHeader("Cache-Control","must-revalidate");

    response.setHeader("Pragma","no-cache");//for http 1.0

    response.setHeader("Expires","0");//for proxies

    if(session.getAttribute("username")==null)
    {
        response.sendRedirect("login.jsp");
    }
%>
<form action="update2">
    <table>
        <tr><td> Id :</td><td>
            <input type="number" name="upid" value ="${id}" placeholder="enter your Id" /></td></tr>

        <tr><td>Name:</td><td>
            <input type="text" name="upname" placeholder="enter name" /></td></tr>

        <tr><td>Roll No :</td><td>
            <input type="number" name="uproll" placeholder="enter roll" /></td></tr>

        <tr><td>Department :</td><td>
            <input type="text" name="updepart" placeholder="enter department" /></td>
    </table>
    <input type="submit" value="Update" id="input1">
    <input type="reset" value="Clear" id="input2">
</form>
<form action="logout">
    <input type="submit" value="Log out">
</form>
<%-----------------------------------------------------------------------------%>
</body>
</html>