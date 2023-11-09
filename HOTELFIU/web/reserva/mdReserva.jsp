<%-- 
    Document   : mdCursosIntern
    Created on : 04-jun-2017, 22:08:09
    Author     : Sandra
--%>


<%@page import="ipec.postulaciondocentes.comun.cFormacionAcademica"%>
<%@page import="java.util.Iterator"%>
<%@page import="ipec.postulaciondocentes.comun.cCursoInternacionales"%>
<%@page import="ipec.postulaciondocentes.comun.cListaCursosInternacionales"%>
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
                String strAcc = request.getParameter("acc");
                String strData = request.getParameter("data");

                if (strAcc.equals("setCursoI")) {
                    
                    Gson gson = new Gson();
                    cListaCursosInternacionales oListaCursos = gson.fromJson(strData,cListaCursosInternacionales.class);
                    Iterator itc = oListaCursos.getCursosInter().iterator();
                    String mensaje="";
                    while (itc.hasNext()) {
                        cCursoInternacionales oCursoI = (cCursoInternacionales) itc.next();
                         String strGuardarCI = gson.toJson(oCursoI, cCursoInternacionales.class);
                         ipec.postulacion.ws.IpecPostulacionWS_Service service = new ipec.postulacion.ws.IpecPostulacionWS_Service();
                         ipec.postulacion.ws.IpecPostulacionWS port = service.getIpecPostulacionWSPort();
                        // String data1 = gson.toJson(oCursoI, cCursoInternacionales.class);
                        if (oCursoI.getCid_ce2() < 0) {
                            
                            java.lang.String result = port.ingresarCursoInternacionales(strGuardarCI);
                            mensaje = gson.fromJson(result, String.class);
                        } else {
                                                        //modificar
                            java.lang.String result = port.modificarCursosInternacionales(strGuardarCI);
                            mensaje = gson.fromJson(result, String.class);
                        }
                    }
                   session.setAttribute("recurso", mensaje);
                   response.sendRedirect("../controladorcursosinternacionales.jsp?opc=CursoI&tsk=mostrarCursoI");
    
                }  else if (strAcc.equals("agregarCursosInter")) {
                    cListaCursosInternacionales oListaCursoI = (cListaCursosInternacionales) session.getAttribute("CursosInterReporte");//dato obtenido desde el mdForAcaReporte, seccion
                    Gson gson = new Gson();
                    cCursoInternacionales ocursointer = gson.fromJson(strData, cCursoInternacionales.class);
                   if (ocursointer.getCid_ce2() > 0) {//modifica 
                       int i = 0;
                       Integer cid_codigo=ocursointer.getCid_ce2();
                   for (cCursoInternacionales oCursoInternacionales : oListaCursoI.getCursosInter()) {
                       Integer codigo=oCursoInternacionales.getCid_ce2(); 
                     if (codigo ==cid_codigo) {
                     
                                oListaCursoI.getCursosInter().set(i, ocursointer);
                           }
                      
                            i++; 
                   }
                 }else  {// agregar
                    oListaCursoI.setObj(ocursointer);
                   }
                    session.setAttribute("CursosInterReporte", oListaCursoI);
                    response.sendRedirect("../controladorcursosinternacionales.jsp?opc=curintreporte&tsk=mostrarCursosInterReporte");//madar tsk al com¡ntrolador
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
    </body>
</html>
