<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- 2022.08.20 Author : Mr.Doe -->

<jsp:include page="../commons/header.jsp" />
<jsp:include page="../member/mypagesidebar.jsp" />

<link rel="stylesheet" href="/resources/dist-kream/04557ba.css">
<link rel="stylesheet" href="/resources/dist-kream/cc91108.css">
<link rel="stylesheet" href="/resources/dist-kream/2a936fa.css">

<div data-v-5f779880="" data-v-3d7f7af7="" class="content_area">

    <div class="content" data-v-f31ad0b8="" style="padding-bottom: 0;">
        <div class="social_user_area" data-v-4e96b3b6="" data-v-f31ad0b8="">
            <div class="user_top" data-v-4e96b3b6="">
                <div class="profile_img_box" data-v-4e96b3b6="">
                    <img src="/resources/dist-temp/img/logo.png" alt="KREAM 프로필 이미지" class="profile_img" data-v-4e96b3b6="">
                </div>
            </div>

            <div class="user_explain" data-v-4e96b3b6="">
                <p class="main_txt" data-v-4e96b3b6="">${ses.email}</p>
                <p><button data-v-3d1bcc82="" data-v-45fa91b1="" type="button" class="btn outline small" data-toggle="modal" data-target="#myModal"> 사진 공유 </button></p>
            </div>
        </div>
        <div class="social_tab" data-v-fae239a8="" data-v-f31ad0b8="">
            <ul class="tab_list" data-v-fae239a8="">
                <li class="tab_item" data-v-fae239a8="">
                    <a href="#" class="tab_link" data-v-fae239a8="">
                        <span class="tab_menu" data-v-fae239a8="">Postring</span>
                        <span class="menu_count" data-v-fae239a8="" id="post-count">3</span>
                    </a>
                </li>
                <li class="tab_item" data-v-fae239a8="">
                    <a href="#" class="tab_link" data-v-fae239a8="">
                        <span class="tab_menu" data-v-fae239a8="">Following</span>
                        <span class="menu_count" data-v-fae239a8="">0</span>
                    </a>
                </li>
            </ul>
        </div>

        <div class="social_feeds" data-v-57a33098="" data-v-f31ad0b8="">
            <div class="modal fade" id="myModal" data-backdrop="static" data-keyboard="false">
                <div class="modal-dialog modal-xl modal-dialog-centered">
                  <div class="modal-content">
                  
                    <!-- Modal Header -->
                    <div class="modal-header">
                      <h4 class="modal-title">Searching Product</h4>
                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                    </div>
                    
                    <!-- Modal body -->
                    <div class="modal-body" style="height: 500px;">

                        <form action="/blog/post" enctype="multipart/form-data" method="POST">
                            
                            <div id="step1" style="display: block;">
                                <input type="file" name="files" id="fileUpload" hidden>
                                <button data-v-3d1bcc82="" data-v-45fa91b1="" type="button" class="btn outline small"> 사진 공유 </button>
                                <img src="" id="preview" style="height: 360px; display: none; margin-top: 20px;">
                            </div>

                            <div id="step2" style="display: none;">
                                <input type="text" id="item-id" name="itemId" hidden>
                                <input type="text" id="item-image" name="itemImage" hidden>
                                <input type="text" id="item-name" name="itemName" hidden>
                                <input type="text" name="ownEmail" value="${ses.email}" hidden>
                                <div class="checkout__input">
                                    <p>Put your keywords<span>*</span></p>
                                    <input type="text">
                                </div>
                                <div data-v-589881b0="" data-v-1f7c6d3f="" class="suggest_area" style="height: 360px;">
                                    <div data-v-2741e9de="" data-v-589881b0="" class="suggest_list lg" data-v-1f7c6d3f="">

                                    </div>
                                </div>
                            </div>

                            <div id="step3" style="display: none;">
                                <div class="content">
                                    <img id="copy-preview" style="height: 360px; display: block;">
                                    <div id="copy-item">

                                    </div>
                                </div>
                                <button type="submit" id="send" hidden></button>
                            </div>
                        </form>

                    </div>
                    
                    <!-- Modal footer -->
                    <div class="modal-footer justify-content-between" style="display: flex;">
                        <button class="site-btn" id="prev" disabled>Prev</button>
                        <button class="site-btn" id="next" disabled>Next</button>
                    </div>
                    <div class="modal-footer" style="display: none;">
                        <button class="btn btn-success" id="done">Complete!</button>
                    </div>
                    
                  </div>
                </div>
            </div>

            <button id="detail-button" data-toggle="modal" data-target="#detail-Modal" hidden></button>

            <div class="modal fade" id="detail-Modal" data-backdrop="static" data-keyboard="false">
                <div class="modal-dialog modal-xl modal-dialog-centered">
                    <div class="modal-content">
                  
                        <!-- Modal Header -->
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                            
                        <!-- Modal body -->
                        <div class="modal-body" style="height: 80vh;">

                        </div>
                    </div>
                </div>
            </div>

            <div data-v-57a33098="" transition-duration="0" item-selector=".item" gutter=".gutter_item" horizontal-order="true" class="masonry_posts" style="position: relative; height: 715px;">

            </div>
        </div>
    </div>

</div>

<script src="/resources/js/member/blog.js"></script>
<script>
    posting_img(session);
    getPostCount(session);
</script>

<jsp:include page="../commons/footer.jsp" />