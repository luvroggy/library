<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title> 
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
<h2>대여 목록</h2>
<hr noshade="noshade">

<table  class="type09">
	<tr>
		<th scope="cols">대여 번호</th>
		<th scope="cols">책 이름</th>
		<th scope="cols">사용자 아이디</th>
		<th scope="cols">대여회수</th>
		<th scope="cols">반납 예정일</th>
		<th scope="cols">대여 일자</th>
		<th scope="cols">상태</th>
		<th scope="cols"></th>
	</tr>
	<!-- forEach 부분 수정안함. -->
  <c:forEach var="rental" items="${rentals}">
	<form method="post" action="/rental/return">
	<tr>
		<td class="center" scope="row">
			<a href="${pageContext.request.contextPath}/rental/select?rentalId=${rental.rentalId}">
			${rental.rentalId}
			</a>
		</td>
		<td scope="row">
			<a href="${pageContext.request.contextPath}/rental/select?rentalId=${rental.rentalId}">
			${rental.title}
		</a>
		</td>
		<td class="right" scope="row">
			${rental.userId}	
		</td>
			<td class="right" scope="row">
			${rental.rentalNumber}
		</td>
		<td class="right" scope="row">
			<fmt:parseDate var="duedate" value="${rental.dueDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
		<fmt:formatDate value="${duedate }" pattern="yyyy-MM-dd"/>
		</td>
			<td class="right" scope="row">
		<fmt:parseDate var="rentaldate" value="${rental.rentalDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
		<fmt:formatDate value="${rentaldate }" pattern="yyyy-MM-dd"/>
		<input type="hidden" name="rentalId" value="${rental.rentalId }"/>
		<input type="hidden" name="bookId" value="${rental.bookId }"/>
		<input type="hidden" name="userId" value="${rental.rentalNumber }"/>
		<input type="hidden" name="dueDate" value="${rental.dueDate }"/>
		</td>
		<td>
		<c:if test="${empty rental.returnDate }">
		반납필요
		</c:if>
		<c:if test="${not empty rental.returnDate }">
		반납완료
		</c:if>
		
		</td>
		<td>
		<c:if test="${empty rental.returnDate }">
		<input type="submit" value="반납" />
		</c:if>
		</td>
	</tr>
	</form>
  </c:forEach>
</table>
<br/>
</body>
</html>