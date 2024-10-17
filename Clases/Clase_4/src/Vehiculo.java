public class Vehiculo {
    private int anio;
    private String modelo, color,placa;
    private double costo;

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
        if(this.color==null)
            System.out.println("Coche:\n Modelo: "+this.modelo);
        else if (this.costo == 0)
            System.out.println("Coche:\n Modelo: "+this.modelo+"\n Año: "+this.anio+"\n Color: "+this.color);
        else
            System.out.println("Coche:\n Modelo: "+this.modelo+"\n Año: "+this.anio+"\n Color: "+this.color+"\n Costo: "+this.costo+"\n Placa: "+this.placa);

    System.out.println("--------------------");
    }
}
