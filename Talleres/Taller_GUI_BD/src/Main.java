import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/concursos";
        String usuario = "root";
        String password = "1234";
        try{
            Connection conn = DriverManager.getConnection(url,usuario,password);
            if (conn != null) {
                System.out.println("Conexión establecida a la base de datos.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}