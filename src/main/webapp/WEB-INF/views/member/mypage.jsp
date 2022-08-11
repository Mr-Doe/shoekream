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
		<div data-v-5f779880="" class="my_home">
			<div data-v-5acef129="" data-v-5f779880="" class="user_membership">
				<div data-v-5acef129="" class="user_detail">
					<div data-v-5acef129="" class="user_thumb">
						<img data-v-5acef129=""
							src="../../resources/dist-temp/img/logo.png" alt="사용자 이미지"
							class="thumb_img">
					</div>
					<div data-v-5acef129="" class="user_info">
						<div data-v-5acef129="" class="info_box">
							<strong data-v-5acef129="" class="name">${initEmail }</strong>
							<p data-v-5acef129="" class="email">${memberVO.email }</p>
							<a data-v-3d1bcc82="" data-v-5acef129=""
								href="/member/modify?email=${memberVO.email }"
								class="btn btn outlinegrey small" type="button"> 프로필 수정 </a> <a
								data-v-3d1bcc82="" data-v-5acef129="" href="#"
								class="btn btn btn_my_style outlinegrey small" type="button">
								내 스타일 </a>
						</div>
					</div>
				</div>
				<div data-v-5acef129="" class="membership_detail">
					<a data-v-5acef129="" href="#" class="membership_item disabled"><strong
						data-v-5acef129="" class="info"> 일반 회원 </strong>
						<p data-v-5acef129="" class="title">회원 등급</p></a><a data-v-5acef129=""
						href="#" class="membership_item"><strong data-v-5acef129=""
						class="info"> 0P </strong>
						<p data-v-5acef129="" class="title">포인트</p></a>
				</div>
			</div>
			<div data-v-6752ceb2="" data-v-5f779880="" class="my_home_title">
				<h3 data-v-6752ceb2="" class="title">구매 내역</h3>
				<a data-v-6752ceb2="" href="#" class="btn_more"><span
					data-v-6752ceb2="" class="btn_txt">더보기</span> <svg
						data-v-6752ceb2="" xmlns="http://www.w3.org/2000/svg"
						class="icon sprite-icons arr-right-gray">
						<use data-v-6752ceb2=""
							href="/_nuxt/1a4fefc9c245c25be8c820c7d584e4d7.svg#i-arr-right-gray"
							xlink:href="/_nuxt/1a4fefc9c245c25be8c820c7d584e4d7.svg#i-arr-right-gray"></use></svg></a>
			</div>
			<div data-v-5f779880="" class="recent_purchase">
				<div data-v-bbed98be="" data-v-5f779880="" class="purchase_list_tab">
					<div data-v-bbed98be="" class="tab_item total">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">전체</dt>
								<dd data-v-bbed98be="" class="count">16</dd>
							</dl></a>
					</div>
					<div data-v-bbed98be="" class="tab_item tab_on">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">입찰 중</dt>
								<dd data-v-bbed98be="" class="count">0</dd>
							</dl></a>
					</div>
					<div data-v-bbed98be="" class="tab_item">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">진행 중</dt>
								<dd data-v-bbed98be="" class="count">0</dd>
								<!---->
							</dl></a>
					</div>
					<div data-v-bbed98be="" class="tab_item">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">종료</dt>
								<dd data-v-bbed98be="" class="count">16</dd>
							</dl></a>
					</div>
				</div>
				<div data-v-5f779880="">
					<div data-v-21d527e4="" data-v-5f779880=""
						class="purchase_list all bid">
						<!---->
						<div data-v-62dace61="" data-v-21d527e4=""
							class="purchase_item buy">
							<div data-v-62dace61="" class="history_product">
								<div data-v-62dace61="" class="product_box">
									<div data-v-75e33658="" data-v-62dace61="" class="product"
										style="background-color: rgb(235, 240, 245);">
										<picture data-v-548c90f9="" data-v-75e33658=""
											class="picture product_img">
										<source data-v-548c90f9="" type="image/webp"
											srcset="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m_webp">
										<source data-v-548c90f9=""
											srcset="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m">
										<img data-v-548c90f9=""
											alt="Nike Dunk Low Retro Varsity Green"
											src="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m"
											class="image"></picture>
										<!---->
										<!---->
										<!---->
									</div>
								</div>
								<div data-v-62dace61="" class="product_detail">
									<!---->
									<p data-v-62dace61="" class="name">Nike Dunk Low Retro
										Varsity Green</p>
									<p data-v-62dace61="" class="size">
										<span data-v-62dace61="" class="size_text">280</span>
									</p>
								</div>
							</div>
							<div data-v-62dace61="" class="history_status">
								<div data-v-62dace61="" class="status_box field_price">
									<div data-v-62dace61="" class="price">
										<span data-v-62dace61="" class="amount">324,000</span><span
											data-v-62dace61="" class="unit">원</span>
									</div>
								</div>
								<div data-v-62dace61="" class="status_box field_date_purchased">
									<span data-v-62dace61="" class="date"> 21/06/14</span>
								</div>
								<div data-v-62dace61="" class="status_box field_date_paid">
									<span data-v-62dace61="" class="date"> </span>
								</div>
								<div data-v-62dace61="" class="status_box field_expires_at">
									<span data-v-62dace61="" class="date text-default">-</span>
								</div>
								<div data-v-62dace61="" class="status_box field_status">
									<span data-v-62dace61="" class="status_txt text-default">배송완료</span>
									<!---->
								</div>
							</div>
						</div>
						<div data-v-62dace61="" data-v-21d527e4=""
							class="purchase_item buy">
							<div data-v-62dace61="" class="history_product">
								<div data-v-62dace61="" class="product_box">
									<div data-v-75e33658="" data-v-62dace61="" class="product"
										style="background-color: rgb(235, 240, 245);">
										<picture data-v-548c90f9="" data-v-75e33658=""
											class="picture product_img">
										<source data-v-548c90f9="" type="image/webp"
											srcset="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m_webp">
										<source data-v-548c90f9=""
											srcset="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m">
										<img data-v-548c90f9=""
											alt="Nike Dunk Low Retro Varsity Green"
											src="https://kream-phinf.pstatic.net/MjAyMTA0MDJfMTE2/MDAxNjE3MzU2MDgyOTQx._YYmfkMlqvAs6uE0tqFkF_rwIQYKEK4KwP188wswnh8g.B2ZCn1ZAN8h_qTlTk-7jNTB7M4yMmjh7hwFa3CO8zIIg.PNG/p_3f37ae036808499d839aa116ee22a81c.png?type=m"
											class="image"></picture>
										<!---->
										<!---->
										<!---->
									</div>
								</div>
								<div data-v-62dace61="" class="product_detail">
									<!---->
									<p data-v-62dace61="" class="name">Nike Dunk Low Retro
										Varsity Green</p>
									<p data-v-62dace61="" class="size">
										<span data-v-62dace61="" class="size_text">280</span>
									</p>
								</div>
							</div>
							<div data-v-62dace61="" class="history_status">
								<div data-v-62dace61="" class="status_box field_price">
									<div data-v-62dace61="" class="price">
										<span data-v-62dace61="" class="amount">322,000</span><span
											data-v-62dace61="" class="unit">원</span>
									</div>
								</div>
								<div data-v-62dace61="" class="status_box field_date_purchased">
									<span data-v-62dace61="" class="date"> 21/06/14</span>
								</div>
								<div data-v-62dace61="" class="status_box field_date_paid">
									<span data-v-62dace61="" class="date"> </span>
								</div>
								<div data-v-62dace61="" class="status_box field_expires_at">
									<span data-v-62dace61="" class="date text-default">21/07/11</span>
								</div>
								<div data-v-62dace61="" class="status_box field_status">
									<span data-v-62dace61="" class="status_txt text-default">배송완료</span>
									<!---->
								</div>
							</div>
						</div>
						<div data-v-62dace61="" data-v-21d527e4=""
							class="purchase_item bid">
							<div data-v-62dace61="" class="history_product">
								<div data-v-62dace61="" class="product_box">
									<div data-v-75e33658="" data-v-62dace61="" class="product"
										style="background-color: rgb(235, 240, 245);">
										<picture data-v-548c90f9="" data-v-75e33658=""
											class="picture product_img">
										<source data-v-548c90f9="" type="image/webp"
											srcset="https://kream-phinf.pstatic.net/MjAyMTA0MjNfMTM3/MDAxNjE5MTY4MjI4OTM4.sAToRDxrfFw9deS1_iWzKI7brDmtN1R9WqkimU81XSsg.Th25GokaQPcn0EdT5AvGYrafEbVkRr5P4BWCqXpImIQg.PNG/p_e6013157f46b40fbbbd81efa0cb3bc89.png?type=m_webp">
										<source data-v-548c90f9=""
											srcset="https://kream-phinf.pstatic.net/MjAyMTA0MjNfMTM3/MDAxNjE5MTY4MjI4OTM4.sAToRDxrfFw9deS1_iWzKI7brDmtN1R9WqkimU81XSsg.Th25GokaQPcn0EdT5AvGYrafEbVkRr5P4BWCqXpImIQg.PNG/p_e6013157f46b40fbbbd81efa0cb3bc89.png?type=m">
										<img data-v-548c90f9=""
											alt="Nike Dunk Low Retro University Blue"
											src="https://kream-phinf.pstatic.net/MjAyMTA0MjNfMTM3/MDAxNjE5MTY4MjI4OTM4.sAToRDxrfFw9deS1_iWzKI7brDmtN1R9WqkimU81XSsg.Th25GokaQPcn0EdT5AvGYrafEbVkRr5P4BWCqXpImIQg.PNG/p_e6013157f46b40fbbbd81efa0cb3bc89.png?type=m"
											class="image"></picture>
										<!---->
										<!---->
										<!---->
									</div>
								</div>
								<div data-v-62dace61="" class="product_detail">
									<!---->
									<p data-v-62dace61="" class="name">Nike Dunk Low Retro
										University Blue</p>
									<p data-v-62dace61="" class="size">
										<span data-v-62dace61="" class="size_text">280</span>
									</p>
								</div>
							</div>
							<div data-v-62dace61="" class="history_status">
								<div data-v-62dace61="" class="status_box field_price">
									<div data-v-62dace61="" class="price">
										<span data-v-62dace61="" class="amount">237,000</span><span
											data-v-62dace61="" class="unit">원</span>
									</div>
								</div>
								<div data-v-62dace61="" class="status_box field_date_purchased">
									<span data-v-62dace61="" class="date"> 21/06/11</span>
								</div>
								<div data-v-62dace61="" class="status_box field_date_paid">
									<span data-v-62dace61="" class="date"> </span>
								</div>
								<div data-v-62dace61="" class="status_box field_expires_at">
									<span data-v-62dace61="" class="date text-default">21/07/11</span>
								</div>
								<div data-v-62dace61="" class="status_box field_status">
									<span data-v-62dace61="" class="status_txt text-default">배송완료</span>
									<!---->
								</div>
							</div>
						</div>
						<!---->
						<!---->
						<!---->
						<!---->
						<!---->
					</div>
					<!---->
				</div>
			</div>
			<div data-v-6752ceb2="" data-v-5f779880="" class="my_home_title">
				<h3 data-v-6752ceb2="" class="title">판매 내역</h3>
				<a data-v-6752ceb2="" href="/my/selling" class="btn_more"><span
					data-v-6752ceb2="" class="btn_txt">더보기</span> <svg
						data-v-6752ceb2="" xmlns="http://www.w3.org/2000/svg"
						class="icon sprite-icons arr-right-gray">
						<use data-v-6752ceb2=""
							href="/_nuxt/1a4fefc9c245c25be8c820c7d584e4d7.svg#i-arr-right-gray"
							xlink:href="/_nuxt/1a4fefc9c245c25be8c820c7d584e4d7.svg#i-arr-right-gray"></use></svg></a>
			</div>
			<div data-v-5f779880="" class="recent_purchase">
				<div data-v-bbed98be="" data-v-5f779880=""
					class="purchase_list_tab sell">
					<div data-v-bbed98be="" class="tab_item total">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">전체</dt>
								<dd data-v-bbed98be="" class="count">0</dd>
							</dl></a>
					</div>
					<div data-v-bbed98be="" class="tab_item tab_on">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">입찰 중</dt>
								<dd data-v-bbed98be="" class="count">0</dd>
							</dl></a>
					</div>
					<div data-v-bbed98be="" class="tab_item">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">진행 중</dt>
								<dd data-v-bbed98be="" class="count">0</dd>
								<!---->
							</dl></a>
					</div>
					<div data-v-bbed98be="" class="tab_item">
						<a data-v-bbed98be="" href="#" class="tab_link"><dl
								data-v-bbed98be="" class="tab_box">
								<dt data-v-bbed98be="" class="title">종료</dt>
								<dd data-v-bbed98be="" class="count">0</dd>
							</dl></a>
					</div>
				</div>
				<div data-v-5f779880="">
					<div data-v-21d527e4="" data-v-5f779880=""
						class="purchase_list all ask">
						<!---->
						<div data-v-e2f6767a="" data-v-21d527e4="" class="empty_area">
							<p data-v-e2f6767a="" class="desc">거래 내역이 없습니다.</p>
							<!---->
						</div>
						<!---->
						<!---->
						<!---->
						<!---->
					</div>
					<!---->
				</div>
			</div>
			<!---->
		</div>
	</div>
</div>

<jsp:include page="../commons/footer.jsp" />