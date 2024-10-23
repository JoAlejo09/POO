import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CREACION OBJETO CON DATOS QUEMADOS
        Empleado empleado = new Empleado("Joaquin Pelaez",22,480.33);

        //CREACION DE OBJETO PIDIENDO DATOS (USO DE SCANNER)
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre_empleado = scan.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad_empleado = scan.nextInt();
        System.out.print("Ingrese el salario que gana: ");
        double salario_empleado =scan.nextDouble();

        Empleado empleado_1 = new Empleado(nombre_empleado,edad_empleado,salario_empleado);

        //MUESTRA DE VALORES DLE EMPLEADO 1
        System.out.print("\n----------EMPLEADO 1----------\nNombre Empleado: "+empleado.getNombre()+
                "\nEdad del empleado: "+empleado.getEdad()+" años\nSalario del empleado: "+empleado.getSalario());

        //MUESTRA DE VALORES DLE EMPLEADO 2
        System.out.print("\n----------EMPLEADO 2----------\nNombre Empleado: "+empleado_1.getNombre()+
                "\nEdad del empleado: "+empleado_1.getEdad()+" años\nSalario del empleado: "+empleado_1.getSalario());

    }
}