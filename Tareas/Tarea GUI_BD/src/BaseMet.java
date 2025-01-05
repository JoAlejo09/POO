import javax.xml.transform.Result;
import java.sql.*;
public class BaseMet {
    private static String url = "jdbc:mysql://localhost:3306/baseprueba";
    private static String user = "root";
    private static String password = "root";
    Connection connection;
    Statement sentencia;
    ResultSet resultado;

    public BaseMet()throws SQLException{
        this.connection = DriverManager.getConnection(url, user, password);
    }
    public ResultSet ejecutarConsulta(String sql) throws SQLException {
        this.sentencia = connection.createStatement();
        this.resultado = sentencia.executeQuery(sql);
        return resultado;
    }
    public int validarLogin(String sql) throws  SQLException{
        this.sentencia = connection.createStatement();
        this.resultado = sentencia.executeQuery(sql);
        int valor=0;
        while(resultado.next()){
            valor = Integer.parseInt(resultado.getString("total"));
        }
        return valor;
    }
    public int hallarUltimoId() throws SQLException {
        int id=0;
        this.sentencia = connection.createStatement();
        this.resultado = sentencia.executeQuery("SELECT id FROM Jugadores \nORDER BY id \nDESC LIMIT 1;");
        while(resultado.next()) {
            id = Integer.parseInt(resultado.getString("id"));
        }
        return id;
    }
    public int agregarRegistro(int id, String nombre, String posicion,String equipo, int edad )throws SQLException{
        this.sentencia = connection.createStatement();
        String sql = "INSERT INTO Jugadores (id, nombre, posicion, equipo, edad) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,nombre);
        stmt.setString(3,posicion);
        stmt.setString(4,equipo);
        stmt.setInt(5,edad);
        int rowsInserted = stmt.executeUpdate();
        return rowsInserted;
    }
}
