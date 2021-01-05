<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員註冊</title>
</head>
<body background="images/background.jpg" bgcolor="#738291">
	<form method="post" action="RegisterSave">
		<fieldset>
			<legend>請輸入註冊資訊</legend>
			<label>帳號:</label>
			<input type="text"  name="username">
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
			<input type="submit" style="width:100px;height:40px" value="註冊">
			
		</fieldset>
	</form>
</body>
</html>