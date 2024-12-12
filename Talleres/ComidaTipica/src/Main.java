public class ComidaCosta extends ComidaTipica{
    private String nombrePlato;
    private String porciondelPlato;
    private String ingredientesPredominate;
    private double precio;
    public ComidaCosta(String nombre,String ingredientes,int numeroIngredientes,boolean salado,String nombrePlato,String porciondelPlato,String ingredientesPredominate){
        super(nombre, ingredientes, numeroIngredientes, salado);
        this.nombrePlato=nombrePlato;
        this.porciondelPlato=porciondelPlato;
        this.ingredientesPredominate=ingredientesPredominate;
    }
    public String getNombre(){
        return nombrePlato;
    }
    public String getporciondelPlato(){
        return porciondelPlato;
    }
    public String getIngredientesPredominate(){
        return ingredientesPredominate;
    }
    public double getPrecio(){
        return precio;
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println(" El plato tipico de la Costa es: " +
                "\n"+nombrePlato+"\n El tamaño del plato es:" +
                "\n"+porciondelPlato+"\n El ingrediente Predominate es: " +
                "\n"+ingredientesPredominate+"\n El precio del plato es: " +
                "\n"+precio);
    }

}