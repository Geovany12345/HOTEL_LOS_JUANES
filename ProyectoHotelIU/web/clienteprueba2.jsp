
<%@page import="Controladores.clienteiuicedula"%>
<%@page import="Controladores.obtenerhabitacioniu"%>
<%@page import="Constructores.habitacionlista"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="Constructores.personaslista"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                            <button class="nav-link" onclick="location.href='Clientereserva.jsp'">RESERVA </button>
                        </li>
                        
                      

                   
                        
                        
                    </ul>
                         <li class="nav-item">
                          
                            <button onclick="location.href='index.jsp'">CERRAR SESION</button>
                        </li>
                </div>
            </div>
        </nav>
        <img src="imgs/fondo.jpg" height="100%" width="100%">
        <div id="contenidoDinamico" class="mt-1" height="60%">
            <center><ul>
                <li>
                   <h1> Formulario de Registro de la Reserva</h1>
           </li></ul>
             <form action="clientereserva">
                                              <%
    try {
       String result;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(new Date()); 
result="<div class=\"form-group\">" 
       +" <label for=\"street2_id\" class=\"control-label\" >Fecha de Reserva</label>"
       +" <input type=\"String\" class=\"form-control\" readonly=\"false\" id=\"street2_id\" name=\"fechaactual\" value="+fecha+">"
    +"</div>    "  ;
out.println(result);
  
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
                 
  <%
    try {
	Gson gson = new Gson();
        String resultfinal;
        hotelws1.NewWebService_Service service = new hotelws1.NewWebService_Service();
	hotelws1.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.obtenertotadaspersonas();

        personaslista personaReporte = gson.fromJson(result,personaslista.class);
        clienteiuicedula per= new clienteiuicedula();
        
        per.setRecursoi(personaReporte.getPersona());
    
        resultfinal = per.toHTML2();
 

out.print(resultfinal);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
            <%
    try {
	Gson gson = new Gson();
        String resultfinal;
        hotelws1.NewWebService_Service service = new hotelws1.NewWebService_Service();
	hotelws1.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.obtenerTodasHabitacion();

        habitacionlista personaReporte = gson.fromJson(result,habitacionlista.class);
        obtenerhabitacioniu per= new obtenerhabitacioniu();
        
        per.setRecursoi(personaReporte.getHabitaciones());
        
        resultfinal = per.toHTML2();
 
       
out.print(resultfinal);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
    
    
  
                       <%
    try {
       String result;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(new Date()); 
result=
         "<div class=\"form-group\"> "
        +"<label for=\"street2_id\" class=\"control-label\" >Desde</label>"
       +" <input type=\"string\" class=\"form-control\" id=\"street2_id\"  step=\"1\" value='"+fecha+"'  name=\"fechareserva\"  placeholder=\"27/10/2020\">"
    +"</div>" 
       + "<div class=\"form-group\"> "
       + "<label for=\"street2_id\" class=\"control-label\">Hasta</label>"
       + "<input type=\"string\" class=\"form-control\" id=\"street2_id\" value="+fecha+" step=\"1\" name=\"fechaareserva\" >"
    +"</div>"  ;
out.println(result);
  
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
  


                            
       
                                     
                        

    <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Guardar</button>
         
    
     </div>  
    </div></form></center>
             <%
   String ressult;
   ressult="<script>"
           +" alert('Error la habitacion ya se encuentra reservada ingrese nuevamente con otras fechas porfavor');"
       + "</script>";
   out.print(ressult);
    %>
    </body>
</html>
