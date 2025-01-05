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

}
