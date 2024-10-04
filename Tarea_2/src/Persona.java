public class Persona {
    public String nombre;
    public int edad;
    public String genero;

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void Presentarse(){
        System.out.print("\n---------------Resultado-----------------");
        System.out.print("\nMi nombre es: "+nombre+"\nTengo "+edad+" años\nMi genero es "+genero);
        System.out.print("\n----------------------------------------\n");
    }
}
