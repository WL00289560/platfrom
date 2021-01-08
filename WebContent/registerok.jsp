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
<body>

	<table border="1" wihtd="100%">
		<thead>註冊結果</thead>
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