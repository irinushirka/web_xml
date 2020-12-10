<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="styles/results_styles.css">
</head>
<body>
	<div class="results">
		<h3>${requestScope["message"]}</h3>
		<h1>Results:</h1>
		<ol>
	        <c:forEach var="item" items="${results}">
				<li><c:out value="${item}" /></li>
			</c:forEach>
		</ol>
    </div> 
</body>
</html>