import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creacion de objetos
        Scanner scanner = new Scanner(System.in);
        PersonaPrivada per_pri = new PersonaPrivada();
        PersonaPublica per_pub = new PersonaPublica();


        //Métodos de la Clase PersonaPrivada
        //Uso de setter para añadir valores a los atributos de la clase PErsonaPrivada
        System.out.print("-----------VALORES QUEMADOS -----------------\n");
        per_pri.setNombre("Juan Carlos Peñafiel");
        per_pri.setEdad(18);
        per_pri.setAltura(1.22);
        //USo de metodos de la clase PersonaPrivada
        per_pri.mostrarDatos();
        per_pri.esMayor();


        //Metodos de la Clase PersonaPublica
            //Uso de setter para agregar los valores en las clase PersonaPublica
        per_pub.setDireccion("Quito-Ecuador");
        per_pub.setEmail("micorrero123@hotmail.com");
        per_pub.setTelefono("23451257");

        //Uso de metodo publico que contiene a los metodos privados de la clase PersonaPublica
        per_pub.usarMetodos_privados("La Magdalena - Quito, Ecuador");
    }
}