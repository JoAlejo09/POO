package Animales;

public class Perro extends Animal {
    public Perro(String nombre, int edad, String raza, double tam) {
        super();
    }
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El perro "+super.getNombre()+" hace guau guau....");
    }
}