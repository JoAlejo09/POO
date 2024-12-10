import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LOGIN/Pagina Registro");
        frame.setContentPane(new Login_form().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(40,60);
        frame.setPreferredSize(new Dimension(320,240));
        frame.pack();
        frame.setVisible(true);

        JFrame frame1 = new JFrame("CALCULADORA");
        frame1.setContentPane(new Calculadora_form().jPanel_C);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(480,60);
        frame1.setPreferredSize(new Dimension(500,360));
        frame1.pack();
        frame1.setVisible(true);
    }
}