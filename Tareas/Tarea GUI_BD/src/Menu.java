import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
        JFrame frame = new JFrame();
        Metodos met  = new Metodos(frame);
        frame_ant.dispose();
        lBien.setText("Bienvenido Usuario: "+usuario);
        verButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = null;
                try {
                    panel = new VerJugadores(frame,frame_act,usuario).jPanel;
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                met.crearVentana("LISTADO DE JUGADORES",panel);
                met.generarDimensiones(600,400);
                met.iniciarVentana();
            }
        });
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new AgreJugadores(frame,frame_act,usuario).jPanel;
                met.crearVentana("AGREGAR NUEVO JUGADOR",panel);
                met.generarDimensiones(600,400);
                met.iniciarVentana();
            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new Busqueda(frame,frame_act,usuario).jPanel;
                met.crearVentana("BUSQUEDA",panel);
                met.generarDimensiones(600,400);
                met.iniciarVentana();

            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new ElimJugador(frame,frame_act,usuario).jPanel;
                met.crearVentana("ELIMINAR", panel);
                met.generarDimensiones(400,200);
                met.iniciarVentana();
            }
        });
        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new Login(frame,frame_act).jPanel;
                met.crearVentana("LOGIN/REGISTRO",panel);
                met.generarDimensiones(300,200);
                met.iniciarVentana();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Saliendo","",JOptionPane.PLAIN_MESSAGE);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });
    }
}
