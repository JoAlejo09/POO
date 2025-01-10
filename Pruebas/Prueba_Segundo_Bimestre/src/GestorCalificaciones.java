import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorCalificaciones {
    private JTextField tCedula;
    private JTextField nombre;
    private JTextField nota1;
    private JTextField nota2;
    private JTextField nota3;
    private JTextField nota4;
    private JTextField nota5;
    private JButton agregarButton;
    private JTable table1;
    private JTextField tPromedio;
    private JTextField tEstado;
    private JLabel tNombre;
    private JLabel tN1;
    private JPanel tN2;
    private JLabel tN3;
    private JLabel tN4;
    private JLabel tN5;
    public JPanel jPanelG;
    BaseDatosMetodos base = new BaseDatosMetodos();
    ResultSet res;
    public GestorCalificaciones() throws SQLException {
        base.conectarBase();//CONECCION A LA BASE DE DATOS
        llenarTabla(); //METODO QUE MUESTRA LA INFORMACION DE LA BASE DE DATOS EN UNA TABLA
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tCedula.getText().isEmpty()||nombre.getText().isEmpty()||nota1.getText().isEmpty()||nota2.getText().isEmpty()||nota3.getText().isEmpty()||nota4.getText().isEmpty()||nota5.getText().isEmpty()){
                    //VALIDAR QUE LOS VALORES NO ESTE EN BLANCO
                    JOptionPane.showMessageDialog(null,"NO PUEDE HABER ESPACIOS SIN LLENAR","ERROR",0);
                }//LOS SIGUIENTES ELSE IF VALIDAN QUE LAS NOTAS ESTEN ENTRE 0 Y 20
                else if(Double.parseDouble(nota1.getText())<0||Double.parseDouble(nota1.getText())>20){
                    JOptionPane.showMessageDialog(null,"ERROR EN INGRESAR LA NOTA 1. INGRESELO NUEVAMENTE","ERROR",0);
                    nota1.setText("");
                }else if (Double.parseDouble(nota2.getText())<0||Double.parseDouble(nota2.getText())>20){
                    JOptionPane.showMessageDialog(null,"ERROR EN INGRESAR LA NOTA 2. INGRESELO NUEVAMENTE","ERROR",0);
                    nota2.setText("");
                }else if (Double.parseDouble(nota3.getText())<0||Double.parseDouble(nota3.getText())>20){
                    JOptionPane.showMessageDialog(null,"ERROR EN INGRESAR LA NOTA 3. INGRESELO NUEVAMENTE","ERROR",0);
                    nota3.setText("");
                }else if (Double.parseDouble(nota4.getText())<0||Double.parseDouble(nota4.getText())>20){
                    JOptionPane.showMessageDialog(null,"ERROR EN INGRESAR LA NOTA 4. INGRESELO NUEVAMENTE","ERROR",0);
                    nota4.setText("");
                }else if (Double.parseDouble(nota5.getText())<0||Double.parseDouble(nota5.getText())>20) {
                    JOptionPane.showMessageDialog(null, "ERROR EN INGRESAR LA NOTA 2. INGRESELO NUEVAMENTE", "ERROR", 0);
                    nota5.setText("");
                }else{
                    try {
                        //LLAMADO DEL METODO PARA AGREGAR REGISTRO
                        int i = base.agregarRegistro(tCedula.getText(),nombre.getText(),Double.parseDouble(nota1.getText()),Double.parseDouble(nota2.getText()),Double.parseDouble(nota3.getText()),Double.parseDouble(nota4.getText()),Double.parseDouble(nota5.getText()));
                        if(i>0){
                            JOptionPane.showMessageDialog(null,"REGISTRO AGREGADO CORRECTAMENTE","CREACION",1);
                            llenarTabla(); //METODO QUE ACTUALIZA LA TABLA UNA VEZ INGRESADO EL VALOR
                            Double promedio = calcularPromedio(); //METODO QUE CALCULA EL PROMEDIO DE LAS NOTAS INGRESADAS
                            validarAprobacion(promedio); //METODO QUE VALIDA SI EL ESTUDIANTE APRUEBA O NO
                    } else{
                            JOptionPane.showMessageDialog(null,"No se ha agregado el registro","ERROR",0);
                        }
                    }catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }
    public void llenarTabla() throws SQLException {
        res = base.consultarCalificaciones();
        //CREACION DE LAS COLUMNAS QUE TENDRA LA TABLA QUE SERA MOSTRADA
        DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Cedula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Nota 1");
            modelo.addColumn("Nota 2");
            modelo.addColumn("Nota 3");
            modelo.addColumn("Nota 4");
            modelo.addColumn("Nota 5");
            //ADICION DE LOS VALORES QUE TIENE LA TABLA ESTUDIANTES A LA TABLA DE LA INTERFAZ
            while (res.next()) {
                //AÑADIR UNA NUEVA FILA A LA TABLA
                modelo.addRow(new Object[]{
                        //SE CREA UN OBJETO QUE CONTENDRA TODOS LOS VALORES DE CADA REGISTRO DE LA TABLA ESTUDIANTES
                    res.getInt("id"),
                    res.getString("cedula"),
                    res.getString("nombre"),
                    res.getDouble("estudiante1"),
                    res.getDouble("estudiante2"),
                    res.getDouble("estudiante3"),
                    res.getDouble("estudiante4"),
                    res.getDouble("estudiante5"),
        });
            }
            //SE AÑADE EL MODELO A LA TABLA DE LA INTERFAZ
            table1.setModel(modelo);
    }
    //FUNCION QUE CALCULARA EL PROMEDIO DE LAS NOTAS INGRESADAS
    public double calcularPromedio(){
            double n1,n2,n3,n4,n5,promedio = 0;
            n1=Double.parseDouble(nota1.getText());
            n2=Double.parseDouble(nota2.getText());
            n3=Double.parseDouble(nota3.getText());
            n4=Double.parseDouble(nota4.getText());
            n5=Double.parseDouble(nota5.getText());
            promedio = (n1+n2+n3+n4+n5);
            tPromedio.setText(String.valueOf(promedio));

            return promedio;
    }
    //METODO QUE VALIDA SI EL ESTUDIANTE APRUEBA O NO
    public void validarAprobacion(Double promedio){
     if(promedio>60){
         tEstado.setText("APROBADO");
     }else
         tEstado.setText("REPROBADO");
    }
}
