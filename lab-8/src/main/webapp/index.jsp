<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Database</title>
</head>
<body>
    <h2>Insert Employee</h2>
    <form action="EmployeeServlet" method="post">
        <input type="hidden" name="action" value="insert">
        Employee ID: <input type="text" name="employeeId" required><br>
        Employee Name: <input type="text" name="employeeName" required><br>
        Designation: <input type="text" name="designation" required><br>
        <input type="submit" value="Insert Employee">
    </form>

    <h2>Search Employee</h2>
    <form action="EmployeeServlet" method="post">
        <input type="hidden" name="action" value="search">
        Employee ID: <input type="text" name="employeeId" required><br>
        <input type="submit" value="Search Employee">
    </form>
</body>
</html>