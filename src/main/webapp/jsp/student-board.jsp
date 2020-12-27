<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Student board</title>
        <%@include file="../WEB-INF/jspf/header.jsp"%>
    </head>
    <body>
        <div class="container">
            <p>This is the table of all students:</p>
            <a href="add-student">Add student</a>
            <table>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th></th>
                </tr>
                <%--@elvariable id="studentList" type="java.util.List<com.example.jspdemo.model.Student>"--%>
                <c:forEach items="${studentList}" var="student">
                    <tr onclick="document.location = 'student'">
                        <td>${student.id}</td>
                        <td>${student.firstName}</td>
                        <td>${student.lastName}</td>
                        <td><a href="student?id=${student.id}">Info</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
