<%--
  Created by IntelliJ IDEA.
  User: nikita
  Date: 19.09.2018
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>User-book</title>
<head>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>


</head>
<body>
<nav role="navigation" class="navbar navbar-default">
    <div class="">
        <a href="#" class="navbar-brand">User book</a>
    </div>

</nav>
<a href="/new-user" type="button" class="btn btn-default">+add user</a>
<table id="table" class="table table-striped table-bordered">
    <thead>
    <tr>
        <td>Name</td>
        <td>Email</td>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}
            <td>${user.email}</td>
                    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
