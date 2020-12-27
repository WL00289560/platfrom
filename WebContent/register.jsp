<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員註冊</title>
</head>
<body>
	<form method="post" action="RegisterSave">
		<label>帳號:</label>
		<input type="text" name="username">
		<br/>
		<label>密碼:</label>
		<input type="password" name="password">
		<br/>
		<label>地址:</label>
		<input type="text" name="address">
		<br/>
		<label>電話:</label>
		<input type="text" name="phone">
		<br/>
		<label>信箱:</label>
		<input type="text" name="email">
		<br/>
		<input type="submit" value="註冊">
	</form>
</body>
</html>