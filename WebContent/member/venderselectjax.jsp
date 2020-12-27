<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ket" uri="http://www.platfrom.com.tw/tag"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JAX 廠商資料搜尋</title>
</head>
<body onload="init()">
	<fieldset>
		<legend>國家別</legend>
		<input type="text" id="country">
		<input type="button" value="查詢" id="btnQry">
			<table border="1" width="100%">
				<thead>
					<tr>
						<td>ID</td>
						<td>姓名</td>
						<td>地址</td>
						<td>電話</td>
						<td>國家</td>
					</tr>
				</thead>
				<tbody id="tb">
				
				</tbody>
			</table>
		<script type="text/javascript">
			function init(){
				var btn = document.getElementById('btnQry');
				btn.onclick = function(){
					tb.innerHTML='';
					var country = document.getElementById('country').value;
					var xhr = new XMLHttpRequest();
						xhr.onreadystatechange = function(){
							if(this.readyState == 4 && this.status == 200){
								var data = JSON.parse(xhr.responseText);
								for(var rowIndex in data){
									
									var mmb = data[rowIndex];
									
									var row = document.createElement('tr');
									
									var tkid = document.createElement('td');
										tkid.innerText = mmb.id;
									var tkname = document.createElement('td');
										tkname.innerText = mmb.name;
									var tkaddress = document.createElement('td');
										tkaddress.innerText = mmb.address;
									var tkphone = document.createElement('td');
										tkphone.innerText = mmb.phone;
									var tkcountry = document.createElement('td');
										tkcountry.innerText = mmb.country;
									
									row.appendChild(tkid);
									row.appendChild(tkname);
									row.appendChild(tkaddress);
									row.appendChild(tkphone);
									row.appendChild(tkcountry);
									tb.appendChild(row);
								}
							}
							if(this.readyState == 4 && this.status == 400){
								alert(xhr.responseText);
							}
						}
					
					
					var url = 'http://localhost:8080/platfrom/member/customerservice/select/'+ country +'/result';
					xhr.open('GET',url);
					xhr.send();
					
				}
				
			}
		
		</script>
	</fieldset>
	<ket:goToVipIndex/>
</body>
</html>