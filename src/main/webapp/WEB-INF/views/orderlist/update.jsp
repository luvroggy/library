<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/orderlist/update" name="setForm" method="post">
	<table>
		<tr>
			<th colspan="2">주문내역 정보 수정</th>
		</tr>
		<tr>
			<td>*주문 번호</td>
			<td>
				<input type="text" name="orderId"
				       required="required"
				       value="${orderlist.orderId}"  />
			</td>
		</tr>
		<tr>
			<td>*수서 번호</td>
			<td>
				<input type="text" name="acquisitionId"
					   required="required"
				       value="${orderlist.acquisitionId}" />
			</td>
		</tr>
		<tr>
				<td>*공급자 번호</td>
				<td>
					<input type="text" name="supplierId" size="20"
						required="required"
						value="${orderlist.supplierId}" />
				</td>
		</tr>
		<tr>
				<td>*요청 번호</td>
				<td>
					<input type="text" name="requestId" size="20"
						required="required"
						value="${orderlist.requestId}" />
				</td>
		</tr>
		<tr>
				<td>*책 이름</td>
				<td>
					<input type="text" name="title" size="20"
						required="required"
						value="${orderlist.title}" />
				</td>
		</tr>
		<tr>
				<td>*저자</td>
				<td>
					<input type="text" name="author" size="20"
						required="required"
						value="${orderlist.author}" />
				</td>
		</tr>
		<tr>
				<td>*출판사</td>
				<td>
					<input type="text" name="publisher" size="20"
						required="required"
						value="${orderlist.publisher}" />
				</td>
		</tr>

		<tr>
				<td>*수량</td>
				<td>
					<input type="text" name="quantity" size="20"
						required="required"
						value="${orderlist.quantity}" />
				</td>
		</tr>
		<tr>
				<td>*가격</td>
				<td>
					<input type="text" name="price" size="20"
						required="required"
						value="${orderlist.price}" />
				</td>
		</tr>
		<tr>
				<td>*ISBN</td>
				<td>
					<input type="text" name="isbn" size="20"
						required="required"
						value="${orderlist.isbn}" />
				</td>
		</tr>
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="수정하기"/> &nbsp;
				<input type="reset"  value="초기화"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>