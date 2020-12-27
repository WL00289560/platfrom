<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="time" value="用EL執行5次"/>
	<ket:iterationTag counter="5">
		${ time }
	</ket:iterationTag>
	<ket:iterationTag counter="3">執行次數3</ket:iterationTag>
	
</body>
</html>