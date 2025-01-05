import javax.swing.*;
import javax.xml.transform.Result;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame();
        Metodos met = new Metodos(frame);
        JPanel panel = new Login(frame).jPanel;
        met.crearVentana("LOGIN/REGISTRO",panel);
        met.generarDimensiones(300,200);
        met.iniciarVentana();


        /*BaseMet base = new BaseMet();
        ResultSet resultado = null;
        try {
            resultado = base.ejecutarConsulta("SELECT * FROM usuarios");
            System.out.println("ID\t | Usuario \t| Contrasena");
            System.out.println("--------------------");

            while(resultado.next()){
                int id = resultado.getInt("id");
                String usuario = resultado.getString("usuario");
                String email = resultado.getString("contrasena");
                System.out.println(id + "\t| " + usuario + "\t| " + email);
            }
        }catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }*/

    }
}

