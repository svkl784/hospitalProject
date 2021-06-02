<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>AllTherapy</title>
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

<h1 style="color:blue;font-size:300%;text-align:center;">List of all therapy</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Id Therapy</th>
        <th scope="col">Category therapy</th>
        <th scope="col">Name therapy</th>
        <th scope="col">Patient</th>
        <th scope="col">Employee</th>

    </tr>
    </thead>
    <c:forEach var="the" items="${allTherapy}">
        <tr>
            <td>${the.id_therapy}</td>
            <td>${the.id_category_therapy}</td>
            <td>${the.name_therapy}</td>
            <td>${the.id_patient}</td>
            <td>${the.id_employee}</td>
        </tr>

    </c:forEach>
</table>
<p><a href="https://www.google.com">This is a Google</a></p>


</body>
</html>

