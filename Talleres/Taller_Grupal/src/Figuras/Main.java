package Figuras;

public class Main {

    //Calculo de soluciones para ecuaciones cuadraticas
    public static void main(String[] args) {
        // Creacion de instancias y objetos de las clases Hijas
        Circulo circulo = new Circulo(2.5);
        Cuadrado cuadrado = new Cuadrado(2.3);
        //Impresion de los valores y los calculos realizados
        System.out.println("Figura.Circulo\nRadio: "+circulo.getRadio()+"\nPerimetro: "+circulo.calcularPerimetro()+"\nArea: "+circulo.calcularArea());
        System.out.println("Figura.Cuadrado\nRadio: "+cuadrado.getLado()+"\nPerimetro: "+cuadrado.calcularPerimetro()+"\nArea: "+cuadrado.calcularArea());



    }
}