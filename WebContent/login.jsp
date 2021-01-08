<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員登入</title>
</head>
<body>
	<form method="post" action="LoingServlet">
		<div>會員帳號:</div>
		<input type="text" name="username">
		<div>會員密碼:</div>
		<input type="password" name="password">
		<br/>
		<input type="submit" value="登入">
	</form>
	<br/>
	<ket:goToIndex/>
</body>
</html>