<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../commons/header.jsp" />

<div class="container login" data-v-4ec1fe02="" data-v-3007c576="">
	<div tabindex="0" class="wrap win_os lg" data-v-3007c576="">
		<!---->
		<div data-v-30ee943a="" data-v-3007c576="" class="container join">
			<form data-v-30ee943a="" class="content lg" action="/product/register" method="post" enctype="multipart/form-data">
				<div data-v-30ee943a="" class="join_area" style="width: 400px; margin: 0 auto;">
					<h2 data-v-30ee943a="" class="join_title">product register</h2>
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">English Name</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="text" name="eName" id="eName" placeholder="englishName" autocomplete="off" class="input_txt" required>
						</div>
						<p data-v-30ee943a="" data-v-0e527ea4="" class="input_error"></p>
					</div>
					
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Korean Name</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="text" name="kName" id="kName" placeholder="koreanName" autocomplete="off" class="input_txt" required>
						</div>
					</div>
					<div data-v-0e527ea4="" data-v-30ee943a="" class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Model Number</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="text" name="model" id="model" placeholder="model" autocomplete="off" class="input_txt" required>
						</div>
					</div>
					<div data-v-0e527ea4="" data-v-30ee943a=""
						class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Brand</h3>
						<div class="container">
  
					</div>
					<div data-v-0e527ea4="" data-v-30ee943a=""
						class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">category</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="text" name="category" id="category" placeholder="category" autocomplete="off" class="input_txt" required>
						</div>
					</div>
					<div data-v-0e527ea4="" data-v-30ee943a=""
						class="input_box has_button">
						<h3 data-v-30ee943a="" data-v-0e527ea4="" class="input_title ess">Price</h3>
						<div data-v-0e527ea4="" class="input_item">
							<input data-v-0e527ea4="" type="int" name="price" id="price" placeholder="price" autocomplete="off" class="input_txt" required>
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
				<div>
					<c:forEach var="brand" items="${FilterDTO.objectList1 }">
						<h6>${brand.brandId} -- ${brand.brandName }</h1>
					</c:forEach>
					<c:forEach var="category" items="${FilterDTO.objectList2}">
						<h6>${category.categoryName}</h6>
					</c:forEach>
				</div>
			</form>
			
			
		</div>
	</div>
</div>

<div class="container mt-3">
  <h2>Dropdowns</h2>
  <p>The .dropdown class is used to indicate a dropdown menu.</p>
  <p>Use the .dropdown-menu class to actually build the dropdown menu.</p>
  <p>To open the dropdown menu, use a button or a link with a class of .dropdown-toggle and data-toggle="dropdown".</p>                                          
  <div class="dropdown">
    <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
      Dropdown button
    </button>
    <ul class="dropdown-menu">
      <li><a class="dropdown-item" href="#">Link 1</a></li>
      <li><a class="dropdown-item" href="#">Link 2</a></li>
      <li><a class="dropdown-item" href="#">Link 3</a></li>
    </ul>
  </div>
</div>


<jsp:include page="../commons/footer.jsp" />
