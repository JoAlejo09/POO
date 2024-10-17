public class Jugador {
    public String avatar, pais;
    public int edad;

    public Jugador(int edad, String pais, String avatar) {
        this.edad = edad;
        this.pais = pais;
        this.avatar = avatar;
    }
    public Jugador(){
        avatar ="Elpro";
        edad = 19;
        pais = "Colombia";

    }
    public void patear(){
        System.out.println("El jugador " + avatar + "\nEsta pateando....");
    }
    public void correr(){
        System.out.println("El jugador " + avatar + "\nEsta corriendo....");
    }
    public void saltar(){
        System.out.println("El jugador " + avatar + "\nEsta saltando....");
    }
}
