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
<body>
	<fieldset>
		<% pageContext.setAttribute("app", application); %>
		<jsp:useBean id="customers" class="platfrom.domain.AddCustomers"></jsp:useBean>
		<jsp:setProperty property="*" name="customers"/>
		${kef:AddCustomer(customers,app)}
		<jsp:getProperty property="companyName" name="customers"/>
	</fieldset>
	<br/>
	<ket:goToAddCustomers/>
	<ket:goToVipIndex/>
</body>
</html>