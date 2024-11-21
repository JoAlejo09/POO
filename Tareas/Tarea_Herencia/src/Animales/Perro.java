package Animales;

public class Perro extends Animal {
    public Perro() {
        super();
    }
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El perro "+super.getNombre()+" de "+super.getEdad()+" años hace guau guau....");
    }
}