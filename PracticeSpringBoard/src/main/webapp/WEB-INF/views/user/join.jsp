<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<div><a href="/user/login">Go to Login</a></div> 
	<!-- / 있고 없고 차이  /있으면 새롭게 시작 없으면 맨 마지막에 해당하는 곳으로 이동 -->
	
	<form id="frm" action="/user/join" method="post" onsubmit="return chkFrm();">
		<div>	<!--정규식으로 확인하면 최고  -->
			<input type="text" name="userId" placeholder="ID">
			<button>중복체크</button>
		</div>
		<div id="idChkMsg"></div>
		<div>
			<input type="password" name="userPw" placeholder="PASSWORD">
		</div>
		<div>
			<input type="password" name="userPwRe" placeholder="CONFIRM PASSWORD">
		</div>
		<div>
			<input type="text" name="nm" placeholder="NAME">
		</div>
		<div>
			Gender : 
			<label>Woman<input type="radio" name="gender" value="0" checked></label> 
				<label>man<input type="radio" name="gender" value="1"></label>

		</div>
		<div>
			<input type="submit" value="Join">
		</div>

	</form>

</div>