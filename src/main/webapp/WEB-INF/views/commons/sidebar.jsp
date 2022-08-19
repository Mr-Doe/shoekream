<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


    <!-- <link rel="stylesheet" href="../../../resources/dist-kream/921e499.css">
    <link rel="stylesheet" href="../../../resources/dist-kream/7588f4c.css">
    <link rel="stylesheet" href="../../../resources/dist-kream/468cd0d.css"> -->


    <!-- Shop Section Begin -->
    <section class="shop spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="shop__sidebar">
                        <div class="shop__sidebar__accordion">
                            <div class="accordion" id="accordionExample">

                                <div data-v-9c60e4ec="" data-v-75a99100="" class="filter_status" count="0">
                                    <div data-v-9c60e4ec="" class="status_box">
                                        <span data-v-9c60e4ec="" class="status_txt">필터</span>
                                        <span data-v-9c60e4ec="" class="status_num" style="display: none;">1</span>
                                    </div>
                                    <a data-v-9c60e4ec="" href="#" class="btn_delete" style="display: none;">모두 삭제</a>
                                </div>

                                <div class="card">
                                    <div class="card-heading">
                                        <a data-toggle="collapse" data-target="#collapseOne">Categories</a>
                                    </div>
                                    <div id="collapseOne" class="collapse show" style="height:130px;">
                                        <div class="card-body">
                                            <div class="shop__sidebar__categories">
                                                <ul class="nice-scroll" id="filter-category">
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-heading">
                                        <a data-toggle="collapse" data-target="#collapseTwo">Branding</a>
                                    </div>
                                    <div id="collapseTwo" class="collapse">
                                        <div class="card-body">
                                            <div class="shop__sidebar__brand" style="overflow-y: scroll; height:256px;">
                                                <ul id="filter-brand">
                                                    <li><a href="#">Louis Vuitton</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card">
                                    <div class="card-heading">
                                        <a data-toggle="collapse" data-target="#collapseFour">Size</a>
                                    </div>
                                    <div id="collapseFour" class="collapse">
                                        <div class="card-body">
                                            <div class="shop__sidebar__size" id="filter-size">
                                                <label><input type="radio">111</label>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div style="display: none;">
                                    <button class="force_click"></button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

<script src="../../../resources/js/commons/sidebar.js" ></script>
<script>
    getFilter_Category();
    getFilter_Brand();
    getFilter_Size();
</script>