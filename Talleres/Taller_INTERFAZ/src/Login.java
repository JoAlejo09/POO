import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPasswordField passwordField1;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton entrarButton;
    public JPanel jPanel;
    private JButton borrarButton;
    private final String CONTRASENA_VALIDA ="12345";
    public Login() {
        a0Button.addActionListener(crearActionListener(passwordField1, "0"));
        a1Button.addActionListener(crearActionListener(passwordField1, "1"));
        a2Button.addActionListener(crearActionListener(passwordField1, "2"));
        a3Button.addActionListener(crearActionListener(passwordField1, "3"));
        a4Button.addActionListener(crearActionListener(passwordField1, "4"));
        a5Button.addActionListener(crearActionListener(passwordField1, "5"));
        a6Button.addActionListener(crearActionListener(passwordField1, "6"));
        a7Button.addActionListener(crearActionListener(passwordField1, "7"));
        a8Button.addActionListener(crearActionListener(passwordField1, "8"));
        a9Button.addActionListener(crearActionListener(passwordField1, "9"));


        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valor = validar();
                if(valor){
                    mostrarMensaje("Usuario registrado correctamente","Registro Correcto",JOptionPane.PLAIN_MESSAGE);
                    mostrarPantalla();
                    cerrarVentana();
                }else{
                    mostrarMensaje("Login incorrecto. Ingreselo nuevamente...","Error",JOptionPane.ERROR_MESSAGE);
                    passwordField1.setText("");
                }

            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorActual = new String(passwordField1.getPassword());
                if (!valorActual.isEmpty()) {
                    // Eliminar el último carácter
                    valorActual = valorActual.substring(0, valorActual.length() - 1);
                    passwordField1.setText(valorActual);
                }
            }
        });
    }
    private static ActionListener crearActionListener(JPasswordField passwordField, String valor) {
            return e -> {
                // Obtener la contraseña actual y agregar el nuevo valor
                String contrasenaActual = new String(passwordField.getPassword());
                contrasenaActual += valor;
                passwordField.setText(contrasenaActual);
            };
    }
    public boolean validar(){
        String password= new String(passwordField1.getPassword());
        return CONTRASENA_VALIDA.compareToIgnoreCase(password)==0;
    }
    public void mostrarMensaje(String mensaje, String titulo,int tipo){
        JOptionPane.showMessageDialog(null,mensaje,titulo,tipo);
    }
    public void mostrarPantalla(){
        JFrame frame = new JFrame("Menu Principal");
        frame.setContentPane(new Menu((double) 100).jMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(40,60);
        frame.setPreferredSize(new Dimension(320,290));
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
    public void cerrarVentana(){
        JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(jPanel);
        loginFrame.dispose();
    }
}
