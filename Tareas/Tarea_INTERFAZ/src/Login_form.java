import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_form {
    private JButton bAcceder;
    public JPanel jPanel;
    private JPasswordField pContraseña;
    private JTextField tUsuario;


    public Login_form() {
        bAcceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valor = validar();
                if(valor){
                    jPanel.setVisible(false);
                    new Login_form().jPanel.setVisible(false);
                    JFrame frame = new JFrame("CALCULAORA");
                    frame.setContentPane(new Calculadora_form().jPanel_C);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(40,60);
                    frame.setPreferredSize(new Dimension(640,480));
                    frame.pack();
                    frame.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Login incorrecto. Ingreselo nuevamente...","Error",JOptionPane.ERROR_MESSAGE);
                    tUsuario.setText("");
                    pContraseña.setText("");
                }

            }
        });
    }
    public boolean validar(){
        int valor = tUsuario.getText().compareToIgnoreCase("Pila");
        int valor_1 = pContraseña.getText().compareToIgnoreCase("Pila123");
        if(valor ==0 && valor_1==0)
        {return true;}else{ return false;}
    }
}
