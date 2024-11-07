public class Circulo {
    private double radio;
    public Circulo(){
        this.radio = 0;
    }
    public void setRadio(double radio){
        System.out.println("El valor del lado del cuadrado se ha cambiado de "+this.radio+" a "+radio);
        this.radio = radio;
    }
    public double getRadio(){
        return this.radio;
    }
    public double perimetroCirculo(){
        return Math.PI * 2 * this.radio;
    }
    public double   areaCirculo(){
        return Math.PI* Math.pow(this.radio,2);
    }
}
