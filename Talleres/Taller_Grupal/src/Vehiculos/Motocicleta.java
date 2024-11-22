package Vehiculos;

public class Motocicleta extends Vehiculo{
private int cilindrada;
private String tipoCombustible; // Gasolina o Eléctrico
    //
    public Motocicleta(String marca, String modelo, int anio, double precioBase, double kilometraje, int cilindrada, String tipoCombustible) {
        super(marca, modelo, anio, precioBase, kilometraje);
        this.cilindrada = cilindrada;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double calcularCostoOperacion() {
        double costoPorLitro, consumoPorKm;
        if (tipoCombustible.equalsIgnoreCase("Gasolina")){
            costoPorLitro = 1.4;
        }else{
            costoPorLitro = 0.5;
        }
        if(cilindrada > 500) {
            consumoPorKm = 0.06;
        }
        else {
            consumoPorKm = 0.04;
            // Mayor consumo si la cilindrada es alta
        }
        return kilometraje * consumoPorKm * costoPorLitro;
    }

    @Override
    public String mostrarInformacion() {
        String info = super.mostrarInformacion();
        info+="\nCilindrada: " + cilindrada + " cc"+
                "\nTipo de Combustible: " + tipoCombustible+
                "\nCosto de Operación: $" + calcularCostoOperacion();
        return info;
    }
}
