<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="../commons/header.jsp" />

<div tabindex="0" class="wrap win_os lg" data-v-3007c576="">
	<!---->
<div data-v-30ee943a="" data-v-3007c576="" class="container join">
	<div data-v-30ee943a="" class="content lg">
		<div data-v-30ee943a="" class="join_area">
			<h2 data-v-30ee943a="" class="join_title">회원가입</h2>
			<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box">
				<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">이메일
					주소</h3>
				<div data-v-0e527ea4="" class="input_item">
					<input data-v-0e527ea4="" type="email" name="email" id="email"
						placeholder="예) ShoeKream@kream.co.kr" autocomplete="off"
						class="input_txt">
				</div>
				<p data-v-30ee943a="" data-v-0e527ea4="" class="input_error"></p>
			</div>
			<!---->
			<div data-v-0e527ea4="" data-v-30ee943a=""
				class="input_box has_button">
				<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">비밀번호</h3>
				<div data-v-0e527ea4="" class="input_item">
					<input data-v-0e527ea4="" type="password" name="pwd" id="pwd"
						placeholder="영문, 숫자, 특수문자 조합 8-16자" autocomplete="off"
						class="input_txt">
				</div>
			</div>
			<div data-v-0e527ea4="" data-v-30ee943a=""
				class="input_box has_button">
				<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">닉네임</h3>
				<div data-v-0e527ea4="" class="input_item">
					<input data-v-0e527ea4="" type="text" name="nickName" id="nickName"
						placeholder="" autocomplete="off"
						class="input_txt">
				</div>
			</div>
			<a data-v-3d1bcc82="" data-v-30ee943a="" id="registerBtn"
				class="btn btn_join full solid"> 가입하기 </a>
		</div>
	</div>
	<!---->
</div>
</div>

<script src="../../resources/js/member/register.js"></script>
<jsp:include page="../commons/footer.jsp" />