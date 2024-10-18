public class Jugador {
    public String avatar, pais;
    public int edad;

    public Jugador(int edad, String pais, String avatar) {
        this.edad = edad;
        this.pais = pais;
        this.avatar = avatar;
    }
    public void imprimir(){
        System.out.println("-------Jugador-------");
        System.out.println("Avatar: "+avatar+"\nEdad:"+edad+"\nPais:"+pais);
        System.out.println("---------------------");

    }
    public void patear(){
        System.out.println("El jugador " + avatar + "\nEsta pateando....");
    }
    public void correr(){
        System.out.println("El jugador " + avatar + "\nEsta corriendo....");
    }
    public void saltar(int veces){
        System.out.println("El jugador " + avatar + "\nEsta saltando "+(veces+2)+" veces");

    }
}
