public class LlamarClase {
    public static void main(String[] args) {
        Vehiculo auto1 = new Vehiculo("Azul","Toyota",2019);
        Vehiculo auto2 = new Vehiculo("Amarillo","Chevrolet",2021);
        Vehiculo auto3 = new Vehiculo("KIA");
        Vehiculo auto4= new Vehiculo(22500,"PHJ-224","Azul","Renault",2021);

        auto1.mostrar();
        auto2.mostrar();
        auto3.mostrar();
        auto4.mostrar();
    }
}