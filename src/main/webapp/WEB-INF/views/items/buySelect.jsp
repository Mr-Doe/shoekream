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
						class="product_info_area" style="padding-bottom: 12px;">
						<div data-v-1643775e="" class="product_info">
							<div data-v-75e33658="" data-v-1643775e="" class="product"
								style="background-color: rgb(235, 240, 245);">
								<picture data-v-548c90f9="" data-v-75e33658=""
									class="picture product_img">
								<source data-v-548c90f9="" type="image/webp"
									srcset="${pdto.productVO.thImg }">
								<source data-v-548c90f9="" srcset="${pdto.productVO.thImg }">
								<img data-v-548c90f9="" alt="상품 이미지"
									src="${pdto.productVO.thImg }" class="image"></picture>
							</div>
							<div data-v-1643775e="" class="product_detail">
								<div data-v-299f50cf="" class="product_detail">
									<p data-v-299f50cf="" class="code">${pdto.productVO.model }
									</p>
									<p data-v-299f50cf="" class="name">${pdto.productVO.eName }
									</p>
									<p data-v-299f50cf="" class="translated_name">
										${pdto.productVO.kName }</p>
								</div>
							</div>
						</div>
					<hr>
					</div>
					<div data-v-30b23d22="" class="buy_before_select">
						<div data-v-02c63ee6="" data-v-30b23d22="" class="select_area md" style="padding: 0 32 20;">
							<ul data-v-02c63ee6="" class="select_list">
								<c:forEach items="${list }" var="idto">
									<li data-v-02c63ee6="" class="select_item"
										data-size="${idto.sizeVO.sizeId }"><button
											data-v-02c63ee6="" role="button" aria-selected="true"
											class="select_link buy">
											<div data-v-02c63ee6="" class="link_inner">
												<span data-v-02c63ee6="" class="size">
													${idto.sizeVO.sizeValue } </span><span data-v-02c63ee6=""
													class="price"> <c:if test="${idto.price ne null }">
														<span data-v-02c63ee6="" class="price">${idto.price }</span>
													</c:if> <c:if test="${idto.price eq null }">
														<span data-v-02c63ee6="" class="price">구매입찰</span>
													</c:if>
												</span>
											</div>
										</button></li>
								</c:forEach>
							</ul>
						</div>
						<div data-v-28c27354="" data-v-03c9a74b="" class="order_btn_area"
							style="display: none; padding:20 32;">
							<a data-v-57f23419="" data-v-28c27354="" href="/items/buyItem"
								class="btn_order order_buy buy_100 clickable"><div
									data-v-57f23419="" class="box">
									<div data-v-57f23419="" class="order_case_info">
										<span data-v-57f23419="" class="order_price"></span>
									</div>
								</div> </a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<input type="hidden" name="pno" value="${pdto.productVO.pno }">
<input type="hidden" name="shoeSize" value="">

<jsp:include page="../commons/footer.jsp" />