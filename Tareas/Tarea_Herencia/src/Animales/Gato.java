package Animales;

public class Gato extends Animal{
    public Gato (){
        super();
    }
    public void hacerSonido(){
        super.hacerSonido();
        System.out.println("El gato "+super.getNombre()+" de "+super.getEdad()+" años hace miau miau....");
    }
}
