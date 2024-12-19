import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Principal registro = new Principal();
        int valor, cont=1;
        do {
        System.out.println("----MENU--------");
        System.out.print("1.Mostrar Clientes\n2.Agregar Cliente\n3.Salir.\nSeleccione una opcion: ");
        valor= scan.nextInt();
            if (valor == 1) {
                System.out.println(registro.toString());
            } else if (valor == 2) {
                String nombre, cedula;
                scan.nextLine();
                System.out.print("Ingrese su nombre y apellido: ");
                String nombres = scan.nextLine();
                System.out.print("Ingrese su cedula: ");
                String ced = scan.nextLine();
                registro.agregarCliente(nombres, ced);
            }else if(valor==3){
                cont=0;
                return;
            }else{
                System.out.println("El valor ingresado es incorrecto.....");
            }
            System.out.println("Desea continuar. 1.Si/2.No. Seleccione: ");
            cont = scan.nextInt();
        }while(cont==1);
    }
}