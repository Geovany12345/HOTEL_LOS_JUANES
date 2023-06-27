/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTOWS;

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
        String expResult = "Habitación ingresada correctamente";
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
        String expResult = "Habitación encontrada";
        String result = instance.obtenerhabitacion(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerhabitaciones method, of class NewWebService.
     */
    @Test
    public void testObtenerhabitaciones() {
        System.out.println("testObtenerhabitaciones");
        NewWebService instance = new NewWebService();
        String expResult = "Todas las habitaciones obtenidas";
        String result = instance.obtenerhabitaciones();
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenertodashabitacion method, of class NewWebService.
     */
    @Test
    public void testObtenertodashabitacion() {
        System.out.println("testObtenertodashabitacion");
        NewWebService instance = new NewWebService();
        String expResult = "Todas las habitaciones obtenidas";
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
        String expResult = "Habitaciones ocupadas obtenidas";
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
        String expResult = "Habitación modificada correctamente";
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
        String expResult = "Habitación eliminada correctamente";
        String result = instance.eliminarhabitacion(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of ingresarpersona method, of class NewWebService.
     */
    @Test
    public void testIngresarpersona() {
        System.out.println("ingresarpersona");
        String identificaci = "";
        String nombre = "";
        String apellido = "";
        String direccion = "";
        String telefono = "";
        String estado = "";
        String usuario = "";
        String contrasenia = "";
        String privilegio = "";
        String email = "";
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.ingresarpersona(identificaci, nombre, apellido, direccion, telefono, estado, usuario, contrasenia, privilegio, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerpersona method, of class NewWebService.
     */
    @Test
    public void testObtenerpersona() {
        System.out.println("obtenerpersona");
        String per = "";
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.obtenerpersona(per);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicarsesion method, of class NewWebService.
     */
    @Test
    public void testInicarsesion() {
        System.out.println("inicarsesion");
        String usuario = "";
        String contrasenia = "";
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.inicarsesion(usuario, contrasenia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenertotsaspersonatrabajadoras method, of class NewWebService.
     */
    @Test
    public void testObtenertotsaspersonatrabajadoras() {
        System.out.println("obtenertotsaspersonatrabajadoras");
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.obtenertotsaspersonatrabajadoras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenertotsaspersona method, of class NewWebService.
     */
    @Test
    public void testObtenertotsaspersona() {
        System.out.println("obtenertotsaspersona");
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.obtenertotsaspersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarpersona method, of class NewWebService.
     */
    @Test
    public void testModificarpersona() {
        System.out.println("modificarpersona");
        String identificaci = "";
        String nombre = "";
        String apellido = "";
        String direccion = "";
        String telefono = "";
        String estado = "";
        String usuario = "";
        String contrasenia = "";
        String privilegio = "";
        String email = "";
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.modificarpersona(identificaci, nombre, apellido, direccion, telefono, estado, usuario, contrasenia, privilegio, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarpersonas method, of class NewWebService.
     */
    @Test
    public void testEliminarpersonas() {
        System.out.println("eliminarpersonas");
        String data = "";
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.eliminarpersonas(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarreserva method, of class NewWebService.
     */
    @Test
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
    }

    /**
     * Test of obtenerreserva method, of class NewWebService.
     */
    @Test
    public void testObtenerreserva() {
        System.out.println("obtenerreserva");
        Integer id = null;
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.obtenerreserva(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenertodasreserva method, of class NewWebService.
     */
    @Test
    public void testObtenertodasreserva() {
        System.out.println("obtenertodasreserva");
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.obtenertodasreserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarreserva method, of class NewWebService.
     */
    @Test
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
    }

    /**
     * Test of eliminarreserva method, of class NewWebService.
     */
    @Test
    public void testEliminarreserva() {
        System.out.println("eliminarreserva");
        Integer id = null;
        Integer ide = null;
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.eliminarreserva(id, ide);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarfecha method, of class NewWebService.
     */
    @Test
    public void testMostrarfecha() {
        System.out.println("mostrarfecha");
        Integer id = null;
        NewWebService instance = new NewWebService();
        String expResult = "";
        String result = instance.mostrarfecha(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
