<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../commons/header_product.jsp" />

<div class="container login" data-v-4ec1fe02="" data-v-3007c576="">
	<div tabindex="0" class="wrap win_os lg" data-v-3007c576="">
		
		<div data-v-30ee943a="" data-v-3007c576="" class="container join">
			<form data-v-30ee943a="" class="content lg" action="/product/register" method="post" enctype="multipart/form-data">
				<input type="hidden" name="brand" value="">
				<input type="hidden" name="category" value="">
				<div data-v-30ee943a="" class="join_area" style="width: 400px; margin: 0 auto;">
					<h2 data-v-30ee943a="" class="join_title">관리자 상품 수정 페이지</h2>
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">English Name</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="text" name="eName" id="eName" placeholder="englishName" value="${productDTO.productVO.eName}"autocomplete="off" class="input_txt" required>
						</div>
						<p data-v-30ee943a="" data-v-0e527ea4="" class="input_error"></p>
					</div>
					
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Korean Name</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="text" name="kName" id="kName" placeholder="koreanName" value="${productDTO.productVO.kName }" autocomplete="off" class="input_txt" required>
						</div>
					</div>
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Model Number</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="text" name="model" id="model" value="${productDTO.productVO.model }" placeholder="model" autocomplete="off" class="input_txt" required>
						</div>
					</div>
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Brand</h3>
						<select id="selectBrand">
							<c:forEach var="brand" items="${FilterDTO.objectList1}">
								<option value="${brand.brandId}">${brand.brandId} - ${brand.brandName}</option>
							</c:forEach>
						</select>
    				</div>
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">category</h3>
						<select id="selectCategory">
							<c:forEach var="category" items="${FilterDTO.objectList2}">
								<option value="${category.categoryId}">${category.categoryId} - ${category.categoryName}</option>
							</c:forEach>
						</select>
					</div>
					<div data-v-0e527ea4="" data-v-30ee943a=""
						class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Retail Price</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="number" name="retailPrice" value="${productDTO.productVO.retailPrice}" id="price" placeholder="price" autocomplete="off" class="input_txt" required>
						</div>
					</div>
					<div class="mb-3">
    					<label for="attach">제품 사진 :</label>
 				    	<input type="file" class="form-control" style="display: none;" id="files" name="fileAttached" multiple required>
      					<div class="d-grid">
      						<button type="button" id="attachTrigger" class="btn btn-outline-primary btn-block d-block">사진등록</button>
      					</div>
      					<div class="my-3" id="fileZone"></div> 
    				</div>
					<button type="submit" data-v-3d1bcc82="" data-v-30ee943a="" id="registerBtn" class="btn_join full solid">등록하기</button>
				</div>
			</form>
		</div>
	</div>
</div>
<span id="grade" style="display: none;">${ses.grade}</span>

<script src="../../resources/js/product/adminlist.js"></script>
<script src="../../resources/js/product/register.js"></script>
<script>
	document.getElementById('attachTrigger').addEventListener('click', () => {
		document.getElementById('files').click();
	});
</script>
<jsp:include page="../commons/footer_product.jsp" />
