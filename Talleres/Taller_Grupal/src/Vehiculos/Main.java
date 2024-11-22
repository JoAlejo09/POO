package Vehiculos;

public class Main {
    public static void main(String []args){

        //CREACION DE LOS OBJETOS E INSTANCIA DE CLASES
        Automovil auto1 = new Automovil("Toyota", "Corolla", 2018, 20000, 50000, 4, "Gasolina");
        Automovil auto2 = new Automovil("Tesla", "Model 3", 2022, 45000, 20000, 4, "Eléctrico");
        Motocicleta moto1 = new Motocicleta("Yamaha", "R3", 2021, 8000, 15000, 321, "Gasolina");
        Motocicleta moto2 = new Motocicleta("Zero", "SR/F", 2023, 18000, 5000, 0, "Eléctrico");

        // Mostrar información y cálculos
            System.out.println("=================================");
            System.out.println(auto1.mostrarInformacion());
            System.out.println("Valor depreciado: $" + auto1.calcularDepreciacion());
            System.out.println("=================================");
            System.out.println(auto2.mostrarInformacion());
            System.out.println("Valor depreciado: $" + auto2.calcularDepreciacion());
            System.out.println("=================================");
            System.out.println(moto1.mostrarInformacion());
            System.out.println("Valor depreciado: $" + moto1.calcularDepreciacion());
            System.out.println("=================================");
            System.out.println(moto2.mostrarInformacion());
            System.out.println("Valor depreciado: $" + moto2.calcularDepreciacion());
        }
    }
