<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request insert</title>
</head>
<body>
<c:forEach var="book" items="${bookItems }" varStatus="status">
<div align="center">
<form action="/auto/insert" method="post">
<table class="table table-bordered" style="width: 500px; border-collapse: collapse;">
	<tr >
		<td rowspan="6" style="width:30px; text-align: center; vertical-align: middle;">${status.count}</td>
		<td  rowspan="6" style="width:80px; text-align: center; vertical-align: middle;">
			<img src="${book.image }">
		</td>
	</tr>
	<tr >
		<td >
		<c:set var="TextValue" value="${book.isbn }"/>
			책이름: ${book.title }
			<input type="hidden" name="requestId" value="가자" />
			<input type="hidden" name="userId" value="${sessionScope.userId }" />
			<input type="hidden" name="requestStatus" value="RQST0101" />
			<input type="hidden" name="title" value="${book.title }" />
			<input type="hidden" name="author" value="${book.author }" />
			<input type="hidden" name="isbn" value="${fn:substring(TextValue,11,24) }" />
			<input type="hidden" name="publisher" value="${book.publisher }" />
			
		</td>
	</tr>
	<tr >
		<td >
			저자: ${book.author }
		</td>
	</tr>
	<tr >
		<td >
			ISBN: ${book.isbn}
		</td>
	</tr>
	<tr >
		<td >가격: ${book.price }</td>
	</tr>
	<tr >
		<td >
			출판사: ${book.publisher }
		</td>
	</tr>
	<tr >
	<td colspan="3" style="text-align: center;">
		<input class="btn btn-default" type="submit" value="신청하기"/>
	</td>
	</tr>
</table>
</form>
</div>
</c:forEach>

</body>
</html>

