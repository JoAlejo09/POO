import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class AgreJugadores {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton agregarButton;
    private JButton menúButton;
    public JPanel jPanel;
public AgreJugadores(JFrame frame_act, JFrame frame_ant,String usuario)throws SQLException {
    frame_ant.dispose();
    JFrame frame = new JFrame();
    Metodos met = new Metodos(frame);
    BaseMet base = new BaseMet();
    textField1.setText(String.valueOf(base.hallarUltimoId()+1));
    menúButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel panel = new Menu(frame,frame_act,usuario).jPanel;
            met.crearVentana("MENU INICIO",panel);
            met.generarDimensiones(300,300);
            met.iniciarVentana();
        }
    });
    agregarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int res = 0;
            if(textField2.getText().isEmpty()| textField3.getText().isEmpty()|textField4.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"HAY ESPACIOS QUE NO DEBEN ESTAR EN BLANCO","ERROR",JOptionPane.ERROR_MESSAGE);
            }else{
                int id = Integer.parseInt(textField1.getText());
                String nombre = textField2.getText();
                String posicion =textField3.getText();
                int edad =  Integer.parseInt(textField4.getText());
                String equipo = textField5.getText();
                try {
                    res = base.agregarRegistro(id,nombre,posicion,equipo,edad);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                if(res>0){
                    JOptionPane.showMessageDialog(null,"REGISTRO AGREGADO CORRECTAMENTE","CREACION",JOptionPane.INFORMATION_MESSAGE);
                    try {
                        textField1.setText(String.valueOf(base.hallarUltimoId()+1));
                        textField2.setText("");
                        textField3.setText("");
                        textField4.setText("");
                        textField5.setText("");
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        }
    });
}
}
