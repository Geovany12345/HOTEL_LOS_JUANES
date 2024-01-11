
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
        <script src="js/habitacion.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" crossorigin="anonymous"></script>
    </head>
    <body bgcolor="#C0C0C0">
      
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><img src="imgs/Logo.png" alt="#" /></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-links" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse text-capitalize" id="nav-links">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <button class="btn btn-primary" style="margin-right: 15px;" onclick="location.href='AdministradorReserva.jsp'">RESERVA </button>
                        </li>
                        <li class="nav-item">
                            <button class="btn btn-primary" style="margin-right: 15px;" onclick="location.href='AdministradorCliente.jsp'">CLIENTE</button>
                        </li>
                        <li class="nav-item">
                        <button class="btn btn-primary" style="margin-right: 15px;" onclick="location.href='Aministradorhabitacion.jsp'">HABITACION</button>
                        </li>
                    </ul>
                         <li class="nav-item">
                          
                            <button class="btn btn-secondary" onclick="location.href='index.jsp'">CERRAR SESION</button>
                        </li>
                </div>
            </div>
        </nav>
        <img src="imgs/fondo.jpg" height="100%" width="100%">
 <section>
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-1 col-lg-1 d-none d-md-block">
             
            </div>
            <div class="col-md-10 col-lg-10 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">
            <center><ul>
                <li>
                     <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" onclick="location.href='Ingresarcliente.jsp'" >Ingresar Cliente</button>
                    </div>
                    <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" onclick="location.href='mostrarpersonas.jsp'">Mostrar Cliente </button>
                    </div>
                    <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" onclick="location.href='modificarcliente1.jsp'">Modificar Cliente</button>
                    </div>
                    <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" onclick="location.href='eliminapersona1.jsp'">Eliminar Cliente</button>
                    </div>
                 
                </li>
            </ul>         
            </center>
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
