package Ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Personaje personaje = new Personaje("Andy","0923456123",2000);
        System.out.println("---INFORMACION PERSONAJE---");
        System.out.println("Nombre: "+personaje.getNombre()+
                "\nAño Nacimiento: "+personaje.getAñoNacimiento()+
                "\nTelefono: "+personaje.getTelefono());


        System.out.print("Ingrese un nuevo numero de telefono: ");
        String numero = scan.nextLine();
        personaje.setTelefono(numero);
        System.out.println("El nuevo numero es: "+personaje.getTelefono());
    }
}
