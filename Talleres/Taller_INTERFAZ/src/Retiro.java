import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro {
    private JTextField tValor;
    private JButton retirarButton;
    private JButton menuButton;
    public JPanel jRetiro;
    JFrame frame = new JFrame();

    public Retiro(Double valor) {
        Cuenta cuenta = new Cuenta(valor);
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
                JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(jRetiro);
                loginFrame.dispose();
            }
        });
        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tValor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Campo vacio.\nIngrese el valor a retirar...","Error",JOptionPane.WARNING_MESSAGE);
                }else if(Double.parseDouble(tValor.getText())==0.0){
                    JOptionPane.showMessageDialog(null,"No puede ser 0.\nIngrese el valor a retirar...","Error",JOptionPane.WARNING_MESSAGE);
                    tValor.setText("");
                }else{
                    Double retiro = Double.parseDouble(tValor.getText());
                    boolean opcion = cuenta.retirarDinero(retiro);
                    if(opcion){
                        JOptionPane.showMessageDialog(null,"Se ha realizado la transaccion.\nSu saldo actual es: $"+cuenta.getDinero(),"Transaccion Realizada",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"No se pudo realizar la transaccion","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }
}
