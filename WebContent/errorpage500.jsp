<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>錯誤代碼500</title>
</head>
<body>
	<% String message =exception.getMessage(); %>	
	<h1>錯誤代碼500轉移此頁面</h1>
	<br/>
	<h3 style="color: red"><%=message %></h3>	
	<br/>
	<ket:goToIndex/>
</body>
</html>