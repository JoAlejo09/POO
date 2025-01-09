import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("LOGIN/REGISTRO");
        frame.setContentPane(new Login().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(80,120);
        frame.setPreferredSize(new Dimension(300,200));
        frame.pack();
        //frame.setResizable(false);

        frame.setVisible(true);

    }
}