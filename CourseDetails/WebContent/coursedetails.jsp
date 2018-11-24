<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="dosearch">
<h1>Course Details</h1>
	<table border="1">
	  
		<tr>
			<th>cId</th>
			<th>cName</th>
			<th>cFees</th>
			<th>Enroll</th>
		</tr>
        <a:forEach var="item" items="${temp}">
		<tr>
			<td>${item.cId}</td>
			<td>${item.cName}</td>
			<td>${item.cFees}</td>
		    <td><a href = "sucess">Enroll</a></td>
		</tr>
        </a:forEach>
       
	</table>
 </form>
</body>
</html>