package modelos;
public class Laptop extends Equipos {
    private String memoria;
    private String tamanoPantalla;
    private String almacenamiento;

    public Laptop(String fabricante, String modelo, String procesador,
            String memoria, String tamanoPantalla, String almacenamiento) {
        super(fabricante, modelo, procesador);
        this.memoria = memoria;
        this.tamanoPantalla = tamanoPantalla;
        this.almacenamiento = almacenamiento;
    }
}
