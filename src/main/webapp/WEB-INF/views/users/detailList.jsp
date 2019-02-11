<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>users detailList</title>
</head>
<script type="text/javascript">
	// 삭제 전 확인 질문
	function confirmRemove(code) {
		var yes = confirm(code + " 정보를 "
				         +"삭제하시겠습니까?");
		return yes;
	}

</script>  
<body>
<form action="${pageContext.request.contextPath}/admin/users/update" name="getForm" >
	<table>
		<tr>
			<th colspan="2">회원 상세 정보</th>
		</tr>
		<tr>
			<td>아이디</td>
			<td> ${users.userId}
				<input type="hidden" name="userId"
				       value="${users.userId}"/>
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${users.userName}</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>${users.userEmail}</td>
		</tr>
		<tr>
			<td>분류</td>
			<td>${users.userPosition}</td>
		</tr>
		<tr>
			<td>소속</td>
			<td>${users.userAssigned}</td>
		</tr>
		<tr>
			<td>직업</td>
			<td>${users.userGrade}</td>
		</tr>
		<tr>
			<td>등록 일자</td>
			<td>${users.regdt}</td>
		</tr>
		<tr>
			<td>수정 일자</td>
			<td>${users.moddt}</td>
		</tr>
		
		
		
		<tr>
			<td colspan="2" class="center">
				
				<a href="remove?userId=${users.userId}" 
				   onclick="return confirmRemove('${users.userId}');">
				삭제하기
				</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>