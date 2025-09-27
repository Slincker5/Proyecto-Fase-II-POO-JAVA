package ventanas;

import contenido.LaminaIngresarTablet;

public class VentanaIngresarTablet extends VentanaBase {
    public VentanaIngresarTablet() {
        super("Ingresar Laptop", 600, 500);
        LaminaIngresarTablet ingresarLaptop = new LaminaIngresarTablet();
        add(ingresarLaptop);
    }
}
