public class Cuadrado {
    private double lado;
    public Cuadrado(){
        this.lado = 0;
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        System.out.println("El valor del lado del cuadrado se ha cambiado de "+this.lado+" a "+lado);
        this.lado = lado;
    }
    public double areaCuadrado(){
        return Math.pow(this.lado,2); // Area l^2
    }
    public double perimetroCuadrado(){
        return this.lado *4; //suma de los 4 lados
    }
}
