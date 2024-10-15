public class LibroCalificaciones {
    private String nombreCurso;
    public void getnombreCurso(String nombre){
        nombreCurso = nombre;
    }
    public String setNombreCurso(){
        return nombreCurso;
    }
    public void mostrarMensaje(){
        System.out.println("Bienvenidos al Libro de Calificaciones del curso: "+setNombreCurso());
    }
}
