public class Principal {
    String[] nombres = new String[3];
    String[] cedulas = new String[3];
    int total_ing = 0;

    public void agregarCliente(String nombre, String cedula){
        if (total_ing<nombres.length|total_ing < cedulas.length ){
            nombres[total_ing] = nombre;
            cedulas[total_ing] = cedula;
            total_ing++;
        }else{
            System.out.println("No se puede agregar mas informacion");
        }

    }
    public String toString(){
        String cadena = "";
        for(int i = 0; i<nombres.length;i++){
            cadena+="Nombres: "+nombres[i]+" Cedula: "+cedulas[i]+"\n";
        }
        return cadena;
    }
}
