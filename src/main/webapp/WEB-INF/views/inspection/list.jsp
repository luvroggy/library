<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fmt"	
           uri="http://java.sun.com/jsp/jstl/fmt" %>      
           
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
<h2>검수 목록</h2>
<hr noshade="noshade">
<table class="type09">
	<tr>
		<th  scope="cols">수서번호</th>
		<th  scope="cols">주문 번호</th>
		<th  scope="cols">요청 번호</th>
		<th  scope="cols">상태</th>
		<th  scope="cols">책 이름</th>
		<th  scope="cols">저자</th>
		<th  scope="cols">출판사</th>
		<th  scope="cols">ISBN</th>


		<th></th>
		<th></th>
	</tr>
	<c:if test="${empty inspections}">

			<tr>
				<td colspan="8"> 희망도서 목록이 없습니다. </td>
			</tr>

		</c:if>
	<!-- forEach 부분 수정안함. -->
  <c:forEach var="inspection" items="${inspections}">
 <form name="actionForm" action="/admin/stackbooks/insert" method="post">
	<tr>

	
			<td class="right" scope="row">
			${inspection.acquisitionId}
			</td>
			
			<td class="right" scope="row">
			${inspection.orderId}
			</td>
			
			<td class="right" scope="row">
			${inspection.requestId}
			</td>
			
			<td class="right" scope="row">
			${inspection.status}
			</td>
			
			<td class="right" scope="row">
			${inspection.title}
			</td>
			
			<td class="right" scope="row">
			${inspection.author}
			</td>
			
			<td class="right" scope="row">
			${inspection.publisher}
			</td>
			
			<td class="right" scope="row">
			${inspection.isbn}
			</td>
			
<!-- 			<td class="right"> -->
<%-- 			${inspection.regdt} --%>
<!-- 			</td> -->
			
<!-- 			<td class="right"> -->
<%-- 			${inspection.moddt} --%>
<!-- 			</td> -->
	<c:if test="${not empty inspections}">
	<td>
	<c:if test="${inspection.status eq '입고대기'}">
				<input type="hidden" name="inspectionId" value="갸오"/>
				<input type="hidden" name="acquisitionId" value="${inspection.acquisitionId }"/>
				<input type="hidden" name="requestId" value="${inspection.requestId }"/>
				<input type="hidden" name="title" value="${inspection.title }"/>
				<input type="hidden" name="author" value="${inspection.author }"/>
				<input type="hidden" name="publisher" value="${inspection.publisher }"/>
				<input type="hidden" name="status" value="${inspection.status }"/>
				<input type="hidden" name="isbn" value="${inspection.isbn }"/>
				<input type="hidden" name="orderId" value="${inspection.orderId }"/>
<!-- 				<input type="hidden" name="acquisitionStatus" value="ACST01"/> -->
	<input type="submit" value="책 등록">
	</c:if>
	</td>
	</c:if>

<!-- 			<td class="right"> -->
<%-- 			${inspection.moddt} --%>
<!-- 		</td> -->
		
	</tr>
  </form>
  </c:forEach>
</table>

<br/>
</body>
</html>