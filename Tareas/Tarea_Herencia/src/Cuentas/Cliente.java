package Cuentas;

public class Cliente {
    private String nombre, identificacion;
    private double saldo;

    public Cliente(String identificacion, String nombre, double saldo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void mostrarInformacion(){
        System.out.println("------CLIENTE------\n" +
                "Nombre: "+getNombre()+"\nId: "+getIdentificacion());
    }
    public void debitarDinero(double valor,int tasa){
        if(valor>saldo){
            System.out.println("Falta de fondos. No se puede debitar....");
        }else if(saldo<100) {
            System.out.println("No se puede debitar....");
        }else{
            saldo=saldo-valor;
            double comision = valor * (tasa/100);
            saldo = saldo-comision;
        }
    }
    public void depositarDinero(double valor){
        saldo = saldo + valor;
    }
}
