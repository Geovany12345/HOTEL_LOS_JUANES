

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

         <%
            String strOpc = request.getParameter("opc");
            if (strOpc != null) {
                if (strOpc.equals("personareporte")) {
                    String strTsk = request.getParameter("tsk");

                    String tipo = request.getParameter("tipo");
                    Integer hid_hoja = 1;//request.getParameter("hid_hoja");
                   
                  
                    if (strTsk.equals("mostrarRecursoIReporte")) {
                        String strJSONData = "{\"hid_hoja\":\"" + hid_hoja + "\"}";
                        response.sendRedirect("persona/mdPersonaReporte.jsp?acc=getPersonaReporte&data="+ strJSONData);
                    } else if (strTsk.equals("mostrarPersonaReporte")) {
                        response.sendRedirect("persona/vwPersonaReporte.jsp");
                    } 
                }
                if (strOpc.equals("ingresarpersona")) {
                     String Cinter = request.getParameter("jsonPersona");
                    response.sendRedirect("persona/mdPersona.jsp?acc=agregarPersona&data=" + Cinter);
                   
                } 
                    else if(strOpc.equals("ingreCursoInter")){
                     String CursoI = request.getParameter("jsonPersona");
               
                    response.sendRedirect("persona/mdPersona.jsp?acc=setPersona&data=" + CursoI);
                    
                }
                    String strTsk = request.getParameter("tsk");
                    if (strTsk.equals("mostrarCursoI")) {
                        response.sendRedirect("persona/vwPersona.jsp");
                    }
                }
            else {
                response.sendRedirect("index.jsp");
            }
            
        %>


    </body>
</html>
