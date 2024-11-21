package Cuentas;

public class CuentaCorriente extends Cliente{
    public CuentaCorriente(String nom,String id){
        super(nom,id,1000);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Saldo:$"+getSaldo());
    }
    public void debitarDinero(double valor, int tasa){
        super.debitarDinero(valor,tasa);
            System.out.println("--Se ha debitado $"+valor+" de la Cuenta Corriente.\nSaldo Actual Cuenta Corriente:$"+getSaldo());
    }
    public void depositarDinero(double valor){
        super.depositarDinero(valor);
        System.out.println("--Se ha depositado $"+valor+" en la Cuenta Corriente.\nSaldo Actual Cuenta Corriente:$"+getSaldo());
    }
}
