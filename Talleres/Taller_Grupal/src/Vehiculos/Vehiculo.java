package Vehiculos;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;
    protected double kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio, double precioBase, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
        this.kilometraje = kilometraje;
    }

    // Metodo para calcular depreciación
    public double calcularDepreciacion() {
        int edad = 2024 - anio;
        return precioBase * Math.pow(0.85, edad); // Depreciación del 15% anual
    }
    public double calcularCostoOperacion() {
        return kilometraje * 0.1; // Costo base (ejemplo genérico)
    }

    // Metodo para mostrar información
    public String mostrarInformacion() {
    String info = "";
        info+="Marca: " + marca+
                "\nModelo: " + modelo+
                "\nAño: " + anio+
                "\nPrecio Base: $" + precioBase+
                "\nKilometraje: " + kilometraje + " km";
    return info;
    }
}
