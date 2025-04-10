public class VidejuegoFisico extends Videojuego{

    String tiendaCompra;
    String estado;


    public VidejuegoFisico(String plataforma, String titulo, int nota, String tiendaCompra, String estado) {
        super(plataforma, titulo, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    public VidejuegoFisico(String plataforma, String titulo, int nota) {
        super(plataforma, titulo, nota);
    }

    @Override
    public String getTipo() {
        return "";
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setTiendaCompra(String tiendaCompra) {
        this.tiendaCompra = tiendaCompra;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "VidejuegoFisico{" +
                "tiendaCompra='" + tiendaCompra + '\'' +
                ", estado='" + estado + '\'' +
                ", titulo='" + titulo + '\'' +
                ", nota=" + nota +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
