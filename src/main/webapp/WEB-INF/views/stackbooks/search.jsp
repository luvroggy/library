<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/search/title">
	<label>책검색</label>
	<input type="text" name="title"/>
</form>
<c:forEach var="book" items="${bookItems}" varStatus="status">
<table class="result" style="width: 500px; border-collapse: collapse;">
	<tr class="result">
		<td rowspan="6" style="width:30px; text-align: center;">${status.count}</td>
		<td class="result" rowspan="6" style="width:80px; text-align: center;">
			<img src="${book.image }">
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			책이름: ${book.title }
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			저자: ${book.author }
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			ISBN: ${book.isbn}
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			가격: ${book.price }
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			출판사: ${book.publisher }
		</td>
	</tr>
</table>
</c:forEach>
</body>
</html>