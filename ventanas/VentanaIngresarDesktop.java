package ventanas;

import contenido.LaminaIngresarDesktop;

public class VentanaIngresarDesktop extends VentanaBase {
    public VentanaIngresarDesktop() {
        super("Ingresar Desktop", 600, 500);
        LaminaIngresarDesktop ingresarDesktop = new LaminaIngresarDesktop();
        add(ingresarDesktop);
    }
}
