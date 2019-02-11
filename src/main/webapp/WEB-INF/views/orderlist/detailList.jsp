<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 삭제 전 확인 질문
	function confirmRemove(code) {
		var yes = confirm(code + " 정보를 "
				         +"삭제하시겠습니까?");
		return yes;
	}

</script>  
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/orderlist/update" name="getForm" >
	<table>
		<tr>
			<th colspan="2">주문내역 상세 정보</th>
		</tr>
		<tr>
			<td>주문 번호</td>
			<td> ${orderlist.orderId}
				<input type="hidden" name="orderId"
				       value="${orderlist.orderId}"/>
			</td>
		</tr>
		<tr>
			<td>수서 번호</td>
			<td>${orderlist.acquisitionId}</td>
		</tr>
	
		<tr>
			<td>요청 번호</td>
			<td>${orderlist.requestId}</td>
		</tr>
		<tr>
			<td>책 이름</td>
			<td>${orderlist.title}</td>
		</tr>
		<tr>
			<td>저자</td>
			<td>${orderlist.author}</td>
		</tr>
		<tr>
			<td>출판사</td>
			<td>${orderlist.publisher}</td>
		</tr>
		<tr>
			<td>수량</td>
			<td>${orderlist.quantity}</td>
		</tr>
		<tr>
			<td>가격</td>
			<td>${orderlist.price}</td>
		</tr>
		<tr>
			<td>ISBN</td>
			<td>${orderlist.isbn}</td>
		</tr>
		<tr>
			<td>등록일</td>
			<td>${orderlist.regdt}</td>
		</tr>
<!-- 		<tr> -->
<!-- 			<td>수정일</td> -->
<%-- 			<td>${orderlist.moddt}</td> --%>
<!-- 		</tr> -->
		<tr>
			<td colspan="2" class="center">
				
				<a href="/admin/orderlist/delete?orderId=${orderlist.orderId}" 
				   onclick="return confirmRemove('${orderlist.orderId}');">
				삭제하기
				</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>