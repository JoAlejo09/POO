import Ejercicio_1.Personaje;
import Ejercicio_2.Factura;
import Ejercicio_2.Plato;
import Ejercicio_3.Jugador;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------MENU----------");
        System.out.println("OPCIONES:\n1. Ejercicio 1 - Clase Personaje.\n2. Clases Plato y Factura.\n3. Clase Jugador y Equipo");
        System.out.print("Seleccione la opcion: ");
        //EJERCICIO 1
        Personaje personaje = new Personaje("Andy","0923456123",2000);
        System.out.println("---INFORMACION PERSONAJE---");
        System.out.println("Nombre: "+personaje.getNombre()+
                    "\nAño Nacimiento: "+personaje.getAñoNacimiento()+
                    "\nTelefono: "+personaje.getTelefono());


        System.out.print("Ingrese un nuevo numero de telefono: ");
        String numero = scan.nextLine();
        personaje.setTelefono(numero);
        System.out.println("El nuevo numero es: "+personaje.getTelefono());
        //EJERCICIO 2
        Factura factura = new Factura(2,22.55,"Chaulafan");
        factura.calcularTotal();
        factura.mostrarFactura();
        //EJERCICIO 3

    }
}