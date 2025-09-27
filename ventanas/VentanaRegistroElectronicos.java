package ventanas;

import contenido.LaminaRegistrosDeElectronicos;

public class VentanaRegistroElectronicos extends VentanaBase {

    public VentanaRegistroElectronicos() {
        super("Registrar equipos", 500, 300);

        LaminaRegistrosDeElectronicos laminaRegistros = new LaminaRegistrosDeElectronicos();
        add(laminaRegistros);
    }
}
