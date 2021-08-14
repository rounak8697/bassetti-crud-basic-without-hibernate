<%@ page import="com.crud.StdModel" %>
<%@ page import="com.crud.DAO" %>
<%@ page import="java.util.List" %>
<%--Created by IntelliJ IDEA.User: rouna Date: 7/24/2021 Time: 1:28 PM To change this template use File | Settings | File Templates.--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View all Student data</title>
</head>
<%-------------------------------------------------------------------------------------------------------------%>
<body>
<%
    //for http 1.1
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
<form action="logout" >
    <input type="submit" value="Log out">
</form>

<h1> All Student List</h1>
    <table>
        <thead>
            <tr>
                <td>ID</td>
                <td>Name </td>
                <td>Roll No </td>
                <td>Department </td>
                <td>Update by Id </td>
                <td>Delete by Id </td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="i" items="${list}">
                <tr>
                    <td><c:out value="${i.getId()}"></c:out> </td>
                    <td><c:out value="${i.getName()}"></c:out> </td>
                    <td><c:out value="${i.getRoll()}"></c:out> </td>
                    <td><c:out value="${i.getDepart()}"></c:out> </td>
                    <td><a href='update1?id=${i.getId()}&name=${i.getName()}&rollno=${i.getRoll()}&depart=${i.getDepart()}'>Update by Id</a></td>
                    <td><a href='delete?searchid=${i.getId()}'>Delete Data</a></td>
                </tr>
            </c:forEach>

            <%--        <%--%>
            <%--            request.getAttribute("list");//catching the list from servlet--%>
            <%--            DAO D=new DAO();--%>
            <%--            List<StdModel> l = D.getstudentlist();--%>
            <%--            for(int i=0;i<l.size();i++)--%>
            <%--            {--%>
            <%--        %>--%>
            <%--        <tbody>--%>
            <%--            <tr>--%>
            <%--                <td><%=l.get(i).getId() %></td>--%>
            <%--                <td><%=l.get(i).getName() %></td>--%>
            <%--                <td><%=l.get(i).getRoll() %></td>--%>
            <%--                <td><%=l.get(i).getDepart() %></td>--%>
            <%--                <td><a href='update1?id=<%=l.get(i).getId()%>&name=<%=l.get(i).getName()%>&rollno=<%=l.get(i).getRoll()%>&depart=<%=l.get(i).getDepart()%>'>Update</a></td>--%>
            <%--                <td><a href='delete?searchid=<%=l.get(i).getId()%>'> Delete a row data</a></td>--%>
            <%--            </tr>--%>
            <%--        </tbody>--%>
            <%--        <%}%>--%>
        </tbody>
    </table>


<%------------------------------------------------------------------------------------------------------------%>
</body>
</html>












