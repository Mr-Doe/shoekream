<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../commons/header.jsp" />

<div id="__layout">
	<div data-v-7ffb34f7="" tabindex="0" class="wrap lg win_os pt-0">
		<div data-v-6657f7cc="" data-v-7ffb34f7="" class="container sell lg">
			<!---->
			<div data-v-6657f7cc="" class="content">
				<div class="container pb-3 text-center">
					<h3>판매하기</h3>
				</div>
				<div data-v-68b558fb="" data-v-6657f7cc="" class="buy_immediate">
					<div data-v-1643775e="" data-v-68b558fb=""
						class="product_info_area">
						<div data-v-1643775e="" class="product_info">
							<div data-v-75e33658="" data-v-1643775e="" class="product" style="background-color: rgb(235, 240, 245);">
								<picture data-v-548c90f9="" data-v-75e33658="" class="picture product_img">
								<source data-v-548c90f9="" type="image/webp" srcset="${idto.img }">
								<source data-v-548c90f9="" srcset="${idto.img }">
								<img data-v-548c90f9="" alt="상품 이미지" src="${idto.img }" class="image"></picture>
							</div>
							<div data-v-1643775e="" class="product_detail">
								<div data-v-299f50cf="" class="product_detail">
									<p data-v-299f50cf="" class="code">${idto.pvo.model }</p>
									<p data-v-299f50cf="" class="name">${idto.pvo.eName }</p>
									<p data-v-299f50cf="" class="translated_name">${idto.pvo.kName }</p>
								</div>
							</div>
						</div>
					</div>
					<div data-v-158ed304="" data-v-68b558fb=""
						class="price_descision_box">
						<ul data-v-638c1354="" data-v-158ed304="" class="price_list">
							<li data-v-638c1354="" class="list_item">
								<p data-v-638c1354="" class="title">즉시 구매가</p> 
								<span data-v-638c1354="" class="price"> 
									<c:if test="${idto.map.buy!=null }">${idto.map.buy }</c:if> 
									<c:if test="${idto.map.buy==null }">-&nbsp;</c:if>
								</span><span data-v-638c1354="" class="unit">원</span></li>
							<li data-v-638c1354="" class="list_item">
								<p data-v-638c1354="" class="title">즉시 판매가</p> 
								<span data-v-638c1354="" class="price" id="sellPrice"> 
									<c:if test="${idto.map.sell!=null }">${idto.map.sell }</c:if> 
									<c:if test="${idto.map.sell==null }">-&nbsp;</c:if>
								</span><span data-v-638c1354="" class="unit">원</span></li>
						</ul>
						<div data-v-158ed304="" class="instant_group">
							<div data-v-b6b2883e="" data-v-158ed304=""
								class="tab_area buy_tab">
								<ul data-v-b6b2883e="" role="tablist" class="tab_list">
									<li data-v-b6b2883e="" role="tab" aria-selected="false"
										id="panel1" aria-controls="panel1" class="item"><a
										data-v-b6b2883e="" href="javascript:void(0);" onclick="fn()"
										;
										class="item_link" id="bid">판매 입찰</a></li>
									<li data-v-b6b2883e="" role="tab" aria-selected="true"
										id="panel2" aria-controls="panel2" class="item"><a
										data-v-b6b2883e="" href="javascript:void(0);" onclick="fn()"
										;
										class="item_link" id="sell">즉시 판매</a></li>
								</ul>
							</div>
							<div id="area"></div>
							<div data-v-158ed304="" class="price_bind">
								<p data-v-158ed304="" class="price_bind_empty" style="color: #f15746;">※자신이 입찰한 상품은 제외됩니다.※</p>
								<p data-v-158ed304="" class="price_bind_empty" style="color: #f15746;">※즉시 판매가 불가능하거나 즉시 판매가가 다르게 표기될 수 있습니다.※</p>
							</div>
						</div>
					</div>
					<div data-v-65a8cedc="" data-v-68b558fb=""
						class="buy_total_confirm" is-instant="true">
						<div data-v-679d7250="" data-v-65a8cedc="" class="price_total">
							<dl data-v-679d7250="" class="price_box price_empty">
								<dt data-v-679d7250="" class="price_title">총 결제금액</dt>
								<dd data-v-679d7250="" class="price_empty_desc">누르면 바로 결제가 진행됩니다.</dd>
							</dl>
						</div>
						<div data-v-65a8cedc="" class="btn_confirm">
							<button data-v-3d1bcc82="" data-v-65a8cedc="" class="full solid" id="btn">
								즉시 판매</button>
						</div>
					</div>
				</div>

				
			</div>
		</div>
	</div>
</div>

<form action="" method="post">
	<c:if test="${idto.ivo.itemNo ne null }">
		<input type="hidden" name="itemNo" value="${idto.ivo.itemNo }">
	</c:if>
	<c:if test="${idto.ivo.itemNo eq null }">
		<input type="hidden" name="itemNo" value="0">
	</c:if>
	<input type="hidden" name="sellerEmail" value="${ses.email }">
	<input type="hidden" id="pno" name="pno" value="${idto.pvo.pno }">
	<input type="hidden" name="shoeSize" value="${idto.ivo.shoeSize }">
	<input type="hidden" name="price" id="priceValue" value="0">
</form>

<span id="price" style="display: none;">${idto.ivo.price }</span>
<span id="email" style="display: none;">${ses.email }</span>
<span id="itemNo" style="display: none;">${idto.ivo.itemNo }</span>
<span id="type" style="display: none;"></span>
<span id="buyer" style="display: none;">${idto.ivo.buyerEmail }</span>

<a href="/member/login" style="display: none;" id="link"></a>

<script src="/resources/js/items/sellItem.js"></script>
<jsp:include page="../commons/footer.jsp" />