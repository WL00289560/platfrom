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
<body background="images/background.jpg" bgcolor="#738291">

	<fieldset>
	<img src="images/login.JPG"  alt="圖片無法顯示" width="50%"/>
	
	<br/>
	<font color="red" size="16px">
	<c:out value="${message}" default="out missing"></c:out>
	</font>
	<br/>
	
	</fieldset>
	<br/>
	<ket:goToIndex/>	
	<ket:goToVipIndex/>

	
</body>
</html>