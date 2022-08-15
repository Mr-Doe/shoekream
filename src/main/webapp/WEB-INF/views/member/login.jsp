<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.security.SecureRandom" %>
<%@ page import="java.math.BigInteger" %>

<jsp:include page="../commons/header.jsp" />

 
<div class="container login" data-v-4ec1fe02="" data-v-3007c576="">
	<div class="content lg" data-v-4ec1fe02="">
		<form class="login_area" data-v-4ec1fe02="" action="login" method="post">
			<div class="has_button input_box" data-v-0e527ea4=""
				data-v-4ec1fe02="">
				<h3 class="input_title" data-v-0e527ea4="" data-v-4ec1fe02="">이메일
					주소</h3>
				<div class="input_item" data-v-0e527ea4="">
					<input type="text" placeholder="예) kream@kream.co.kr" id="email" name="email"
						autocomplete="off" class="input_txt" data-v-0e527ea4="">
				</div>
			</div>
			<div class="input_box has_button" data-v-0e527ea4=""
				data-v-4ec1fe02="">
				<h3 class="input_title" data-v-0e527ea4="" data-v-4ec1fe02="">비밀번호</h3>
				<div class="input_item" data-v-0e527ea4="">
					<input type="password" placeholder="" autocomplete="off" id="pwd" name="pwd"
						class="input_txt" data-v-0e527ea4="">
				</div>
			</div>
			<div class="login_btn_box" data-v-4ec1fe02="">
				<button class="full solid" type="button" id="loginBtn"
					data-v-3d1bcc82="" data-v-4ec1fe02=""> 로그인 </button>
			</div>
			<ul class="look_box" data-v-4ec1fe02="">
				<li class="look_list" data-v-4ec1fe02=""><a href="/member/register"
					class="look_link" data-v-4ec1fe02=""> 이메일 가입 </a></li>
			</ul>
			<div class="social_login" data-v-4ec1fe02="" style="" id="naver_id_login"></div>
		</form>
	</div>
</div>

  <!-- //네이버 로그인 버튼 노출 영역 -->
  <script type="text/javascript">
  	var naver_id_login = new naver_id_login("QWAHyjmF6fq48VCT8czA", "http://localhost:8090/member/callback");
  	var state = naver_id_login.getUniqState();
  	naver_id_login.setButton("white", 2,40);
  	naver_id_login.setDomain("http://localhost:8090/");
  	naver_id_login.setState(state);
  	// naver_id_login.setPopup();
  	naver_id_login.init_naver_id_login();
  </script>

<script src="../../resources/js/member/login.js"></script>
<jsp:include page="../commons/footer.jsp" />