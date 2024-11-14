import javax.sound.sampled.Port;

public class Main {
    public static void main(String[] args) {
        Portero por = new Portero("Andres",22,"ABC",200,0,11,11);
        por.mostrarInfo();
        Defensa def = new Defensa("Bryan",18,"ABC",180,0,5);
        def.mostrarInfo();
        Delantero del = new Delantero("Carlos",17,"123",90,1);
        del.mostrarInfo();
    }
}