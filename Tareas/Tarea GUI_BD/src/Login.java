import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField tUsuario;
    private JPasswordField pContraseña;
    private JButton ingresarButton;
    public JPanel jPanel;
    Metodos met;
    public Login(JFrame frameActual) {
        JFrame frame = new JFrame();
        met = new Metodos(frame);
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
                        JPanel panel = new Menu(frame,frameActual,tUsuario.getText()).jPanel;
                        met.crearVentana("MENU INICIO",panel);
                        met.generarDimensiones(300,300);
                        met.iniciarVentana();

                }
                    else{
                    JOptionPane.showMessageDialog(null,"Registro Incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
                }}
            }
        });
    }
    public Login(JFrame frameActual, JFrame frameAnt){
        frameAnt.dispose();
        JFrame frame = new JFrame();
        met = new Metodos(frame);
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
                       JPanel panel = new Menu(frame,frameActual,tUsuario.getText()).jPanel;
                        met.crearVentana("MENU INICIO",panel);
                        met.generarDimensiones(300,300);
                        met.iniciarVentana();

                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Registro Incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
                    }}
            }
        });
    }
}
