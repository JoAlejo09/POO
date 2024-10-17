public class Main {
    public static void main(String[] args) {
        System.out.println("Registro de informacion de Jugadores");
        Jugador jugador1 = new Jugador(18, "Ecuador", "Andy");
        Jugador jugador2 = new Jugador();
        jugador1.patear();
        System.out.println("--------------------------");
        jugador1.correr();
        System.out.println("--------------------------");
        jugador2.patear();
        System.out.println("--------------------------");
        jugador2.correr();
        System.out.println("--------------------------");
        jugador2.saltar();
        System.out.println("--------------------------");
    }
}