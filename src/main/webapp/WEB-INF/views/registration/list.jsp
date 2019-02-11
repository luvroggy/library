<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 삭제 전 확인 질문
// 	function confirmRemove(code) {
// 		var yes = confirm(code + " 정보를 " + "삭제하시겠습니까?");
// 		return yes;
// 	}
	function cbck(){
		
		var registrations = document.getElementsByName("registrationId");
		
// 		console.log("requests=" + requests);
// 		console.log("requests_length=" + requests.length);
// 		return false;
		
		
		if (registrations.length != undefined) {
		
			var registrations_length = registrations.length;
			var checked = 0;
			
			for(i = 0; i < registrations_length; i++){
				console.log(registrations[i].checked)
				
				if(registrations[i].checked){
					checked += 1;
				}
			}
			
			
			if(checked == 0){
				
				registrations[0].focus();
				return false;
			} else {
				var yes = confirm(checked + "개의 데이터를 수정하시겠습니까?");
				if (yes) {
					return true;
				} else {
					return false;
				}
			}
			
		} else {
			
			return false;
		}
		
	}
	
	function deleteFn(){
		document.actionForm.action = "/registration/delete";
		document.actionForm.method = "post";
		document.actionForm.submit();
	}
	
	function stackbooksFn(){
		
		var chked = cbck();
// 		console.log("checked=" + chked);
		
		if (chked) {
			document.actionForm.action = "/admin/stackbooks/insert";
			document.actionForm.method = "post";
			document.actionForm.submit();
		} else {			
			alert("선택된 데이터가 없습니다.");			
			return false;
		}
		
	}
	
</script>    
</head>
<body>
<h2>서지등록 목록</h2>
<hr noshade="noshade">
 <form name="actionForm" >
<table>
	<tr>
		<th>등록 번호</th>
		<th>수서 번호</th>
		<th>검수 번호</th>
		<th>요구 번호</th>
		<th>책 이름</th>
		<th>저자</th>
		<th>출판사</th>
		<th>ISBN</th>
		<th>등록일</th>
		<th>수정일</th>
		<th></th>
	</tr>
	<!-- forEach 부분 수정안함. -->
	<c:if test="${empty requests}">

			<tr>
				<td colspan="8"> 희망도서 목록이 없습니다. </td>
			</tr>

	</c:if>
		
  <c:forEach var="registration" items="${registrations}">
	<tr>
	
		<td>
			<input type="checkbox" name="registrationId" value="${registration.registrationId }"/>
		</td>
				
		<td class="center">
			<a href="${pageContext.request.contextPath}/registration/select?registrationId=${registration.registrationId}">
			${registration.registrationId}
			</a>
		</td>
		<td class="right">
			${registration.acquisitionId}
		</td>
		<td class="right">
			${registration.inspectionId}
		</td>
		<td class="right">
			${registration.requestId}
		</td>
		<td class="right">
			${registration.title}
		</td>
		<td class="right">
			${registration.author}
		</td>
		<td class="right">
			${registration.publisher}
		</td>
		<td class="right">
			${registration.isbn}
		</td>
			<td class="right">
			${registration.regdt}
		</td>
			<td class="right">
			${registration.moddt}
		</td>
	
	</tr>
  </c:forEach>
</table>
				<input type="hidden" name="bookId" value="갸오"/>
				<input type="hidden" name="userId" value="${sessionScope.userId }"/>
				<input type="hidden" name="acquisitionStatus" value="ACST01"/>
	<c:if test="${not empty registrations}">
		<button type="button" id="stackbooksInsert" onclick="stackbooksFn();" style="cursor: pointer">책 등록</button>
		<button type="button" id="registrationDelete"     onclick="deleteFn();" style="cursor: pointer">삭제</button>	
	</c:if>
	<c:if test="${empty registrations}">
		<button type="button" id="stackbooksInsert" disabled="disabled" style="cursor: not-allowed">책 등록</button>
		<button type="button" id="registrationDelete"     disabled="disabled" style="cursor: not-allowed"	 >삭제</button>
	</c:if>
	<a href="/registration/search">신청하기</a>
  </form>
<br/>
</body>
</html>