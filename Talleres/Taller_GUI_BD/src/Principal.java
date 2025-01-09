import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {
    private JTextField tNombre;
    private JTextField tApellido;
    private JTextField tEdad;
    private JTextField tCorreo;
    private JButton insertarButton;
    private JTable table1;
    public JPanel jPanelP;
    private JButton salirButton;
    MetodosBase base = new MetodosBase();
    public Principal() throws SQLException {
        base.conectarBase();
        actualizarTabla();
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                base.finalizarBase();
                System.exit(0);
            }
        });
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {int edad = Integer.parseInt(tEdad.getText());
                if(tNombre.getText().isEmpty()||tApellido.getText().isEmpty()||tEdad.getText().isEmpty()||tCorreo.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"NO PUEDE TENER ESPACIOS VACIOS","ERROR",0);
                }
                if(edad<18 || edad>40){
                    JOptionPane.showMessageDialog(null,"EDAD NO VALIDA. DEBE ESTAR ENTRE 18 Y 40 AÑOS","ERROR",0);
                    tEdad.setText("");
                }else{
                    try {
                        base.insertarRegistro(tNombre.getText(),tApellido.getText(),edad,tCorreo.getText());
                        actualizarTabla();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }
    public void actualizarTabla() throws SQLException{
        ResultSet res = base.consultarTabla();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cod");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Edad");
        model.addColumn("Correo");
        while (res.next()) {
            Object[] fila = {res.getInt("cod"), res.getString("nombre"), res.getString("apellido"),res.getInt("edad"),res.getString("correo")};
            model.addRow(fila);
        }
        table1.setModel(model);
    }
}
