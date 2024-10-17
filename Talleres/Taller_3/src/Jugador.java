public class Jugador {
    public String avatar, pais;
    public int edad;

    public Jugador(int edad, String pais, String avatar) {
        this.edad = edad;
        this.pais = pais;
        this.avatar = avatar;
    }
    public Jugador(){
    }
    public void patear(){
        System.out.println("El jugador " + avatar + "Esta pateando....");
    }
    public void correr(){
        System.out.println("El jugador " + avatar + "Esta corriendo....");
    }
    public void saltar(){
        System.out.println("El jugador " + avatar + "Esta saltando....");
    }
}
