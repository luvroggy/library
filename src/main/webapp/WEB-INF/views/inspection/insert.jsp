<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/admin/inspection/insert" name="inspectionInsert" method="post">
	<table>
		<tr>
			<th colspan="2">검수 등록</th>
		</tr>
		<tr>
			<td>*검수 번호</td>
			<td>
				<input type="text" name="inspectionId"
				       required="required"/>
			</td>
		</tr>
		<tr>
			<td>*수서 번호</td>
			<td>
				<input type="text" name="acquisitionId"
				       required="required"/>
			</td>
		</tr>
		<tr>
			<td>*주문 번호</td>
			<td>
				<input type="text" name="orderId"
					   required="required"	
				       />
			</td>
		</tr>
		<tr>
			<td>*요청 번호</td>
			<td>
				<input type="text" name="requestId"
					   required="required"	
				       />
			</td>
		</tr>
		<tr>
			<td>*책 이름</td>
			<td>
				<input type="text" name="title"
					   required="required"	
				       />
			</td>
		</tr>
		<tr>
			<td>*저자</td>
			<td>
				<input type="text" name="author"
					   required="required"	
				       />
			</td>
		</tr>
		
		<tr>
			<td>*출판사</td>
			<td>
				<input type="text" name="publisher"
					   required="required"	
				       />
			</td>
		</tr>
		
		<tr>
			<td>*ISBN</td>
			<td>
				<input type="text" name="isbn"
					   required="required"	
				       />
			</td>
		</tr>
		
		<tr>
			<td>*등록 일자</td>
			<td>
				<input type="text" name="regdt"
					   required="required"	
				       />
			</td>
		</tr>
		
		<tr>
			<td>*수정 일자</td>
			<td>
				<input type="text" name="moddt"
					   required="required"	
				       />
			</td>
		</tr>
		
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="등록하기"/> &nbsp;
				<input type="reset"  value="초기화"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>