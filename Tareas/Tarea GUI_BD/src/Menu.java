import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public JPanel jPanel;
    private JButton verButton;
    private JButton agregarButton;
    private JButton buscarButton;
    private JButton eliminarButton;
    private JButton cerrarSesiónButton;
    private JButton salirButton;
    private JLabel lBien;

    public Menu(JFrame frame_act, JFrame frame_ant,String usuario){
        frame_ant.dispose();
        lBien.setText("Bienvenido Usuario: "+usuario);

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Saliendo","",JOptionPane.PLAIN_MESSAGE);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });
        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                Metodos met  = new Metodos(frame);
                JPanel panel = new Login(frame,frame_act).jPanel;
                met.crearVentana("LOGIN/REGISTRO",panel);
                met.generarDimensiones(300,200);
                met.iniciarVentana();
            }
        });
    }
}
