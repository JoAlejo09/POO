package Mipracticabasica;

public class Persona {
public int edad;

public Persona(int edad){
    this.edad =edad;
}
private void imprimirEdad(){
    System.out.println("La edad de la persona es: "+edad+" años");
}
private boolean verificarMayordeEdad(){
    if(edad>=18){
        System.out.println("La persona es mayor de edad");
        return true;
    }else{
        System.out.println("La persona es menor de edad");
        return false;
    }
}
public void mostrarResultados(){
    imprimirEdad();
    verificarMayordeEdad();
}
}
