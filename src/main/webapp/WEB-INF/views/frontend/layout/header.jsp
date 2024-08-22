<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<header class="header">
            <div class="header__top">
                <div class="container">
                    <p class="header__top-title">
                        Welcome To our shop !
                    </p>
                </div>
            </div>
            <div class="header__bottom">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-md-4 col-6">
                            <div class="header__bottom-logo">
                                <a href="#"><img src="${classpath}/frontend/img/logo.jpg" alt="áº¢nh logo" class="logo"></a>
                            </div>
                        </div>
                        <div class="col-lg-6 block none">
                            <div class="header__bottom-menu">
                                <ul>
                                    <li class="header__bottom-menu-children"><a href="${classpath}/frontend/index.html">Trang chá»§</a></li>
                                    <li class="header__bottom-menu-children">
                                        <a href="${classpath}/frontend/danhmuc.html">ThÃº cÆ°ng</a>
                                        <ul class="mega__subnav">
                                            <li class="mega__subnav-menu">
                                                <h4 class="mega__menu-title">ChÃ³</h4>
                                                <ul class="mega__subnav-menu-2">
                                                    <li><a href="${classpath}/frontend/danhmuc.html">ChÃ³ Corgi</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">ChÃ³ Beagle</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">ChÃ³ Alaska Malamute</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">ChÃ³ Golden Retriever</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">ChÃ³ Husky Siberian</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">ChÃ³ Phá»c SÃ³c â Pomeranian</a></li>
                                                </ul>
                                            </li>
                                            <li class="mega__subnav-menu">
                                                <h4 class="mega__menu-title">MÃ¨o</h4>
                                                <ul class="mega__subnav-menu-2">
                                                    <li><a href="${classpath}/frontend/danhmuc.html">MÃ¨o Anh (DÃ i + Ngáº¯n)</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">MÃ¨o ChÃ¢n Ngáº¯n</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">MÃ¨o Tai Cá»¥p</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">MÃ¨o XiÃªm</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">MÃ¨o Ba TÆ°</a></li>
                                                    <li><a href="${classpath}/frontend/danhmuc.html">MÃ¨o Chinchilla</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="header__bottom-menu-children"><a href="#">Phá»¥ kiá»n</a></li>
                                    <li class="header__bottom-menu-children">
                                        <a href="#">Dá»ch vá»¥</a>
                                        <ul class="subnav">
                                            <li><a href="#">Spa</a></li>
                                            <li><a href="#">ChÄm sÃ³c thÃº cÆ°ng</a></li>
                                        </ul>
                                    </li>
                                    <li class="header__bottom-menu-children"><a href="${classpath}/frontend/lienhe.html">LiÃªn há»</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-8 col-6">
                            <div class="header__bottom-actions">
                                <div class=" header__bottom-btn header__bottom-search">
                                    <a href="#"><i class='bx bx-search'></i></a>
                                    <div class="header__box">
                                        <div class="header__bottom-box-search">
                                            <input type="text" placeholder="TÃ¬m kiáº¿m..." class="header__search-input">
                                            <div class="header__search-btn">
                                                <i class='bx bx-search'></i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class=" header__bottom-btn header__bottom-user">
                                    <a href="${classpath}/frontend/pages/login/login.html"><i class='bx bx-user'></i></a>
                                </div>
                                <div class=" header__bottom-btn header__bottom-cart">
                                    <a href="#"><i class='bx bx-cart'></i></a>
                                    <span class="header__bottom-num">3</span>
                                    <div class="header__box-cart">
                                        <div class="header__bottom-box-cart">
                                            <div class="header__cart-products">
                                                <div class="cart-product-inner">
                                                    <div class="cart-product__main">
                                                        <div class="cart-product__thumb">
                                                            <img src="${classpath}/frontend/img/products/3.jpg" class="cart-product-img">
                                                        </div>
                                                        <div class="cart-product__content">
                                                            <a href="${classpath}/frontend/sanpham.html">
                                                                <p class="cart-product__content-title">POODLE NÃU Äá»
                                                                    ÄÃNG YÃU
                                                                </p>
                                                            </a>
                                                            <p class="cart-product__content-quantity">Sá» lÆ°á»£ng: 1</p>
                                                        </div>
                                                    </div>
                                                    <div class="cart-product__close">
                                                        <i class='bx bx-x'></i>
                                                    </div>
                                                </div>
                                                <div class="cart-product-inner">
                                                    <div class="cart-product__main">
                                                        <div class="cart-product__thumb">
                                                            <img src="${classpath}/frontend/img/products/1.jpg" class="cart-product-img">
                                                        </div>
                                                        <div class="cart-product__content">
                                                            <a href="${classpath}/frontend/sanpham.html">
                                                                <p class="cart-product__content-title">MÃO TAI Cá»¤P CÆ¯NG
                                                                    CÆ¯NG
                                                                </p>
                                                            </a>
                                                            <p class="cart-product__content-quantity">Sá» lÆ°á»£ng: 1</p>
                                                        </div>
                                                    </div>
                                                    <div class="cart-product__close">
                                                        <i class='bx bx-x'></i>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="header__cart-product-buy">
                                                <a href="#" class="buy-product">Mua hÃ ng</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="header__bottom-btn header__bottom-mobilemenu">
                                    <i class='bx bx-menu'></i>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header__slider">
                <div class="swiper mySwiper ">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${classpath}/frontend/img/slider-1.jpg" alt="" class="header__slider-img">
                        </div>
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${classpath}/frontend/img/slider-2.jpg" alt="" class="header__slider-img">
                        </div>
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${classpath}/frontend/img/slider-3.jpg" alt="" class="header__slider-img">
                        </div>
                        <div class="swiper-slide .header__slider-imgs">
                            <img src="${classpath}/frontend/img/slider-4.jpg" alt="" class="header__slider-img">
                        </div>
                    </div>
                    <div class="swiper-button-next next"></div>
                    <div class="swiper-button-prev prev"></div>
                </div>
            </div>
        </header>