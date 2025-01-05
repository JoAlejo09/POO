import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Busqueda {
    private JTextField textField1;
    private JTable table1;
    private JButton buscarButton;
    private JButton menuButton;
    public JPanel jPanel;
    public Busqueda(JFrame frame_act, JFrame frame_ant,String usuario){
        frame_ant.dispose();
        JFrame frame = new JFrame();
        Metodos met = new Metodos(frame);
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new Menu(frame,frame_act,usuario).jPanel;
                met.crearVentana("MENU INICIO",panel);
                met.generarDimensiones(300,300);
                met.iniciarVentana();
            }
        });
    }
}
