import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //INTERFAZ LOGIN
        JFrame frame = new JFrame("LOGIN/Pagina Registro");
        frame.setContentPane(new Login().jPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(40,60);
        frame.setPreferredSize(new Dimension(320,290));
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

    }
}