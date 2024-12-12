import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    private JLabel jlSaldo;
    private JButton menuButton;
    public JPanel jSaldo;
    JFrame frame = new JFrame();
    public Saldo(Double valor) {
        Cuenta cuenta = new Cuenta(valor);
        jlSaldo.setText("Su saldo actual es: $"+cuenta.getDinero());
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("MENU");
                frame.setContentPane(new Menu(cuenta.getDinero()).jMenu);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(40,60);
                frame.setPreferredSize(new Dimension(320,290));
                frame.pack();
                frame.setVisible(true);
                JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(jSaldo);
                loginFrame.dispose();
            }
        });
    }
}
