import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String HOST="bupl8q1jrhl7f6e1r4kw-mysql.services.clever-cloud.com";
        String DB="bupl8q1jrhl7f6e1r4kw";
        String USER="uz0f4hvb4kaxxhoj";
        String PORT="3306";
        String PASSWORD="ihbABbTUEwQt34iVQhc6";
        String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DB;
       // MYSQL_ADDON_URI=mysql://uz0f4hvb4kaxxhoj:ihbABbTUEwQt34iVQhc6@bupl8q1jrhl7f6e1r4kw-mysql.services.clever-cloud.com:3306/bupl8q1jrhl7f6e1r4kw



        // Establecer la conexión con la base de datos
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Conexión exitosa!");

    }
}