//Nombre clase
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    //CONSTRUCTOR
    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
