import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class MetodosBase {
    public static String url= "jdbc:mysql://localhost:3306/concursos";
    public static String usuario = "root";
    public static String password = "1234";
    Connection conn;
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
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sqlSelect);
        while(rs.next()){
            id = rs.getInt("id");
        }
        if(id!=0){
            return true;
        }else
            return false;
    }

}
