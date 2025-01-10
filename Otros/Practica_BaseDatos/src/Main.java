import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String url= "jdbc:mysql://localhost:3306/";
    public static String usuario = "root";
    public static String password = "root";
    public static String database= "practica";

    public static void main(String[] args) {
        //Establecer la conexion
        try {
            /*Connection con = DriverManager.getConnection(url, usuario, password);
            Statement stmt = con.createStatement();
            //Creacion base de datos
            String sql = "CREATE DATABASE IF NOT EXISTS "+database;
            stmt.executeUpdate(sql);
            System.out.println("Base de datos 'practica' verificada o creada con éxito.");*/
            //CREACION DE LA TABLA
            Connection con = DriverManager.getConnection(url+database, usuario, password);
            Statement stmt = con.createStatement();
            String crearTabla = "CREATE TABLE IF NOT EXISTS usuarios ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nombre VARCHAR(100) NOT NULL, "
                    + "correo VARCHAR(150) UNIQUE, "
                    + "edad INT, "
                    + "fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            stmt.executeUpdate(crearTabla);
            System.out.println("Tabla 'usuarios' verificada o creada con éxito.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}