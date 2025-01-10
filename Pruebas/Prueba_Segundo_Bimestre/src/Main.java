import javax.swing.*;
import java.awt.*;

public class Main {
    /*EVALUACION SEGUNDO BIMESTRE
    NOMBRE: Jose Pila*/

    public static void main(String[] args) {
        //INICIALIZACION DE LA VENTANA
        JFrame frame = new JFrame();
        frame.setTitle("LOGIN REGISTRO");
        frame.setContentPane(new Login().jPanelL);
        frame.setSize(100,80);
        frame.setPreferredSize(new Dimension(350,200));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}