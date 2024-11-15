public class Portero extends Jugador{
    public int atajadas, goles_recibidos,nro_camiseta;
    public Portero(String nombre, int edad, String equipo,int minutos,int goles_m,int atajadas, int goles_r,int camiseta){
        super(nombre,edad,equipo,minutos,goles_m);
        this.atajadas= atajadas;
        this.goles_recibidos=goles_r;
        nro_camiseta = camiseta;
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Posicion: Portero\nAtajadas: "+this.atajadas+
                "\nGoles Recibidos: "+goles_recibidos+
                "\nCamiseta: "+nro_camiseta);

    }
}
