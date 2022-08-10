<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../commons/header.jsp" />

<div id="__layout">
	<div data-v-7ffb34f7="" tabindex="0" class="wrap lg win_os pt-0">
		<div data-v-6657f7cc="" data-v-7ffb34f7="" class="container buy lg">
			<!---->
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
								<!---->
								<!---->
								<!---->
							</div>
							<div data-v-1643775e="" class="product_detail">
								<!-- <strong data-v-1643775e="" class="model_number">315122-111/CW2288-111
								</strong>
								<p data-v-1643775e="" class="model_title">Nike Air Force 1
									'07 Low White</p>
								<p data-v-1643775e="" class="model_ko">나이키 에어포스 1 '07 로우 화이트</p>
								<div data-v-1643775e="" class="model_desc">
									<p data-v-1643775e="" class="size_txt">260</p>
									
								</div> -->
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
									<p data-v-299f50cf="" class="size">
										<%-- ${product.size } --%>
										사이즈
									</p>
								</div>
							</div>
						</div>
					</div>
					<div data-v-158ed304="" data-v-68b558fb=""
						class="price_descision_box">
						<ul data-v-638c1354="" data-v-158ed304="" class="price_list">
							<li data-v-638c1354="" class="list_item"><p
									data-v-638c1354="" class="title">즉시 구매가</p> <span
								data-v-638c1354="" class="price">130,000</span><span
								data-v-638c1354="" class="unit">원</span></li>
							<li data-v-638c1354="" class="list_item"><p
									data-v-638c1354="" class="title">즉시 판매가</p> <span
								data-v-638c1354="" class="price">127,000</span><span
								data-v-638c1354="" class="unit">원</span></li>
						</ul>
						<div data-v-158ed304="" class="instant_group">
							<div data-v-b6b2883e="" data-v-158ed304=""
								class="tab_area buy_tab">
								<ul data-v-b6b2883e="" role="tablist" class="tab_list">
									<li data-v-b6b2883e="" role="tab" aria-selected="false"
										aria-controls="panel1" class="item"><a data-v-b6b2883e=""
										href="#" class="item_link">구매 입찰</a></li>
									<li data-v-b6b2883e="" role="tab" aria-selected="true"
										aria-controls="panel2" class="item on"><a
										data-v-b6b2883e="" href="#" class="item_link">즉시 구매</a></li>
								</ul>

							</div>
							<div data-v-03750f89="" data-v-158ed304="" class="price_now">
								<dl data-v-03750f89="" class="price_now_box">
									<dt data-v-03750f89="" class="price_now_title">즉시 구매가</dt>
									<dd data-v-03750f89="" class="price">
										<span data-v-03750f89="" class="amount">130,000</span><span
											data-v-03750f89="" class="unit">원</span>
									</dd>
								</dl>
								<div data-v-03750f89="" class="price_warning"
									style="display: none;">
									<!---->
								</div>
							</div>
							<!-- <div data-v-158ed304="" data-v-68b558fb=""
								class="price_descision_box">
								<ul data-v-638c1354="" data-v-158ed304="" class="price_list">
									<li data-v-638c1354="" class="list_item"><p
											data-v-638c1354="" class="title">즉시 구매가</p>
										<span data-v-638c1354="" class="price">132,000</span><span
										data-v-638c1354="" class="unit">원</span></li>
									<li data-v-638c1354="" class="list_item"><p
											data-v-638c1354="" class="title">즉시 판매가</p>
										<span data-v-638c1354="" class="price">127,000</span><span
										data-v-638c1354="" class="unit">원</span></li>
								</ul>
								<div data-v-158ed304="" class="instant_group">
									<div data-v-b6b2883e="" data-v-158ed304=""
										class="tab_area buy_tab">
										<ul data-v-b6b2883e="" role="tablist" class="tab_list">
											<li data-v-b6b2883e="" role="tab" aria-selected="true"
												aria-controls="panel1" class="item on"><a
												data-v-b6b2883e="" href="#" class="item_link">구매 입찰</a></li>
											<li data-v-b6b2883e="" role="tab" aria-selected="false"
												aria-controls="panel2" class="item"><a
												data-v-b6b2883e="" href="#" class="item_link">즉시 구매</a></li>
										</ul>
										
										
									</div>
									<div data-v-03750f89="" data-v-158ed304=""
										class="price_now active_input">
										<dl data-v-03750f89="" class="price_now_box">
											<dt data-v-03750f89="" class="price_now_title">구매 희망가</dt>
											<dd data-v-03750f89="" class="price">
												<input data-v-03750f89="" type="text"
													pattern="([0-9]+.{0,1}[0-9]*,{0,1})*[0-9]"
													required="required" placeholder="희망가 입력" autocomplete="off"
													class="input_amount"><span data-v-03750f89=""
													class="unit">원</span>
											</dd>
										</dl>
										<div data-v-03750f89="" class="price_warning"
											style="display: none;">
											
										</div>
									</div>
									<div data-v-158ed304="" class="price_bind">
										<p data-v-158ed304="" class="price_bind_empty">총 결제금액은 다음
											화면에서 계산됩니다.</p>
									</div>
								</div>
							</div> -->
							<div data-v-158ed304="" class="price_bind">
								<p data-v-158ed304="" class="price_bind_empty">총 결제금액은 다음
									화면에서 계산됩니다.</p>
							</div>
						</div>
					</div>
					<!---->
					<div data-v-65a8cedc="" data-v-68b558fb=""
						class="buy_total_confirm" is-instant="true">
						<div data-v-679d7250="" data-v-65a8cedc="" class="price_total">
							<dl data-v-679d7250="" class="price_box price_empty">
								<dt data-v-679d7250="" class="price_title">총 결제금액</dt>
								<dd data-v-679d7250="" class="price_empty_desc">다음 화면에서 확인</dd>
							</dl>
							<span data-v-679d7250="" class="price_warning"
								style="display: none;"><em data-v-679d7250="">주의! </em></span>
						</div>
						<div data-v-65a8cedc="" class="btn_confirm">
							<button data-v-3d1bcc82="" data-v-65a8cedc=""
								class="full solid"> 즉시 구매 </button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<form action="" method="post">
	<input type="hidden" name="itemNo">
	<input type="hidden" name="buyerEmail">
	<input type="hidden" name="pno">
	<input type="hidden" name="shoeSize">
	<input type="hidden" name="price">
	
</form>
<jsp:include page="../commons/footer.jsp" />