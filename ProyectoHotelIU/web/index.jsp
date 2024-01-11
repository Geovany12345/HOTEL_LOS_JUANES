

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>HOTEL LOS JUANES</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/fontawesome.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><img src="imgs/Logo.png" alt="#" /></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-links" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse text-capitalize" id="nav-links">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#home">INICIO <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#about">QUIENES SOMOS</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#service">SERVICIOS</a>
                        </li>
                      
                        <li class="nav-item">
                            <a class="nav-link" href="#contact">CONTACTOS</a>
                        </li>
                   
                        <li class="nav-item search">
                            <a class="nav-link search-link" href=""><i class="fas fa-search"></i></a>
                            <form>
                                <input type="search">
                            </form>
                        </li>
                        
                    </ul>
                         <li class="nav-item" style="margin-left: 30px;">
                          
                            <button class="btn btn-primary" onclick="location.href='IniciarSecion.jsp'" style="cursor:  pointer;">INICIAR SESIÓN</button>
                        </li>
                </div>
            </div>
        </nav>
        <img src="imgs/fondo.jpg" height="100%" width="100%">
        <header id="home" >
            
                
          <div id="slideToNext" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
              
                <img src="imgs/header.jpg" class="d-block w-100">
              </div>
              <div class="carousel-item">
                <img src="imgs/header1.jpg" class="d-block w-100">
              </div>
              <div class="carousel-item">
                <img src="imgs/header2.jpg" class="d-block w-100">
              </div>
            </div>
           
          </div>
     </header>
        
        <div class="about" id="about">
            <div class="row">
                <div class="col-lg-6 col-12">
                    <div class="img"><img src="imgs/header.jpg"></div>
                </div>
                <div class="col-lg-6 col-12 text-right">
                    <div class="about-child">
                        <h2 class="text-uppercase">Quienes somos</h2>
                        <p>El hotel esta ubicado en el cantón PERDERNALES-ECUADOR</p>
                        <p>Es uno de los mejores lugares del cantón donde se pfrece los mejroes servicios en cuanto a las habitaciones, piscina, eventos con los mejores precios. </p>
                        
                    </div>
                </div>
            </div>
        </div>
        
        <div class="services" id="service">
            <div class="container"><h2 class="text-capitalize">SERVICIOS</h2></div>
            <div class="services-child">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-4 col-md-6 col-12">
                            <div>
                                <img src="imgs/header2.jpg">
                                <a href="#"><h4>Habitaciones</h4></a>
                                <p>Se brindan habitaciones simples, dobles y suits para satisfacer las necesidades de cada cliente.</p>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6 col-12">
                            <div>
                                <img src="imgs/header1.jpg">
                                <a href="#"><h4>Restaurant</h4></a>
                                <p>Se cuenra con diversidad de comida tanto nacional como extranjera, servio de bar, entre otros.</p>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-6 col-12">
                            <div>
                                <img src="imgs/piscina.jpg">
                                <a href="#"><h4>Piscina y más</h4></a>
                                <p>Se brinda serviiso de piscina, jacuzi, area recreativa, entre otros</p>
                            </div>
                        </div>
                    </div>
                
                </div>
            </div>
        </div>
        
        
        
        <div class="contact" id="contact">
            <div class="container"><h2 class="text-capitalize">Contáctanos</h2></div>
            <div class="contact-child">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 col-12">
                            <div class="contact-form">
                                <form>
                                    <input type="text" placeholder="NOMBRE Y APELLIDO">
                                    <input type="text" placeholder="TELÈFONO">
                                    <input type="email" placeholder="EMAIL">
                                    <textarea placeholder="TEXTO"></textarea>
                                    <input type="submit" value="ENVIAR" class="text-uppercase">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        
        
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-12">
                        <a href="index.html" class="logo"></a>
                    </div>
                    <div class="col-lg-9 col-12">
                        <div class="row">
                            <div class="col-md-4 col-12">
                                <i class="fas fa-map-marker-alt fa-2x"></i>
                                <span>Pedernales, Ecuador </span>
                            </div>
                            <div class="col-md-4 col-12">
                                <i class="fas fa-phone fa-2x"></i>
                                <span>+593993816446</span>
                            </div>
                           
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Información General</h4>
                            <p>El hotel Los Juanes esta ubicado en la ciudad de Pedernales, este brinda el servio de hospedaje segun la necesidad de cada cliente.</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Menu</h4>
                            <ul class='text-capitalize main-list'>
                                <li><a href="#home">Inicio</a></li>
                                <li><a href="#about">Quienes Somos</a></li>
                                <li><a href="#service">Servicios</a></li>
                        
                                <li><a href="#contact">Contactos</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Metas</h4>
                            <ul class="text-capitalize">
                                <li><a href="#">Cliente Satisfecho</a></li>
                                <li><a href="#">Disfrutar momentos increibles</a></li>
                      
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Acerca del Hotel</h4>
                            <form>
                                <input type="text" placeholder="Email">
                                <input type="submit" value="Subscribete">
                            </form>
                        </div>
                    </div>
                </div>
                <ul class="social-media">
                    <li><a href="#"><i class="fab fa-facebook-square fa-2x"></i></a></li>
                    <li><a href="#"><i class="fab fa-twitter-square fa-2x"></i></a></li>
                    <li><a href="#"><i class="fab fa-google-plus-square fa-2x"></i></a></li>
                    <li><a href="#"><i class="fab fa-linkedin fa-2x"></i></a></li>
                </ul>
               
            </div>
        </footer>    
        
        
            
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script>
            $(function () {
                
                'use strict';
                
                var winH = $(window).height();
                
                $('header, .slide').height(winH);
                
                $('.navbar a.search-link').on('click', function () {
                    $(this).siblings('form').fadeToggle();
                });
                
                $('.navbar ul.navbar-nav li a, footer ul.main-list li a').on('click', function (e) {
                    
                    var getAttr = $(this).attr('href');
                    
                    e.preventDefault();
                    $('html').animate({scrollTop: $(getAttr).offset().top}, 1000);
                });
            });
        </script>
    </body>
</html>
