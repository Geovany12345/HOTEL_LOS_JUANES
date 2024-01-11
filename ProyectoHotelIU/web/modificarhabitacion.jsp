


<%@page import="com.google.gson.Gson"%>
<%@page import="Constructores.habitacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>HOTEL LOS JUANES</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/fontawesome.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body bgcolor="#C0C0C0">
            <center>
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="index.jsp"><img src="imgs/Logo.png" alt="#" /></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-links" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse text-capitalize" id="nav-links">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="Aministradorhabitacion.jsp">REGRESAR <span class="sr-only">(current)</span></a>
                        </li>
                        
                        
                   
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

     <form action="modificarhabitacion">

     <div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Id Habitación</label>
        <input type="text" class="form-control" id="descripcion" name="id" placeholder="1">
    </div>   
         <div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Descripción</label>
        <input type="text" class="form-control" id="descripcion" name="descripcion" placeholder="HABITACION CON VISTA AL PARQUE">
    </div>    

    <div class="form-group"> <!-- Street 1 -->
        <label for="street1_id" class="control-label">Piso</label>
        <input type="text" class="form-control" id="piso" name="piso" placeholder="1">
    </div>                    
                            
    <div class="form-group"> <!-- Street 2 -->
        <label for="street2_id" class="control-label">precio</label>
        <input type="text" class="form-control" id="precio" name="precio" placeholder="5">
    </div>    

    <div class="form-group"> <!-- City-->
        <label for="city_id" class="control-label">Numero de camas</label>
        <input type="text" class="form-control" id="numcamas" name="numcamas" placeholder="2">
    </div>                                    
                            
     
               
    <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Guardar</button>
         
    
     </div>  
         </form>
</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>          
                     
    </center>   

    </body>
</html>
