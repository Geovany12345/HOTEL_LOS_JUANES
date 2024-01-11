/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioWeb;

import ServicioWeb.NewWebService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */

public class NewWebServiceTest {
    
    public NewWebServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ingresarHabitacion method, of class NewWebService.
     */
    @Test
    public void testIngresarHabitacion() {
        System.out.println("testIngresarHabitacion");
        String descripcion = "Habitación individual";
        Double precio = 100.0;
        Integer piso = 2;
        Integer numerocamas = 1;
        String estado = "Disponible";
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.ingresarHabitacion(descripcion, precio, piso, numerocamas, estado);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerhabitacion method, of class NewWebService.
     */
    @Test
    public void testObtenerhabitacion() {
        System.out.println("testObtenerhabitacion");
        Integer id = 1;
        NewWebService instance = new NewWebService();
        String expResult = "{\"habitaciones\":[]}";
        String result = instance.obtenerhabitacion(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerhabitaciones method, of class NewWebService.
     */
 /*   @Test
    public void testObtenerhabitaciones() {
        System.out.println("testObtenerhabitaciones");
        NewWebService instance = new NewWebService();
        String expResult = "{\"habitaciones\":[{\"id_habitacion\":2,\"descripcion\":\"Habitación individual\",\"precio\":0.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":3,\"descripcion\":\"Habitación individual\",\"precio\":0.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":4,\"descripcion\":\"Habitación individual\",\"precio\":0.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":5,\"descripcion\":\"Habitación individual\",\"precio\":0.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":8,\"descripcion\":\"A\",\"precio\":0.0,\"piso\":1,\"numero_camas\":1,\"estadoh\":\"HHH\"},{\"id_habitacion\":10,\"descripcion\":\"HABITACION CON VISTA AL MAR\",\"precio\":50.0,\"piso\":1,\"numero_camas\":2,\"estadoh\":\"Activo\"},{\"id_habitacion\":11,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":12,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":13,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":14,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":15,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":16,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":17,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":18,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":19,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":20,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":21,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":22,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":23,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":24,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":25,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":26,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":27,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":28,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":29,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":30,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":31,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":32,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":33,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":34,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":35,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":36,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":37,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":38,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":39,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":40,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":41,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":42,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":43,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":44,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":45,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":46,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":47,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":48,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":49,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":50,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":51,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":52,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":53,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":54,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":55,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":56,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":57,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":58,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":59,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":60,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"},{\"id_habitacion\":61,\"descripcion\":\"Habitación individual\",\"precio\":100.0,\"piso\":2,\"numero_camas\":1,\"estadoh\":\"Disponible\"}]}";
        String result = instance.obtenerhabitaciones();
        assertEquals(expResult, result);
    }*/

    /**
     * Test of obtenertodashabitacion method, of class NewWebService.
     */
    @Test
    public void testObtenertodashabitacion() {
        System.out.println("testObtenertodashabitacion");
        NewWebService instance = new NewWebService();
        String expResult = "{\"habitaciones\":[]}";
        String result = instance.obtenertodashabitacion();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenertodashabitacionocupadas method, of class NewWebService.
     */
    @Test
    public void testObtenertodashabitacionocupadas() {
        System.out.println("testObtenertodashabitacionocupadas");
        NewWebService instance = new NewWebService();
        String expResult = "{\"habitaciones\":[]}";
        String result = instance.obtenertodashabitacionocupadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of modificarhabitacion method, of class NewWebService.
     */
    @Test
    public void testModificarhabitacion() {
        System.out.println("testModificarhabitacion");
        Integer id = 1;
        String descripcion = "Habitación doble";
        Double precio = 150.0;
        Integer piso = 3;
        Integer numerocamas = 2;
        String estado = "Disponible";
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.modificarhabitacion(id, descripcion, precio, piso, numerocamas, estado);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarhabitacion method, of class NewWebService.
     */
    @Test
    public void testEliminarhabitacion() {
        System.out.println("testEliminarhabitacion");
        Integer id = 1;
        NewWebService instance = new NewWebService();
        String expResult = "\"Operacines exitosas!!\"";
        String result = instance.eliminarhabitacion(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of ingresarpersona method, of class NewWebService.
     */
    @Test
    public void testIngresarpersona() {
        System.out.println("ingresarpersona");
        String identificaci = "1";
        String nombre = "Prueba";
        String apellido = "P";
        String direccion = "aaaaa";
        String telefono = "00000";
        String estado = "1";
        String usuario = "admin";
        String contrasenia = "12345";
        String privilegio = "Administrador";
        String email = "aaaa@gmail.com";
        NewWebService instance = new NewWebService();
        String expResult = "Exito";
        String result = instance.ingresarpersona(identificaci, nombre, apellido, direccion, telefono, estado, usuario, contrasenia, privilegio, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerpersona method, of class NewWebService.
     */
    @Test
    public void testObtenerpersona() {
        System.out.println("obtenerpersona");
        String per = "";
        NewWebService instance = new NewWebService();
        String expResult = "{\"persona\":[]}";
        String result = instance.obtenerpersona(per);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of inicarsesion method, of class NewWebService.
     */
    @Test
    public void testInicarsesion() {
        System.out.println("inicarsesion");
        String usuario = "admin";
        String contrasenia = "12345";
        NewWebService instance = new NewWebService();
        String expResult = "{\"persona\":[]}";
        String result = instance.inicarsesion(usuario, contrasenia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.  
    }

    /**
     * Test of obtenertotsaspersonatrabajadoras method, of class NewWebService.
     */
    @Test
    public void testObtenertotsaspersonatrabajadoras() {
        System.out.println("obtenertotsaspersonatrabajadoras");
        NewWebService instance = new NewWebService();
        String expResult = "{\"persona\":[]}";
        String result = instance.obtenertotsaspersonatrabajadoras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenertotsaspersona method, of class NewWebService.
     */
    @Test
    public void testObtenertotsaspersona() {
        System.out.println("obtenertotsaspersona");
        NewWebService instance = new NewWebService();
        String expResult = "{\"persona\":[]}";
        String result = instance.obtenertotsaspersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarpersona method, of class NewWebService.
     */
    @Test
    public void testModificarpersona() {
        System.out.println("modificarpersona");
        String identificaci = "1";
        String nombre = "aaaa";
        String apellido = "aaaa";
        String direccion = "aaa";
        String telefono = "aaa";
        String estado = "1";
        String usuario = "admin";
        String contrasenia = "12345";
        String privilegio = "Administrador";
        String email = "aaaa";
        NewWebService instance = new NewWebService();
        String expResult = "\"Operacines exitosas!!\"";
        String result = instance.modificarpersona(identificaci, nombre, apellido, direccion, telefono, estado, usuario, contrasenia, privilegio, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarpersonas method, of class NewWebService.
     */
    @Test
    public void testEliminarpersonas() {
        System.out.println("eliminarpersonas");
        String data = "";
        NewWebService instance = new NewWebService();
        String expResult = "\"Exito\"";
        String result = instance.eliminarpersonas(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarreserva method, of class NewWebService.
     */
    /*@Test
    public void testIngresarreserva() {
        System.out.println("ingresarreserva");
        String identificaci = "";
        Integer id = null;
        String fechaactual = "";
        String fecha = "";
        String fechaai = "";
        Long cantidad = null;
        Double costo = null;
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.ingresarreserva(identificaci, id, fechaactual, fecha, fechaai, cantidad, costo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of obtenerreserva method, of class NewWebService.
     */
    @Test
    public void testObtenerreserva() {
        System.out.println("obtenerreserva");
        Integer id = null;
        NewWebService instance = new NewWebService();
        String expResult = "{\"reservas\":[]}";
        String result = instance.obtenerreserva(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenertodasreserva method, of class NewWebService.
     */
    @Test
    public void testObtenertodasreserva() {
        System.out.println("obtenertodasreserva");
        NewWebService instance = new NewWebService();
        String expResult = "{\"reservas\":[]}";
        String result = instance.obtenertodasreserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of modificarreserva method, of class NewWebService.
     */
   /* @Test
    public void testModificarreserva() {
        System.out.println("modificarreserva");
        Integer identificaci = null;
        String cedula = "";
        Integer id = null;
        String fecha = "";
        String fechaai = "";
        Long cantidad = null;
        Double costo = null;
        Integer ide = null;
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.modificarreserva(identificaci, cedula, id, fecha, fechaai, cantidad, costo, ide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of eliminarreserva method, of class NewWebService.
     */
   /* @Test
    public void testEliminarreserva() {
        System.out.println("eliminarreserva");
        Integer id = null;
        Integer ide = null;
        NewWebService instance = new NewWebService();
        String expResult = "Operacines exitosas!!";
        String result = instance.eliminarreserva(id, ide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }*/

    /**
     * Test of mostrarfecha method, of class NewWebService.
     */
    @Test
    public void testMostrarfecha() {
        System.out.println("mostrarfecha");
        Integer id = null;
        NewWebService instance = new NewWebService();
        String expResult = "{\"reservas\":[]}";
        String result = instance.mostrarfecha(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
