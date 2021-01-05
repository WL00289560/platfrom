<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>會員區首頁</title>
</head>
<body background="../images/background.jpg" bgcolor="#738291">
	<fieldset>
		<header>會員區</header>
		
		<h4>分散式架構採用pathparam,可複製下方連結並貼上瀏覽器網址執行:</h4>
		<h4>http://localhost:8080/platfrom/member/customerservice/select/Taiwan/result</h4>
		<h4>搜尋國籍 Taiwan 可更改:例:France</h4>
		<img src="../images/separate_1.JPG" alt="圖片無法顯示" width="700px"/>
		
		<br/>
		<div>前往其他位置,請點擊下方連結</div>
		<br/><br/>
		<ket:goToReport/>
		<ket:goToAddCustomers/>
		<ket:goToThrowsErrorCode/>
		<br/><br/>
		<ket:goToVender/>
		<ket:goToVenderJax/>
		<br/><br/>
		<ket:goToIndex/>
		
	</fieldset>
	<br/>
	<img src="../images/give_the_cookie.JPG"  alt="圖片無法顯示" width="900px"/>
</body>
</html>