package Cuentas;

import java.util.Scanner;

import static java.lang.Thread.*;

public class Main{
    public static void main(String []args) {
        double valor;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        CuentaAhorro ahorro = new CuentaAhorro("CA-001", "Jose Pila");
        CuentaCorriente corriente = new CuentaCorriente("CC-001", "Alejandro Vizuete");
        int inicio = 1;
        do {
            System.out.print("----------Menu----------\n" +
                    "1.Ver informacion del cliente y saldo.\n" +
                    "2.Transferir entre cuentas.\n" +
                    "3.Retirar dinero.\n" +
                    "4.Depositar dinero.\n" +
                    "5.Salir\nSeleccione una opcion:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ahorro.mostrarInformacion();
                    corriente.mostrarInformacion();
                    try {
                        System.out.println("Volviendo al menu.........");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.print("---TRANSFERENCIA ENTRE CUENTAS---\n" +
                            "1.De la Cuenta Corriente a la Ahorros.\n" +
                            "2.De la Cuenta Ahorros a la Corriente\n" +
                            "Seleccione una opcion: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("---------TRANSFIRIENDO DINERO----------\n" +
                                    "Saldo Actual Cuenta Corriente:$" + corriente.getSaldo() + "\n" +
                                    "Saldo Actual Cuenta Ahorros:$" + ahorro.getSaldo() +
                                    "\nIngrese el valor a transferir: ");
                            valor = scanner.nextDouble();
                            corriente.debitarDinero(valor, 0);
                            ahorro.depositarDinero(valor);
                            break;
                        case 2:
                            System.out.print("---------TRANSFIRIENDO DINERO----------\n" +
                                    "Saldo Actual Cuenta Corriente:$" + corriente.getSaldo() + "\n" +
                                    "Saldo Actual Cuenta Ahorros:$" + ahorro.getSaldo() +
                                    "\nIngrese el valor a transferir: ");
                            valor = scanner.nextDouble();
                            ahorro.debitarDinero(valor, 0);
                            corriente.depositarDinero(valor);
                            break;
                        default:
                            System.out.println("Opcion ingresada incorrectamente");
                            break;
                    }
                    try {
                        System.out.println("Volviendo al menu.........");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.print("-----RETIRO DE DINERO-----\n" +
                            "De que cuenta desea retirar dinero:\n" +
                            "1. Cuenta Ahorros.\n2.Cuenta Corriente\n" +
                            "Seleccione la opcion: ");
                    opcion = scanner.nextInt();
                    System.out.print("Ingrese el valor a retirar: $");
                    valor = scanner.nextDouble();
                    switch (opcion) {
                        case 1:
                            ahorro.debitarDinero(valor, 2);
                            break;
                        case 2:
                            corriente.debitarDinero(valor, 2);
                            break;
                        default:
                            System.out.println("Opcion ingresada incorrectamente");
                            break;
                    }
                    try {
                        System.out.println("Volviendo al menu.........");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    System.out.print("-----DEPOSITO DE DINERO-----\n" +
                            "De que cuenta desea depositar dinero:\n" +
                            "1. Cuenta Ahorros.\n2.Cuenta Corriente\n" +
                            "Seleccione la opcion: ");
                    opcion = scanner.nextInt();
                    System.out.print("Ingrese el valor a depositar: $");
                    valor = scanner.nextDouble();
                    switch (opcion) {
                        case 1:
                            ahorro.depositarDinero(valor);
                            break;
                        case 2:
                            corriente.depositarDinero(valor);
                            break;
                        default:
                            System.out.println("Opcion ingresada incorrectamente");
                            break;
                    }
                    try {
                        System.out.println("Volviendo al menu.........");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    inicio = 0;
                    System.out.println("Finalizacion del ropGracias por usar el programa........\nFinalizando.........");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("Opcion ingresada incorrectamente");
                    break;
            }
        } while (inicio == 1);
    }
}
