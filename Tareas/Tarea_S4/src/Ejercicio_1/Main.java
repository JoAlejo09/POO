package Ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nombre Personaje: ");
        String nombre = scan.nextLine();
        System.out.print("Telefono: ");
        String telefono = scan.nextLine();
        System.out.print("Año de Nacimiento: ");
        int anio = scan.nextInt();
        Personaje personaje = new Personaje(nombre,telefono,anio);
        System.out.println("---INFORMACION PERSONAJE---");
        System.out.println("Nombre: "+personaje.getNombre()+
                "\nAño Nacimiento: "+personaje.getAñoNacimiento()+
                "\nTelefono: "+personaje.getTelefono());
        System.out.print("Ingrese un nuevo numero de telefono: ");
        scan.nextLine();
        String numero = scan.nextLine();
        personaje.setTelefono(numero);
        System.out.println("El nuevo numero es: "+personaje.getTelefono());
        System.out.println("---INFORMACION PERSONAJE ACTUALIZADO---");
        System.out.println("Nombre: "+personaje.getNombre()+
                "\nAño Nacimiento: "+personaje.getAñoNacimiento()+
                "\nTelefono: "+personaje.getTelefono());

    }
}
