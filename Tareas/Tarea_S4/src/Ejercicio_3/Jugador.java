package Ejercicio_3;

public class Jugador {
    private String nombre;
    private int anioNacimiento, numeroCamiseta;

    public Jugador(int numeroCamiseta, int anioNacimiento, String nombre) {
        this.numeroCamiseta = numeroCamiseta;
        this.anioNacimiento = anioNacimiento;
        this.nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
    public void mostrarInfo(){
        System.out.print("-----JUGADOR-----");
        System.out.print("\nNombre: "+getNombre()+"\nAño Nacimiento: "+getAnioNacimiento()+"\nNumero de Camiseta: "+getNumeroCamiseta());
    }
    public double calcularVenta(int cantidad){
        return cantidad*25.00;
    }
}
