<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Result</title>
</head>
<body>
    <h2>Search Result</h2>
    <c:if test="${not empty employee}">
        <p><strong>Employee ID:</strong> ${employee.employeeId}</p>
        <p><strong>Employee Name:</strong> ${employee.employeeName}</p>
        <p><strong>Designation:</strong> ${employee.designation}</p>
    </c:if>
</body>
</html>