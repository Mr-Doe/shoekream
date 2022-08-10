<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<jsp:include page="../commons/header.jsp" />



<div class="container mt-3">
  <h2>Product Register</h2>
  <form action="/product/register" method="post">
    <div class="mb-3 mt-3">
      <label for="category">e_name :</label>
      	<input type="text" class="form-control" id="category" name="eName">
    </div>
    <div class="mb-3">
      <label for="pname">k_name :</label>
      <input type="text" class="form-control" id="pname" name="kName">
    </div>    
    <div class="mb-3">
      <label for="price">model :</label>
      <input type="text" class="form-control" id="price" name="price">
    </div>    
    <div class="mb-3">
      <label for="writer">category :</label>
      <input type="number" class="form-control" id="Writer" name="category">
    </div>
    <div class="mb-3">
      <label for="writer">brand :</label>
      <input type="number" class="form-control" id="Writer" name="brand">
    </div>
    <div class="mb-3">
      <label for="writer">price :</label>
      <input type="number" class="form-control" id="Writer" name="th_img">
    </div>
    <div class="mb-3">
      <label for="writer">th_img :</label>
      <input type="text" class="form-control" id="Writer" name="th_img">
    </div>
    
<!--     <div class="mb-3">
      <label for="attach">File Attach:</label>
      <input type="file" class="form-control" style="display: none;"
       id="files" name="fileAttached" multiple>
      <div class="d-grid">
      <button type="button" id="attachTrigger"
       class="btn btn-outline-primary btn-block d-block">Attach Files</button>
      </div>
      <div class="my-3" id="fileZone"></div> 
    </div> -->
    <button type="submit" class="btn btn-primary" id="regBtn">Submit</button>
  </form>
</div>



<jsp:include page="../commons/footer.jsp" />