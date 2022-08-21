<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" href="/resources/dist-kream/04557ba.css">
<link rel="stylesheet" href="/resources/dist-kream/f80f1ca.css">
<link rel="stylesheet" href="/resources/dist-kream/405f48d.css">

<div data-v-d77b39ae="" data-v-2ab24454="" social="" class="container social lg" style="margin-top: 0px;">
    <div data-v-d77b39ae="" class="content" style="padding-bottom: 0;">
        <div data-v-b5f8fcbc="" data-v-d77b39ae="">

            <div data-v-15938e94="" data-v-b5f8fcbc="" id="p556237" class="social_post_detail">
                <div data-v-271ab2d7="" data-v-15938e94="" class="social_user_state">
                    <a data-v-271ab2d7="" href="#" class="user_state_box">
                        <div data-v-271ab2d7="" class="profile_img_box">
                            <!-- 프로필 이미지 -->
                            <img data-v-271ab2d7=""  src="" class="profile_img">
                        </div>
                        <div data-v-271ab2d7="" class="profile_info">
                            <p data-v-271ab2d7="" href="#" class="user_name">${bvo.ownEmail}</p>
                            <!-- <p data-v-271ab2d7="" class="upload_time">2일 전</p> -->
                        </div>
                        <button data-v-3d1bcc82="" data-v-7611bfce="" data-v-271ab2d7="" type="button" class="btn solid small btn_follow small"> 팔로우 </button>
                    </a>
                </div>
                <div data-v-ff5c1306="" data-v-15938e94="" class="social_image_box">
                    <div data-v-ff5c1306="" class="social_slide">
                        <div data-v-3d1a4f76="" data-v-ff5c1306="" dir="ltr" class="slick-slider slick-initialized">
                            <div data-v-3d1a4f76="" class="slick-list">
                                    
                                <div data-v-e4caeaf8="" tabindex="-1" data-index="0" aria-hidden="false" class="slick-slide slick-active slick-current" style="outline: none; width: 720px;">
                                    <div data-v-e4caeaf8="">
                                        <div data-v-ff5c1306="" data-v-e4caeaf8="" tabindex="-1" class="slide_content" style="width: 100%; display: inline-block;">
                                            <div data-v-ff5c1306="" data-v-e4caeaf8="" class="slide_item" style="border: 1px solid blue; margin: auto;">
                                                <div data-v-ff5c1306="" data-v-e4caeaf8="" class="img_box">
                                                    <!-- 포스팅 이미지 -->
                                                    <img data-v-ff5c1306="" data-v-e4caeaf8="" src="${bvo.blogImagePath}" class="social_img">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div data-v-91cee5a6="" data-v-15938e94="" class="social_product">
            <div data-v-91cee5a6="">
                <div data-v-91cee5a6="" class="product_title">
                    <span data-v-91cee5a6="" class="title_txt">&nbsp;</span>
                    
                </div>
            </div>
            <div data-v-91cee5a6="" class="product_list_area single_list">
                <ul data-v-91cee5a6="" class="product_list" style="transform: translateX(0px);">
                    <li data-v-91cee5a6="" class="product_item">
                        <!-- 프로덕트 아이디 -->
                        <a data-v-91cee5a6="" href="/items/detail?pno=${bvo.itemId}" class="product_link">
                            <div data-v-75e33658="" data-v-91cee5a6="" class="product" style="background-color: rgb(235, 240, 245);">
                                <picture data-v-548c90f9="" data-v-75e33658="" class="picture product_img">
                                    <!-- 프로덕트 이미지 -->
                                    <img data-v-548c90f9=""  src="${bvo.itemImage}" class="image" style="height: 128px;">
                                </picture>
                            </div>
                            <div data-v-91cee5a6="" class="product_desc">
                                <!-- 프로덕트 이름 -->
                                <p data-v-91cee5a6="" class="product_name">${bvo.itemName}</p>
                                <div data-v-91cee5a6="" class="price_box">
                                    <!-- 프로덕트 가격 -->
                                    <span data-v-91cee5a6="" class="amount">${bvo.minPrice}</span>
                                    <span data-v-91cee5a6="" class="unit">원</span>
                                </div>
                            </div>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div data-v-6d810e86="" data-v-15938e94="" class="social_contents">
            <div data-v-66774c6c="" data-v-6d810e86="" class="social_btn">
                <div data-v-66774c6c="" class="btn_bind">
                    <a data-v-66774c6c="" href="#" aria-label="좋아요" class="btn like">
                        <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-chat-heart" viewBox="0 0 16 16">
                            <path fill-rule="evenodd" d="M2.965 12.695a1 1 0 0 0-.287-.801C1.618 10.83 1 9.468 1 8c0-3.192 3.004-6 7-6s7 2.808 7 6c0 3.193-3.004 6-7 6a8.06 8.06 0 0 1-2.088-.272 1 1 0 0 0-.711.074c-.387.196-1.24.57-2.634.893a10.97 10.97 0 0 0 .398-2Zm-.8 3.108.02-.004c1.83-.363 2.948-.842 3.468-1.105A9.06 9.06 0 0 0 8 15c4.418 0 8-3.134 8-7s-3.582-7-8-7-8 3.134-8 7c0 1.76.743 3.37 1.97 4.6a10.437 10.437 0 0 1-.524 2.318l-.003.011a10.722 10.722 0 0 1-.244.637c-.079.186.074.394.273.362a21.673 21.673 0 0 0 .693-.125ZM8 5.993c1.664-1.711 5.825 1.283 0 5.132-5.825-3.85-1.664-6.843 0-5.132Z"/>
                        </svg>
                        <span data-v-0066c9b3="" class="like_count">${bvo.likesCount}</span>
                    </a>
                    <a data-v-66774c6c="" href="#" aria-label="댓글" class="btn comment">
                        <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-chat-square-dots" viewBox="0 0 16 16">
                            <path d="M14 1a1 1 0 0 1 1 1v8a1 1 0 0 1-1 1h-2.5a2 2 0 0 0-1.6.8L8 14.333 6.1 11.8a2 2 0 0 0-1.6-.8H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v8a2 2 0 0 0 2 2h2.5a1 1 0 0 1 .8.4l1.9 2.533a1 1 0 0 0 1.6 0l1.9-2.533a1 1 0 0 1 .8-.4H14a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"/>
                            <path d="M5 6a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"/>
                        </svg>
                        <span data-v-0066c9b3="" class="cmt_count">${bvo.commentsCount}</span>
                    </a>
                </div>

            </div>
        </div>
    </div>
</div>
