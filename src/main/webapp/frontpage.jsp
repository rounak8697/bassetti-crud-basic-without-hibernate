<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Display front page</title>
</head>
<%--------------------------------------------------------%>
<body>

<%//for http 1.1
    response.setHeader("Cache-Control","no-cache");
    response.setHeader("Cache-Control","no-store");
    response.setHeader("Cache-Control","must-revalidate");

    response.setHeader("Pragma","no-cache");//for http 1.0

    response.setHeader("Expires","0");//for proxies

    //for a secure session
    if(session.getAttribute("username")==null)
    {
        response.sendRedirect("login.jsp");
    }
%>
Welcome, ${username}.

    <h2>Add Student</h2>
    <form method="get" action="add">

    <table>
        <tr><td> Id :</td><td> <input type="number" name="userid" placeholder=" enter your Id" autocomplete="off" /></td></tr>

        <tr><td>Name:</td><td> <input type="text" name="username" placeholder=" enter name" autocomplete="off"/></td></tr>

        <tr><td>Roll No :</td><td><input type="number" name="roll" placeholder="  enter roll" autocomplete="off"/></td></tr>

        <tr><td>Department :</td><td> <input type="text" name="depart" placeholder="  enter your department"  autocomplete="off"/></td>
    </table>

         <input type="submit" value="ADD" />
         <input type="reset" value="CLEAR"/>
    </form>
    <br>
    <div>
        <a href="servlist">Show Student List</a>
    </div>
    <br>
    <form action="logout">
        <input type="submit" value="Log out">
    </form>

</body>
</html>
