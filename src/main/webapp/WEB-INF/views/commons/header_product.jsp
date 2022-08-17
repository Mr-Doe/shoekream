<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <title>ShoeKream</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="/resources/dist-temp/css/bootstrap.min.css" type="text/css" />
        <link rel="stylesheet" href="/resources/dist-temp/css/font-awesome.min.css" type="text/css" />
        <link rel="stylesheet" href="/resources/dist-temp/css/elegant-icons.css" type="text/css" />
        <link rel="stylesheet" href="/resources/dist-temp/css/magnific-popup.css" type="text/css" />
        <link rel="stylesheet" href="/resources/dist-temp/css/owl.carousel.min.css" type="text/css" />
        <link rel="stylesheet" href="/resources/dist-temp/css/slicknav.min.css" type="text/css" />
        <link rel="stylesheet" href="/resources/dist-temp/css/style.css" type="text/css" />

        <!-- 리스트 페이지 -->
        <link rel="stylesheet" href="/resources/dist-kream/921e499.css">
        <link rel="stylesheet" href="/resources/dist-kream/7588f4c.css">
        <link rel="stylesheet" href="/resources/dist-kream/468cd0d.css">

		<!-- 로그인 페이지 -->
		<link rel="stylesheet" href="/resources/dist-kream/0f788f7.css">

        <!-- 상세 페이지 -->
        <link rel="stylesheet" href="/resources/dist-kream/979f3ae.css">
        <link rel="stylesheet" href="/resources/dist-kream/d3a96a9.css">
        
        <!-- 판매&구매 내역 상세 페이지 -->
        <link rel="stylesheet" href="/resources/dist-kream/0c0bd8f.css">
        <link rel="stylesheet" href="/resources/dist-kream/d70e979.css">
        <link rel="stylesheet" href="/resources/dist-kream/d78f754.css">
        <link rel="stylesheet" href="/resources/dist-kream/4e21bd5.css">
        <link rel="stylesheet" href="/resources/dist-kream/d550008.css">


        <!-- 마이페이지 -->
        <link rel="stylesheet" href="/resources/dist-kream/fc8ba0e.css">
        <link rel="stylesheet" href="/resources/dist-kream/d1a5384.css">
        <link rel="stylesheet" href="/resources/dist-kream/862267a.css">
        <link rel="stylesheet" href="/resources/dist-kream/5691821.css">
        <link rel="stylesheet" href="/resources/dist-kream/1afe7d3.css">

        <!-- 리스트 + 상세 페이지 공통 -->
        <link rel="stylesheet" href="/resources/dist-kream/734fa9a.css">
        <link rel="stylesheet" href="/resources/dist-kream/a3c2917.css">
        <link rel="stylesheet" href="/resources/dist-kream/9c5ecb4.css">


        <!-- 상세 + 마이 페이지 공통 -->
        <link rel="stylesheet" href="/resources/dist-kream/efe06bc.css">


        <!-- 공통 -->
        <link rel="stylesheet" href="/resources/dist-kream/1381ce9.css">
        <link rel="stylesheet" href="/resources/dist-kream/ed926a7.css">
        <link rel="stylesheet" href="/resources/dist-kream/b50e50e.css">

		<!-- 아이템 -->
		<link rel="stylesheet" href="/resources/dist-kream/e907f22.css">
		<link rel="stylesheet" href="/resources/dist-kream/b676d9d.css">
		<link rel="stylesheet" href="/resources/dist-kream/55ae018.css">
		<link rel="stylesheet" href="/resources/dist-kream/19dbfc1.css">
		
		<!-- 프로덕트 등록 -->
  		  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Header Section Begin -->
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 col-md-7">
                        </div>
                        <div class="col-lg-6 col-md-5">
                            <div class="header__top__right">
                                <div class="header__top__links">
                                    <c:choose>
                                        <c:when test="${ses.email eq null }">
                                            <a href="/member/register">join</a>
                                            <a href="/member/login">log in</a>
                                        </c:when>
                                        <c:otherwise>
                                            <a href="/member/mypage?email=${ses.email }">my page</a>
                                            <a href="/member/logout">log out</a>
                                        </c:otherwise>
                                    </c:choose>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-3">
                        <div class="header__logo">
                            <a href="/product/listPage">
                                <img src="../../resources/dist-temp/img/logo.png" alt="">
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <nav class="header__menu mobile-menu" style="margin-top: 30px;">
                            <ul>
                                <li><a href="/product/listPage">Home</a></li>
                                <li class="active"><a href="/product/listPage">Shop</a></li>
                                <li><a href="">Blog</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="col-lg-3 col-md-3">
                        <div class="header__nav__option" style="margin-top: 30px;">
                            <button class="search-switch" id="search-button"><img src="../../resources/dist-temp/img/icon/search.png" alt=""></button>
                        </div>
                    </div>
                    <div id="display-modal" style="float: left; display: none;">
                        <jsp:include page="../search/modal.jsp" />
                    </div>
                </div>
            </div>
        </header>
        <!-- Header Section End -->

        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-option">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="breadcrumb__text">
                            <h4>Shop</h4>
                            <div class="breadcrumb__links">
                                <a href="/product/listPage">Home</a>
                                <span>Shop</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Breadcrumb Section End -->

<script src="../../../resources/js/commons/header.js"></script>
<script>
    show_page_path();
</script>