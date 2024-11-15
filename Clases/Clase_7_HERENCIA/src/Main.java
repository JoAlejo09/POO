import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0,edad;
        String nombre,equipo;
        Scanner scanner = new Scanner(System.in);
        do{
            try {
                System.out.print("Seleccione un tipo de jugador\n1.Portero\n2.Defensa\n3.Delantero\nOpcion: ");
                opcion = scanner.nextInt();
         }catch (InputMismatchException e){
                System.out.println("Dato ingresado incorrectamente....");
                break;
          }
        }while(opcion<1 || opcion>3);
        switch (opcion){
            case 1:
                scanner.nextLine();
                System.out.print("Ingrese el nombre del Jugador: ");
                nombre = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Ingrese la edad: ");
                edad = scanner.nextInt();
                System.out.print("Ingrese el nombre del Equipo donde juega: ");
                equipo = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Ingrese el nro de la camiseta que usa: ");
                int camiseta = scanner.nextInt();
                Portero por = new Portero(nombre,edad,equipo,0,0,0,0,camiseta);
                por.mostrarInfo();
                break;
            default:
                System.out.println("Opcion Incorrecta.....");
                break;
        }


        /*Defensa def = new Defensa("Bryan",18,"ABC",180,0,5);
        def.mostrarInfo();
        Delantero del = new Delantero("Carlos",17,"123",90,1);
        del.mostrarInfo();*/
    }
}