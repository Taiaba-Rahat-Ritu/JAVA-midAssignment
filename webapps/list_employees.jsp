<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Employee List</title>
</head>
<body>
  <h2>Employee List</h2>
  <table border="1">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Date of Birth</th>
      <th>Email</th>
      <th>Joining Date</th>
      <th>Vacation Days</th>
      <th>Sick Days</th>
    </tr>
    <!-- Use JSTL forEach to loop through employee data -->
    <c:forEach var="employee" items="${employeeList}">
      <tr>
        <td>${employee.id}</td>
        <td>${employee.name}</td>
        <td>${employee.dateOfBirth}</td>
        <td>${employee.email}</td>
        <td>${employee.joiningDate}</td>
        <td>${employee.vacationDays}</td>
        <td>${employee.sickDays}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
