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
                    JOptionPane.showMessageDialog(null,"Usuario registrado correctamente","Registro Correcto",JOptionPane.PLAIN_MESSAGE);
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
