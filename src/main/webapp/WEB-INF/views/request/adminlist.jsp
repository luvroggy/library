<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request list</title>

</head>
<body>
<div align="center" style="max-width: 900px;">
	<h2>요청 전체 목록</h2>
	<hr noshade="noshade">
	<table class="table">
		<tr>
			<th> 
			</th>

			<th scope="cols">요청 번호</th>
			<!-- 		<th>사용자 번호</th> -->
			<!-- 		<th>요청 타입</th> -->
			<th scope="cols">책 이름</th>
			<th scope="cols">저자</th>
			<th scope="cols">출판사</th>
			<th scope="cols">복본 수</th>
			<th scope="cols">요청 상태</th>
			<th scope="cols">요청일자</th>
			<th></th>
			<!-- 		<th>수정 일자</th> -->
		</tr>
		<!-- forEach 부분 수정안함. -->
		<c:if test="${empty requests}">

			<tr>
				<td colspan="8"> 희망도서 목록이 없습니다. </td>
			</tr>

		</c:if>
		
		<c:forEach var="request" items="${requests}" varStatus="status" >
  <form action="/admin/acquisition/insert" method="post">
			<tr>

				<td>
				</td>

				<td class="center" scope="row"><a
					href="${pageContext.request.contextPath}/request/select?requestId=${request.requestId}">
						${request.requestId} </a></td>
				<!-- 		<td> -->

				<%-- 			${request.userId} --%>

				<!-- 		</td> -->
				<!-- 		<td class="right"> -->
				<%-- 			${request.requestType}	 --%>
				<!-- 		</td> -->
				<td class="right" scope="row">${request.title}</td>
				<td class="right" scope="row">${request.author}</td>
				<td class="right" scope="row">${request.publisher}</td>
				<td class="right" scope="row">${request.copy}</td>
				<td class="right" scope="row">${requestStatusName}</td>
				<td class="right" scope="row">${request.regdt}
				</td>
				<td>
				<c:if test="${not empty requests }">
				<input type="submit" value="수서등록"/>
				</c:if>
						
				</td>

			</tr>
					<input type="hidden" name="requestId" value="${request.requestId }"/>
					<input type="hidden" name="title"     value="${request.title }"/>
					<input type="hidden" name="author"    value="${request.author }"/>
					<input type="hidden" name="publisher" value="${request.publisher }"/>
					<input type="hidden" name="isbn"      value="${request.isbn}"/>
					<input type="hidden" name="userId"    value="${request.userId }"/>
					<input type="hidden" name="acquisitionId"     value="갸오"/>
					<input type="hidden" name="acquisitionStatus" value="ACST01"/>
  </form>
		</c:forEach>	
	</table>
	<a class="btn btn-primary btn-lg" href="/request/search" role="button" style="background-color: black; border-color: black;">희망도서신청</a>
</div>
<br />
</body>
</html>
