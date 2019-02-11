<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registration/admin/update" name="setForm" method="post">
	<table>
		<tr>
			<th colspan="2">서지 등록정보 수정</th>
		</tr>
		<tr>
			<td>*수서 번호</td>
			<td>
				<input type="text" name="acquisitionId"
				       required="required"
				       value="${registration.acquisitionId}"  />
			</td>
		</tr>
		<tr>
			<td>*검수 번호</td>
			<td>
				<input type="text" name="inspectionId"
					   required="required"
				       value="${registration.inspectionId}" />
			</td>
		</tr>
		<tr>
			<td>*요청 번호</td>
			<td>
				<input type="text" name="requestId"
					   required="required"
				       value="${registration.requestId}" />
			</td>
		</tr>
		
		<tr>
			<td>*책 이름</td>
			<td>
				<input type="text" name="title"
					   required="required"
				       value="${registration.title}" />
			</td>
		</tr>
		
		<tr>
			<td>*저자</td>
			<td>
				<input type="text" name="author"
					   required="required"
				       value="${registration.author}" />
			</td>
		</tr>
		
		<tr>
			<td>*출판사</td>
			<td>
				<input type="text" name="publisher"
					   required="required"
				       value="${registration.publisher}" />
			</td>
		</tr>
		
		<tr>
			<td>*ISBN</td>
			<td>
				<input type="text" name="isbn"
					   required="required"
				       value="${registration.titisbnle}" />
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