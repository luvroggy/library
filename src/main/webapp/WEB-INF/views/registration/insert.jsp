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
<form action="register" name="myForm" onsubmit="return submitMyForm();" method="post">
		<table>
			<tr>
				<td colspan="2" style="text-align: center;">서지 등록</td>
			</tr>
			<tr>
				<td>*등록 번호</td>
				<td><input type="text" name="registrationId" size="10"
					required="required" /></td>
			</tr>
			<tr>
				<td>*수서 번호</td>
				<td><input type="text" name="acquisitionId" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*검수 번호</td>
				<td><input type="text" name="inspectionId" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*요구 번호</td>
				<td><input type="text" name="requestId" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*책 이름</td>
				<td><input type="text" name="title" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*저자</td>
				<td><input type="text" name="author" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*출판사</td>
				<td><input type="text" name="publisher" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*ISBN</td>
				<td><input type="text" name="isbn" size="10"
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