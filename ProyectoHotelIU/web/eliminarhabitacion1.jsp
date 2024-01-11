<%-- 
    Document   : eliminarhabitacion1
    Created on : 30-nov-2020, 16:52:54
    Author     : Yutokiva
--%>

<%@page import="com.google.gson.Gson"%>
<%@page import="Controladores.habitacioniu"%>
<%@page import="Constructores.habitacionlista"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Hotel San Carlos</title>
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
                <%-- start web service invocation --%><hr/>
    <%
    try {
	Gson gson= new Gson();
        String resultfinal;
        hotelws1.NewWebService_Service service = new hotelws1.NewWebService_Service();
	hotelws1.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.obtenerTodasHabitacion();
	
        habitacionlista personaReporte = gson.fromJson(result,habitacionlista.class);
        habitacioniu per= new habitacioniu();
        
        per.setRecursoi(personaReporte.getHabitaciones());
    
        resultfinal = per.toHTML2();
 

out.print(resultfinal);
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
  <li class="nav-item">
                          
                            <button onclick="location.href='eliminarhabitacion.jsp'">SIGUIENTE</button>
                        </li>
            </center>
    </body>
</html>
