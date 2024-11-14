public class Delantero extends Jugador{
    public Delantero (String nombre, int edad, String equipo,int minutos, int goles){
        super(nombre, edad, equipo, minutos, goles);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Posicion: Delantero");
    }
}
