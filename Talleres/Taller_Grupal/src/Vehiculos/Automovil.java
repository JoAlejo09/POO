package Vehiculos;

public class Automovil extends Vehiculo{
    private int numeroPuertas;
    private String tipoCombustible; // Gasolina, Diesel

    public Automovil(String marca, String modelo, int anio, double precioBase, double kilometraje, int numeroPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precioBase, kilometraje);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double calcularCostoOperacion() {
        double costoPorLitro = tipoCombustible.equalsIgnoreCase("Gasolina") ? 1.5 : 1.2;
        double consumoPorKm = 0.08; // Ejemplo: consumo de 8 L/100km
        return kilometraje * consumoPorKm * costoPorLitro;
    }

    @Override
    public String mostrarInformacion() {
        String info = super.mostrarInformacion();
        info+="\nNúmero de Puertas: " + numeroPuertas+
                "\nTipo de Combustible: " + tipoCombustible+
                "\nCosto de Operación: $" + calcularCostoOperacion();
        return info;
    }
}
