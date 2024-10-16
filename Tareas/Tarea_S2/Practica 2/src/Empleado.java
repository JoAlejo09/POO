public class Empleado {
    public String nombre, cargo,fecha_ingreso;
    public double salario;

    public Empleado (String nombre, String cargo, String ingreso, double salario){
        this.nombre = nombre;
        this.cargo = cargo;
        this.fecha_ingreso = ingreso;
        this.salario = salario;
    }
    public void mostrarEmpleado(){
        System.out.print("-------------------------\nNomina Empleado");
        System.out.print("\nNombre empleado: "+nombre+"\nCargo que ocupa: "+
        cargo+"\nFecha que ingreso: "+fecha_ingreso+"\nSalario que gana: "+salario);
        System.out.print("\n-------------------------\n");
    }

}
