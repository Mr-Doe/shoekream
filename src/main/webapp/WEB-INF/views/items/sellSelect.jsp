<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../commons/header.jsp" />

<div id="__layout">
	<div data-v-7ffb34f7="" tabindex="0" class="wrap lg win_os pt-0">
		<div data-v-6657f7cc="" data-v-7ffb34f7="" class="container buy lg" >
			<div data-v-6657f7cc="" class="content">
				<div class="container pb-3 text-center">
					<h3>판매하기</h3>
				</div>
				<div data-v-68b558fb="" data-v-6657f7cc="" class="buy_immediate">
					<div data-v-1643775e="" data-v-68b558fb=""
						class="product_info_area" style="padding-bottom: 12px">
						<div data-v-1643775e="" class="product_info" >
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
						<hr>
					</div>

					<div data-v-30b23d22="" class="sell_before_select">
						<div data-v-02c63ee6="" data-v-30b23d22="" class="select_area md" style="padding: 0 32 20;">
							<ul data-v-02c63ee6="" class="select_list">
								<c:forEach items="sizeVO" var="size">
									<li data-v-02c63ee6="" class="select_item"><button
											data-v-02c63ee6="" role="button" aria-selected="true"
											class="select_link sell">
											<div data-v-02c63ee6="" class="link_inner">
												<span data-v-02c63ee6="" class="size"> <!-- ${idto.sizeValue} -->
													235
												</span><span data-v-02c63ee6="" class="price"> <!-- ${items.price} -->270,000
												</span>
											</div>
										</button></li>
									<li data-v-02c63ee6="" class="select_item "><button
											data-v-02c63ee6="" role="button" aria-selected="true"
											class="select_link sell">
											<div data-v-02c63ee6="" class="link_inner">
												<span data-v-02c63ee6="" class="size"> <!-- ${idto.sizeValue} -->
													240
												</span><span data-v-02c63ee6="" class="price"> <!-- ${items.price} -->310,000
												</span>
											</div>
									</button></li>
								</c:forEach>
							</ul>
						</div>
						<div data-v-744cecc2="" data-v-30b23d22="" class="order_btn_area" style="padding: 20 32;">
							<a data-v-57f23419="" data-v-744cecc2="" href="#"
								class="btn_order order_sell sell clickable">
								<div
									data-v-57f23419="" class="box">
									<!---->
									<div data-v-57f23419="" class="order_case_info">
										<span data-v-57f23419="" class="order_price">510,000</span><span
											data-v-57f23419="" class="order_desc">선불발송</span>
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

<input type="hidden" id="pnoValue" name="pno" value="1">
<input type="hidden" id="sizeValue" name="sizeValue" value="4">

<script src="/resources/js/items/itemSelect.js"></script>
<jsp:include page="../commons/footer.jsp" />