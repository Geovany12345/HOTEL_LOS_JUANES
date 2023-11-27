
<%@page import="hotelcomun.personaslista"%>
<%@page import="clasesiu.Personasiu"%>
<%
  String resultJSON = "{}";
   
   
   Personasiu persona=new Personasiu();
   
     personaslista oListaCursos = (personaslista) session.getAttribute("PersonaReporte");//CursosInterReporte dato obtenido desde el mdForAcaReporte, seccion
     persona.setRecurso(oListaCursos.getPersona());//setFormAca lista de objetos de la clase cFormacionAcademica
    
   // if (oListaCursos != null) {
        resultJSON = "{"
                + "\"contenidoDinamico\":\"" + persona.toHTML2() + "\""
                + "}";
   //}
    response.setContentType("text/plain");
    response.getWriter().write(resultJSON);
%>