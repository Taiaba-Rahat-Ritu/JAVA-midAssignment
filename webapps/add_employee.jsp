<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body>
    <h2>Add Employee</h2>
    <form action="/addEmployee' method="post">
        <label for="id">Employee ID:</label><br>
        <input type="text" id="id" name="id"><br>

        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name"><br>

        <label for="dob">Date of Birth (yyyy-mm-dd):</label><br>
        <input type="date" id="dob" name="dob"><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email"><br>

        <label for="joiningDate">Joining Date (yyyy-mm-dd):</label><br>
        <input type="date" id="joiningDate" name="joiningDate"><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
