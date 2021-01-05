<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="kef" uri="http://www.platfrom.com.tw/functions"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>客戶新增作業</title>
</head>
<body background="../images/background.jpg" bgcolor="#738291">
	<fieldset>
		<% pageContext.setAttribute("app", application); %>
		<jsp:useBean id="customers" class="platfrom.domain.AddCustomers"></jsp:useBean>
		<jsp:setProperty property="*" name="customers"/>
		${kef:AddCustomer(customers,app)}
	</fieldset>
	<br/><br/>
	<img src="../images/addcustomers.JPG"  alt="圖片無法顯示" width="900px"/>
	<br/><br/>
	<ket:goToAddCustomers/>
	<ket:goToVipIndex/>
</body>
</html>