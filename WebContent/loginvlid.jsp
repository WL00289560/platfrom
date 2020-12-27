<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入驗證</title>
</head>
<body>
	<font color="red">
	<c:out value="${message}" default="out missing"></c:out>
	</font>
	<br/>
	<ket:goToIndex/>	
	<ket:goToVipIndex/>

	
</body>
</html>