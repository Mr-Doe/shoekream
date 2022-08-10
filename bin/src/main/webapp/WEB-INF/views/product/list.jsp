<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../commons/header.jsp" />
<jsp:include page="../commons/sidebar.jsp" />


<div class="col-lg-9 search_result_item">
	<div class="row">
		<c:forEach items="${map}" var="pvo">
			<div class="col-lg-3 col-md-6" style="padding-top: 20px; padding-top: 20px;">
				<div OnClick="location.href ='/product/list'" style="cursor:pointer;">
					<div class="product" style="background-color: #ebf0f5;" data-v-75e33658="" data-v-6a8ef390="">
						<picture class="picture product_img"  data-v-75e33658="">
							<img alt="나이키 덩크 로우 레트로 블랙" src="${pvo.th_img }" class="image">
						</picture>
					</div>
					<div class="product__item__text">
						<p id="title">${pvo.brand_name }</p>					
						<p id="name" style="line-height: 16px; font-size: 13px;">${pvo.e_name }</p>
						<p id="translated_name" style="line-height: 14px; font-size: 12px; letter-spacing: -.06px; color: rgba(34,34,34,.5);">
							${pvo.k_name }
						</p>
						<c:forEach items="${minPrice }" var="price">
							<c:if test="${pvo.pno eq price.pno }">
								<p style="padding-top: 11px; line-height: 17px; font-size: 14px; font-weight: 700;">${price.min_price}원</p>
								<p style="line-height: 13px; font-size: 11px; color: rgba(34,34,34,.5);">즉시 구매가</p>
							</c:if>
						</c:forEach>
						<div class="product__color__select">
							<label for="pc-4"> <input type="radio" id="pc-4"></label> 
							<label class="active black" for="pc-5"><input type="radio" id="pc-5"></label>
							<label class="grey" for="pc-6"><input type="radio" id="pc-6"></label>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	<hr>
	<ul class="pagination justify-content-center">
		<c:if test="${pgn.prev }">
			<li class="page-item">
				<a class="page-link" href="/product/list?pageNo=${i }&qty=${pgn.pgvo.qty}<c:if test="${shoe_brand ne null}">&shoe_brand=${pgn.pgvo.shoe_brand }</c:if><c:if test="${shoe_brand ne null}">&shoe_size=${pgn.pgvo.shoe_size }</c:if><c:if test="${shoe_brand ne null}">&shoe_category=${pgn.pgvo.shoe_category }</c:if>">Prev</a>
			</li>
		</c:if>
		<c:forEach begin="${pgn.startPage }" end="${pgn.endPage }" var="i">
			<li class="page-item ${pgn.pgvo.pageNo == i ? 'active':'' }">
					<a class="page-link" href="/product/list?pageNo=${i }&qty=${pgn.pgvo.qty}
											<c:if test="${pgn.pgvo.shoe_brand ne null}">&shoe_brand=${pgn.pgvo.shoe_brand}</c:if>
											<c:if test="${pgn.pgvo.shoe_category ne null}">&shoe_category=${pgn.pgvo.shoe_category}</c:if>
											<c:if test="${pgn.pgvo.shoe_size ne null}">&shoe_size=${pgn.pgvo.shoe_size}</c:if>
											<c:if test="${pgn.pgvo.keyword ne null}">&keyword=${pgn.pgvo.keyword}</c:if>">${i }</a>
			</li>
		</c:forEach>
		<c:if test="${pgn.next }">
			<li class="page-item"><a class="page-link" href="/product/list?pageNo=${i }&qty=${pgn.pgvo.qty}<c:if test="${shoe_brand ne null}">&shoe_brand=${pgn.pgvo.shoe_brand }</c:if><c:if test="${shoe_brand ne null}">&shoe_size=${pgn.pgvo.shoe_size }</c:if><c:if test="${shoe_brand ne null}">&shoe_category=${pgn.pgvo.shoe_category }</c:if>">Next</a>
			</li>
		</c:if>
	</ul>
</div>

<script>
	console.log(${pgn});
</script>
<!-- Shop Section End -->

<jsp:include page="../commons/footer.jsp" />