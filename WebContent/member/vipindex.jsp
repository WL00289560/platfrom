<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員區首頁</title>
</head>
<body>
	<fieldset>
		<header>會員區</header>
		<h4>分散式架構採用pathparam,可複製下方連結並貼上瀏覽器網址執行:</h4>
		<h4>http://localhost:8080/platfrom/member/customerservice/select/Taiwan/result</h4>
		<h4>搜尋國籍 Taiwan 可更改:例:France</h4>
		<br/>
		<div>請點擊下方連結</div>
		<br/>
		<ket:goToReport/>
		<ket:goToVender/>
		<ket:goToVenderJax/>
		<br/>
		<ket:goToAddCustomers/>
		<ket:goToThrowsErrorCode/>
		<ket:goToIndex/>
		
	</fieldset>
</body>
</html>