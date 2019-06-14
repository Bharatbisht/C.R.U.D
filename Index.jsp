<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="data">
ID <input type="number" name="id">
Name <input type="text" name="uname">
Email <input type="email" name="email">
<button type="submit" name="operation" value="create">Create</button>
<button type="submit" name="operation" value="update">Update</button>
<button type="submit" name="operation" value="delete">Delete</button>
</form>
<a href="View.jsp">Read</a>
</body>
</html>