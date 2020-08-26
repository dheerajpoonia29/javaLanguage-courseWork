<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
	<title>Signup</title>
</head>
<body>

<%
String firstname=request.getParameter("firstname");
String password=request.getParameter("pass");
out.print("Hello");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into auth(username,password)values('"+firstname+"','"+password+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
out.print(e);
e.printStackTrace();
}
%>
</body>
</html>