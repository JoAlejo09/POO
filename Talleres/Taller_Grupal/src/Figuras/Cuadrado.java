package Figuras;

public class Cuadrado extends Figura{
    //Atributo privado solo se usa en la clase Figura.Cuadrado
    private double lado;

    //Constructor que inicializa el valor de la clase
    public Cuadrado(double l){
        super();
        this.lado = l;
    }
    //Metodo que devuelve el valor del atributo privado
    public double getLado() {
        return lado;
    }
    //Metodos heredados que sobreescriben los metodos para adaptarlos a la Clase Figura.Cuadrado(Area y Perimetro en funcion del lado)
    public double calcularArea(){
        return Math.pow(lado,2);
    }
    public double calcularPerimetro(){
        return 4*lado;
    }
}
