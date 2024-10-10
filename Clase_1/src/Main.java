public class Main {
    public static void main(String[] args) {
    Persona secretario=new Persona(),profesor=new Persona(), estudiante = new Persona();
    estudiante.setPersona("Jose Antonio","Av. Quito","0982345621","Estudiante 9vo Semestre",22);
    profesor.setPersona("Andres Alcivar","Guayaquil y garcia Moreno","0123521245","Docente ocacional",35);
    secretario.setPersona("Ana Sofia","Toledo y Benalcazar","2464466","Secretaria",25);

    estudiante.presentarse();
    profesor.presentarse();
    secretario.presentarse();
    System.out.println("");

    estudiante.correr();
    profesor.correr();
    secretario.correr();

    }
}
