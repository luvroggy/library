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
<form action="${pageContext.request.contextPath}/booking/admin/update" name="bookingGet" >
	<table>
		<tr>
			<th colspan="2">예약 상세 정보</th>
		</tr>
		<tr>
			<td>예약 번호</td>
			<td> ${booking.bookingId}
				<input type="hidden" name="bookingId"
				       value="${booking.bookingId}"/>
			</td>
		</tr>
		<tr>
			<td>예약 상태</td>
			<td>${bookingStatusName}</td>
		</tr>
		<tr>
			<td>책 번호</td>
			<td>${booking.bookId}</td>
		</tr>
		<tr>
			<td>이용자 번호</td>
			<td>${booking.userId}</td>
		</tr>
		<tr>
			<td>예약 날짜</td>
			<td>${booking.bookingDate}</td>
		</tr>
		<tr>
			<td>등록 일자</td>
			<td>${booking.regdt}</td>
		</tr>
		<tr>
			<td>수정 일자</td>
			<td>${booking.moddt}</td>
		</tr>
	
		<tr>
			<td colspan="2" class="center">
				
				<a href="remove?bookingId=${booking.bookingId}" 
				   onclick="return confirmRemove('${booking.bookingId}');">
				삭제하기
				</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>