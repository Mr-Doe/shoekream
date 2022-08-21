<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../commons/header.jsp" />
<jsp:include page="../commons/sidebar.jsp" />

<style>
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

<div class="col-lg-9 search_result_item" id="printZone"></div>

<script src="../../resources/js/product/list.js"></script>
<script>
  // spreadList();
  
  /**
   * Author : Mr.Doe
   **/
  setTimeout(function() {
    document.querySelector('.force_click').click();
  }, 300);
</script>

<jsp:include page="../commons/footer.jsp" />