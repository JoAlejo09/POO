public class Coche extends Vehiculo{
 public float costo_mantenimiento;
 public float consumo_gasolina,cilindraje;
 public String color;


    public Coche(String marca, String modelo, int anio,float cilindraje, String color) {
        super(marca, modelo, anio);
        this.consumo_gasolina=0;
        this.costo_mantenimiento=0;
    }
    public float calcularCostooperacion(float consumo, float costo){
        return super.calcularCostooperacion(consumo,costo);
    }
    public float agregarConsumoGasolina(int km){
        consumo_gasolina+= (float)km* 0.07;
        super.kilometraje +=km;
        return consumo_gasolina;
    }
}
