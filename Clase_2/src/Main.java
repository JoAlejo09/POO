import java.util.Scanner;

public class Main { //Definicion de las clases para Java
    //Establecimiento de clases publicas y con el nombre de la clase
    public static void main(String[] args) {
        //Establecimiento del metodo solo existe un metodo main para cada programa
         LibroCalificaciones mi_Libro = new LibroCalificaciones();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese el curso al que pertenece: ");
         String curso = scanner.nextLine();
         mi_Libro.getnombreCurso(curso);
         mi_Libro.mostrarMensaje();
    }
}