<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<h2>주문내역 목록</h2>
	<hr noshade="noshade">
	<table   class="type09">
		<tr>
			<th  scope="cols">수서 번호</th>
			<th  scope="cols">요청 번호</th>
			<th  scope="cols">상태</th>
			<th  scope="cols">책 이름</th>
			<th  scope="cols">저자</th>
			<th  scope="cols">출판사</th>
			<th  scope="cols">ISBN</th>
<!-- 			<th>등록일</th> -->
			<!-- 		<th>수정일</th> -->
			<th></th>
			<th></th>
		</tr>

		<c:if test="${empty orderlists}">

			<tr>
				<td colspan="8">희망도서 목록이 없습니다.</td>
			</tr>

		</c:if>

		<!-- forEach 부분 수정안함. -->
		<c:forEach var="orderlist" items="${orderlists}">
			<form action="/admin/inspection/insert" name="actionForm" method="post">
				<tr>

					<%-- 	<c:if test="${not empty orderlists}"> --%>
					<!-- 		<button type="button" id="inspectionInsert" onclick="inspectionFn();" -->
					<!-- 			style="cursor: pointer">검수등록</button> -->
					<!-- 		<button type="button" id="orderlistDelete" onclick="deleteFn();" -->
					<!-- 			style="cursor: pointer">삭제</button> -->
					<%-- 	</c:if> --%>



					<td scope="row"><a
						href="${pageContext.request.contextPath}/admin/orderlist/select?orderId=${orderlist.orderId}">
							${orderlist.orderId} </a></td>
					<td class="right"scope="row">${orderlist.requestId}</td>
					<td class="right"scope="row">${orderlist.status}</td>
<%-- 					<td class="right">${orderlist.userId }</td> --%>
					<td class="right"scope="row">${orderlist.title}</td>
					<td class="right"scope="row">${orderlist.author}</td>
					<td class="right"scope="row">${orderlist.publisher}</td>
					<td class="right"scope="row">${orderlist.isbn}</td>
<%-- 					<td class="right"scope="row">${orderlist.regdt} --%>
					</td>
					<td>
					<input type="hidden" name="orderId" value="${orderlist.orderId }"/>
					<input type="hidden" name="acquisitionId" value="${orderlist.acquisitionId }"/>
					<input type="hidden" name="requestId" value="${orderlist.requestId }"/>
					<input type="hidden" name="title" value="${orderlist.title }"/>
					<input type="hidden" name="author" value="${orderlist.author }"/>
					<input type="hidden" name="publisher" value="${orderlist.publisher }"/>
					<input type="hidden" name="isbn" value="${orderlist.isbn }"/>
					<input type="hidden" name="inspectionId" value="갸오" />
					<input type="hidden" name="userId" value="${sessionScope.userId }" />
					<input type="hidden" name="acquisitionStatus" value="ACST03" />
					<c:if test="${not empty orderlists}">
						<c:if test="${orderlist.status eq '검수대기' }">
								<input type="submit" value="전송"/>
						</c:if>
					</c:if>
				  </td>
				</tr>
			</form>
		</c:forEach>
	</table>

	<br />
</body>
</html>