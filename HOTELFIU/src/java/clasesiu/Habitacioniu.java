/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesiu;


import hotelcomun.habitacion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author  Ange
 */
public class Habitacioniu {
    private List<habitacion> recursoi = new ArrayList<>();

    public List<habitacion> getRecurso() {
        return recursoi;
    }

    public void setRecurso(List<habitacion> recurso) {
        this.recursoi = recurso;
    }

    private Integer hid_hoja;

    public Integer getHid_hoja() {
        return hid_hoja;
    }

    public void setHid_hoja(Integer hid_hoja) {
        this.hid_hoja = hid_hoja;
    }
    public String toHTML1() {
        String result = "";
        result += "<h5 align='center'> Cursos </h5><br>";
        return result;
    }
      
     public String toHTML2() {
         
         
           Iterator it = recursoi.iterator();
        Integer hid_hoja = recursoi.get(0).getId_habitacion();
        String result = "";
        //Boton Agregar
        result += "<h3>Habitaciones</h3>"
                +"<div class='form-group row'>"
                + "<div class='col-xs-9'>"
                + "</div>"
                + "<div class='col-xs-3'>"
                + "<span>"
                + "<button type='button' id='frmCurInter'  class='btn btn-secondary float-xs-right gRecursos' style='float: right;'data-toggle='tooltip' data-placement='top' title='Ingresar'>"
                + "Agregar | <i class='fa fa-plus-square'></i>"
                //Boton mas (+)
                //+ " <span class='' style='float: right;' id='nuevoExDir' class='btn btn-primary' data-toggle='modal' data-target='#index'>"
                //+ "<i id='act-modal-ingresar' class='fa fa-plus-square fa-2x' aria-hidden='true' title='Ingresar'></i>"
                + "</button>"
                + "</span>"
                + "</div>"
                +"</div>";
   
          while (it.hasNext()) {

            habitacion oRecurso1 = (habitacion) it.next();
             result += "<div class='cursoi' data-detalle='habita' data-id='" + oRecurso1.getId_habitacion() + "' data-tipo='' data-estado=''>"
                    + "<div class='input-group'>"
                    + "<span class='input-group-addon'>Título</span>"
                    + "<input type='text' class='form-control habita nombre' id='" + oRecurso1.getId_habitacion()+ "' placeholder='Descripci&oacute;n de la habitacion ' data-descripcion='" + oRecurso1.getDescripcion() + "' data-nc='" + oRecurso1.getNumero_camas() +"' data-piso='" + oRecurso1.getPiso() +  "' data-precio='" + oRecurso1.getPrecio() +"' value='" + oRecurso1.getDescripcion() + "'>";
            result += "<span class='input-group-addon' id='deshabilitarh' data-toggle='tooltip' data-placement='bottom' title='Eliminar'>"
                    + "<i class='fa fa-minus-circle' title='eliminar'> </i>"
                    + "</span>";//Boton eliminar
            result += "<span class='input-group-addon' id='modificarh' data-toggle='tooltip' data-placement='bottom' title='modificar' onclick='ModificarCursosInternacionales(" + oRecurso1.getId_habitacion() + ")'>"
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
                + "<button type='button' id='btnGuardarH' class='btn btn-secondary float-xs-right gRecursos' data-toggle='tooltip' data-placement='top' title='Guardar cambios'>"
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
