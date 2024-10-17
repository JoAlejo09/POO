public class Vehiculo {
    private int anio;
    private String modelo, color,placa;
    private double costo;

    public Vehiculo() {
    }

    public Vehiculo(String color, String modelo, int anio) {
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(double costo, String placa, String color, String modelo, int anio) {
        this.costo = costo;
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrar(){
        String cadena ="Coche";
        if(this.modelo!=null)
            cadena+="\n Modelo: "+this.modelo;
        if(this.anio !=0)
            cadena+="\n Año: "+this.anio;
        if(this.color!=null)
            cadena+="\n Color: "+this.color;
        if(this.costo!=0)
            cadena+="\n Costo: "+this.costo;
        if(this.placa!=null)
            cadena+="\n Placa: "+this.placa;
        cadena+="\n--------------------";
        System.out.println(cadena);

    }
}
