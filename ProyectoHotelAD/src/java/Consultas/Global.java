/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

/**
 *
 * @author Alejandro
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Global {

    public static String driverclass = "org.postgresql.Driver";
    public static String databaseURL = "jdbc:postgresql://localhost:5432/HOTEL";
    public static String usuarioDB = "postgres";
    public static String claveDB = "12345";
    public static Connection connection = null;

    public static void conectar() {
        try {
            Class.forName(driverclass);
            connection = DriverManager.getConnection(databaseURL, usuarioDB, claveDB);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void desconectar() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Desconexión exitosa de la base de datos");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
         conectar();

    }
}
