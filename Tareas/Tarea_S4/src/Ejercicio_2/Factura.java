package Ejercicio_2;

public class Factura {
    private String nombrePlato;
    private double precioPlato;
    private int cantidad;
    Plato plato;
    public Factura(int cantidad, double precioPlato, String nombrePlato) {
        this.cantidad = cantidad;
        this.precioPlato = precioPlato;
        this.nombrePlato = nombrePlato;
        plato = new Plato(nombrePlato,precioPlato);
    }
    public double calcularTotal(){
        return plato.getPrecio()*cantidad;
    }
    public void mostrarFactura(){
        System.out.println("-----FACTURA-----");
        System.out.println("Plato\t\t\t\tCantidad\t\tPrecio Unitario\tPrecio Total");
        System.out.println(plato.getNombre()+"\t\t"+cantidad+"\t\t\t"+plato.getPrecio()+"\t\t\t"+calcularTotal());
    }
}
