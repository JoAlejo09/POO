import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Metodos met = new Metodos(frame);
        JPanel panel = new Login(frame).jPanel;
        met.crearVentana("LOGIN/REGISTRO",panel);
        met.generarDimensiones(300,200);
        met.iniciarVentana();

    }
}