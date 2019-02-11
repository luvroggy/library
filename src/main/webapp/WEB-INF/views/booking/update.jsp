<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" name="bookingUpdate" method="post">
	<table>
		<tr>
			<th colspan="2">예약 정보 수정</th>
		</tr>
		<tr>
			<td>*예약 번호</td>
			<td>
				<input type="text" name="bookingId"
				       required="required"
				       value="${booking.bookingId}"  />
			</td>
		</tr>
		<tr>
			<td>책 번호</td>
			<td>
				<input type="text" name="bookId"
					value="${booking.bookId}" />
			</td>
		</tr>
		<tr>
			<td>이용자 번호</td>
			<td>
				<input type="text" name="userId"
				       value="${booking.userId}" />
			</td>
		</tr>
		<tr>
			<td>예약 상태</td>
			<td>
				<input type="text" name="bookingStatus"
				       value="${booking.bookingStatus}" />
			</td>
		</tr>
		<tr>
			<td>예약 날짜</td>
			<td>
				<input type="text" name="bookingDate"
				       value="${booking.bookingDate}" />
			</td>
		</tr>
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="저장하기"/> &nbsp;
				<input type="reset"  value="초기화"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>