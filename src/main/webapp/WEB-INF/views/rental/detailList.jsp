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
<body>
<form action="${pageContext.request.contextPath}/rental/admin/update" name="getForm" >
	<table>
		<tr>
			<th colspan="2">대여 상세 정보</th>
		</tr>
		<tr>
			<td>대여 번호</td>
			<td> ${rental.rentalId}
				<input type="hidden" name="rentalId"
				       value="${rental.rentalId}"/>
			</td>
		</tr>
		<tr>
			<td>책 번호</td>
			<td>${rental.bookId}</td>
		</tr>
		<tr>
			<td>사용자 아이디</td>
			<td>${rental.userId}</td>
		</tr>
		<tr>
			<td>대여 상태</td>
			<td>${rental.rentalStatus}</td>
		</tr>
		<tr>
			<td>대여 번호</td>
			<td>${rental.rentalNumber}</td>
		</tr>
		<tr>
			<td>반납 예정일</td>
			<td>${rental.dueDate}</td>
		</tr>
		<tr>
			<td>대여 일자</td>
			<td>${rental.rentalDate}</td>
		</tr>
		<tr>
			<td colspan="2" class="center">
				
				<a href="remove?rentalId=${rental.rentalId}" 
				   onclick="return confirmRemove('${rental.rentalId}');">
				삭제하기
				</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>