package Ejercicio_3;

public class Equipo {
    Jugador jugador;
    public String nombreEquipo;
    public Equipo(String nombreEquipo)
    {
        this.nombreEquipo = nombreEquipo;
    }
    public void inscribirJugador(String nombre, int anioNacimiento, int numeroCamiseta)
    {
        jugador = new Jugador(numeroCamiseta,anioNacimiento,nombre);
    }
    public void mostrarJugador(){
        jugador.mostrarInfo();
    }
    public Jugador obtenerJugador(){
        return jugador;
    }
}
