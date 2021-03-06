<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>콩콩북스 도서 관리 시스템</title>
<script type="text/javascript">
   // 비밀번호, 비밀번호 확인칸 입력이
   // 동일한지 확인
   // myForm 전역변수에 받음
   var myForm;
   // myForm 변수를 개발자 콘솔에 출력

   // 비밀번호 입력칸 값이 최소 5글자 이상 되도록 함
   function checkPassLength() {

      myForm = document.myForm;

      // 비밀번호 인풋
      var password = myForm.password;

      // 비밀번호 길이 저장 변수
      var passLength = password.value.length;

      // 글자 길이가 충분한지 결과에 따라 리턴하는 변수
      var isLong = false;
      var pwErr = document.getElementById("pwErr");

      if (password != undefined && passLength < 5) {
         // 비밀번호 길이가 짧음을 알리고 포커스를 맞춤
         pwErr.innerHTML = "비밀번호 길이는 최소 5글자 이상이어야 합니다.";
         password.focus();
      } else {
         isLong = true;
         // 정상 입력 시 경고 구문 삭제
         pwErr.innerHTML = "";
      }
      return isLong;
   }
   function checkPassword() {
      // 문서에 name이 myFrom인 폼 엘리먼트를 myForm 변수에 받는다.
      // 비밀번호가 입력된 인풋
      myForm = document.myForm;
      passwordInput = myForm.password;
      // 비밀번호확인이 입력된 인풋
      pwConfirmInput = myForm.pwconfirm;
      var pwd = passwordInput.value;
      var pwdCnfrm = pwConfirmInput.value;
      console.log("비밀번호: " + pwd);
      console.log("비번확인: " + pwdCnfrm);

      var pwcnfrmSpan = document.getElementById("pwcnfrmSpan");
      var isEqual = false;
      if (pwd == pwdCnfrm) {
         isEqual = true;
         pwcnfrmSpan.innerHTML = "";
      } else {
         // 비밀번호 확인 입력의 값 초기화
         pwConfirmInput.value = "";
         // 비밀번호 확인 입력으로 커서 이동
         pwConfirmInput.focus();
         // 입력된 비밀번호 확인 값이 0글자보다 클때
         // 오류 원인 span 출력
         pwcnfrmSpan.innerHTML = "비밀번호 확인 값이 일치하지 않습니다.";
      }
      return isEqual;
   } // endCheckPassword

   // 이메일 아이디, 도메인이 따로 입력된 값을 조합해 하나의 이메일 인풋에 저장
   function makeEmailAddress() {
      // emailid
      var emailId = myForm.emailid;
      // emaildomain
      var emailDomain = myForm.maildomain;

      // var email = emainId.value + "@" + emailDomain.value;
      // hidden email 인풋
      var email = myForm.userEmail;
      email.value = emailId.value + "@" + emailDomain.value;
      var flag = false;
      if (email.value.length > 0) {
         flag = true;
      }
      return flag;
   } // end makeEmailAddress

   // myForm을 최종적으로 action에 전송
   function submitMyForm() {
      // 전송 전 email 조합
      if (!makeEmailAddress()) {
         return;
      }
      var yes = confirm("입력값을 전송하시겠습니까?");
      // var isSubmit = false;
      // if (yes) {
      //      isSubmit = true;
      // }
      return yes;
   }
</script>


</head>
<body>

   <form action="/users/insert" name="myForm"
      onsubmit="return submitMyForm();" method="post">
      <table class="table table-bordered" style="width: 500px;" align="center">
         <tr>
            <td colspan="2" style="text-align: center;">회원가입</td>
         </tr>
         <tr>
            <td>*아이디</td>
            <td><input type="text" name="userId" size="10"
               required="required" /></td>
         </tr>
         <tr>
            <td>*비밀번호</td>
            <td><input type="password" name="password" size="10"
               required="required" onblur="checkPassLength();" /> <br /> <span id="pwErr" class="errSpan"></span>
            </td>
         </tr>
         <tr>
            <td class="title">*비밀번호 확인</td>
            <td><input type="password" name="pwconfirm" size="10"
               required="required" onblur="checkPassword();" /> <br /> <span
               id="pwcnfrmSpan" class="errSpan"></span></td>
            <!-- onblur 이벤트 핸들러는 커서(포커스)가 이 엘리먼트를 떠날 때 발생하는 blur 이벤트를 잡아 수행 -->
         </tr>
         <tr>
            <td>*이름</td>
            <td><input type="text" name="userName" size="10"
               required="required" /></td>
         </tr>
         <tr>
            <td>*전화번호</td>
            <td><input type="text" name="userPhone" size="10"
               required="required" /></td>
         </tr>
         <tr>
            <td>*이메일</td>
            <td><input type="text" name="emailid" size="10"
               required="required" placeholder="username"/> @ <!--                              select[name="maildomain"]>option[value=""]*5 -->
               <input type="text" size="10" name="maildomain" required="required" placeholder="example.com"/>
               <input type="hidden" name="userEmail" /></td>
         </tr>
         <tr>
            <td colspan="2" style="text-align: center;">
               <input class="btn btn-default" type="submit" value="가입하기">
               <input class="btn btn-default" type="reset" value="초기화">
         </tr>
      </table>
   </form>
   <script type="text/javascript">
      // head에서 선언한 전역변수 myForm에
      // body에서 그려진 name = "myForm"인 폼을
      // 할당 => 폼 객체 전체가 저장됨
      myForm = document.myForm;
      console.log(myForm);
      console.log(myForm.password);
   </script>
</body>
</html>