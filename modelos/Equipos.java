package modelos;
public class Equipos {
    protected String fabricante;
    protected String modelo;
    protected String procesador;

    public Equipos() {
    }

    public Equipos(String fabricante, String modelo, String procesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.procesador = procesador;
    }
}
