import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion para sumar dos numeros");
        frame.setContentPane(new form1().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(40,60);
        frame.setPreferredSize(new Dimension(320,240));
        frame.pack();
        frame.setVisible(true);
    }
}