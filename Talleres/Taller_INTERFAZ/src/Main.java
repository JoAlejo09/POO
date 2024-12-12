import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        //INTERFAZ LOGIN
        JFrame frame = new JFrame("LOGIN/Pagina Registro");
        frame.setContentPane(new Login_form().jPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(40,60);
        frame.setPreferredSize(new Dimension(320,240));
        frame.pack();
        frame.setVisible(true);

    }
}