package Vehiculos;

public class Main {
    public static void main(String []args){

        //CREACION DE LOS OBJETOS E INSTANCIA DE CLASES
        Vehiculo vehiculo1 = new Automovil("Toyota", "Corolla", 2018, 20000, 50000, 4, "Gasolina");
        Vehiculo vehiculo2 = new Automovil("Tesla", "Model 3", 2022, 45000, 20000, 4, "Eléctrico");
        Vehiculo vehiculo3 = new Motocicleta("Yamaha", "R3", 2021, 8000, 15000, 321, "Gasolina");
        Vehiculo vehiculo4 = new Motocicleta("Zero", "SR/F", 2023, 18000, 5000, 0, "Eléctrico");

        // Mostrar información y cálculos
        Vehiculo[] vehiculos = {vehiculo1, vehiculo2, vehiculo3, vehiculo4};//CREACION DE ARREGLO DE OBJETOS
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("=================================");
            System.out.println(vehiculo.mostrarInformacion());
            System.out.println("Valor depreciado: $" + vehiculo.calcularDepreciacion());
        }
    }
}
