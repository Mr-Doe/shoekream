<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="../commons/header.jsp" />

<style>
p {
	font-size: 13px;
	font-family: -apple-system, BlinkMacSystemFont, Roboto,
		AppleSDGothicNeo-Regular, NanumBarunGothic, NanumGothic, 나눔고딕,
		Segoe UI, Helveica, Arial, Malgun Gothic, Dotum, sans-serif;
	color: #3d3d3d;
	margin: 0;
}

.productitempic {
	height: 180px;
	position: relative;
	background-position: center center;
}

#imggg {
	border-radius: 0.5em;
	background-color: #ebf0f5;
	height: auto;
	width: auto;
}

.product[data-v-75e33658] {
	padding: 0;
	overflow: hidden;
	position: relative;
	padding-top: 100%;
	border-radius: 8px;
}

.productitemtext {
	padding-top: 11px;
	position: relative;
}

#title {
	display: inline-block;
	vertical-align: top;
	line-height: 16px;
	font-size: 14px;
	letter-spacing: -.21px;
	font-weight: 700;
	color: #333;
}

#name[data-v-6a8ef390] {
	line-height: 16px;
	font-size: 13px;
}

#translated_name[data-v-6a8ef390] {
	line-height: 14px;
	font-size: 12px;
	letter-spacing: -.06px;
	color: rgba(34, 34, 34, .5);
}
</style>

<div data-v-3d7f7af7="" class="container my lg">
	<div data-v-3d7f7af7="">
		<div data-v-3d7f7af7="" class="snb_area">
			<a data-v-3d7f7af7="" href="/member/mypage?email=${ses.email }"
				aria-current="page" class="nuxt-link-exact-active nuxt-link-active"><h2
					data-v-3d7f7af7="" class="snb_main_title">마이 페이지</h2></a>
			<nav data-v-7bcac446="" data-v-3d7f7af7="" class="snb">
				<div data-v-7bcac446="" class="snb_list">
					<strong data-v-7bcac446="" class="snb_title">내 정보</strong>
					<ul data-v-4d11470e="" data-v-7bcac446="" class="snb_menu">
						<li data-v-4d11470e="" class="menu_item"><a
							data-v-4d11470e="" href="#" class="menu_link"> 구매 내역 </a></li>
						<li data-v-4d11470e="" class="menu_item"><a
							data-v-4d11470e="" href="#" class="menu_link"> 판매 내역 </a></li>
						<li data-v-4d11470e="" class="menu_item"><a
							data-v-4d11470e="" href="/member/detail?email=${ses.email }"
							class="menu_link"> 프로필 정보 </a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
	<div data-v-5f779880="" data-v-3d7f7af7="" class="content_area">
		<div class="my_buying_detail finished" data-v-d8835e88="">
			<div class="content_title" data-v-88eb18f6="" data-v-d8835e88="">
				<div class="title" data-v-88eb18f6="">
					<h3 data-v-88eb18f6="">구매내역 &gt; 종료된 거래</h3>
					<!---->
				</div>
				<div class="btn_box" data-v-88eb18f6="" data-v-d8835e88="">
					<!---->
					<!---->
					<a type="button" class="btn" data-v-3d1bcc82="" data-v-d8835e88=""
						data-v-88eb18f6=""><span class="btn_txt" data-v-d8835e88="">문의하기</span></a>
				</div>
				<!---->
			</div>
			<!---->
			<div class="order_info_wrap" data-v-5a9e5588="" data-v-d8835e88="">
				<div class="section_title order_title" data-v-5fd118dc=""
					data-v-5a9e5588="">
					<div class="title_box" data-v-5fd118dc="">
						<h4 class="title" data-v-5fd118dc="">
							주문번호 <em class="order_number" data-v-5fd118dc=""
								data-v-5a9e5588=""> B-SN8344010 </em>
						</h4>
					</div>
					<!---->
				</div>
				<div class="order_info" data-v-5a9e5588="">
					<div class="order_product" data-v-5a9e5588="">
						<div class="product_box" data-v-5a9e5588="">
							<div class="product" style="background-color: #ebf0f5;"
								data-v-75e33658="" data-v-5a9e5588="">
								<picture class="picture product_img" data-v-548c90f9=""
									data-v-75e33658="">
								<source type="image/webp"
									srcset="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m_webp"
									data-v-548c90f9="">
								<source
									srcset="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m"
									data-v-548c90f9="">
								<img alt="Nike Dunk Low Retro Varsity Green"
									src="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m"
									class="image" data-v-548c90f9=""></picture>
								<!---->
								<!---->
								<!---->
							</div>
						</div>
						<div class="product_detail" data-v-5a9e5588="">
							<!---->
							<strong class="number" data-v-5a9e5588="">새상품 ·
								DD1391-101</strong>
							<p class="name" data-v-5a9e5588="">Nike Dunk Low Retro
								Varsity Green</p>
							<p class="size" data-v-5a9e5588="">
								<span class="size_text" data-v-5a9e5588="">280</span>
							</p>
						</div>
					</div>
					<!---->
					<div class="order_btn" data-v-5a9e5588="">
						<a href="#" class="btn outlinegrey small" data-v-3d1bcc82=""
							data-v-5a9e5588=""> 상품 상세보기 </a>
					</div>
					<!---->
				</div>
			</div>
			<div class="progress_wrap" data-v-b273706e="" data-v-d8835e88="">
				<div class="progress" data-v-b273706e="">
					<p><strong class="progress_title" data-v-b273706e="">진행 상황</strong></p>
					<ol class="progress_list level-default" data-v-b273706e="" style="border: 1px solid red;">
						<li class="progress_item past" data-v-b273706e=""><p
								class="status" data-v-b273706e="">발송완료</p> <!----> <!----></li>
						<li class="progress_item past" data-v-b273706e=""><p
								class="status" data-v-b273706e="">입고완료</p> <!----> <!----></li>
						<li class="progress_item past" data-v-b273706e=""><p
								class="status" data-v-b273706e="">검수합격</p> <!----> <!----></li>
						<li class="progress_item complete" data-v-b273706e=""><p
								class="status" data-v-b273706e="">배송완료</p> <!----> <!----></li>
					</ol>
				</div>
				<!---->
				<!---->
				<!---->
			</div>
			<div class="purchase_history_wrap" data-v-c90bb174=""
				data-v-d8835e88="">
				<div class="section_title" data-v-5fd118dc="" data-v-c90bb174="">
					<div class="title_box" data-v-5fd118dc="">
						<h4 class="title" data-v-5fd118dc="">결제 내역</h4>
					</div>
					<!---->
				</div>
				<div class="purchase_history buy instant" data-v-c90bb174="">
					<div class="history_detail" data-v-c90bb174="">
						<div class="main_box" data-v-c90bb174="">
							<dl class="main_item" data-v-c90bb174="">
								<dt class="title" data-v-c90bb174="">총 결제금액</dt>
								<dd class="price buy" data-v-c90bb174="">
									<span class="amount" data-v-c90bb174="">324,000</span><span
										class="unit" data-v-c90bb174="">원</span>
								</dd>
							</dl>
						</div>
						<div
							item="[object Object],[object Object],[object Object],[object Object]"
							class="detail_box" data-v-c90bb174="">
							<dl class="price_addition" data-v-3a2a7b6b="" data-v-c90bb174="">
								<dt class="price_title dark" data-v-3a2a7b6b="">
									<span data-v-3a2a7b6b="">구매가</span>
									<!---->
								</dt>
								<dd class="price_text bold" data-v-3a2a7b6b="">324,000원</dd>
							</dl>
							<dl class="price_addition" data-v-3a2a7b6b="" data-v-c90bb174="">
								<dt class="price_title" data-v-3a2a7b6b="">
									<span data-v-3a2a7b6b="">검수비</span>
									<!---->
								</dt>
								<dd class="price_text" data-v-3a2a7b6b="">무료</dd>
							</dl>
							<dl class="price_addition" data-v-3a2a7b6b="" data-v-c90bb174="">
								<dt class="price_title" data-v-3a2a7b6b="">
									<span data-v-3a2a7b6b="">수수료</span>
									<!---->
								</dt>
								<dd class="price_text" data-v-3a2a7b6b="">무료</dd>
							</dl>
							<dl class="price_addition" data-v-3a2a7b6b="" data-v-c90bb174="">
								<dt class="price_title" data-v-3a2a7b6b="">
									<span data-v-3a2a7b6b="">배송비</span>
									<!---->
								</dt>
								<dd class="price_text" data-v-3a2a7b6b="">무료</dd>
							</dl>
						</div>
						<div item="[object Object]" class="detail_box" data-v-c90bb174="">
							<dl class="price_addition" data-v-3a2a7b6b="" data-v-c90bb174="">
								<dt class="price_title dark" data-v-3a2a7b6b="">
									<span data-v-3a2a7b6b="">거래 일시</span>
									<!---->
								</dt>
								<dd class="price_text" data-v-3a2a7b6b="">21/06/14 12:02</dd>
							</dl>
						</div>
					</div>
					<div class="history_btn" data-v-c90bb174="">
						<!---->
						<!---->
						<!---->
						<!---->
					</div>
					<div class="layer_point layer md" style="display: none;"
						data-v-1f7c6d3f="" data-v-28cabbb5="" data-v-c90bb174="">
						<div class="layer_container" data-v-1f7c6d3f="">
							<div class="layer_header" data-v-1f7c6d3f="">
								<h2 class="title" data-v-1f7c6d3f="" data-v-28cabbb5="">이용안내</h2>
							</div>
							<div class="layer_content" data-v-1f7c6d3f="">
								<div class="usable_wrap" data-v-1f7c6d3f="" data-v-28cabbb5="">
									<div class="usable_point" data-v-1f7c6d3f="" data-v-28cabbb5="">
										<h3 class="title" data-v-1f7c6d3f="" data-v-28cabbb5="">사용
											가능한 포인트</h3>
										<p class="point_box" data-v-1f7c6d3f="" data-v-28cabbb5="">
											<span class="point" data-v-1f7c6d3f="" data-v-28cabbb5="">0</span><span
												class="unit" data-v-1f7c6d3f="" data-v-28cabbb5="">P</span>
										</p>
										<div class="point_info" data-v-1f7c6d3f="" data-v-28cabbb5="">
											<p class="info_item" data-v-1f7c6d3f="" data-v-28cabbb5="">이번달
												소멸 예정 포인트 0P</p>
											<p class="info_item" data-v-1f7c6d3f="" data-v-28cabbb5="">
												포인트 유효기간은 적립일로부터 최대 1년까지이며, 유형에 따라 달라질 수 있습니다.</p>
										</div>
									</div>
									<ul class="usable_list" data-v-1f7c6d3f="" data-v-28cabbb5="">
										<li class="usable_item" data-v-1f7c6d3f="" data-v-28cabbb5="">
											1,000P 이상부터 구매금액 제한 없이 사용하실 수 있습니다.</li>
										<li class="usable_item" data-v-1f7c6d3f="" data-v-28cabbb5="">
											입찰 삭제, 거래 취소 시 사용한 포인트는 환불됩니다.</li>
										<li class="usable_item" data-v-1f7c6d3f="" data-v-28cabbb5="">
											먼저 적립된 포인트부터 순서대로 사용되며, 사용하지 않으실 경우 유효기간이 지나면 자동 소멸됩니다.</li>
										<li class="usable_item" data-v-1f7c6d3f="" data-v-28cabbb5="">
											유효기간이 지난 후 환불받은 포인트는 다시 사용하실 수 없습니다.</li>
									</ul>
								</div>
								<div class="layer_btn" data-v-1f7c6d3f="" data-v-28cabbb5="">
									<a href="#" class="btn outline medium" data-v-3d1bcc82=""
										data-v-28cabbb5="" data-v-1f7c6d3f=""> 확인 </a>
								</div>
							</div>
							<a href="#" class="btn_layer_close" data-v-1f7c6d3f=""
								data-v-28cabbb5=""><svg xmlns="http://www.w3.org/2000/svg"
									class="ico-close icon sprite-icons" data-v-1f7c6d3f=""
									data-v-28cabbb5="">
							<use
										href="/_nuxt/1a4fefc9c245c25be8c820c7d584e4d7.svg#i-ico-close"
										xlink:href="/_nuxt/1a4fefc9c245c25be8c820c7d584e4d7.svg#i-ico-close"
										data-v-1f7c6d3f="" data-v-28cabbb5=""></use></svg></a>
						</div>
					</div>
				</div>
			</div>
			<div class="shipping_info_wrap" data-v-7b91b450="" data-v-d8835e88="">
				<div class="section_title" data-v-5fd118dc="" data-v-7b91b450="">
					<div class="title_box" data-v-5fd118dc="">
						<h4 class="title" data-v-5fd118dc="">배송 정보</h4>
					</div>
					<!---->
				</div>
				<div class="shipping_info" data-v-7b91b450="">
					<a href="#" class="btn_shipping" data-v-7b91b450="">
						로젠택배93580102055 </a>
				</div>
			</div>
			<div class="shipping_address_wrap" data-v-8c2dcbf2=""
				data-v-d8835e88="">
				<div class="section_title" data-v-5fd118dc="" data-v-8c2dcbf2="">
					<div class="title_box" data-v-5fd118dc="">
						<h4 class="title" data-v-5fd118dc="">배송 주소</h4>
					</div>
					<p class="noti" data-v-5fd118dc="">대기 중, 발송완료, 입고완료 상태에서만 배송지
						변경이 가능합니다.</p>
				</div>
				<div class="shipping_address" data-v-8c2dcbf2="">
					<dl class="address_item" data-v-8c2dcbf2="">
						<dt class="address_title" data-v-8c2dcbf2="">받는 사람</dt>
						<dd class="address_txt" data-v-8c2dcbf2="">#</dd>
					</dl>
					<dl class="address_item" data-v-8c2dcbf2="">
						<dt class="address_title" data-v-8c2dcbf2="">휴대폰 번호</dt>
						<dd class="address_txt" data-v-8c2dcbf2="">#</dd>
					</dl>
					<dl class="address_item" data-v-8c2dcbf2="">
						<dt class="address_title" data-v-8c2dcbf2="">주소</dt>
						<dd class="address_txt" data-v-8c2dcbf2="">#</dd>
					</dl>
				</div>
				<!---->
				<!---->
			</div>
			<div class="payment_wrap" data-v-79623caa="" data-v-d8835e88="">
				<div class="section_title" data-v-5fd118dc="" data-v-79623caa="">
					<div class="title_box" data-v-5fd118dc="">
						<h4 class="title" data-v-5fd118dc="">결제 정보</h4>
					</div>
					<!---->
				</div>
				<div class="payment_info" data-v-79623caa="">
					<div class="card_info" data-v-74cc8e24="" data-v-79623caa="">
						<span class="card_name" data-v-74cc8e24=""> 신한</span>
						<div class="card_num" data-v-74cc8e24="">
							<span class="num_bind" data-v-74cc8e24=""><span
								class="dot" data-v-74cc8e24=""><span class="dot"
									data-v-74cc8e24=""></span></span><span class="hyphen"
								data-v-74cc8e24=""></span><span class="dot" data-v-74cc8e24=""><span
									class="dot" data-v-74cc8e24=""></span></span><span class="hyphen"
								data-v-74cc8e24=""></span><span class="dot" data-v-74cc8e24=""><span
									class="dot" data-v-74cc8e24=""></span></span><span class="hyphen"
								data-v-74cc8e24=""></span>
								<div class="last_num_box" data-v-74cc8e24="">
									<span class="last_num">9086</span>
								</div></span>
							<!---->
						</div>
					</div>
				</div>
			</div>
			<div data-v-d8835e88=""></div>
			<div class="detail_btn_box" data-v-d8835e88="">
				<a href="#" class="btn btn_view_list outlinegrey medium"
					data-v-3d1bcc82="" data-v-d8835e88=""> 목록보기 </a>
			</div>
			<!---->
			<!---->
			<!---->
			<!---->
			<!---->
			<!---->
			<!---->
		</div>
	</div>
</div>



<jsp:include page="../commons/footer.jsp" />