import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    private JButton jbutton;
    public JPanel jpanel;
    private JLabel jlabel_1;
    private JLabel jlabel_2;
    private JTextField textField3;
    private JLabel jlabel_3;

    public form1() {
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double valor1 = Double.parseDouble(textField1.getText());
                Double valor2 = Double.parseDouble(textField2.getText());
                Double total = valor1+valor2;
                textField3.setText(String.valueOf(total));
            }
        });
    }
}
