<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request list</title>
</head>
<body>
<div align="center" style="max-width: 900px;">
	<h2>희망 도서 목록</h2>
	<hr noshade="noshade">

	<table class="table">
		<tr>

			<th scope="cols">요청 번호</th>
			<!-- 		<th>사용자 번호</th> -->
			<!-- 		<th>요청 타입</th> -->
			<th scope="cols">책 이름</th>
			<th scope="cols">저자</th>
			<th scope="cols">출판사</th>
			<th scope="cols">요청 상태</th>
			<th scope="cols">요청일자</th>
			<!-- 		<th>수정 일자</th> -->
		</tr>
		<!-- forEach 부분 수정안함. -->
		<c:if test="${empty requests}">

			<tr>
				<td colspan="7"> 희망도서 목록이 없습니다. </td>
			</tr>
		</c:if>
		
		<c:forEach var="request" items="${requests}">
			<tr>
				<td class="center"><a
					href="${pageContext.request.contextPath}/request/select?requestId=${request.requestId}">
						${request.requestId} </a></td>
				<!-- 		<td> -->

				<%-- 			${request.userId} --%>

				<!-- 		</td> -->
				<!-- 		<td class="right"> -->
				<%-- 			${request.requestType}	 --%>
				<!-- 		</td> -->
				<td class="right"scope="row">${request.title}</td>
				<td class="right"scope="row">${request.author}</td>
				<td class="right"scope="row">${request.publisher}</td>
				<td class="right"scope="row">${request.status}</td>
				<td class="right"scope="row">${request.regdt}</td>

			</tr>
		</c:forEach>	
	</table>
	<a class="btn btn-primary btn-lg" href="/request/search" role="button" style="background-color: black; border-color: black;">희망도서신청</a>
</div>
<br />
</body>
</html>
