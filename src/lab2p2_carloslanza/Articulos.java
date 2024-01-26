package lab2p2_carloslanza;

public class Articulos {

    String titulo;
    String autor;
    String tema;
    String fechaPublicacion;
    String accesoEnLinea;

    public Articulos(String titulo, String autor, String tema, String fechaPublicacion, String accesoEnLinea) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fechaPublicacion = fechaPublicacion;
        this.accesoEnLinea = accesoEnLinea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAccesoEnLinea() {
        return accesoEnLinea;
    }

    public void setAccesoEnLinea(String accesoEnLinea) {
        this.accesoEnLinea = accesoEnLinea;
    }

}
