<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title }</title>
    <jsp:include page="/WEB-INF/views/frontend/layout/css.jsp"></jsp:include>
    <jsp:include page="/WEB-INF/views/frontend/layout/js.jsp"></jsp:include>
</head>

<body>
    <div class="wrapper">
        <jsp:include page="/WEB-INF/views/frontend/layout/header.jsp"></jsp:include>
        <main class="main">
            <div class="main__products-hot">
                <div class="container">
                    <div class="main__products-title">
                        <p>Sáº£n pháº©m ná»i báº­t</p>
                    </div>
                    <div class="main__products-content">
                        <div class="row">
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/4.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="new">new</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/2.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/7.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- <div class="main__products-more">
                        <a href="#">Xem thÃªm</a>
                    </div> -->
                </div>
            </div>
            <!-- Sale -->
            <div class="main__products-sale">
                <div class="container">
                    <div class="row">
                        <div class="col-12 col-lg-6">
                            <a href="${classpath}/frontend/danhmuc.html" class="banner-sale">
                                <img src="${classpath}/frontend/img/oder-1.jpg" alt="">
                            </a>
                        </div>
                        <div class="col-12 col-lg-6 block none">
                            <a href="${classpath}/frontend/danhmuc.html" class="banner-sale">
                                <img src="${classpath}/frontend/img/oder-2.jpg" alt="">
                            </a>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Danh má»¥c sáº£n pháº©m -->
            <div class="main__products">
                <div class="container">
                    <div class="main__products-title">
                        <p>Danh sÃ¡ch sáº£n pháº©m</p>
                    </div>
                    <div class="main__products-content">
                        <div class="row">
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                            <span class="new">new</span>

                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/1.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-15%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/8.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/7.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/5.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/6.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/4.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                            <span class="new">new</span>

                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/4.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="new">new</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/2.jpeg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/7.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">ChÃ³ mÃ¨o</h5>
                                        </a>
                                        <span class="price">
                                            <span class="old">20.000.000Ä</span>
                                            <span class="new">15.000.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="main__products-more">
                        <a href="${classpath}/frontend/danhmuc.html">Xem thÃªm</a>
                    </div>
                </div>
            </div>
            <!-- Danh sÃ¡ch phá»¥ kiá»n -->
            <div class="main__accessory">
                <div class="container">
                    <div class="main__products-title">
                        <p>Danh sÃ¡ch phá»¥ kiá»n</p>
                    </div>
                    <div class="main__products-content">
                        <div class="row">
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/phukien/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <!-- <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span> -->
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">BÃ¡t sá»© hÃ¬nh trÃ¡i cÃ¢y</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/phukien/4.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="new">new</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">Ly gáº¥u dá» thÆ°Æ¡ng</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">100.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/phukien/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <!-- <span class="sale">-20%</span> -->
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">BÃ¡t sá»© hÃ¬nh trÃ¡i cÃ¢y</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-12 col-lg-3 col-md-6">
                                <div class="product">
                                    <div class="thumb">
                                        <a href="${classpath}/frontend/sanpham.html" class="image">
                                            <img src="${classpath}/frontend/img/products/phukien/1.jpg" class="fit-img zoom-img">
                                        </a>
                                        <span class="badges">
                                            <span class="sale">-20%</span>
                                        </span>
                                    </div>
                                    <div class="content">
                                        <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                            <h5 class="title">BÃ¡t sá»© hÃ¬nh trÃ¡i cÃ¢y</h5>
                                        </a>
                                        <span class="price">
                                            <!-- <span class="old">20.000.000Ä</span> -->
                                            <span class="new">15.000Ä</span>
                                        </span>
                                        <span class="symbol">
                                            <a href="#"><i class='bx bx-heart'></i></a>
                                            <a href="#"><i class='bx bx-cart'></i></a>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="main__products-more">
                        <a href="#">Xem thÃªm</a>
                    </div>
                </div>
            </div>
            <!-- Tin tá»©c -->
            <div class="main__news">
                <div class="container">
                    <div class="row">
                        <div class="main__products-title">
                            <p>Blog</p>
                        </div>
                        <div class="col-12 col-lg-4 col-md-6">
                            <div class="product">
                                <div class="thumb">
                                    <a href="${classpath}/frontend/sanpham.html" class="image">
                                        <img src="${classpath}/frontend/img/products/1.jpeg" class="fit-img opacity-img">
                                    </a>
                                </div>
                                <div class="content">
                                    <div class="new__author">
                                        <p class="author">By <strong>Admin</strong> -
                                            18, Mar, 2023</p>
                                    </div>
                                    <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                        <h5 class="title">Tips for taking care of dogs</h5>
                                    </a>
                                    <div class="new__desc">
                                        <p class="desc">Lorem ipsum dolor sit, amet consectetur adipisicing elit.
                                            Deserunt, distinctio! Obcaecati quis praesentium fugiat corrupti at quidem
                                            cum doloribus eos. Sunt amet velit ducimus odit atque saepe harum vitae
                                            soluta.</p>
                                    </div>
                                    <div class="new__more">
                                        <a href="#"><span>More</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-lg-4 col-md-6">
                            <div class="product">
                                <div class="thumb">
                                    <a href="${classpath}/frontend/sanpham.html" class="image">
                                        <img src="${classpath}/frontend/img/products/2.jpg" class="fit-img opacity-img">
                                    </a>
                                </div>
                                <div class="content">
                                    <div class="new__author">
                                        <p class="author">By <strong>Admin</strong> -
                                            18, Mar, 2023</p>
                                    </div>
                                    <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                        <h5 class="title">Tips for taking care of dogs</h5>
                                    </a>
                                    <div class="new__desc">
                                        <p class="desc">Lorem ipsum dolor sit, amet consectetur adipisicing elit.
                                            Deserunt, distinctio! Obcaecati quis praesentium fugiat corrupti at quidem
                                            cum doloribus eos. Sunt amet velit ducimus odit atque saepe harum vitae
                                            soluta.</p>
                                    </div>
                                    <div class="new__more">
                                        <a href="#"><span>More</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-lg-4 col-md-6">
                            <div class="product">
                                <div class="thumb">
                                    <a href="${classpath}/frontend/sanpham.html" class="image">
                                        <img src="${classpath}/frontend/img/products/6.jpeg" class="fit-img opacity-img">
                                    </a>
                                </div>
                                <div class="content">
                                    <div class="new__author">
                                        <p class="author">By <strong>Admin</strong> -
                                            18, Mar, 2023</p>
                                    </div>
                                    <a href="${classpath}/frontend/sanpham.html" class="content-link">
                                        <h5 class="title">Tips for taking care of dogs</h5>
                                    </a>
                                    <div class="new__desc">
                                        <p class="desc">Lorem ipsum dolor sit, amet consectetur adipisicing elit.
                                            Deserunt, distinctio! Obcaecati quis praesentium fugiat corrupti at quidem
                                            cum doloribus eos. Sunt amet velit ducimus odit atque saepe harum vitae
                                            soluta.</p>
                                    </div>
                                    <div class="new__more">
                                        <a href="#"><span>More</span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- main bottom -->
            <div class="main__bottom">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-4 none block">
                            <div class="main__bottom-wrap">
                                <div class="wrap__icon"><i class='bx bxs-truck'></i></div>
                                <div class="wrap__content">
                                    <h4 class="title">FREE SHIPPING</h4>
                                    <p>Free shipping on all order</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 none block">
                            <div class="main__bottom-wrap">
                                <div class="wrap__icon"><i class='bx bx-headphone'></i></div>
                                <div class="wrap__content">
                                    <h4 class="title">ONLINE SUPPORT</h4>
                                    <p>Online live support 24/7</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 none block">
                            <div class="main__bottom-wrap">
                                <div class="wrap__icon"><i class='bx bx-bar-chart-alt'></i></div>
                                <div class="wrap__content">
                                    <h4 class="title">MONEY RETURN</h4>
                                    <p>Back guarantee under 5 days</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        
       <jsp:include page="/WEB-INF/views/frontend/layout/footer.jsp"></jsp:include>
        <div class="scroll__top">
        
            <i class='bx bx-up-arrow-alt'></i>
        </div>

        <!-- mobile menu -->
        
    </div>
    

   <jsp:include page="/WEB-INF/views/frontend/layout/js.jsp"></jsp:include>
</body>

</html>