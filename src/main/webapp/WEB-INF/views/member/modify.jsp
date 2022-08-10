<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="../commons/header.jsp" />

<div data-v-3d7f7af7="" class="container my md">
	<div data-v-3d7f7af7="">
		<div data-v-3d7f7af7="" class="snb_area">
			<a data-v-3d7f7af7="" href="#" class="nuxt-link-active"><h2
					data-v-3d7f7af7="" class="snb_main_title">마이 페이지</h2></a>
			<nav data-v-7bcac446="" data-v-3d7f7af7="" class="snb">
				<div data-v-7bcac446="" class="snb_list">
					<strong data-v-7bcac446="" class="snb_title">내 정보</strong>
					<ul data-v-4d11470e="" data-v-7bcac446="" class="snb_menu">
						<li data-v-4d11470e="" class="menu_item"><a
							data-v-4d11470e="" href="#" class="menu_link"> 구매 내역 </a></li>
						<li data-v-4d11470e="" class="menu_item"><a
							data-v-4d11470e="" href="#" class="menu_link"> 판매 내역 </a></li>
						<li data-v-4d11470e="" class="menu_item menu_on"><a
							data-v-4d11470e="" href="#" aria-current="page"
							class="menu_link nuxt-link-exact-active nuxt-link-active">
								프로필 정보 </a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	<div data-v-7fba8f8c="" data-v-3d7f7af7="" class="content_area">
		<div data-v-7fba8f8c="" class="my_profile">
			<div data-v-88eb18f6="" data-v-7fba8f8c=""
				class="content_title border">
				<div data-v-88eb18f6="" class="title">
					<h3 data-v-88eb18f6="">프로필 정보</h3>
					<!---->
				</div>
				<!---->
			</div>
			<div data-v-6dea036d="" data-v-7fba8f8c="" class="user_profile">
				<div data-v-6dea036d="" class="profile_detail">
					<strong data-v-6dea036d="" class="name">${initEmail }</strong>
				</div>
			</div>
			<input data-v-7fba8f8c="" type="file" accept="image/jpeg,image/png"
				hidden="hidden">
			<canvas data-v-7fba8f8c="" width="1000" height="1000"
				style="display: none;"></canvas>
			<form data-v-7fba8f8c="" class="profile_info" action="/member/modify"
				method="post">
				<div data-v-7fba8f8c="" class="profile_group">
					<h4 data-v-7fba8f8c="" class="group_title">로그인 정보</h4>
					<div data-v-7fba8f8c="" class="unit">
						<label data-v-7fba8f8c="" class="title" for="email">이메일 주소
						</label> <input data-v-7fba8f8c="" type="text" name="email"
							disabled="disabled" value="${memberVO.email }">
					</div>
					<div data-v-7fba8f8c="" class="unit">
						<label data-v-7fba8f8c="" class="title" for="pwd">비밀번호 </label> <input
							data-v-7fba8f8c="" type="password" name="pwd"
							value="${memberVO.pwd }">
					</div>
				</div>
				<div data-v-7fba8f8c="" class="profile_group">
					<h4 data-v-7fba8f8c="" class="group_title">개인 정보</h4>
					<div data-v-7fba8f8c="" class="unit">
						<label data-v-7fba8f8c="" class="title">닉네임 </label> <input
							data-v-7fba8f8c="" type="text" name="nickName"
							value="${memberVO.nickName }">
					</div>
				</div>

			</form>
			<div>
				<button data-v-3d1bcc82="" data-v-7fba8f8c="" type="button"
					class="btn outlinegrey small">회원정보 수정</button>
				<a data-v-7fba8f8c="" href="#" class="btn_withdrawal">회원 탈퇴</a>
			</div>
		</div>
	</div>
</div>

<jsp:include page="../commons/footer.jsp" />