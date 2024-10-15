public class Persona {
    //Atributos
    private String nombre, direccion, telefono, ocupacion;
    private int edad;
    //CONSTRUCTOR
    public Persona() {
    }

    public void setPersona(String nombre, String direccion, String telefono, String ocupacion, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
    }
    public  void presentarse(){
        System.out.println("Mi nombre es "+nombre+", tengo "+edad+" años, vivo en "+direccion+", mi telefono es "+telefono+" y  mi ocupacion es "+ocupacion);
    }
    public void correr(){

        System.out.println("Mi nombre es "+nombre+", tengo "+edad+" años y estos corriendo");
    }

}
