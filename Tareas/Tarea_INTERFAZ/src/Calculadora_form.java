import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_form {
    public JPanel jPanel_C;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JTextField tResultado;
    private JTextField tNum1;
    private JTextField tNum2;

    public Calculadora_form() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = 0.0, valor2 = 0.0;
                if(tNum1.getText().isEmpty()&&tNum2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }else if (tNum1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }else if (tNum2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                } else {
                    valor1 = Double.parseDouble(tNum1.getText());
                    valor2 = Double.parseDouble(tNum2.getText());
                    tResultado.setText(String.valueOf(valor1 + valor2));
                }
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = 0.0, valor2 = 0.0;

                if(tNum1.getText().isEmpty()&&tNum2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }else if (tNum1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }
                else if (tNum2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                } else {
                    valor1 = Double.parseDouble(tNum1.getText());
                    valor2 = Double.parseDouble(tNum2.getText());
                }
                tResultado.setText(String.valueOf(valor1 - valor2));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = 0.0, valor2 = 0.0;

                if(tNum1.getText().isEmpty()&&tNum2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }else if (tNum1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }
                else if (tNum2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                } else {
                    valor1 = Double.parseDouble(tNum1.getText());
                    valor2 = Double.parseDouble(tNum2.getText());
                }
                tResultado.setText(String.valueOf(valor1 * valor2));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = 0.0, valor2 = 0.0;
                if(Double.parseDouble(tNum2.getText()) == 0.0 ){
                    JOptionPane.showMessageDialog(null,"No es posible realizar la division para 0","Error",JOptionPane.ERROR_MESSAGE);
                }else if(tNum2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }else if(Double.parseDouble(tNum1.getText())==0.0&&Double.parseDouble(tNum2.getText())==0.0){
                    JOptionPane.showMessageDialog(null,"No es posible realizar la division para 0","Error",JOptionPane.ERROR_MESSAGE);
                }else if(tNum1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Error",JOptionPane.WARNING_MESSAGE);
                }else{
                    valor1 = Double.parseDouble(tNum1.getText());
                    valor2 = Double.parseDouble(tNum2.getText());
                }
                tResultado.setText(String.valueOf(valor1 / valor2));
            }
        });
    }
}
