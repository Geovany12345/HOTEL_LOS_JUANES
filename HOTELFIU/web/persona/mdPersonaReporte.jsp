
<%@page import="hotelcomun.personaslista"%>
<%@page import="com.google.gson.Gson"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
            try {
                String strAcc = request.getParameter("acc");//acc dato obtenido desde el controlador 

                if (strAcc.equals("getPersonasReporte")) {
                    Gson gson = new Gson();
                    
                         hotelaaws.Proyectowser_Service service = new hotelaaws.Proyectowser_Service();
                           hotelaaws.Proyectowser port = service.getProyectowserPort();
                    Integer hid_hoja=1;// cambiar el id de la hoja de vida 
                    java.lang.String result = port.obtenerpersonas();
                    
                    //out.println("Result = " + result);
                    if (result.equals("")) {
                        response.sendError(500, "ERROR: no es posible obtener los datos de cursos a nivel general.");
                    } else {
                        personaslista CursosInterReporte = gson.fromJson(result,personaslista.class);
                        session.setAttribute("PersonaReporte", CursosInterReporte);
                        response.sendRedirect("../controladorpersonas.jsp?opc=personaporte&tsk=mostrarPersonaReporte");//madar tsk al com¡ntrolador
                   }
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
    </body>
</html>
