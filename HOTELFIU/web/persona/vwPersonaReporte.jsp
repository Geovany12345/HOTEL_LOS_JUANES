<%-- 
    Document   : vwCursoInternReporte
    Created on : 04-jun-2017, 20:06:07
    Author     : Sandra
--%>


<%@page import="ipec.postulaciondocentes.comun.cListaCursosInternacionales"%>
<%@page import="ipec.postulacionDocentes.iu.cCursoInternIU"%>
<%
  String resultJSON = "{}";
   
   cCursoInternIU ocursoIU = new cCursoInternIU();
   
   
     cListaCursosInternacionales oListaCursos = (cListaCursosInternacionales) session.getAttribute("CursosInterReporte");//CursosInterReporte dato obtenido desde el mdForAcaReporte, seccion
     ocursoIU.setRecurso(oListaCursos.getCursosInter());//setFormAca lista de objetos de la clase cFormacionAcademica
    
   // if (oListaCursos != null) {
        resultJSON = "{"
                + "\"contenidoDinamico\":\"" + ocursoIU.toHTML2() + "\""
                + "}";
   //}
    response.setContentType("text/plain");
    response.getWriter().write(resultJSON);
%>