<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
.sizeTxt {
	height: 38px;
	line-height: 38px;
	vertical-align: middle;
}
</style>

<jsp:include page="../commons/header.jsp" />

<div id="__layout">
	<div data-v-44d29853="" data-v-3007c576="" class="container detail lg">
		<div data-v-44d29853="" class="content">
			<div data-v-44d29853="" class="column_bind">
				<div data-v-44d29853="" class="column is_fixed">
					<div data-v-44d29853="" class="spread">
						<img src="${idto.img }">
					</div>
				</div>
				<div data-v-44d29853="" class="column">
					<div data-v-5622d1e8="" data-v-44d29853="" class="column_box">
						<div data-v-5622d1e8="" class="column_top">
							<div data-v-22fed681="" data-v-5622d1e8="" class="detail_main_title lg">
								<div data-v-22fed681="" class="main_title_box">
									<div data-v-22fed681="" class="brand">${idto.brand }</div>
									<p data-v-22fed681="" class="title">${idto.pvo.eName }</p>
									<p data-v-22fed681="" class="sub_title">${idto.pvo.kName }</p>
								</div>
							</div>
							<div data-v-5622d1e8="" class="product_info_wrap">
								<h3 data-v-52dd777b="" data-v-5622d1e8="" class="detail_title info_title lg">상품 정보</h3>
								<div data-v-b809b0a6="" data-v-5622d1e8="" class="detail_product_wrap">
									<dl data-v-b809b0a6="" class="detail_product">
										<div data-v-b809b0a6="" class="detail_box model_num">
											<dt data-v-b809b0a6="" class="product_title">모델번호</dt>
											<dd data-v-b809b0a6="" class="product_info">${idto.pvo.model }</dd>
										</div>
										<div data-v-b809b0a6="" class="detail_box">
											<dt data-v-b809b0a6="" class="product_title">출시일</dt>
											<dd data-v-b809b0a6="" class="product_info">${idto.pvo.regAt }</dd>
										</div>
										<div data-v-b809b0a6="" class="detail_box">
											<dt data-v-b809b0a6="" class="product_title">발매가</dt>
											<dd data-v-b809b0a6="" class="product_info">${idto.pvo.retailPrice }원</dd>
										</div>
									</dl>
								</div>
							</div>
							<div data-v-5622d1e8="" class="product_figure_wrap lg">
								<div data-v-1260122e="" data-v-5622d1e8="" class="detail_size">
									<span data-v-1260122e="" class="">
										<span data-v-1260122e="" class="sizeTxt">사이즈</span>
									</span>
									<div data-v-1260122e="" class="size">
										<span class="sizeBtn">
											<span data-v-6c6430ce="" class="sizeValue">모든 사이즈</span>
											<button class="btn btn-outline-dark">사이즈 선택</button>
										</span>
									</div>
								</div>
								<div data-v-5943a237="" data-v-5622d1e8="" class="detail_price">
									<div data-v-5943a237="" class="title">
										<span data-v-5943a237="" class="title_txt">최근 거래가</span>
									</div>
									<div data-v-5943a237="" class="price">
										<div data-v-5943a237="" class="amount">
											<span data-v-5943a237="" class="num" id="recentPriceValue">
												${idto.map.recentPrice ne null ?  idto.map.recentPrice : "-&nbsp"}
											</span>
											<span data-v-5943a237="" class="won">원</span>
										</div>
									</div>
								</div>
							</div>
							<div data-v-5622d1e8="" class="btn_wrap">
								<div data-v-23bbaa82="" data-v-5622d1e8="" class="division_btn_box lg">
									<a data-v-23bbaa82="" href="/items/buySelect?pno=${idto.pvo.pno }&email=${ses.email}" class="btn_division buy">
										<strong data-v-23bbaa82="" class="title">구매</strong>
										<div data-v-23bbaa82="" class="price">
											<span data-v-23bbaa82="" class="amount">
												<em data-v-23bbaa82="" class="num" id="buyPrice">${idto.map.minBuyPrice ne null ?  idto.map.minBuyPrice : "-&nbsp"}</em>
												<span data-v-23bbaa82="" class="won">원</span>
											</span>
											<span data-v-23bbaa82="" class="desc">즉시 구매가</span>
										</div>
									</a>
									<a data-v-23bbaa82="" href="/items/sellSelect?pno=${idto.pvo.pno }&email=${ses.email}" class="btn_division sell">
										<strong data-v-23bbaa82="" class="title">판매</strong>
										<div data-v-23bbaa82="" class="price">
											<span data-v-23bbaa82="" class="amount">
												<em data-v-23bbaa82="" class="num">${idto.map.maxSellPrice ne null ?  idto.map.maxSellPrice : "-&nbsp"}</em>
												<span data-v-23bbaa82="" class="won">원</span>
											</span>
											<span data-v-23bbaa82="" class="desc">즉시 판매가</span>
										</div>
									</a>
								</div>
							</div>
						</div>
						<div data-v-1f7c6d3f="" class="layer lg layer_detail_size_select select_only_size" style="display: none;">
							<div data-v-1f7c6d3f="" class="layer_container" id="modal">
								<div data-v-1f7c6d3f="" class="layer_header">
									<h2 data-v-1f7c6d3f="" class="title">
										<span data-v-1f7c6d3f="">사이즈</span>
									</h2>
								</div>
								<div data-v-1f7c6d3f="" class="layer_content">
									<div data-v-02c63ee6="" class="select_area lg" showlayer="true" optiontitle="사이즈" data-v-1f7c6d3f="">
										<ul data-v-02c63ee6="" class="select_list">0</ul>
									</div>
								</div>
								<button data-v-1f7c6d3f="" class="btn_layer_close close"><i class="fa fa-close"></i></button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div style="display: none;" id="pno">${idto.pvo.pno }</div>
<div style="display: none;" id="email">${ses.email }</div>

<script src="/resources/js/items/detail.js"></script>

<jsp:include page="../commons/footer.jsp" />