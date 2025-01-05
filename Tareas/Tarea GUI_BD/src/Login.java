import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login {
    private JTextField tUsuario;
    private JPasswordField pContraseña;
    private JButton ingresarButton;
    public JPanel jPanel;
    Metodos met;
    BaseMet bas;
    public Login(JFrame frameActual) {
        JFrame frame = new JFrame();
        met = new Metodos(frame);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tUsuario.getText().isEmpty() | pContraseña.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No puede haber espacios en blanco....", "ERROR", JOptionPane.WARNING_MESSAGE);
                }else{
                    String sql ="SELECT COUNT(*) AS total FROM usuarios WHERE usuario =\'"+tUsuario.getText()+"\'and contrasena=\'"+pContraseña.getText()+"\'";
                    try {
                        bas = new BaseMet();
                        int valor = bas.validarLogin(sql);
                        if (valor >= 1) {
                            JPanel panel = new Menu(frame, frameActual, tUsuario.getText()).jPanel;
                            met.crearVentana("MENU INICIO", panel);
                            met.generarDimensiones(300, 300);
                            met.iniciarVentana();
                        }else{
                            JOptionPane.showMessageDialog(null,"Registro Incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
                    }} catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
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
                if (tUsuario.getText().isEmpty() | pContraseña.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No puede haber espacios en blanco....", "ERROR", JOptionPane.WARNING_MESSAGE);
                }else{
                    String sql ="SELECT COUNT(*) AS total FROM usuarios WHERE usuario =\'"+tUsuario.getText()+"\'and contrasena=\'"+pContraseña.getText()+"\'";
                    try {
                        bas = new BaseMet();
                        int valor = bas.validarLogin(sql);
                        if (valor >= 1) {
                            JPanel panel = new Menu(frame, frameActual, tUsuario.getText()).jPanel;
                            met.crearVentana("MENU INICIO", panel);
                            met.generarDimensiones(300, 300);
                            met.iniciarVentana();
                        }else{
                            JOptionPane.showMessageDialog(null,"Registro Incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
                        }} catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }
}
