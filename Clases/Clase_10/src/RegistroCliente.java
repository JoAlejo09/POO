import java.util.ArrayList;

public class RegistroCliente {
    //USO DE ARREGLOS FISICOS
    private String[] nombres1 = new String[3];
    private String[] cedulas1 = new String[3];
    //USO DE ARRAYLIST
    private ArrayList<String> nombres;
    private ArrayList<String> cedulas;
    int total = 0;
    public RegistroCliente(){
     //   nombres = new ArrayList<>();
    }
    public void ArreglarCliente(String nombres, String cedula){
        if(total<3){
            cedulas1[total] = cedula;
            nombres1[total] = nombres;
            total++;
            System.out.println("Cliente agregado con exito");
        }else{
            System.out.println("Se alcanzo el limite con exito");
        }
    }
    public void mostrarClientes(){
        System.out.println("--------LISTADO DE CLIENTES--------");
        for (int i = 0; i<3;i++){
            System.out.println("Cedula: "+cedulas1[i]+"\nNombres: "+nombres1[i]);
            System.out.println("--------------------");
        }
    }

}
