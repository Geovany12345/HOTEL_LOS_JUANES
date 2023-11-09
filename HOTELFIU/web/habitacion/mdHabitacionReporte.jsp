<%-- 
    Document   : mdCursoInternReporte
    Created on : 04-jun-2017, 19:59:01
    Author     : Sandra
--%>

<%@page import="ipec.postulaciondocentes.comun.cListaCursosInternacionales"%>
<%@page import="ipec.postulaciondocentes.comun.cCursoInternacionales"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="ipec.postulaciondocentes.comun.cListaCursosNacionales"%>
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

                if (strAcc.equals("getCursoInterReporte")) {
                    Gson gson = new Gson();
                    ipec.postulacion.ws.IpecPostulacionWS_Service service = new ipec.postulacion.ws.IpecPostulacionWS_Service();
                    ipec.postulacion.ws.IpecPostulacionWS port = service.getIpecPostulacionWSPort();
                    Integer hid_hoja=1;// cambiar el id de la hoja de vida 
                    java.lang.String result = port.obtenerCursosInternacionales(hid_hoja);
                    
                    //out.println("Result = " + result);
                    if (result.equals("")) {
                        response.sendError(500, "ERROR: no es posible obtener los datos de cursos a nivel general.");
                    } else {
                        cListaCursosInternacionales CursosInterReporte = gson.fromJson(result,cListaCursosInternacionales.class);
                        session.setAttribute("CursosInterReporte", CursosInterReporte);
                        response.sendRedirect("../controladorcursosinternacionales.jsp?opc=curintreporte&tsk=mostrarCursosInterReporte");//madar tsk al com¡ntrolador
                   }
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
    </body>
</html>
