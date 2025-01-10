import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login {
    private JTextField tUsuario;
    private JPasswordField pContrasena;
    private JButton accederButton;
    public JPanel jPanelL;
    BaseDatosMetodos base = new BaseDatosMetodos();
    JFrame frame = new JFrame();
    public Login() {
        base.conectarBase();
        accederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int i = base.consultarUsuario(tUsuario.getText(),pContrasena.getText());
                    if(i<=0){
                        JOptionPane.showMessageDialog(null,"USUARIO O PASSWORD INCORRECTOS....","ERROR",0);
                    }else{
                        JOptionPane.showMessageDialog(null,"USUARIO REGISTRADO","",1);
                        frame.setTitle("REGISTRO DE CALIFICACIONES");
                        frame.setContentPane(new GestorCalificaciones().jPanelG);
                        frame.setSize(100,80);
                        frame.setPreferredSize(new Dimension(700,500));
                        frame.setLocationRelativeTo(null);
                        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                        frame.pack();
                        frame.setVisible(true);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
