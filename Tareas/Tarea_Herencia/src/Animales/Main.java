package Animales;
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.setEdad(7);
        perro.setNombre("Jack");
        Gato gato = new Gato();
        gato.setEdad(5);
        gato.setNombre("Domi");
        perro.hacerSonido();
        gato.hacerSonido();
    }

}