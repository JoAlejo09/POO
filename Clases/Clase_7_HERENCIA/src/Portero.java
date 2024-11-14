public class Portero extends Jugador{
    public int atajadas, goles_recibidos;
    public Portero(String nombre, int edad, String equipo,int minutos,int goles_m,int atajadas, int goles_r){
        super(nombre,edad,equipo,minutos,goles_m);
        this.atajadas= atajadas;
        this.goles_recibidos=goles_r;
    }@Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Posicion: Portero\nAtajadas: "+this.atajadas+
                "\nGoles Recibidos: "+goles_recibidos);
    }
}
