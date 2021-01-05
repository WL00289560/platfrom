<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ke" uri="http://www.platfrom.com.tw/functions" %>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>廠商查詢結果</title>
<style type="text/css">

mark{
	font-size: 18px;
	color:blue;
}
</style>
</head>
<body background="../images/background.jpg" bgcolor="#738291">
	<h3>查詢資料總數:${ke:mark(requestScope.selectCountry.size())}</h3>
	<c:if test="${requestScope.selectCountry.size() != 0}">
		<table border="1" width = "100%">
			<thead>
				<tr>
					<td>ID</td>
					<td>名字</td>
					<td>地址</td>
					<td>電話</td>
					<td>城市</td>
					<td>國家</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.selectCountry}" var="selectCountry">
					<tr>
						<td><c:out value="${selectCountry.id}" default="out missing"></c:out></td>
						<td><c:out value="${selectCountry.name}" default="out missing"></c:out></td>
						<td><c:out value="${selectCountry.address}" default="out missing"></c:out></td>
						<td><c:out value="${selectCountry.phone}" default="out missing"></c:out></td>
						<td><c:out value="${selectCountry.city}" default="out missing"></c:out></td>
						<td align="left"><font color="red"><c:out value="${selectCountry.country}" default="out missing"></c:out></font></td>
					</tr>
				</c:forEach>
				
			</tbody>
		</table>
	</c:if>
	<c:if test="${requestScope.selectCountry.size() == 0}">
		<div style="color: red"><c:out value="查無資料,請更換條件" default="out missing"></c:out></div>
	</c:if>
	<br/>
	<img src="../images/MVC.JPG"  alt="圖片無法顯示" width="900px"/>	
	<br/>
	<br/>
	<ket:goToVipIndex/>
</body>
</html>