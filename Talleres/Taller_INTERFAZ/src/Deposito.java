import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito {
    private JTextField tValor;
    private JButton depositarButton;
    private JButton menuButton;
    public JPanel jDepositar;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton puntoButton;
    private JButton borrarButton;
    JFrame frame = new JFrame();
    public Deposito(Double valor) {
        Cuenta cuenta = new Cuenta(valor);
        a0Button.addActionListener(crearActionListener(tValor, "0"));
        a1Button.addActionListener(crearActionListener(tValor, "1"));
        a2Button.addActionListener(crearActionListener(tValor, "2"));
        a3Button.addActionListener(crearActionListener(tValor, "3"));
        a4Button.addActionListener(crearActionListener(tValor, "4"));
        a5Button.addActionListener(crearActionListener(tValor, "5"));
        a6Button.addActionListener(crearActionListener(tValor, "6"));
        a7Button.addActionListener(crearActionListener(tValor, "7"));
        a8Button.addActionListener(crearActionListener(tValor, "8"));
        a9Button.addActionListener(crearActionListener(tValor, "9"));
        puntoButton.addActionListener(crearActionListener(tValor,"."));
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tValor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Campo vacio.\nIngrese el valor a retirar...","Error",JOptionPane.WARNING_MESSAGE);
                }else if(Double.parseDouble(tValor.getText())==0.0){
                    JOptionPane.showMessageDialog(null,"No puede ser 0.\nIngrese el valor a retirar...","Error",JOptionPane.WARNING_MESSAGE);
                }else{
                    Double deposito = Double.parseDouble(tValor.getText());
                    cuenta.depositarDinero(deposito);
                    JOptionPane.showMessageDialog(null,"Se ha realizado la transaccion.\nSu saldo actual es: $"+cuenta.getDinero(),"Transaccion Realizada",JOptionPane.INFORMATION_MESSAGE);
                    }
                tValor.setText("");
            }
        });
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
                JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(jDepositar);
                loginFrame.dispose();
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorActual = new String(tValor.getText());
                if (!valorActual.isEmpty()) {
                    // Eliminar el último carácter
                    valorActual = valorActual.substring(0, valorActual.length() - 1);
                    tValor.setText(valorActual);
                }
            }
        });
    }
    private static ActionListener crearActionListener(JTextField texto, String valor) {
        return e -> {
            // Obtener la contraseña actual y agregar el nuevo valor
            String contrasenaActual = new String(texto.getText());
            contrasenaActual += valor;
            texto.setText(contrasenaActual);
        };
    }
}
