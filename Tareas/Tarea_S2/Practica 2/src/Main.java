import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        String nombre, cargo, ingreso;

        //Ingreso 1
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("\nIngrese la fecha en la que ingreso: ");
        ingreso = scanner.nextLine();
        System.out.print("\nIngrese el cargo que ocupa: ");
        cargo = scanner.nextLine();
        System.out.print("\nIngrese el salario que gana el empleado: ");
        salario = scanner.nextDouble();
        Empleado empleado_1 = new Empleado(nombre, cargo, ingreso, salario);
        empleado_1.mostrarEmpleado();
        scanner.nextLine();

        //Ingreso 2
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("\nIngrese la fecha en la que ingreso: ");
        ingreso = scanner.nextLine();
        System.out.print("\nIngrese el cargo que ocupa: ");
        cargo = scanner.nextLine();
        System.out.print("\nIngrese el salario que gana el empleado: ");
        salario = scanner.nextDouble();
        Empleado empleado_2 = new Empleado(nombre, cargo, ingreso, salario);
        empleado_2.mostrarEmpleado();
        scanner.nextLine();

        //Ingreso 3
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("\nIngrese la fecha en la que ingreso: ");
        ingreso = scanner.nextLine();
        System.out.print("\nIngrese el cargo que ocupa: ");
        cargo = scanner.nextLine();
        System.out.print("\nIngrese el salario que gana el empleado: ");
        salario = scanner.nextDouble();
        Empleado empleado_3 = new Empleado(nombre, cargo, ingreso, salario);
        empleado_3.mostrarEmpleado();
        scanner.nextLine();
    }
}