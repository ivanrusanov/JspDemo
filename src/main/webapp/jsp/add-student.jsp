<%--@elvariable id="student" type="com.example.jspdemo.model.Student"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Add new student</title>
        <%@include file="../WEB-INF/jspf/header.jsp"%>
    </head>
    <body>
        <div class="container">
            <p>Add new student:</p>
            <form action="${pageContext.request.contextPath}/add-student" method="post">
                <label for="firstName">First name:</label><br>
                <input type="text" id="firstName" name="firstName"><br>
                <label for="lastName">Last name:</label><br>
                <input type="text" id="lastName" name="lastName"><br><br>
                <input type="submit" value="Add">
            </form>
        </div>
    </body>
</html>
