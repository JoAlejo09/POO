public class Rectangulo {
    private double base, altura;

    public Rectangulo(){
        this.base = 0;
        this.altura= 0;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        System.out.println("El valor de la altura del rectangulo se ha cambiado de "+this.altura+" a "+altura);
        this.altura = altura;
    }
    public void setBase(double base){
        System.out.println("El valor de la base del rectangulo se ha cambiado de "+this.base+" a "+base);
        this.base = base;
    }
    public double areaRectangulo(){
        return this.base * this.altura;
    }
    public double perimetroRectangulo(){
        return 2*(this.base+this.altura);
    }
}
