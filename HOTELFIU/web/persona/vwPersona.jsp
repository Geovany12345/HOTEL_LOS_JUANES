<%-- 
    Document   : vwCursoIntern
    Created on : 04-jun-2017, 22:21:48
    Author     : Sandra
--%>

<%
   String resultJSON = "{}";
   
   
    String recurso = (String) session.getAttribute("recurso");
    //cRecursoIU recursoIU = new cRecursoIU();
    //recursoIU.setStrid(recurso);
    
    //if (recursoIU != null) {
        resultJSON = "{"
                + "\"contenidoDinamico\":\"" + recurso + "\""
                + "}";
    //}
    response.setContentType("text/plain");
    response.getWriter().write(resultJSON);
%>
