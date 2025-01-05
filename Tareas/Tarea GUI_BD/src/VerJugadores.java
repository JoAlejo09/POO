import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerJugadores {
    private JButton actualizarButton;
    private JButton menúButton;
    public JPanel jPanel;
    private JTable tabla;


    public VerJugadores(JFrame frame_act, JFrame frame_ant, String usuario) throws SQLException {
        frame_ant.dispose();
        JFrame frame = new JFrame();
        Metodos met = new Metodos(frame);
        llenarTabla();
            menúButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JPanel panel = new Menu(frame, frame_act, usuario).jPanel;
                    met.crearVentana("MENU INICIO", panel);
                    met.generarDimensiones(300, 300);
                    met.iniciarVentana();
                }
            });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    llenarTabla();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
        public void llenarTabla() throws SQLException {
            BaseMet bas = new BaseMet();
            ResultSet resultado = bas.ejecutarConsulta("SELECT * FROM Jugadores");
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Posición");
            modelo.addColumn("Equipo");
            modelo.addColumn("Edad");
            while (resultado.next()) {
                modelo.addRow(new Object[]{
                        resultado.getInt("id"),
                        resultado.getString("nombre"),
                        resultado.getString("posicion"),
                        resultado.getString("equipo"),
                        resultado.getInt("edad")});
            }
            tabla.setModel(modelo);
        }
    }