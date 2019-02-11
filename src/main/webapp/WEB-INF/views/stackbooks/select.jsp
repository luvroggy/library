<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table class="result" style="width: 500px; border-collapse: collapse;">
<c:set var="TextValue" value="${bookItems[0].isbn }"/>
	<tr class="result">
		<td class="result" rowspan="6" style="width:80px; text-align: center;">
			<img src="${bookItems[0].image }">
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			책이름: ${bookItems[0].title }
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			저자: ${bookItems[0].author }
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			ISBN: ${fn:substring(TextValue,11,24) }
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			가격: ${bookItems[0].price }
		</td>
	</tr>
	<tr class="result">
		<td class="result">
			출판사: ${bookItems[0].publisher }
		</td>
	</tr>
</table>
</body>
</html>