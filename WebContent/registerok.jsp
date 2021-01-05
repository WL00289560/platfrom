<%@page import="platfrom.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>註冊結果</title>
	<% Member member = (Member)request.getAttribute("member"); %>
</head>
<body background="images/background.jpg" bgcolor="#738291">
	<img src="images/register.JPG" align="left" alt="圖片無法顯示"  width="50%"/>
	<table border="1" wihtd="100%">
		
		<h1 style="color:red">註冊結果</h1>
		<tr>
			<td>名稱:</td>
			<td><%=member.getUsername() %></td>
		</tr>
		<tr>
			<td>信箱:</td>
			<td><%=member.getEmail() %></td>
		</tr>
	
	
	</table>
	<div style="color: red" >註冊成功</div>
	<br/>
	<ket:goToLogin/>
</body>
</html>