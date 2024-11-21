package Animales;

public class Gato extends Animal{
    public Gato (String nombre, int edad, String raza, double tam){
        super();
    }
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El perro "+super.getNombre()+" hace miau miau....");
    }
}
