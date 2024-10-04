import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tarea 2\nNombre:Jose Pila\nFecha:9/10/2024\n");
        //EJERCICIO 1
        Persona nueva_Persona = new Persona();
        System.out.println("---------------EJERCICIO 1---------------");
        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su genero 1.M / 2.F : ");
        int genero = scanner.nextInt();
        if (genero==1)
            nueva_Persona.setGenero("Masculino");
        else
            nueva_Persona.setGenero("Femenino");
        nueva_Persona.setNombre(nombre);
        nueva_Persona.setEdad(edad);
        nueva_Persona.Presentarse();

        //EJERCICIO 2
        System.out.println("---------------EJERCICIO 2---------------");
        Libro nuevo_Libro = new Libro();

        System.out.print("Ingrese el nombre del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el nommbre del autor del libro: ");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el numero de paginas del libro; ");
        int numPaginas = scanner.nextInt();
        nuevo_Libro.setTitulo(titulo);
        nuevo_Libro.setAutor(autor);
        nuevo_Libro.setPaginaCount(numPaginas);
    }

}