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
<body background="images/background.jpg" bgcolor="#738291">
	<img src="images/register.JPG" alt="圖片無法顯示"  width="50%"/>
	<h3 style="color:red;"><%=(String)request.getAttribute("content")%></h3> 
	<br/>
	<ket:goToIndex/>
</body>
</html>