<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="/write/insert" method="post">
<table class="table table-bordered" style=" max-width: 800px; text-align:center;">
	<tr>
		<td colspan="2">희망도서 신청서</td>
	</tr>
	<tr>
		<td>신청자명</td>
		<td><input type="text" name="userId" value="-"/></td>
	</tr>
	<tr>
		<td>책이름</td>
		<td><input type="text" name="title" value="-"/></td>
	</tr>
	<tr>
		<td>저자</td>
		<td><input type="text" name="author" value="-"/></td>
	</tr>
	<tr>
		<td>출판사</td>
		<td><input type="text" name="publisher" value="-"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<input class="btn btn-default" type="submit" value="신청서 전송"/>
		</td>
	</tr>
</table>
	<input type="hidden" name="requestId" value="-"/>
	<input type="hidden" name="requestStatus" value="RQST0101"/>
	<input type="hidden" name="isbn" value="-"/>
	<input type="hidden" name="copy" value="0"/>
</form>
</div>
</body>
</html>