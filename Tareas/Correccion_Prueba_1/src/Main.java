/*TAREA CORRECCION DE LA PRUEBA
    Nombre: Jose Pila
    Fecha: 5/11/2024
 */

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CREACION DE LAS INSTANCIAS DE CLASES O SUS OBJETOS
        Scanner scan = new Scanner(System.in);
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();

        //SOLICITUD DE VALORES INGRESADOS Y SETEO DE LAS VARIABLES
        double lado, radio, base, altura, lado_tri;
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        lado = scan.nextDouble();
        cuadrado.setLado(lado);
        System.out.println("--------------------------");

        System.out.print("Ingrese el valor del radio del circulo: ");
        radio = scan.nextDouble();
        circulo.setRadio(radio);
        System.out.println("--------------------------");

        System.out.print("Ingrese el valor de la base del rectangulo: ");
        base = scan.nextDouble();
        System.out.print("Ingrese el valor de la altura del rectangulo: ");
        altura = scan.nextDouble();
        rectangulo.setBase(base);
        rectangulo.setAltura(altura);
        System.out.println("---------------------------");

        System.out.print("Ingrese el valor del lado del triangulo: ");
        lado_tri = scan.nextDouble();
        triangulo.setLado(lado_tri);
        System.out.println("---------------------------");

        //PERIMETROS Y AREAS
        System.out.println("CALCULO DE PERIMETRO Y AREAS");
        System.out.println("--------CUADRADO-------\n Lado: " + cuadrado.getLado() +
                "\n Perimetro: " + cuadrado.perimetroCuadrado() + "\n Area: " + cuadrado.areaCuadrado());
        System.out.println("--------CIRCULO-------\n Radio: " + circulo.getRadio() +
                "\n Perimetro: " + circulo.perimetroCirculo() + "\n Area: " + circulo.areaCirculo());
        System.out.println("--------RECTANGULO-------\n Base: " + rectangulo.getBase() +
                "\n Altura: " + rectangulo.getAltura() + "\n Perimetro: " + rectangulo.perimetroRectangulo() +
                "\n Area: " + rectangulo.areaRectangulo());
        System.out.println("--------TRIANGULO-------\n Lado: " + triangulo.getLado() +
                "\n Perimetro: " + triangulo.perimetroTriangulo() + "\n Area: " + triangulo.areaTriangulo());
        //SUMATORIA DE AREAS Y PERIMETROS
        System.out.println("------SUMATORIA DE AREAS Y PERIMETROS------");
        System.out.println("La sumatoria de los perimetros es: "+(cuadrado.perimetroCuadrado()+circulo.perimetroCirculo()+triangulo.perimetroTriangulo()+rectangulo.perimetroRectangulo())+
        "\nLa sumatoria de las areas es: "+(cuadrado.areaCuadrado()+circulo.areaCirculo()+rectangulo.areaRectangulo()+triangulo.areaTriangulo()));
    }
}