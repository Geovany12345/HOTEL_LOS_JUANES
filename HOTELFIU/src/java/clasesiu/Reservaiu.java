/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesiu;


import hotelcomun.reserva;
import hotelcomun.reservalista;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author  Ange
 */
public class Reservaiu {
    private List<reserva> recursoi = new ArrayList<>();

    public List<reserva> getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(List<reserva> recursoi) {
        this.recursoi = recursoi;
    }

   
    public String toHTML1() {
        String result = "";
        result += "<h5 align='center'> Cursos </h5><br>";
        return result;
    }
      
     public String toHTML2() {
         
         
           Iterator it = recursoi.iterator();
        Integer hid_hoja = recursoi.get(0).getHid_hoja();
        String result = "";
        //Boton Agregar
        result += "<h3>Reservas</h3>"
                +"<div class='form-group row'>"
                + "<div class='col-xs-9'>"
                + "</div>"
                + "<div class='col-xs-3'>"
                + "<span>"
                + "<button type='button' id='frmReserv'  class='btn btn-secondary float-xs-right gRecursos' style='float: right;'data-toggle='tooltip' data-placement='top' title='Ingresar'>"
                + "Agregar | <i class='fa fa-plus-square'></i>"
                //Boton mas (+)
                //+ " <span class='' style='float: right;' id='nuevoExDir' class='btn btn-primary' data-toggle='modal' data-target='#index'>"
                //+ "<i id='act-modal-ingresar' class='fa fa-plus-square fa-2x' aria-hidden='true' title='Ingresar'></i>"
                + "</button>"
                + "</span>"
                + "</div>"
                +"</div>";
   
          while (it.hasNext()) {

            reserva oRecurso1 = (reserva) it.next();
             result += "<div class='cursoi' data-detalle='CursoInter' data-id='" + oRecurso1.getId_reserva()+ "' data-tipo='' data-estado=''>"
                    + "<div class='input-group'>"
                    + "<span class='input-group-addon'>Título</span>"
                    + "<input type='text' class='form-control CursoInter nombre' id='" + oRecurso1.getId_reserva() + "' placeholder='Descripci&oacute;n del curso' data-universidad='" + oRecurso1.getCi_institucion() + "' data-anio='" + oRecurso1.getCianio() + "' data-hoja='" + oRecurso1.getHid_hoja() + "' data-pais='" + oRecurso1.getCi_pais() + "' value='" + oRecurso1.getCi_nombre() + "'>";
            result += "<span class='input-group-addon' id='deshabilitar' data-toggle='tooltip' data-placement='bottom' title='Eliminar'>"
                    + "<i class='fa fa-minus-circle' title='eliminar'> </i>"
                    + "</span>";//Boton eliminar
            result += "<span class='input-group-addon' id='modificarIn' data-toggle='tooltip' data-placement='bottom' title='modificar' onclick='ModificarCursosInternacionales(" + oRecurso1.getCid_ce2() + ")'>"
                    + "<i class='fa fa-ellipsis-h' title='Modificar'></i>"
                    + "</span>";//Boton Modificar
            result += "</div>"
                    + "</div>";
        }
            
            result += "</div>"
                + "</div>"
                + "</div>"
                + "</form>"
                + "<!-- barra de botones -->"
                + "<div class='form-group row'>"
                + "<div class='col-xs-9'>"
                + "</div>"
                + "<div class='col-xs-3'>"
                + "<button type='button' id='btnGuardarCurIn' class='btn btn-secondary float-xs-right gRecursos' data-toggle='tooltip' data-placement='top' title='Guardar cambios'>"
                + "Guardar | <i class='fa fa-fw'></i>"
                + "</button>"
                + "</div>"
                + "</div>";
             
         
          
          
     return result;
         }
     public String toHTML3() {
        String result = "";
        result += "<h5 align='center'>" + getHid_hoja() + "</h5><br>";
        return result;
    }
}
