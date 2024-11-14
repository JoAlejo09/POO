import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor =0;
        float gasolina;
        Coche coche = new Coche("Renault", "Gold",2012,600,"Azul");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de km recorridos: ");
        valor = scanner.nextInt();
        gasolina = coche.agregarConsumoGasolina( valor);
        System.out.println("El coche ha recorrido "+coche.kilometraje+
                "km\nEl coche ha gastado "+valor+"L de gasolina");
        float costo = coche.calcularCostooperacion(gasolina, (float) 5.23);
        System.out.println("El costo de reparacion es de $"+ costo);
    }
}