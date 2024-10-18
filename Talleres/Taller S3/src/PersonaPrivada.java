public class PersonaPrivada {
    private String nombre;
    private int edad;
    private double altura;

    public PersonaPrivada (){
        this.edad =0;
        this.nombre="";
        this.altura=0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos(){
        System.out.println("----------INFORMACION----------");
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+" años\nEstatura: "+altura+" m");
    }
    public void esMayor(){
        if (this.edad <=18)
            System.out.println("Es menor de edad");
        else
            System.out.println("Es mayor de edad");
    }
}
