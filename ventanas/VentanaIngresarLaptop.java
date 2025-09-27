package ventanas;

import contenido.LaminaIngresarLaptop;

public class VentanaIngresarLaptop extends VentanaBase {
    public VentanaIngresarLaptop() {
        super("Ingresar Laptop", 600, 500);
        LaminaIngresarLaptop ingresarLaptop = new LaminaIngresarLaptop();
        add(ingresarLaptop);
    }
}
