<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客戶資料查詢</title>
</head>
<body>
	<form method="post" action="VenderSelectController">
		<fieldset>
			<div>請用英文輸入國家別(例:Taiwan/France)</div>
			<input type="text" name="country">	
			<input type="submit" value="搜尋">
		</fieldset>
	<ket:goToVipIndex/>
	</form>
</body>
</html>