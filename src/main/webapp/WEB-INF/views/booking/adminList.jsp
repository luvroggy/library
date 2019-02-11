<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 목록이므로 반복출력, core tag 사용 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 삭제 전 확인 질문
	function confirmRemove(code) {
		var yes = confirm(code + " 정보를 " + "삭제하시겠습니까?");
		return yes;
	}
</script>
</head>
<body>
<h2>예약 조회</h2>
<hr noshade="noshade">

<table>
	<tr>
		<th>예약 번호</th>
		<th>예약 상태</th>
		<th>책 번호</th>
		<th>이용자 번호</th>
		<th>예약 날짜</th>
		<th>등록 일자</th>
		<th>수정 일자</th>			
	</tr>
	<!-- forEach 부분 수정안함. -->
  <c:forEach var="booking" items="${booking}">
	<tr>
		<td class="center">
			<a href="${pageContext.request.contextPath}/booking/select?bookingId=${booking.bookingId}">
			${booking.bookingId}
			</a>
		</td>
		<td>
			<a href="${pageContext.request.contextPath}/booking/select?bookingId=${booking.bookingId}">
			${code}
			</a>
		</td>
		<td class="right">
			${booking.bookId}	
		</td>
		<td class="right">
			${booking.userId}	
		</td>
		<td class="right">
			${booking.bookingDate}
		</td>
		<td class="right">
			${booking.regdt}
		</td>
		<td class="right">
			${booking.moddt}
		</td>

		<td>
			<a href="${pageContext.request.contextPath}/booking/delete?bookingId=${booking.bookingId}" 
			   onclick="return confirmRemove('${booking.bookingId}');">
			삭제
			</a>
		</td>
	</tr>
  </c:forEach>
</table>
<br/>
</body>
</html>