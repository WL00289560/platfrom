<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>
<style type="text/css">
	fieldset {
	background: #fbbf5b;
}

	
</style>

</head>
<body background="images/background.jpg" bgcolor="#738291">

	<img src="images/banner.png" width=100%  alt="圖片無法顯示"  align="top"/>
	<fieldset>
		<h3>請先登入或註冊</h3>
		<img src="images/simple_process_1.JPG"  alt="圖片無法顯示"   width="50%"/>
		<br/>
		<ket:goToRegister/>
		<ket:goToLogin/>

	</fieldset>
	<br/>
	<fieldset> 	
		<h3>尚未登入無法訪問下方頁面</h3>
		<img src="images/simple_process_2.JPG"  alt="圖片無法顯示"  width="50%"/>
		<br/>
		<ket:goToVipIndex/>
		<ket:goToReport/>
	</fieldset>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	
	<img src="images/systembasicset.JPG"  alt="圖片無法顯示"   width="50%"/>
	
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<hr/>  

</body>
</html>