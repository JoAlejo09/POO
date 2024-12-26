import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField tUsuario;
    private JPasswordField pContraseña;
    private JButton ingresarButton;
    public JPanel jPanel;
    Metodos met = new Metodos();
    public Login() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = met.validarUSuario(tUsuario.getText());
                int j = met.validadContra(pContraseña.getText());
                if (tUsuario.getText().isEmpty() | pContraseña.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No puede haber espacios en blanco....", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    if(i==0 && j==0){
                }
                    else{
                    JOptionPane.showMessageDialog(null,"Registro Incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
                }}
            }
        });
    }
}
