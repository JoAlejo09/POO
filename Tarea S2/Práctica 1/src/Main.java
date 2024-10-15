import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombre, posicion;
        int edad, camiseta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador: ");
        nombre = scanner.nextLine();
        System.out.print("\nIngrese la posicion donde juega el jugador: ");
        posicion = scanner.nextLine();
        System.out.print("\nIngrese la edad del jugador: ");
        edad = scanner.nextInt();
        System.out.print("\nIngrese el numero de la camiseta del jugador: ");
        camiseta = scanner.nextInt();
        Jugador jugador_1 = new Jugador(nombre, posicion, edad, camiseta);
        jugador_1.mostrarJugador();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del jugador: ");
        nombre = scanner.nextLine();
        System.out.print("\nIngrese la posicion donde juega el jugador: ");
        posicion = scanner.nextLine();
        System.out.print("\nIngrese la edad del jugador: ");
        edad = scanner.nextInt();
        System.out.print("\nIngrese el numero de la camiseta del jugador: ");
        camiseta = scanner.nextInt();
        Jugador jugador_2 = new Jugador(nombre, posicion, edad, camiseta);
        jugador_2.mostrarJugador();
        scanner.nextLine();


        System.out.print("Ingrese el nombre del jugador: ");
        nombre = scanner.nextLine();
        System.out.print("\nIngrese la posicion donde juega el jugador: ");
        posicion = scanner.nextLine();
        System.out.print("\nIngrese la edad del jugador: ");
        edad = scanner.nextInt();
        System.out.print("\nIngrese el numero de la camiseta del jugador: ");
        camiseta = scanner.nextInt();
        Jugador jugador_3 = new Jugador(nombre, posicion, edad, camiseta);
        jugador_3.mostrarJugador();
        scanner.nextLine();
    }
}