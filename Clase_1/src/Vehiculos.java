public class Vehiculos {
    String marca,color,tipo;
    int anio;
    double precio;

    public Vehiculos(double precio, String tipo, int anio, String color, String marca) {
        this.precio = precio;
        this.tipo = tipo;
        this.anio = anio;
        this.color = color;
        this.marca = marca;
    }
    public void imprimir(){
        System.out.println("Marca: "+marca+"\nTipo: "+tipo+"\nAño: "+anio+"\tColor: "+color+"\tPrecio: "+precio);
    }

}