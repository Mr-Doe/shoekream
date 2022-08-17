<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
	.list-group a:hover {
		color: black;
		font-weight: 700;
	}
</style>

<div data-v-3d7f7af7="" class="container my lg">
	<div data-v-3d7f7af7="">
		<div data-v-3d7f7af7="" class="snb_area">
			<a data-v-3d7f7af7="" href="/member/mypage?email=${ses.email}"
				aria-current="page" class="nuxt-link-exact-active nuxt-link-active"><h2
					data-v-3d7f7af7="" class="snb_main_title">마이 페이지</h2></a>
			<nav data-v-7bcac446="" data-v-3d7f7af7="" class="snb">
				<div data-v-7bcac446="" class="snb_list">
					<ul data-v-4d11470e="" data-v-7bcac446="" class="snb_menu">
						<li data-v-4d11470e="" class="menu_item">
							<a data-v-4d11470e="" href="/member/mypage?email=${ses.email}" class="menu_link" id="mypage"> 내 정보 </a>
						</li>
						<li data-v-4d11470e="" class="menu_item">
							<a data-v-4d11470e="" href="/member/buying?email=${ses.email}" class="menu_link" id="buying"> 구매 내역 </a>
						</li>
						<li data-v-4d11470e="" class="menu_item">
							<a data-v-4d11470e="" href="/member/selling?email=${ses.email}" class="menu_link" id="selling"> 판매 내역 </a>
						</li>
						<li data-v-4d11470e="" class="menu_item">
							<a data-v-4d11470e="" href="/member/detail?email=${ses.email}" class="menu_link" id="detail"> 프로필 정보 </a>
						</li>
						<c:if test = "${ses.grade eq '99'}">
							<li data-v-4d11470e="" class="menu_item">
								<a data-v-4d11470e="" href="" class="menu_link" id="operation_config"> 설정 </a>
							</li>
						</c:if>
					</ul>
				</div>
			</nav>
		</div>
	</div>

	<script src="../../resources/js/member/mypagesidebar.js"></script>
	<script>
		selected_tab_menu();
	</script>