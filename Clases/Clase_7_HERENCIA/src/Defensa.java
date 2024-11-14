public class Defensa extends Jugador{
    public int bloqueos;
    public Defensa(String nombre, int edad, String equipo,int minutos, int goles,int bloqueos){
        super(nombre, edad, equipo, minutos,goles);
        this.bloqueos=bloqueos;
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Posicion: Defensa\nBloqueos Realizados: "+bloqueos);
    }

}
