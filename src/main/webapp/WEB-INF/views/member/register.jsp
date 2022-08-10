<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="../commons/header.jsp" />

<div data-v-30ee943a="" data-v-3007c576="" class="container join my-5">
	<div data-v-30ee943a="" class="content md py-3">
		<form data-v-30ee943a="" class="join_area">
			<h2 data-v-30ee943a="" class="join_title">회원가입</h2>
			<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box my-3">
				<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">이메일
					주소</h3>
				<div data-v-0e527ea4="" class="input_item">
					<input data-v-0e527ea4="" type="text"
						placeholder="예) ShoeKream@kream.co.kr" autocomplete="off"
						class="input_txt" name="email" id="email">
				</div>
				<p data-v-30ee943a="" data-v-0e527ea4="" class="input_error"></p>
			</div>
			<!---->
			<div data-v-0e527ea4="" data-v-30ee943a=""
				class="input_box has_button my-3">
				<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">비밀번호</h3>
				<div data-v-0e527ea4="" class="input_item">
					<input data-v-0e527ea4="" type="password"
						placeholder="영문, 숫자, 특수문자 조합 8-16자" autocomplete="off"
						class="input_txt" name="pwd" id="pwd">
				</div>
				<p data-v-30ee943a="" data-v-0e527ea4="" class="input_error">
					영문, 숫자, 특수문자를 조합하여 입력해주세요. (8-16자)</p>
			</div>
			<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box my-3">
				<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">닉네임</h3>
				<div data-v-0e527ea4="" class="input_item">
					<input data-v-0e527ea4="" type="text"
						 autocomplete="off"
						class="input_txt" name="nickName" id="nickName">
				</div>
				<p data-v-30ee943a="" data-v-0e527ea4="" class="input_error"></p>
			</div>
			<a data-v-3d1bcc82="" data-v-30ee943a="" href="#"
				class="btn btn_join full solid mt-3" id="registerBtn"> 가입하기 </a>
		</form>
	</div>
	<!---->
</div>

<script src="../../resources/js/member/register.js"></script>
<jsp:include page="../commons/footer.jsp" />