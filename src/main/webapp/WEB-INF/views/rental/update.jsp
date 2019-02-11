<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/rental/admin/update" name="setForm" method="post">
	<table>
		<tr>
			<th colspan="2">대여 정보 수정</th>
		</tr>
		<tr>
			<td>*대여 번호</td>
			<td>
				<input type="text" name="rentalId"
				       required="required"
				       value="${rental.rentalId}"  />
			</td>
		</tr>
		<tr>
			<td>*책 번호</td>
			<td>
				<input type="text" name="bookId"
					   required="required"
				       value="${rental.bookId}" />
			</td>
		</tr>
		<tr>
				<td>*사용자 아이디</td>
				<td>
					<input type="text" name="userId" size="20"
						required="required"
						value="${rental.userId}" />
				</td>
		</tr>
			<tr>
				<td>*대여 상태</td>
				<td>
					<select name="rentalStatus" required="required">
                           <option value="">== 대여 상태 선택 ==</option>
                             <option value="BKST0100">예약 가능</option>
                             <option value="BKST0101">예약 불가</option>
                             <option value="BKST0200">대출 가능</option>
                             <option value="BKST0201">대출 불가</option>
                    </select>
				</td>
			</tr>
		<tr>
				<td>*대여 번호</td>
				<td>
					<input type="text" name="rentalNumber" size="20"
						required="required"
						value="${rental.rentalNumber}" />
				</td>
		</tr>
		<tr>
				<td>*반납 예정일</td>
				<td>
					<input type="text" name="dueDate" size="20"
						required="required"
						value="${rental.dueDate}" />
				</td>
		</tr>
		<tr>
				<td>*대여 일자</td>
				<td>
					<input type="text" name="rentalDate" size="20"
						required="required"
						value="${rental.rentalDate}" />
				</td>
		</tr>
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="수정하기"/> &nbsp;
				<input type="reset"  value="초기화"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>