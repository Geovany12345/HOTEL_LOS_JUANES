/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAD;

import proyectohotel.personas;

/**
 *
 * @author Alejandro
 */
public class PersonaAD  extends personas {
      public String setSQLInsert() {
        String result = "Error Sentencia AD";
        result = "INSERT INTO personas(\n"
                + "identificacion,nombres,apellidos, telefono, email, estadop, direccion, usuario,contrasenia,provolegio)\n"
                + "VALUES ('" + this.getIdentificacion() + "','" + this.getNombres()+ "', '" + this.getApellidos() + "', '" + this.getTelefono()+ "','" + this.getEmail()+ "','" + this.getEstadop() + "','" + this.getDireccion()+ "','" + this.getUsuario() + "','" + this.getContrasenia()+ "','" + this.getProvolegio()+ "');";
        return result;
    }
    
      
        public String getSQLInicarsecion() {
         
         String result;

             result = "SELECT * FROM personas WHERE( (usuario = '" + this.getUsuario()+ "') and (contrasenia='"+this.getContrasenia()+"'))" ; 
  

         return result;
     }
     public String getSQLMostrar() {
         String result = "";

         if ( getIdentificacion()!= null) {
             result = "SELECT * FROM personas WHERE( (identificacion = '" + this.getIdentificacion()+ "') and (estadop= 'Activo'))" ; 
         }

         return result;
     }
     
       public String getSQLMostrartodos() {
         String result = "";

         
             result = "SELECT * FROM personas WHERE( (estadop= 'Activo') and (provolegio='Cliente'))" ; 
  

         return result;
     }
        public String getSQLMostrartodostrabajadores() {
         String result = "";

         
             result = "SELECT * FROM personas WHERE( (estadop= 'Activo') and (provolegio='Empleado'))" ; 
  

         return result;
     }
     public String setSQLUpdate() {

        String result = "Error Sentencia AD";
        result = "  UPDATE personas\n"
                + "   SET nombres='"+this.getNombres()+"',apellidos='"+this.getApellidos()+"',telefono='"+this.getTelefono()+"',email='"+this.getEmail()+"',usuario='"+this.getUsuario()+"',contrasenia='"+this.getContrasenia()+"',direccion='"+this.getDireccion()+"',provolegio='"+this.getProvolegio()+"' \n"
                + "   where identificacion=='" + this.getIdentificacion() + "' ;";
        return result;

    }
      public String setSQLdelete() {

        String result = "Error Sentencia AD";
        result = "  UPDATE personas\n"
                + "   SET estadop='"+this.getEstadop()+"' \n"
                + "   where identificacion='" + this.getIdentificacion() + "' ;";
        return result;

    }
}
