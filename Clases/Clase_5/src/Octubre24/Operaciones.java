package Octubre24;

public class Operaciones {
    //Atributos
    int valor1,valor2;
    //Constructor
    public Operaciones(int val1, int val2){
        this.valor1 = val1;
        this.valor2 = val2;
    }
    //Metodos
    public void imprimir(){
        System.out.println("Los numeros con los que se van a realizar las operaciones son: "+valor1+" y "+valor2);
    }
    public void suma(){
        System.out.println("La suma de "+valor1+" + "+valor2+" = "+(valor1+valor2));
    }
    protected void resta(){
        System.out.println("La resta de "+valor1+" - "+valor2+" = "+(valor1-valor2));
    }
    void producto(){
        System.out.println("El producto de "+valor1+" * "+valor2+" = "+(valor1*valor2));
    }
}
