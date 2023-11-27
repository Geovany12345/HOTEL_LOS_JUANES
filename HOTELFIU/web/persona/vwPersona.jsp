

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
