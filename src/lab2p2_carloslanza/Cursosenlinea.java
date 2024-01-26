package lab2p2_carloslanza;

public class Cursosenlinea {

    String titulo;
    String instructor;
    String duracionSemanas;
    String plataforma;

    public Cursosenlinea(String titulo, String instructor, String duracionSemanas, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracionSemanas = duracionSemanas;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracionSemanas() {
        return duracionSemanas;
    }

    public void setDuracionSemanas(String duracionSemanas) {
        this.duracionSemanas = duracionSemanas;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

}
