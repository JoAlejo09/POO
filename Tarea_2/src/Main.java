import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona nueva_Persona = new Persona();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su genero 1.M / 2.F ");
        int genero = scanner.nextInt();
        if (genero==1)
            nueva_Persona.setGenero("Masculino");
        else
            nueva_Persona.setGenero("Femenino");
        nueva_Persona.setNombre(nombre);
        nueva_Persona.setEdad(edad);
        nueva_Persona.Presentarse();

    }

}