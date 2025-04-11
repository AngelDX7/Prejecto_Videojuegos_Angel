public class VidiojuegoDigital extends Videojuego {

    public VidiojuegoDigital(String plataforma, String titulo, int nota, String tiedaOnline, Double tamañoGB) {
        super(plataforma, titulo, nota);
        this.tiedaOnline = tiedaOnline;
        this.tamañoGB = tamañoGB;
    }

    public Double getTamañoGB() {
        return tamañoGB;
    }

    public void setTamañoGB(Double tamañoGB) {
        this.tamañoGB = tamañoGB;
    }

    public String getTiedaOnline() {
        return tiedaOnline;
    }

    public void setTiedaOnline(String tiedaOnline) {
        this.tiedaOnline = tiedaOnline;
    }

    String tiedaOnline;
    Double tamañoGB;

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public String toString() {
        return  " ▶Videjuego digital║║" +
                " ▷Tienda Online: " + tiedaOnline + '\'' +
                " ▷Peso:" + tamañoGB + " GB" +
                " ▷Plataforma:'" + plataforma + '\'' +
                " ▷Titulo:'" + titulo + '\'' +
                " ▷Nota:" + nota;
    }
}
