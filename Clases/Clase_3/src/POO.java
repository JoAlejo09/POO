import java.util.Scanner;

public class POO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String asignatura,dias;
        int horas;
        System.out.print("Ingrese el nomrbre de la asignatura: ");
        asignatura = scanner.nextLine();
        System.out.print("Ingrese los dias de clases: ");
        dias = scanner.nextLine();
        System.out.print("Ingrese las horas de clase: ");
        horas = scanner.nextInt();
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Nombre asignatura: "+asignatura+"\n Dias de clase: "+dias+"\nHoras de clase a la semana: "+horas);

    }
}