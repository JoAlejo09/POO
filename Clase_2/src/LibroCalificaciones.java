public class LibroCalificaciones {
    private String nombreCurso;
    public void getNombreCurso(String nombre){
        nombreCurso = nombre;
    }
    public String setNombreCurso(){
        return nombreCurso;
    }
    public void mostrarMensaje(String curso){
        System.out.println("Bienvenidos al Libro de Calificaciones del curso: "+curso);
    }
}
