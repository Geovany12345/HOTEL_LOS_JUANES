
<%@page import="Controladores.clienteiuicedula"%>
<%@page import="Constructores.personaslista"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="Controladores.obtenerhabitacioniu"%>
<%@page import="Constructores.habitacionlista"%>
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
                            <a class="nav-link" href="AdministradorReserva.jsp">Regresar<span class="sr-only">(current)</span></a>
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
           
             <form action="modificarreserv">
                  <div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Id Reserva</label>
        <input type="text" class="form-control" id="descripcion" name="id_reserva" placeholder="1">
    </div> 
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
</div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>                   

    </body>
</html>
