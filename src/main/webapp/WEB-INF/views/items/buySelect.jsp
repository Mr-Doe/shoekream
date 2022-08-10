<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../commons/header.jsp" />

<div id="__layout">
	<div data-v-7ffb34f7="" tabindex="0" class="wrap lg win_os pt-0">
		<div data-v-6657f7cc="" data-v-7ffb34f7="" class="container buy lg">
			<div data-v-6657f7cc="" class="content">
				<div class="container pb-3 text-center">
					<h3>구매하기</h3>
				</div>
				<div data-v-68b558fb="" data-v-6657f7cc="" class="buy_immediate">
					<div data-v-1643775e="" data-v-68b558fb=""
						class="product_info_area">
						<div data-v-1643775e="" class="product_info">
							<div data-v-75e33658="" data-v-1643775e="" class="product"
								style="background-color: rgb(235, 240, 245);">
								<picture data-v-548c90f9="" data-v-75e33658=""
									class="picture product_img">
								<source data-v-548c90f9="" type="image/webp"
									srcset="https://kream-phinf.pstatic.net/MjAyMjA2MTVfMjYw/MDAxNjU1MjgzNjk2Mzk3.gh8n5rs7p-pWVqzIhNh7yj_KdyjLFBeJr9QbsDumoFEg.KdvPfvgBYmjm7MKKhcbIEQIP6FGeuof_GnmcDUgrvyAg.PNG/a_baa1ccea3726495badba419dfede63f9.png?type=l_webp">
								<source data-v-548c90f9=""
									srcset="https://kream-phinf.pstatic.net/MjAyMjA2MTVfMjYw/MDAxNjU1MjgzNjk2Mzk3.gh8n5rs7p-pWVqzIhNh7yj_KdyjLFBeJr9QbsDumoFEg.KdvPfvgBYmjm7MKKhcbIEQIP6FGeuof_GnmcDUgrvyAg.PNG/a_baa1ccea3726495badba419dfede63f9.png?type=l">
								<img data-v-548c90f9="" alt="상품 이미지"
									src="https://kream-phinf.pstatic.net/MjAyMjA2MTVfMjYw/MDAxNjU1MjgzNjk2Mzk3.gh8n5rs7p-pWVqzIhNh7yj_KdyjLFBeJr9QbsDumoFEg.KdvPfvgBYmjm7MKKhcbIEQIP6FGeuof_GnmcDUgrvyAg.PNG/a_baa1ccea3726495badba419dfede63f9.png?type=l"
									class="image"></picture>
							</div>
							<div data-v-1643775e="" class="product_detail">
								<div data-v-299f50cf="" class="product_detail">
									<p data-v-299f50cf="" class="code">
										<%-- ${product.model } --%>
										모델명
									</p>
									<p data-v-299f50cf="" class="name">
										<%-- ${product.eName } --%>
										영어이름
									</p>
									<p data-v-299f50cf="" class="translated_name">
										<%-- ${product.kName } --%>
										한글이름
									</p>
								</div>
							</div>
						</div>
					</div>

					<div data-v-30b23d22="" class="sell_before_select">
						<div data-v-02c63ee6="" data-v-30b23d22="" class="select_area md">
							<!---->
							<ul data-v-02c63ee6="" class="select_list">
								<c:forEach items="sizeVO" var="size">
									<li data-v-02c63ee6="" class="select_item active"><button
											data-v-02c63ee6="" role="button" aria-selected="true"
											class="select_link buy">
											<div data-v-02c63ee6="" class="link_inner">
												<span data-v-02c63ee6="" class="size">
													<!----> 235
												</span><span data-v-02c63ee6="" class="price">270,000</span>
											</div>
										</button></li>
								</c:forEach>
							</ul>
						</div>
						<div data-v-28c27354="" data-v-03c9a74b="" class="order_btn_area">
							<a data-v-57f23419="" data-v-28c27354="" href="/itmes/buyItem"
								class="btn_order order_buy buy_100 clickable"><div
									data-v-57f23419="" class="box">
									<!---->
									<div data-v-57f23419="" class="order_case_info">
										<span data-v-57f23419="" class="order_price">167,000</span>
									</div>
								</div>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<input type="hidden" name="pno" value="1">
<input type="hidden" name="sizeValue" value="4">

<script src="/resources/js/items/itemSelect.js"></script>
<jsp:include page="../commons/footer.jsp" />