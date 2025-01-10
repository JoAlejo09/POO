import java.sql.*;

public class BaseDatosMetodos {
    private static String url = "jdbc:mysql://localhost:3306/prueba_bimestral";
    private static String user = "root";
    private static String password = "1234";
    Connection con;

    public void conectarBase(){//METODO QUE CONECTA A LA BASE DE DATOS
        try {
            con = DriverManager.getConnection(url,user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int consultarUsuario(String usuario, String password) throws SQLException {//METODO QUE PERMITE BUSCAR EN LA BASE DE DATOS SI EXISTE EL USUARIO Y CONTRASEÑA PARA EL LOGIN
        String sql = "SELECT id FROM usuarios WHERE username = '"+usuario+"'AND password ='"+password+"';";
        int i=-1;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            i = rs.getInt("id");
        }
        return i;
    }
    public ResultSet consultarCalificaciones() throws SQLException { //METODO QUE PERMITE OBTENER LOS VALORES DE LA TABLA ESTUDIANTES PARA SER MOSTRADOS
        String sql = "SELECT * FROM estudiantes";
        Statement stmt = con.createStatement();
        return stmt.executeQuery(sql);
    }
     public int agregarRegistro(String cedula, String nombre,double n1, double n2, double n3, double n4, double n5)throws SQLException{
        //METODO QUE PERMITE INGRESAR UN NUEVO REGISTRO DE LA TABLA ESTUDIANTES
        String sql = "INSERT INTO estudiantes (cedula, nombre, estudiante1,estudiante2,estudiante3,estudiante4,estudiante5) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,cedula);
            stmt.setString(2,nombre);
            stmt.setDouble(3,n1);
            stmt.setDouble(4,n2);
            stmt.setDouble(5,n3);
            stmt.setDouble(6,n4);
            stmt.setDouble(7,n5);
            int rowsInserted = stmt.executeUpdate();
            return rowsInserted;
    }
}
