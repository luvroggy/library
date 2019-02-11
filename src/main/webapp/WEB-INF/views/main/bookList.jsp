<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>오정북스 도서 관리 시스템</title>
<script type="text/javascript">
	

	function bookingFunction(formIdx) {
		var form = document.getElementById("bookForm" + formIdx);
		
// 		console.log(" form.action=" + form.action);
		
// 		return;
		
// 		form.method = "post";
		form.action = "/booking/insert";
		form.submit();
	}
	
	function rentalFunction(formIdx) {
		var form = document.getElementById("bookForm" + formIdx);
		
// 		console.log(" form.action=" + form.action);
		
// 		return;
// 		form.method = "post";
		form.action = "/rental/insert";
		form.submit();
	}
</script>
</head>
<body>

	<c:forEach var="book" items="${bookItems}" varStatus="status">
	<c:set var="TextValue" value="${book.isbn }"/>
		<form name="bookForm" method="post" id="bookForm${status.index}">
		
			<table align="center" class="table table-bordered" style="width: 700px; border-collapse: collapse;">
				<tr>
					<td rowspan="9" style="width: 30px; vertical-align: middle; text-align: center;">${status.count}</td>
					<td rowspan="9"
						style="width: 200px; text-align: center;"><a
						href="/stackbooks/select?bookId=${book.bookId}"><img
							src="${book.image }" width="200px"></a></td>
				</tr>
				
				
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/stackbooks/select?bookId=${book.bookId}">
							책이름: ${book.title } </a></td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/stackbooks/select?bookId=${book.bookId}">
							저자: ${book.author } </a></td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/stackbooks/select?bookId=${book.bookId}">
							ISBN: ${fn:substring(TextValue,11,24) } </a></td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/stackbooks/select?bookId=${book.bookId}">
							가격: ${book.price } </a></td>
				</tr>
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/stackbooks/select?bookId=${book.bookId}">
							출판사: ${book.publisher } </a> <input type="hidden" name="rentalId"
						value="autowrite" /> <input type="hidden" name="bookId"
						value="${book.bookId }" /> <input type="hidden" name="userId"
						value="${sessionScope.userId }" /> <input type="hidden"
						name="rentalNumber" value="1" /></td>
				</tr>
				<tr>
					<td>상태: ${book.bookStatus}</td>
				</tr>
				<tr>
					<td>소장처: ${book.institutionIdName}</td>
				</tr>
					<c:if test="${not empty userId }">
				<tr>
					<td>
							<c:if test="${book.bookStatus == '대여가능' }">
								<button type="button" onclick="rentalFunction('${status.index}');">대여신청</button>
							</c:if>
							<c:if test="${book.bookStatus == '예약가능' }">
								<button type="button" onclick="bookingFunction('${status.index}');">예약신청</button>
							</c:if>
					</td>
				</tr>
					</c:if>
			</table>
		</form>
	</c:forEach>
</body>
</html>

