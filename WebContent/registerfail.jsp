<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>驗證失敗</title>
</head>
<body>
	
	<h3 style="color:red;"><%=(String)request.getAttribute("content")%></h3> 
	<br/>
	<ket:goToIndex/>
</body>
</html>