/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import com.google.gson.Gson;
import hotelcomun.personas;
import hotelcomun.personaslista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Yutokiva
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
         String usuario=request.getParameter("usuario");
      String contra=request.getParameter("contra");
     // String result=inicarsecion(usuario,contra);
      
     
      Gson gson=new Gson();
      //personaslista per=gson.fromJson(result,personaslista.class);
    iniciarsecioniu per1 = new iniciarsecioniu();
        
       // per1.setRecursoi(per.getPersona());
        personas pers=new personas();
        String privilegio=per1.privilegio();
     if (privilegio.equals("Cliente"))
     {
         response.sendRedirect("cliente.jsp");
     }
      else if("Administrador".equals(privilegio))
     {
         response.sendRedirect("administrador.jsp");
     } else if("Error".equals(privilegio)){
          response.sendRedirect("Registrarse.jsp");
      }  
    }


}

