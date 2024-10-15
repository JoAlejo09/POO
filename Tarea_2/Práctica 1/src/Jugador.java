public class Jugador {
    public String nombre, posicion;
    public int edad, nro_camiseta;
    public Jugador (String nombre, String posicion, int edad, int camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.nro_camiseta = camiseta;
    }
    public void mostrarJugador (){
        System.out.println("------------------------------\nJugador");
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nPosicion: "+posicion+"\nCamiseta: "+nro_camiseta);
        System.out.println("------------------------------");
    }
}
