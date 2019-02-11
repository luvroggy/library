<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- form action, name, onsubmit 수정안함. -->
<form action="/admin/orderlist/list" name="orderlistInsert"  method="post">
		<table>
			<tr>
				<td colspan="2" style="text-align: center;">주문내역 등록</td>
			</tr>
			<tr>
				<td>*주문 번호</td>
				<td><input type="text" name="orderId" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*수서 번호</td>
				<td><input type="text" name="acquisitionId" size="10"
					required="required" /></td>
			</tr>
			
			<tr>
				<td>*공급자 번호</td>
				<td><input type="text" name="supplierId" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*요청 번호</td>
				<td><input type="text" name="requestId" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*책 이름</td>
				<td><input type="text" name="title" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*저자</td>
				<td><input type="text" name="author" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*출판사</td>
				<td><input type="text" name="publisher" size="20"
					required="required" /></td>
			</tr>
			
			<tr>
				<td>*수량</td>
				<td><input type="text" name="quantity" size="20"
					required="required" /></td>
			</tr>
			
			<tr>
				<td>*가격</td>
				<td><input type="text" name="price" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*ISBN</td>
				<td><input type="text" name="isbn" size="20"
					required="required" /></td>
			</tr>
			
			<tr>
				<td colspan="2" style="text-align: center;">
				<input type="submit" value="등록하기" /> 
				<input type="reset" value="초기화" /></td>
			</tr>
		</table>
	</form>
</body>
</html>