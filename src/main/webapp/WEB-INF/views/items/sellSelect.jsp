<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <jsp:include page="../../commons/header.jsp" /> --%>
<style>
.product_info{
 border-bottom: solid;
 border-color: rgb(244, 244, 244);
 padding-bottom: 19;
}
.sell_before{
 border: 2px solid rgb(244, 244, 244); 
 padding: 32 32 28;
}
.select_list{
margin: auto;
}
</style>
<div data-v-30b23d22="" data-v-7ffb34f7="" class="container sell md">
	<div data-v-30b23d22="" class="content_area">
		<div class="container pt-3 pb-3 text-center">
			<h3>판매하기</h3>
		</div>
		<div data-v-30b23d22="" class="sell_before">
			<div data-v-30b23d22="" class="sell_before_check">
				<div data-v-299f50cf="" data-v-30b23d22="" id="imgbox" class="product_info">
					<div data-v-299f50cf="" class="product_thumb">
						<div data-v-75e33658="" data-v-299f50cf="" class="product"
							style="background-color: rgb(244, 244, 244);">
							<picture data-v-548c90f9="" data-v-75e33658=""
								class="picture product_img">
							<source data-v-548c90f9="" type="image/webp"
								srcset="">
							<source data-v-548c90f9=""
								srcset="">
							<img data-v-548c90f9="" alt="상품 이미지"
								src=""
								class="image"></picture>
						</div>
					</div>
					<div data-v-299f50cf="" class="product_detail">
						<p data-v-299f50cf="" class="code">${product.model }</p>
						<p data-v-299f50cf="" class="name">${product.eName }</p>
						<p data-v-299f50cf="" class="translated_name">${product.kName }</p>
					</div>
				</div>
				<div data-v-30b23d22="" class="sell_before_select">
					<div data-v-02c63ee6="" data-v-30b23d22="" class="select_area md">
						<!---->
						<ul data-v-02c63ee6="" class="select_list">
							<c:forEach items="sizeVO" var="size">
							<li data-v-02c63ee6="" class="select_item"><button
									data-v-02c63ee6="" role="button" aria-selected="false"
									class="select_link sell bid">
									<div data-v-02c63ee6="" class="link_inner">
										<span data-v-02c63ee6="" class="size"> 
										${size.sizeValue }
										</span>
										<span data-v-02c63ee6="" class="price">
										<c:if test="${items.price ne null || items.price ne ''}">
										${items.price }
										</c:if>
										<c:if test="${items.price eq null || items.price eq ''}">
										판매입찰
										</c:if>
										</span>
									</div>
								</button></li>
							</c:forEach>
						</ul>
					</div>
					<div data-v-744cecc2="" data-v-30b23d22="" class="order_btn_area">
						<a data-v-57f23419="" data-v-744cecc2="" href="#"
							class="btn_order order_sell sell clickable">
							<div data-v-57f23419="" class="box">
								<div data-v-57f23419="" class="order_case_info">
									<span data-v-57f23419="" class="order_price">510,000</span>
									<span data-v-57f23419="" class="order_desc">선불발송</span>
								</div>
							</div>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!---->
</div>
<input type="hidden" id="sizeValue">
<input type="hidden" id="pnoValue">

<%-- <jsp:include page="../../commons/footer.jsp" /> --%>