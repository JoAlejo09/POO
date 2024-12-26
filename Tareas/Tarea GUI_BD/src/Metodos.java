import javax.swing.*;
import java.awt.*;

public class Metodos extends JFrame {
    JFrame frame;
    public Metodos(JFrame frame){
        this.frame = frame;
    }
    public void crearVentana(String titulo, JPanel panel){
        frame.setTitle(titulo);
        frame.setContentPane(panel);
    }
    public void generarDimensiones(int w, int h){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(80,120);
        frame.setPreferredSize(new Dimension(w,h));
    }
    public void iniciarVentana(){
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public int validarUSuario(String usuario){
        return usuario.compareToIgnoreCase("Jose123");
    }
    public int validadContra(String contrase){
        return contrase.compareToIgnoreCase ("123");
    }
}
