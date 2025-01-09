import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login {
    private JTextField tUsuario;
    private JPasswordField pContrasena;
    private JButton ingresarButton;
    public JPanel jPanel;

    public Login() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean res = false;
                if(tUsuario.getText().isEmpty()|pContrasena.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"","",JOptionPane.ERROR_MESSAGE);
                }else{
                    MetodosBase base = new MetodosBase();
                    base.conectarBase();
                    try {
                        res = base.consultaTabla(tUsuario.getText(),pContrasena.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    if(res){
                        JFrame frame = new JFrame();
                        frame.setTitle("Principal");
                        try {
                            frame.setContentPane(new Principal().jPanelP);
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        frame.setSize(80,120);
                        frame.setPreferredSize(new Dimension(600,500));
                        frame.pack();
                        frame.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null,"ERROR USUARIO O CONTRASEÑA INCORRECTO","",0);
                    }
                }

            }
        });
    }
}
