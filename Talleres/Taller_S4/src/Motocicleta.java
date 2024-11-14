public class Motocicleta extends Vehiculo{
    public float consumo_gasolina, costo_mantenimiento;
    public int vel_max;

    public Motocicleta(String marca, String modelo, int anio, int vel){
        super(marca,modelo,anio);
        this.vel_max = vel;
        this.consumo_gasolina=0;
        this.costo_mantenimiento=0;
    }
    public float calcularCostooperacion(float consumo, float costo){
        return super.calcularCostooperacion(consumo,costo);
    }
    public void imprimir(){
        System.out.println("-----VEHICULO-----\n" +
                "Marca: "+super.marca+
                "\nModelo: "+super.modelo+
                "\nAño de fabricacion: "+super.anio+
                "\nKilometraje actual: "+super.kilometraje+
                "\nVelocidad maxima: "+this.vel_max);
    }
}
