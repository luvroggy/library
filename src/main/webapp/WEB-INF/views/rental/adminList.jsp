<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    
</head>
<body>
<h2>대여 / 반납</h2>
<hr noshade="noshade">

<table>
	<tr>
		<th>대여 번호</th>
		<th>사용자 아이디</th>
		<th>도서명</th>
		<th>대여횟수</th>
		<th>대여 일자</th>
		<th>반납 예정일</th>
		<th>대여 상태</th>
		<th></th>
	</tr>
	<!-- forEach 부분 수정안함. -->
  <c:forEach var="rental" items="${rentals}">
	<tr>
		<td class="center">
			<a href="${pageContext.request.contextPath}/rental/select?rentalId=${rental.rentalId}">
			${rental.rentalId}
			</a>
		</td>
		<td class="right">
			${rental.userId}	
		</td>
		<td class="right">
			${rental.title }
		</td>
		<td class="right">
			${rental.rentalNumber}
		</td>
		<td class="right">
		<fmt:parseDate var="rentaldate" value="${rental.rentalDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
		<fmt:formatDate value="${rentaldate }" pattern="yyyy-MM-dd"/>
		</td>
		<td class="right">
		<fmt:parseDate var="duedate" value="${rental.dueDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
		<fmt:formatDate value="${duedate }" pattern="yyyy-MM-dd"/>
		</td>
		<td>
		${rental.status }
		</td>
		<td>
		
		</td>
	</tr>
  </c:forEach>
</table>
<br/>
</body>
</html>