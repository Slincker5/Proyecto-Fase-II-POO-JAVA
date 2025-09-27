package modelos;

public class Tablet extends Equipos {
    private String tamanoPantalla;
    private String tipoPantalla;    
    private String memoriaNAND;     
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String procesador,
                  String tamanoPantalla, String tipoPantalla,
                  String memoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, procesador);
        this.tamanoPantalla = tamanoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamanoPantalla()  { return tamanoPantalla; }
    public String getTipoPantalla()    { return tipoPantalla; }
    public String getMemoriaNAND()     { return memoriaNAND; }
    public String getSistemaOperativo(){ return sistemaOperativo; }
}
