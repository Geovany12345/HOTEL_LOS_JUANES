
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
            <div class="container">
                <a class="navbar-brand" href="index.html"><img src="imgs/Logo.png" alt="#" /></a>
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
                <h1> Formulario de Ingreso de Habitacion</h1>
           
                <form action="Ingresarhabitacionfi">

    <div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Descripción</label>
        <input type="text" class="form-control" id="descripcion" name="descripcion" placeholder="HABITACION CON VISTA AL PARQUE">
    </div>    

    <div class="form-group"> <!-- Street 1 -->
        <label for="street1_id" class="control-label">Piso</label>
        <input type="number" class="form-control" min="1" max="4" id="piso" name="piso" placeholder="1">
    </div>                    
                            
    <div class="form-group"> <!-- Street 2 -->
        <label for="street2_id" class="control-label">precio</label>
        <input type="text" class="form-control" id="precio" name="precio" placeholder="5">
    </div>    

    <div class="form-group"> <!-- City-->
        <label for="city_id" class="control-label">Numero de camas</label>
        <input type="number" class="form-control" id="numcamas" min="1" max="4" name="numcamas" placeholder="2">
    </div>                                    
                            

    <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Guardar</button>
         
    
     </div>  
                 

             

</form>
      
                     
    </center>   
    </body>
</html>
