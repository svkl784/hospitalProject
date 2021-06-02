<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: powderblue;;
        }

        * {
            box-sizing: border-box;
        }

        .container {
            padding: 20px;
            background-color: white;
        }

        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #33ccff;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #33ccff;
            outline: none;
        }

        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        a {
            color: dodgerblue;
        }

        .adminMessage {
            background-color: #f1f1f1;
            text-align: center;
        }

        .button {
            background-color: #33ccff;
            border: none;
            color: white;
            padding: 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }

        .button4 {
            border-radius: 12px;
        }
    </style>
</head>
<body>
<h1>Create new patient</h1>
<p>Please enter new patient details</p>

<form:form action="createdPatient" modelAttribute="newPatient">
    First Name <form:input path="firstName" placeholder="Enter first name"/>
    <br>
    Second Name <form:input path="secondName" placeholder="Enter second name"/>
    <br>
    Date of birth <form:input path="dateOfBirth" placeholder="Enter date of birth"/>
    <br>
    Healths Complaints<form:input path="healthsComplaints" placeholder="Enter healths complaints"/>
    <input class="button button4" type="submit" value="OK">

</form:form>

</body>
</html>
