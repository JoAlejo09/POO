public class Cuenta {
    private Double dinero;
    public Cuenta(){
        dinero = dinero;
    }
    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        dinero = dinero;
    }
    public boolean retirarDinero(double valor){
        if(dinero < valor){
            return false;
        }else{
            dinero -= valor;
            return true;
        }
    }
    public void depositarDinero(double valor){
        dinero+=valor;
    }
}
