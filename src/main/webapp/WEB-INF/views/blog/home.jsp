<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="../commons/header.jsp" />

<link rel="stylesheet" href="/resources/dist-kream/5599975.css">
<link rel="stylesheet" href="/resources/dist-kream/455c647.css">
<link rel="stylesheet" href="/resources/dist-kream/6313f6c.css">


<style>
    .card_box {
        width: 279px;
        height: 520;
        padding: 32px 0px 0px;
    }
    .style_tab_list a:hover {
        color: black;
        font-weight: 900;
    }
</style>

<div data-v-1a4d0c2e="" data-v-7606896d="" class="social_feed_header" style="margin-top: 50px; margin-bottom: 30px;">
    <div data-v-1a4d0c2e="" class="content_title">
        <div data-v-0bd1a56f="" data-v-1a4d0c2e="" class="style_tab_list">
            <a data-v-0bd1a56f="" href="#" class="tab_item tab_on"> 인기 </a>
            <a data-v-0bd1a56f="" href="#" class="tab_item"> 최신 </a>
            <a data-v-0bd1a56f="" href="#" class="tab_item"> 팔로잉 </a>
        </div>
    </div>
</div>

<div data-v-7606896d="" class="content">
    <div data-v-57a33098="" data-v-7606896d="" class="social_feeds">
        <div data-v-57a33098="" transition-duration="0" item-selector=".item" gutter=".gutter_item" horizontal-order="true" class="masonry_posts" style="position: relative; height: 2300px;">

            <div data-v-0066c9b3="" data-v-57a33098="" class="feed_card item" style="position: absolute; left: 0px; top: 0px;">
                <a data-v-0066c9b3="" href="#">
                    <div data-v-0066c9b3="" class="card_box">
                        <div data-v-0066c9b3="" class="social_img_box vertical"><img data-v-0066c9b3=""
                                alt="소셜이미지" oncontextmenu="return false" ondragstart="return false" onselectstart="return false"
                                src="https://kream-phinf.pstatic.net/MjAyMjA4MTdfMTc0/MDAxNjYwNzIyMDk2MjE4.V8_cCO2XViWGw9oTgQ4vtPnvH9lWtyL9BEERuxZ4gaEg.qqpodVytIg4EsAmEIzL5SBZQt5r9t6Vs2hDFaFd9P30g.JPEG/p_40ea535e99c84d7b840c42a31db9afd9.jpeg?type=m" class="social_img">
                            </div>
                        <div data-v-0066c9b3="" class="card_detail">
                            <div data-v-0066c9b3="" class="user_box">
                                <img data-v-0066c9b3="" alt="사용자 프로필 이미지"
                                    src="https://kream-phinf.pstatic.net/MjAyMTEyMjhfMTc4/MDAxNjQwNjczODA2OTU1.aMv0TjwHmoCBVrhgIud2QpKtkC5nUwm1ykVlv4aE6eYg.4GHTWE-vFHxi4vyqPjAY8726AFZKG7XEtVGVlG24_jcg.JPEG/p_b6b89ccfc3e3426aa8a6e0098d584e48.jpeg?type=sl" class="img_profile">
                                <p data-v-0066c9b3="" class="user_name">z00___daa</p>
                            </div>
                            <div data-v-0066c9b3="" class="btn_box">
                                <a data-v-0066c9b3="" href="#" aria-label="좋아요" class="btn like">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-chat-heart" viewBox="0 0 16 16">
                                        <path fill-rule="evenodd" d="M2.965 12.695a1 1 0 0 0-.287-.801C1.618 10.83 1 9.468 1 8c0-3.192 3.004-6 7-6s7 2.808 7 6c0 3.193-3.004 6-7 6a8.06 8.06 0 0 1-2.088-.272 1 1 0 0 0-.711.074c-.387.196-1.24.57-2.634.893a10.97 10.97 0 0 0 .398-2Zm-.8 3.108.02-.004c1.83-.363 2.948-.842 3.468-1.105A9.06 9.06 0 0 0 8 15c4.418 0 8-3.134 8-7s-3.582-7-8-7-8 3.134-8 7c0 1.76.743 3.37 1.97 4.6a10.437 10.437 0 0 1-.524 2.318l-.003.011a10.722 10.722 0 0 1-.244.637c-.079.186.074.394.273.362a21.673 21.673 0 0 0 .693-.125ZM8 5.993c1.664-1.711 5.825 1.283 0 5.132-5.825-3.85-1.664-6.843 0-5.132Z"/>
                                    </svg>
                                    <span data-v-0066c9b3="" class="like_count">70</span>
                                </a>
                                <a data-v-0066c9b3="" href="#" aria-label="댓글" class="btn comment">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-chat-square-dots" viewBox="0 0 16 16">
                                        <path d="M14 1a1 1 0 0 1 1 1v8a1 1 0 0 1-1 1h-2.5a2 2 0 0 0-1.6.8L8 14.333 6.1 11.8a2 2 0 0 0-1.6-.8H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v8a2 2 0 0 0 2 2h2.5a1 1 0 0 1 .8.4l1.9 2.533a1 1 0 0 0 1.6 0l1.9-2.533a1 1 0 0 1 .8-.4H14a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"/>
                                        <path d="M5 6a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"/>
                                    </svg>
                                    <span data-v-0066c9b3="" class="comment_count">2</span>
                                </a>
                            </div>
                            <div data-v-0066c9b3="">
                                <ul data-v-0066c9b3="" class="product_list">
                                    <li data-v-0066c9b3="" class="product_item">
                                        <a data-v-0066c9b3="" href="/products/12831" class="product_link">
                                            <div data-v-75e33658="" data-v-0066c9b3="" class="product" style="background-color: rgb(235, 240, 245);">
                                                <picture data-v-548c90f9="" data-v-75e33658="" class="picture product_img">
                                                    <img data-v-548c90f9="" src="https://kream-phinf.pstatic.net/MjAyMjA2MTVfMjYw/MDAxNjU1MjgzNjk2Mzk3.gh8n5rs7p-pWVqzIhNh7yj_KdyjLFBeJr9QbsDumoFEg.KdvPfvgBYmjm7MKKhcbIEQIP6FGeuof_GnmcDUgrvyAg.PNG/a_baa1ccea3726495badba419dfede63f9.png?type=m" class="image">
                                                </picture>
                                            </div>
                                            <div data-v-0066c9b3="" class="product_desc">
                                                <p data-v-0066c9b3="" class="product_name">Nike Air Force 1 '07 Low White</p>
                                                <div data-v-0066c9b3="" class="price_box">
                                                    <span data-v-0066c9b3="" class="amount">125,000</span>
                                                    <span data-v-0066c9b3="" class="unit">원</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </a>
            </div>

        </div>
    </div>
</div>

<script src="/resources/js/blog/home.js"></script>
<script>
    feed_cards();
    which_memu();
</script>

<jsp:include page="../commons/footer.jsp" />