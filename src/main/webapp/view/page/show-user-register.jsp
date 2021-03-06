<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
        .button4 {border-radius: 12px;}
    </style>
</head>
<body>
<h1>Register</h1>
<p>Please fill out this form to sign in to your account!</p>
<form action=" ">
    <div class="container">
        <%--@declare id="username"--%><%--@declare id="email"--%><%--@declare id="password"--%>
        <label for="userName"><b>UserName</b></label>
        <input type="text" placeholder="Enter Email" name="userName" required>

        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter email" name="email" required>

        <label for="password"><b>Enter Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>
        <hr>

    <p>If you are not registered, contact the administrator <a href="#">Write a message to the administrator</a>.</p>
</form>

</body>
</html>
