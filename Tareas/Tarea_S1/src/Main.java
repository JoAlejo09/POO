import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner_1 = new Scanner(System.in);
        System.out.println("Tarea 2\nNombre:Jose Pila\nFecha:9/10/2024\n");
        //EJERCICIO 1
        System.out.print("Seleccione una de las opciones:\n" +
                "1. Practica 1: Clase Persona\n" +
                "2. Practica 2: Clase Libro\n" +
                "Opcion:  ");
        int opc = scanner.nextInt();
        if (opc == 1) {
            Persona nueva_Persona = new Persona();
            System.out.println("---------------EJERCICIO 1---------------");
            System.out.print("Ingrese su nombre y apellido: ");
            String nombre = scanner_1.nextLine();
            System.out.print("Ingrese su edad: ");
            int edad = scanner_1.nextInt();
            System.out.print("Ingrese su genero 1.M / 2.F : ");
            int genero = scanner_1.nextInt();
            if (genero == 1)
                nueva_Persona.setGenero("Masculino");
            else
                nueva_Persona.setGenero("Femenino");
            nueva_Persona.setNombre(nombre);
            nueva_Persona.setEdad(edad);
            nueva_Persona.Presentarse();
        } else if (opc == 2) {
            //EJERCICIO 2
            System.out.println("---------------EJERCICIO 2---------------");
            Libro nuevo_Libro = new Libro();
            System.out.print("Ingrese el nombre del libro: ");
            String titulo = scanner_1.nextLine();
            System.out.print("Ingrese el nommbre del autor del libro: ");
            String autor = scanner_1.nextLine();
            System.out.print("Ingrese el numero de paginas del libro:  ");
            int numPaginas = scanner_1.nextInt();
            nuevo_Libro.setTitulo(titulo);
            nuevo_Libro.setAutor(autor);
            nuevo_Libro.setPaginaCount(numPaginas);
            nuevo_Libro.infoLibro();
        }
    }
}