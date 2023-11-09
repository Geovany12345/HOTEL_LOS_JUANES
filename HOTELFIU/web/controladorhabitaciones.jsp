<%-- 
    Document   : controladorcursosinternacionales
    Created on : 04-jun-2017, 19:50:24
    Author     : Sandra
--%>

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
                if (strOpc.equals("curintreporte")) {
                    String strTsk = request.getParameter("tsk");

                    String tipo = request.getParameter("tipo");
                    Integer hid_hoja = 1;//request.getParameter("hid_hoja");
                   
                  
                    if (strTsk.equals("mostrarRecursoIReporte")) {
                        String strJSONData = "{\"hid_hoja\":\"" + hid_hoja + "\"}";
                        response.sendRedirect("cursosIntern/mdCursoInternReporte.jsp?acc=getCursoInterReporte&data="+ strJSONData);
                    } else if (strTsk.equals("mostrarCursosInterReporte")) {
                        response.sendRedirect("cursosIntern/vwCursoInternReporte.jsp");
                    } 
                }
                if (strOpc.equals("ingresari")) {
                     String Cinter = request.getParameter("jsonGCursoInter");
                    response.sendRedirect("cursosIntern/mdCursosIntern.jsp?acc=agregarCursosInter&data=" + Cinter);
                   
                } 
                    else if(strOpc.equals("ingreCursoInter")){
                     String CursoI = request.getParameter("jsonGCursoInternac");
               
                    response.sendRedirect("cursosIntern/mdCursosIntern.jsp?acc=setCursoI&data=" + CursoI);
                    
                }
                    String strTsk = request.getParameter("tsk");
                    if (strTsk.equals("mostrarCursoI")) {
                        response.sendRedirect("cursosIntern/vwCursoIntern.jsp");
                    }
                }
            else {
                response.sendRedirect("index.jsp");
            }
            
        %>


    </body>
</html>
