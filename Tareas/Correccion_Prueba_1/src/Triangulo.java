public class Triangulo {
    private double lado;
    public Triangulo(){
        this.lado = 0;
    }
    public void setLado(double lado){
        System.out.println("El valor del lado del triangulo se ha cambiado de "+this.lado+" a "+lado);
        this.lado = lado;
    }
    public double getLado(){return this.lado;}

    public double perimetroTriangulo(){
        return 3*this.lado;
    }
    public double areaTriangulo() {
        return (Math.sqrt(3) / 4) * Math.pow(this.lado, 2);
    }
}
