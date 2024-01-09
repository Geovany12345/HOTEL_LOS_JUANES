

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
    <body bgcolor="#C0C0C0">
            <center>
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container" style="margin-top: 20px;font-weight: 700;">
     
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-links" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse text-capitalize" id="nav-links">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.jsp">INICIO <span class="sr-only">(current)</span></a>
                        </li>
                        
                        
                   
            </div>
                </nav>
                <img src="imgs/fondo.jpg" height="100%" width="100%">
           
<section class="vh-100" style="background-color: #9A616D;background-image: url(&quot;imgs/1767.jpg&quot;);background-size: contain;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
              <img src="imgs/fondo_1.jpg"
                alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;height: 100%;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">

                <form action="NewServlet">

                  <div class="d-flex align-items-center mb-3 pb-1" style="justify-content: center;">
                    <img src="imgs/sello.png" height="20%" width="20%">
              
                  </div>

                  <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Iniciar Sesión</h5>

                  <div class="form-outline mb-4">
              
                    <input type="text" class="form-control form-control-lg" autofocus="true" name="usuario"required="true" placeholder="Usuario" />
                    <label class="form-label" for="form2Example17"></label>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="password" class="form-control form-control-lg" required="true" name ="contra"placeholder="Contraseña" />
                    <label class="form-label" for="form2Example27"></label>
                  </div>

                  <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" type="submit" id="btningresarcliente" onclick="Guardarcliente()">Acceder</button>
                  </div>

             
                  <p class="mb-5 pb-lg-2" style="color: #393f81;">No tienes una cuenta? <a href="Registrarse.jsp"
                      style="color: #393f81;">Registrate aquí</a></p>
             
                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>                
                
 
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
        
   
    </body>
</html>
