<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 삭제 전 확인 질문
	function confirmRemove(code) {
		var yes = confirm(code + " 정보를 "
				         +"삭제하시겠습니까?");
		return yes;
	}

</script> 
</head> 
<body>
<form action="${pageContext.request.contextPath}/registration/admin/update" name="getForm" >
	<table>
		<tr>
			<th colspan="2">등록 상세 정보</th>
		</tr>
		<tr>
			<td>등록 번호</td>
			<td> ${registration.registrationId}
				<input type="hidden" name="registrationId"
				       value="${registration.registrationId}"/>
			</td>
		</tr>
		<tr>
			<td>수서 번호</td>
			<td>${registration.acquisitionId}</td>
		</tr>
		<tr>
			<td>검수 번호</td>
			<td>${registration.inspectionId}</td>
		</tr>
		<tr>
			<td>요청 번호</td>
			<td>${registration.requestId}</td>
		</tr>
		<tr>
			<td>책 이름</td>
			<td>${registration.title}</td>
		</tr>
		<tr>
			<td>저자</td>
			<td>${registration.author}</td>
		</tr>
		<tr>
			<td>출판사</td>
			<td>${registration.publisher}</td>
		</tr>
		<tr>
			<td>ISBN</td>
			<td>${registration.isbn}</td>
		</tr>
			<tr>
			<td>등록일</td>
			<td>${registration.regdt}</td>
		</tr>
			<tr>
			<td>수정일</td>
			<td>${registration.moddt}</td>
		</tr>
	
		<tr>
			<td colspan="2" class="center">
				
				<a href="remove?registrationId=${registration.registrationId}" 
				   onclick="return confirmRemove('${registration.registrationId}');">
				삭제하기
				</a>
			</td>
		</tr>
	</table>
</form>

</body>
</html>