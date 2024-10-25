package Ejercicio_1;

public class Personaje {
    private String nombre, telefono;
    private int añoNacimiento;

    public Personaje(String nombre, String telefono, int anio){
        this.nombre = nombre;
        this.telefono = telefono;
        this.añoNacimiento = anio;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
