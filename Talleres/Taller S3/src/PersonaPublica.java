public class PersonaPublica {
    public String direccion,telefono,email;

    public PersonaPublica() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //CambiarDireccion usa set para cambiar el valor del atributo Direccion y usa get para mostrar el cambio realizado
    private void cambiarDireccion(String nueva_direccion){
        String cadena="La direccion \""+getDireccion()+"\"";
        setDireccion(nueva_direccion);
        cadena+=" ha sido cambiada por \""+getDireccion()+"\"";
        System.out.println(cadena);
    }

    private void mostrarTelefono(){
        System.out.println("Telefono: "+this.telefono);
    }
    //Metodo que permite acceder a las clases private
    public void usarMetodos_privados(String nueva_direccion){
        cambiarDireccion(nueva_direccion);
        mostrarTelefono();
    }

}
