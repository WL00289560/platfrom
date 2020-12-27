<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>
</head>
<body>
	<fieldset>
		<h3>首頁你好</h3>
		<ket:goToRegister/>
		<ket:goToLogin/>

		
	</fieldset>
	<fieldset>
		<h3>尚未登入無法訪問下方頁面</h3>
		<ket:goToVipIndex/>
		<ket:goToReport/>
	</fieldset>
</body>
</html>