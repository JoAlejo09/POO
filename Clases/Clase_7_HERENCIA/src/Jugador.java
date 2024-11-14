public class Jugador {
    protected String nombre;
    protected int edad;
    protected String equipo;
    protected int minutos;
    protected int goles;

    public Jugador(String nombre, int edad, String equipo,int minutos, int goles){
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.minutos = minutos;
        this.goles = goles;
    }
    public void mostrarInfo(){
        System.out.println("-----INFORMACION JUGADOR-----");
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nEquipo: "+equipo+"\nMinutos: "+minutos+
                "\nGoles Marcados: "+goles);
    }
}
