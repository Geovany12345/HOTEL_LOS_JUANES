<%-- 
    Document   : eliminarhabitacion
    Created on : 30-nov-2020, 16:41:52
    Author     : Yutokiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Hotel San Carlos</title>
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
      
 <form action="eliminarhabitacion">

     <div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Id Habitación</label>
        <input type="text" class="form-control" id="descripcion" name="id" placeholder="1">
    </div> 
        <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Guardar</button>
         
    
     </div>  
 </form>
        
    </center>
    </body>
</html>
