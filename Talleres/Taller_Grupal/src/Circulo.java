//Clase Circulo hereda los atributos de Figura (CalcularArea, CalcularPerimetro )y lo sobreescribe
public class Circulo extends  Figura{
    //Atributos privados que solo se usan en Circulo
    private double radio;
    public Circulo(double r){
        super();
        this.radio=r;
    }
    //Metodo que permite devolver el valor del atributo privado de la clase
    public double getRadio() {
        return radio;
    }
    //Metodos heredados y aplicados sobreescritura para el Circulo(Calcula el area y perimetro en funcion del radio)
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
