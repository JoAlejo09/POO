public class Vehiculo {
    protected String marca,modelo;
    protected int anio;
    double kilometraje=0;
    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public float calcularCostooperacion(float consumo, float costo){
        return (float) consumo * costo;
    }
}
