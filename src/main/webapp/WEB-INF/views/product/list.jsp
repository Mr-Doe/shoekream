<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../commons/header.jsp" />
<jsp:include page="../commons/sidebar.jsp" />
<style>
.*{
	padding: 0;
	margin: 0;
}

p {
    font-size: 13px;
    font-family: -apple-system,BlinkMacSystemFont,Roboto,AppleSDGothicNeo-Regular,NanumBarunGothic,NanumGothic,나눔고딕,Segoe UI,Helveica,Arial,Malgun Gothic,Dotum,sans-serif; 
    color: #3d3d3d;
    margin: 0;
}

.product__item__pic {
	height: 180px;
	position: relative;
	background-position: center center;
}

#imggg {
	border-radius: 0.5em;
	background-color: #ebf0f5;
	height: auto;
	width : auto;
}

/* 
	공용css 
*/
.breadcrumb-option {
    background: #f5f5f5;
    padding: 40px 0;
}
.spad {
    padding-top: 60px;
    padding-bottom: 60px;
}
.footer {
    background: #f5f5f5;
    margin-top: 20px;
}

#preloder {
	position: fixed;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	z-index: 999999;
	background: #f5f5f5;
}

.loader {
	width: 40px;
	height: 40px;
	position: absolute;
	top: 50%;
	left: 50%;
	margin-top: -13px;
	margin-left: -13px;
	border-radius: 60px;
	animation: loader 0.8s linear infinite;
	-webkit-animation: loader 0.8s linear infinite;
}

/*
	공용 css 끝
 */


.product[data-v-75e33658] {
	padding: 0;
    overflow: hidden;
    position: relative;
    padding-top: 100%;
    border-radius: 8px;
}
.product__item__text {
    padding-top: 11px;
    position: relative;
}
#title{
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
    color: rgba(34,34,34,.5);
}

</style>

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
						<c:if test="${pvo.min_price ne null }">
							<p style="padding-top: 11px; line-height: 17px; font-size: 14px; font-weight: 700;">${pvo.min_price}원</p>
							<p style="line-height: 13px; font-size: 11px; color: rgba(34,34,34,.5);">즉시 구매가</p>
						</c:if>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	<hr>
	<ul class="pagination justify-content-center">
		<c:if test="${pgn.prev }">
			<li class="page-item">
				<a class="page-link" href="/product/list?pageNo=${pgn.startPage-1 }&qty=${pgn.pgvo.qty}
											<c:if test="${pgn.pgvo.shoe_brand ne null}">&shoe_brand=${pgn.pgvo.shoe_brand }</c:if>
											<c:if test="${pgn.pgvo.shoe_category ne null}">&shoe_category=${pgn.pgvo.shoe_category }</c:if>
											<c:if test="${pgn.pgvo.shoe_size ne null}">&shoe_size=${pgn.pgvo.shoe_size }</c:if>
											<c:if test="${pgn.pgvo.keyword ne null}">&keyword=${pgn.pgvo.keyword}</c:if>">Prev</a>
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
			<li class="page-item"><a class="page-link" href="/product/list?pageNo=${pgn.endPage+1 }&qty=${pgn.pgvo.qty}
											<c:if test="${pgn.pgvo.shoe_brand ne null}">&shoe_brand=${pgn.pgvo.shoe_brand }</c:if>
											<c:if test="${pgn.pgvo.shoe_category ne null}">&shoe_category=${pgn.pgvo.shoe_category }</c:if>
											<c:if test="${pgn.pgvo.shoe_size ne null}">&shoe_size=${pgn.pgvo.shoe_size }</c:if>
											<c:if test="${pgn.pgvo.keyword ne null}">&keyword=${pgn.pgvo.keyword}</c:if>">Next</a>
			</li>
		</c:if>
	</ul>
</div>

<script>
	console.log(${map});
</script>
<!-- Shop Section End -->

<jsp:include page="../commons/footer.jsp" />