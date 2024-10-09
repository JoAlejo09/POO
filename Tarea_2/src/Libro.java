public class Libro {
    public String titulo;
    public String autor;
    public int paginaCount;

    public void setPaginaCount(int paginaCount) {
        this.paginaCount = paginaCount;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void infoLibro(){
        System.out.print("\n---------------Resultado-----------------");
        System.out.print("\nNombre: "+titulo+", Autor: "+autor+",  Paginas: "+paginaCount);
        System.out.print("\n----------------------------------------\n");
    }
}
