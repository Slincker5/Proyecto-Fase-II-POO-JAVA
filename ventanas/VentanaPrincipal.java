package ventanas;

import java.util.ArrayList;

import contenido.Lamina;
import modelos.Desktop;
import modelos.Laptop;
import modelos.Tablet;

public class VentanaPrincipal extends VentanaBase {

    public static ArrayList<Desktop> listaDesktops = new ArrayList<>();
    public static ArrayList<Laptop> listaLaptops = new ArrayList<>();
    public static ArrayList<Tablet> listaTablets = new ArrayList<>();
    public VentanaPrincipal() {
        super("Administracion de Equipos", 500, 300);

        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}
