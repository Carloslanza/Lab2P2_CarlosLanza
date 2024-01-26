package lab2p2_carloslanza;

public class Conferenciasvirtuales {

    String titulo;
    String conferencista;
    String fecha;
    String duracion;
    String enlaceAcceso;

    public Conferenciasvirtuales(String titulo, String conferencias, String fecha, String duracion, String enlaceAcesso) {
        this.titulo = titulo;
        this.conferencista = conferencista;
        this.fecha = fecha;
        this.duracion = duracion;
        this.enlaceAcceso = enlaceAcceso;
    }

    public Conferenciasvirtuales(String titulo, String conferencista, String fecha, int duracionHoras, String enlaceAcceso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferencista() {
        return conferencista;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEnlaceAcceso() {
        return enlaceAcceso;
    }

    public void setEnlaceAcceso(String enlaceAcceso) {
        this.enlaceAcceso = enlaceAcceso;
    }

}
