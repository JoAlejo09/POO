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
    Cuenta cuenta = new Cuenta();

    public Retiro() {
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("MENU");
                frame.setContentPane(new Menu().jMenu);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(40,60);
                frame.setPreferredSize(new Dimension(320,240));
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
                    Double valor = Double.parseDouble(tValor.getText());
                    boolean opcion = cuenta.retirarDinero(valor);
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
