import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    private JButton bSeleccion;
    public JPanel jMenu;
    private JPanel jList;
    ButtonGroup grupo = new ButtonGroup();
    public Menu(Double valor){
        grupo.add(verSaldoRadioButton);
        grupo.add(retiroRadioButton);
        grupo.add(depositoRadioButton);
        grupo.add(salirRadioButton);
        bSeleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                if (verSaldoRadioButton.isSelected()){
                    frame.setTitle("SALDO CLIENTE");
                    frame.setContentPane(new Saldo(valor).jSaldo);
                    frame.setPreferredSize(new Dimension(370,240));
                }else if(retiroRadioButton.isSelected()) {
                    frame.setTitle("RETIRO DINERO");
                    frame.setContentPane(new Retiro(valor).jRetiro);
                    frame.setPreferredSize(new Dimension(320,310));
                }else if(depositoRadioButton.isSelected()){
                    frame.setTitle("DEPOSITO DINERO");
                    frame.setContentPane(new Deposito(valor).jDepositar);
                    frame.setPreferredSize(new Dimension(320,310));
                }else if(salirRadioButton.isSelected()){
                    JOptionPane.showMessageDialog(null,"GRACIAS POR USAR LA APLICACION","SALIENDO....",JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                }
                else{
                    JOptionPane.showMessageDialog(null,"SELECCIONE UNA OPCION.","ALERTA",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(40,60);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
                JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(jMenu);
                loginFrame.dispose();
            }
        });
    }


}
