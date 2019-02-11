<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>users list</title>
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
<h2>회원 목록</h2>
<hr noshade="noshade">

<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>이메일</th>
		<th>분류</th>
		<th>소속</th>
		<th>직업</th>
		<th>등록 일자</th>
		<th>수정 일자</th>
		<th></th>
	</tr>
	<!-- forEach 부분 수정안함. -->
  <c:forEach var="users" items="${userss}">
	<tr>
		<td class="center">
			<a href="${pageContext.request.contextPath}/users/select?userId=${users.userId}">
			${users.usersId}
			</a>
		</td>
		<td>
			<a href="${pageContext.request.contextPath}/users/select?userId=${users.userId}">
			${users.userName}
			</a>
		</td>
		<td class="right">
			${users.userEmail}	
		</td>
			<td class="right">
			${users.userPosition}
		</td>
			<td class="right">
			${users.userAssigned}
		</td>
			<td class="right">
			${users.userGrade}
		</td>
			<td class="right">
			${users.regdt}
		</td>
			<td class="right">
			${users.moddt}
		</td>
		<td>
			<a href="${pageContext.request.contextPath}/users/admin/delete?userId=${users.userId}" 
			   onclick="return confirmRemove('${users.userId}');">
			삭제
			</a>
		</td>
	</tr>
  </c:forEach>
</table>
<br/>
</body>
</html>



