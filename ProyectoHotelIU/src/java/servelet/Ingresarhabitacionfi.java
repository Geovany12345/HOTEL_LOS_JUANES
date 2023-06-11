/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;



import hotelws1.NewWebService_Service;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Alejandro
 */
@WebServlet(name = "Ingresarhabitacionfi", urlPatterns = {"/Ingresarhabitacionfi"})
public class Ingresarhabitacionfi extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ProyectoHotelAD/NewWebService.wsdl")
    private NewWebService_Service service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String descripcion=request.getParameter("descripcion");
      String precio1=request.getParameter("precio");
      String piso1=request.getParameter("piso");
      String numero_camas1=request.getParameter("numcamas");

      String estado="Activo";
      Double precio =Double.parseDouble(precio1);
      Integer piso = Integer.parseInt(piso1);
      Integer numero_camas=Integer.parseInt(numero_camas1);
        String ingresarHabitacion = ingresarHabitacion(descripcion,precio,piso,numero_camas,estado);
     response.sendRedirect("Aministradorhabitacion.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String ingresarHabitacion(java.lang.String dese, java.lang.Double precio, java.lang.Integer piso, java.lang.Integer numeroCamas, java.lang.String estado) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.ingresarHabitacion(dese, precio, piso, numeroCamas, estado);
    }

   
   


    
}
