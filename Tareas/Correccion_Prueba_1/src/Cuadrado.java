public class Cuadrado {
    private double lado;
    public Cuadrado(){
        this.lado = 0;
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public double areaCuadrado(){
        return Math.pow(this.lado,2);
    }
    public double perimetroCuadrado(){
        return this.lado *4;
    }
}
