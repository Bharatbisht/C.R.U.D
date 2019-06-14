<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="crud.*,java.sql.*,java.util.*" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View jsp</title>
</head>
<body>
<%
System.out.println("run view.jsp");

List<String> list = Read.read();
	%>
	<table border="1">  
<tr><th>Id</th><th>Name</th><th>Password</th></tr>
<%for(int i=0;i<list.size();i++){ %>
<tr><td><%out.println(list.get(i));%></td><td><%out.println(list.get(i+1));%></td><td><%out.println(list.get(i+2));%></td></tr>    
<%	
i++;
i++;
}
%>
</table>  
<form method="post" action="Index.jsp">
<button type="submit">Back Page</button>
</form>

</body>
</html>