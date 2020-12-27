<%--@elvariable id="student" type="com.example.jspdemo.model.Student"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Student Record</title>
        <%@include file="../WEB-INF/jspf/header.jsp"%>
    </head>
    <body>
        <div class="container">
            <h1>Student Record</h1>
            <p>ID: ${student.id}</p>
            <p>First Name: ${student.firstName}</p>
            <p>Last Name: ${student.lastName}</p>
            <a href="student-board">Back</a>
        </div>
    </body>
</html>
