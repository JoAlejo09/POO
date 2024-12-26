import javax.swing.*;
import java.awt.*;

public class Metodos extends JFrame {
    JFrame frame = new JFrame();
    public void mostrarPantalla(String titulo, JPanel ventana){

        frame.setTitle(titulo);
        frame.setContentPane(ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
    public void generarDimensiones(int w, int h){
        frame.setSize(80,120);
        frame.setPreferredSize(new Dimension(w,h));
    }
    public void iniciarVentana(){
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public int validarUSuario(String usuario){
        return usuario.compareToIgnoreCase("a");
    }
    public int validadContra(String contrase){
        return contrase.compareToIgnoreCase ("123");
    }
}
