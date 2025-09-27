package modelos;
public class Desktop extends Equipos {
    private String memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private String almacenamiento;

    public Desktop(String fabricante, String modelo, String procesador,
            String memoria, String tarjetaGrafica, String tamanoTorre, String almacenamiento) {
        super(fabricante, modelo, procesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.almacenamiento = almacenamiento;
    }
}
