package Ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //EJERCICIO 2
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el nombre del plato: ");
        String plato= scan.nextLine();
        System.out.print("Ingrese el numero de platos: ");
        int platos = scan.nextInt();
        System.out.print("Ingrese el precio del plato: ");
        double precio =scan.nextDouble();
        Factura factura = new Factura(platos,precio,plato);
        factura.calcularTotal();
        factura.mostrarFactura();
    }
}
