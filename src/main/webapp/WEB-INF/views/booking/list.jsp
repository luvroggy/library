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
<style type="text/css">
table.type09 {
    border-collapse: collapse;
    text-align: left;
    line-height: 1.5;

}
table.type09 thead th {
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    color: #369;
    border-bottom: 3px solid #036;
}
table.type09 tbody th {
    width: 150px;
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
    background: #f3f6f7;
}
table.type09 td {
    width: 350px;
    padding: 10px;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
}

</style>
</head>
<body>
<h2>예약 목록</h2>
<hr noshade="noshade">

<table class="type09">
	<tr>
		<th scope="cols">예약 번호</th>
		<th scope="cols">예약 상태</th>
		<th scope="cols">책 번호</th>
		<th scope="cols">이용자 번호</th>
		<th scope="cols">예약 날짜</th>
			<th scope="cols"></th>

		
	</tr>
	<!-- forEach 부분 수정안함. -->
  <c:forEach var="booking" items="${booking}">
	<tr>
		<td class="center" scope="row">
			<a href="${pageContext.request.contextPath}/booking/select?bookingId=${booking.bookingId}">
			${booking.bookingId}
			</a>
		</td>
		<td scope="row">
			<a href="${pageContext.request.contextPath}/booking/select?bookingId=${booking.bookingId}">
			${code}
			</a>
		</td>
		<td class="right" scope="row">
			${booking.bookId}	
		</td>
		<td class="right" scope="row">
			${booking.userId}	
		</td>
		<td class="right" scope="row">
			${booking.bookingDate}
		</td>


		<td scope="row">
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