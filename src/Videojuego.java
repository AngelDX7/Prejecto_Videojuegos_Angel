import java.io.Serializable;

public abstract class Videojuego implements Serializable {

    String titulo;
    String plataforma;
    int nota;
    public abstract String getTipo();

    public Videojuego(String plataforma, String titulo, int nota) {
        this.plataforma = plataforma;
        this.titulo = titulo;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getNota() {
        return nota;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota +
                '}';
    }
}
