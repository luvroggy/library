<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>acquisition insert</title>
</head>
<body>
<form action="/admin/acquisition/insert" name="acquisitionInsert" method="post">
	<table>
		<tr>
			<th colspan="2">수서 정보 등록</th>
		</tr>
		<tr>
			<td>요청 번호</td>
			<td>
				<input type="text" name="requestId" value="${request.requestId }"/>
			</td>
		</tr>
		<tr>	
			<td>관리자 아이디</td>
			<td>
				<input type="text" name="userId" value="${sessionScope.userId }"/>
			</td>
		</tr>
		<tr>	
			<td>책 이름</td>
			<td>
				<input type="text" name="title" value="${request.title }"/>
			</td>
		</tr>
		<tr>	
			<td>저자</td>
			<td>
				<input type="text" name="author" value="${request.author }"/>
			</td>
		</tr>
		<tr>	
			<td>출판사</td>
			<td>
				<input type="text" name="publisher" value="${request.publisher }"/>
			</td>
		</tr>
		<tr>	
			<td>ISBN</td>
			<td>
				<input type="text" name="isbn" value="${request.isbn }"/>
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