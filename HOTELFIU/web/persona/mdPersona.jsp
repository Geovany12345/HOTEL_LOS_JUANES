
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.Iterator"%>
<%@page import="hotelcomun.personas"%>
<%@page import="hotelcomun.personaslista"%>
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
                String strAcc = request.getParameter("acc");
                String strData = request.getParameter("data");

                if (strAcc.equals("setCursoI")) {
                    
                    Gson gson = new Gson();
                    personaslista soLPers = gson.fromJson(strData,personaslista.class);
                    Iterator itc = soLPers.getPersona().iterator();
                    String mensaje="";
                    while (itc.hasNext()) {
                        personas oper = (personas) itc.next();
                         String strGuardarCI = gson.toJson(oper, personas.class);
                         hotelaaws.Proyectowser_Service service = new hotelaaws.Proyectowser_Service();
                           hotelaaws.Proyectowser port = service.getProyectowserPort();
                        // String data1 = gson.toJson(oCursoI, cCursoInternacionales.class);
                        if (oper.getIdentificacion()== " ") {
                            
                            java.lang.String result = port.ingresarPersonas(strGuardarCI);
                            mensaje = gson.fromJson(result, String.class);
                        } else {
                                                        //modificar
                            java.lang.String result = port.modificarpersonas(strGuardarCI);
                            mensaje = gson.fromJson(result, String.class);
                        }
                    }
                   session.setAttribute("recurso", mensaje);
                   response.sendRedirect("../controladorpersonas.jsp?opc=CursoI&tsk=mostrarCursoI");
    
                }  else if (strAcc.equals("agregarpersonas")) {
                    personaslista oListaCursoI = (personaslista) session.getAttribute("personasReporte");//dato obtenido desde el mdForAcaReporte, seccion
                    Gson gson = new Gson();
                    personas ocursointer = gson.fromJson(strData, personas.class);
                   if (ocursointer.getIdentificacion() != " ") {//modifica 
                       int i = 0;
                       String cid_codigo=ocursointer.getIdentificacion();
                   for (personas oCursoInternacionales : oListaCursoI.getPersona()) {
                       String codigo=oCursoInternacionales.getIdentificacion(); 
                       
                       if (codigo ==cid_codigo) {
                     
                                oListaCursoI.getPersona().set(i, ocursointer);
                           }
                      
                            i++; 
                   }
                 }else  {// agregar
                    oListaCursoI.setObjCN(ocursointer);
                   }
                    session.setAttribute("CursosInterReporte", oListaCursoI);
                    response.sendRedirect("../controladorpersonas.jsp?opc=personareporte&tsk=mostrarPersonaReporte");//madar tsk al com¡ntrolador
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
    </body>
   
    
</html>
