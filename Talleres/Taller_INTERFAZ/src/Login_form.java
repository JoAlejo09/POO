import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_form {
    private JButton bAcceder;
    public JPanel jPanel;
    private JPasswordField pContraseña;
    private JTextField tUsuario;
    private final String USUARIO_VALIDO ="Pila";
    private final String CONTRASENA_VALIDA ="Pila123";

    public Login_form() {

        bAcceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean valor = validar();
                if(valor){
                    mostrarMensaje("Usuario registrado correctamente","Registro Correcto",JOptionPane.PLAIN_MESSAGE);
                    mostrarPantalla();
                    cerrarVentana();
                }else{
                    mostrarMensaje("Login incorrecto. Ingreselo nuevamente...","Error",JOptionPane.ERROR_MESSAGE);
                    tUsuario.setText("");
                    pContraseña.setText("");
                }

            }
        });
    }
    public boolean validar(){
        String password= new String(pContraseña.getPassword());
       return USUARIO_VALIDO.compareToIgnoreCase(tUsuario.getText()) == 0  && CONTRASENA_VALIDA.compareToIgnoreCase(password)==0;
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
