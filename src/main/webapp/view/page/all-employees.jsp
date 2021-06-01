<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>AllEmployees</title>
    <%--    <link href="styles.css" rel="stylesheet">--%>
    <style>
        body {
        background-color: powderblue;
    }

    h1 {
        color: blue;
    }

    p {
        color: red;
    }
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>

</head>
<body>

<h1 style="color:blue;font-size:300%;text-align:center;">List of all employees</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">First Name</th>
        <th scope="col">Second Name</th>
        <th scope="col">Department</th>
    </tr>
    </thead>
    <c:forEach var="emp" items="${allEmployees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.firstName}</td>
            <td>${emp.secondName}</td>
            <td>${emp.department}</td>
        </tr>
        >

    </c:forEach>
</table>
<p><a href="https://www.google.com">This is a Google</a></p>


</body>
</html>

