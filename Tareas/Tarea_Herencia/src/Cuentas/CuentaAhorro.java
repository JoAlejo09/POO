package Cuentas;

public class CuentaAhorro extends Cliente {
    public CuentaAhorro(String nom, String id){
        super(nom,id,500);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Saldo:$"+getSaldo()+"\n-------------------------------");
    }
    public void debitarDinero(double valor,int tasa){
        super.debitarDinero(valor,tasa);
        System.out.println("--Se ha debitado $"+valor+" de la Cuenta Ahorros.\nSaldo Actual Cuenta Ahorros:$"+getSaldo());
    }
    public void depositarDinero(double valor){
        super.depositarDinero(valor);
        System.out.println("--Se ha depositado $"+valor+" en la Cuenta Corriente.\nSaldo Actual Cuenta Corriente:$"+getSaldo());
    }
}
