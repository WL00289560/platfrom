<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增客戶</title>
</head>
<body>
	<fieldset>
		<legend>客戶新增</legend>
			<form method="post" action="customerssave.jsp">
				<div>客戶編號(請輸入數字)</div>
				<input type="text" oninput="value=value.replace(/[^\d]/g,'')" name="customerId">
				<div>公司行號</div>
				<input type="text" name="companyName">
				<div>地址</div>
				<input type="text" name="address">
				<div>電話</div>
				<input type="text" name="phone">
				<div>國家</div>
				<input type="text" name="country">
				<br/>
				<input type="submit" value="新增">
		</form>
	</fieldset>
	<br/>
	<ket:goToVipIndex/>
</body>
</html>