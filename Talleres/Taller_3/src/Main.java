import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Registro de informacion de Jugadores");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String avatar = scanner.nextLine();
        System.out.print("Ingrese la edad:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el pais de donde proviene:");
        String pais = scanner.nextLine();
        Jugador jugador1 = new Jugador(edad,pais,avatar);

        System.out.print("Ingrese el nombre: ");
        avatar = scanner.nextLine();
        System.out.print("Ingrese la edad:");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el pais de donde proviene:");
        pais = scanner.nextLine();
        Jugador jugador2 = new Jugador(edad,pais,avatar);

        System.out.println("-------INFORMACION ----------");

        jugador1.imprimir();
        jugador2.imprimir();

        System.out.println("-------ACCIONES ----------");
        jugador1.patear();
        System.out.println("--------------------------");
        jugador1.correr();
        System.out.println("--------------------------");
        jugador2.imprimir();
        jugador2.patear();
        System.out.println("--------------------------");
        jugador2.correr();
        System.out.println("--------------------------");
        System.out.println("Ingrese el numero de saltos que quiere dar: ");
        int saltos = scanner.nextInt();
        jugador2.saltar(saltos);
        System.out.println("--------------------------");
    }
}