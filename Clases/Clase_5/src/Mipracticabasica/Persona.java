package Mipracticabasica;

public class Persona {
public int edad;

public Persona(int edad){
    this.edad =edad;
}
private void imprimirEdad(){
    System.out.println("La edad de la persona es: "+edad+" años");
}
private void verificarMayordeEdad(){
    if(edad>=18){
        System.out.println("La persona es mayor de edad");
    }else{
        System.out.println("La persona es menor de edad");
    }
}
public void mostrarResultados(){
    imprimirEdad();
    verificarMayordeEdad();
}
}
