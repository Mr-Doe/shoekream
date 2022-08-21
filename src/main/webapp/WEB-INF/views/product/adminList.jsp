<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<jsp:include page="../commons/header_product.jsp" />

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
.purchase_item[data-v-62dace61] {
	cursor: auto;
}
.pagination {
  display: inline-block;
}

.pagination a {
  color: black;
  float: left;
  padding: 8px 16px;
  text-decoration: none;
}

.pagination a.active {
  background-color: #4CAF50;
  color: white;
  border-radius: 5px;
}

.pagination a:hover:not(.active) {
  background-color: #ddd;
  border-radius: 5px;
}
</style>

<jsp:include page="../member/mypagesidebar.jsp" />

<div data-v-5f779880="" data-v-3d7f7af7="" class="content_area">
	<div data-v-5f779880="" class="my_home">
		<div data-v-6752ceb2="" data-v-5f779880="" class="my_home_title">
			<h3 data-v-6752ceb2="" class="title">관리자 페이지</h3>
		</div>
		<div data-v-5f779880="" class="recent_purchase">
			<div data-v-bbed98be="" data-v-5f779880=""
				class="purchase_list_tab sell">
				<div data-v-bbed98be="" class="tab_item total">
					<a data-v-bbed98be="" href="#" class="tab_link" style="pointer-events: none;">
						<dl data-v-bbed98be="" class="tab_box">
							<dt data-v-bbed98be="" class="title">전체</dt>
							<dd data-v-bbed98be="" class="count">${productDTO.totalCountPageHandler.totalCount}</dd>
						</dl>
					</a>
				</div>
				<div data-v-bbed98be="" class="tab_item tab_on">
					<a data-v-bbed98be="" href="#" class="tab_link" style="pointer-events: none;">
						<dl data-v-bbed98be="" class="tab_box">
							<dt data-v-bbed98be="" class="title">활성</dt>
							<dd data-v-bbed98be="" class="count">${productDTO.activateCountPageHandler.activateCount}</dd>
						</dl>
					</a>
				</div>
				<div data-v-bbed98be="" class="tab_item">
					<a data-v-bbed98be="" href="#" class="tab_link" style="pointer-events: none;">
						<dl data-v-bbed98be="" class="tab_box">
							<dt data-v-bbed98be="" class="title">비활성</dt>
							<dd data-v-bbed98be="" class="count">${productDTO.nonActivateCountPageHandler.nonActivateCount}</dd>
						</dl>
					</a>
				</div>
			</div>
			<div data-v-5f779880="">
				<!-- <div data-v-21d527e4="" data-v-5f779880=""
					class="purchase_list all ask"> -->
				<div data-v-21d527e4="" data-v-5f779880="" class="printZone" style="padding-top: 2em;">
					<!---->
					<!---->
					<!---->
					<!---->
					<c:choose>
						<c:when test="${productDTO.totalCountPageHandler.totalCount eq 0}">
							<div data-v-e2f6767a="" data-v-21d527e4="" class="empty_area">
								<p data-v-e2f6767a="" class="desc">등록된 제품이 없습니다.</p>
							</div>
						</c:when>
						<c:otherwise>
							<c:forEach items="${productDTO.productList}" var="productVO" varStatus="status">
								<div data-v-62dace61="" data-v-21d527e4="" class="purchase_item buy" onclick="window.location.href='/product/modify?pno=${productVO.pno}'" data-itemno="${productVO.pno}">
									<div data-v-62dace61="" class="history_product">
										<div data-v-62dace61="" class="product_box">
											<div data-v-75e33658="" data-v-62dace61="" class="product" style="background-color: rgb(235, 240, 245);">
												<picture data-v-548c90f9="" data-v-75e33658="" class="picture product_img">
													<img data-v-548c90f9="" alt="#" src="${productVO.imageUrl}" class="image"> </picture>
											</div>
										</div>
										<div data-v-62dace61="" class="product_detail">
											<p data-v-62dace61="" class="name">name : ${productVO.eName}</p>
											<p data-v-62dace61="" class="name">이름 : ${productVO.kName}</p>
											<p data-v-62dace61="" class="name">브랜드 : ${productVO.brandName}</p>
											<p data-v-62dace61="" class="name">카테고리 : ${productVO.categoryName}</p>
											<p data-v-62dace61="" class="size">
												<span data-v-62dace61="" class="size_text">활성화여부 : </span>
												<span style="color: ${productVO.activate == 'Y' ? 'GREEN' : 'RED'}">${productVO.activate == 'Y' ? '사용중' : '미사용'}</span>
											</p>
										</div>
									</div>
								</div>
							</c:forEach>
							<div class="pagination">
								<c:if test="${productDTO.totalCountPageHandler.prev eq true}">
									<a class="pageBtn" href="/product/adminList?pageNo=${productDTO.totalCountPageHandler.startPage -1}" data-pageno="${pageHandler.startPage-1}">&laquo;</a>
								</c:if>
								<c:forEach begin="${productDTO.totalCountPageHandler.startPage }" end="${productDTO.totalCountPageHandler.endPage }" var="i">
									<a class="pageBtn" href="/product/adminList?pageNo=${i }&qty=12" style="${productDTO.totalCountPageHandler.pgvo.pageNo == i ? 'background-color: rgb(235, 240, 245); border-radius: 5px;' : ''}" data-pageno="${i}">${i}</a>
								</c:forEach>				
								<c:if test="${productDTO.totalCountPageHandler.next eq true}">
									<a class="pageBtn" href="/product/adminList?pageNo=${productDTO.totalCountPageHandler.endPage +1}" data-pageno="${pageHandler.startPage-1}">&raquo;</a>
								</c:if>
							</div>
						</c:otherwise>
					</c:choose>
					<!---->
					<!---->
					<!---->
					<!---->
				</div>
			</div>
		</div>
	</div>
</div>
<span id="grade" style="display: none;">${ses.grade}</span>
<script src="../../resources/js/product/adminlist.js"></script>


<jsp:include page="../commons/footer_product.jsp" />