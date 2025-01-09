import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class MetodosBase {
    public static String url= "jdbc:mysql://localhost:3306/concursos";
    public static String usuario = "root";
    public static String password = "1234";
    Connection conn;
    Statement stm;
    public void conectarBase(){
        try{
            conn = DriverManager.getConnection(url,usuario,password);
            if (conn != null) {
                System.out.println("Conexión establecida a la base de datos.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean consultaTabla(String usuario, String password) throws SQLException {
        int id=0;
        String sqlSelect = "SELECT id FROM usuarios WHERE usuario='"+usuario+"' AND pasword = '"+password+"'";
        stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sqlSelect);
        while(rs.next()){
            id = rs.getInt("id");
        }
        if(id!=0){
            return true;
        }else
            return false;
    }
    public ResultSet consultarTabla() throws SQLException {
        String sqlSelect = "SELECT * FROM inscripciones";
        stm = conn.createStatement();
        return stm.executeQuery(sqlSelect);
    }
    public void insertarRegistro(String nombre, String apellido, int edad, String correo) throws SQLException {
        String sql = "INSERT INTO Inscripciones (nombre, apellido, edad,correo) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1,nombre);
        stmt.setString(2,apellido);
        stmt.setInt(3,edad);
        stmt.setString(4,correo);
        stmt.executeUpdate();
    }
    public void finalizarBase() {
        try {
            stm.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
