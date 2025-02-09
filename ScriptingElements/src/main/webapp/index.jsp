<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting elements Example</title>
</head>
<body>
<h1>Scripting elements examples</h1>
<strong>Scripting elements practice</strong>
<br/>
<%--Expression --%>
<%=2*5%>
<br/>
<%--Scriptlet --%>
<%out.print("Printing using scriptlet"); %>
<br/>
<%--Declarations --%>
<%! int a = 10; int b = 20; %>
<%=a*b %>
<br/>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> is the starting example of directive --%>
    
<br/>
<%=a>b %>
</body>
</html>