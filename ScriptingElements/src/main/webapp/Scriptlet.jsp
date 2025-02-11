<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriptlet and Declaration</title>
</head>
<body>
<h1>Scriptlet and Declaration</h1>
<%--declaring a method using declarations --%>
<%!int a = 10; String b = "Running"; 
String message(){
return b;
}
%>
<br/>
<%-- calling method message() --%>

<%=message() %>


</body>
</html>