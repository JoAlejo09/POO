import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgreJugadores {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton agregarButton;
    private JButton menúButton;
    public JPanel jPanel;
public AgreJugadores(JFrame frame_act, JFrame frame_ant,String usuario){
    frame_ant.dispose();
    JFrame frame = new JFrame();
    Metodos met = new Metodos(frame);
    menúButton.addActionListener(new ActionListener() {
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
