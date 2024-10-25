package Ejercicio_3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //EJERCICIO 3
        System.out.print("Ingrese el nombre del equipo: ");
        String equipo = scan.nextLine();
        Equipo equipo1 = new Equipo(equipo);
        System.out.print("Ingrese el nombre del Jugador: ");
        String jugador = scan.nextLine();
        System.out.print("Ingrese el año de nacimiento: ");
        int anio = scan.nextInt();
        System.out.print("Ingrese el Numero de su Camiseta: ");
        int nro = scan.nextInt();
        equipo1.inscribirJugador(jugador,anio,nro);
        equipo1.mostrarJugador();
        System.out.print("\n--INFORMACION DE NUMERO DE CAMISETA---");
        System.out.print("\nEl numero de camiseta actual es: "+equipo1.obtenerJugador().getNumeroCamiseta()+"\nIngrese el nuevo nro de camiseta: ");
        int nuevo_nro=scan.nextInt();
        equipo1.obtenerJugador().setNumeroCamiseta(nuevo_nro);
        System.out.println("CAMBIO REALIZADO......");
        equipo1.mostrarJugador();
    }
}