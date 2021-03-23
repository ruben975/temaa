<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--  aici vom afisa rezultatul adunarii a 2 numere 
catre controller -->

Rezultatul adunarii este: <c:out value="${suma}"/></br>
Minumul dintre 5 numere este: <c:out value="${minim}"/></br>
Maximul dintre 5 numere este: <c:out value="${maxim}"/></br>
Media aritmetica este: <c:out value="${mediaAritmetica}"/></br>
Ordonat crescator: <c:out value="${ordonat}"/></br>
</body>
</html>