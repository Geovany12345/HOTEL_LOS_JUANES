/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesiu;


import hotelcomun.personas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author  Ange
 */
public class Personasiu {
    private List<personas> recursoi = new ArrayList<>();

    public List<personas> getRecurso() {
        return recursoi;
    }

    public void setRecurso(List<personas> recurso) {
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
        
        String result = "";
        //Boton Agregar
        result += "<h3>Personas</h3>"
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

            personas oRecurso1 = (personas) it.next();
             result += "<div class='cursoi' data-detalle='CursoInter' data-id='" + oRecurso1.getIdentificacion() + "' data-tipo='' data-estado=''>"
                    + "<div class='input-group'>"                    + "<span class='input-group-addon'>Título</span>"
                    + "<input type='text' class='form-control CursoInter nombre' id='" + oRecurso1.getIdentificacion() + "' placeholder='Nombre' data-nombre='" + oRecurso1.getNombres() + "' data-apellido='" + oRecurso1.getApellidos()+ "' data-direccion='" + oRecurso1.getDireccion()+ "' data-email='" + oRecurso1.getEmail() +"' data-telefono='" + oRecurso1.getTelefono() +"' data-usuario='" + oRecurso1.getUsuario() +"' data-contra='" + oRecurso1.getContrasenia()+"' data-privi='" + oRecurso1.getProvolegio()+ "' value='" + oRecurso1.getNombres() + "'>";
            result += "<span class='input-group-addon' id='deshabilitarp' data-toggle='tooltip' data-placement='bottom' title='Eliminar'>"
                    + "<i class='fa fa-minus-circle' title='eliminar'> </i>"
                    + "</span>";//Boton eliminar
            result += "<span class='input-group-addon' id='modificarp' data-toggle='tooltip' data-placement='bottom' title='modificar' onclick='ModificarCursosInternacionales(" + oRecurso1.getIdentificacion() + ")'>"
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
                + "<button type='button' id='btnGuardarP' class='btn btn-secondary float-xs-right gRecursos' data-toggle='tooltip' data-placement='top' title='Guardar cambios'>"
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
