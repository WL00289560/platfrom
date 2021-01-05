<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員登入</title>
</head>
<body background="images/background.jpg" bgcolor="#738291">
	<form method="post" action="LoingServlet">
		<fieldset>
			<legend>會員登入</legend>
			<div>會員帳號:</div>
			<input type="text" name="username">
			<div>會員密碼:</div>
			<input type="password" name="password">
			<br/>
			<br/>
			<input type="submit" style="width:100px;height:40px" value="登入">
		</fieldset>
		
	</form>
	<br/>
	<ket:goToIndex/>
</body>
</html>