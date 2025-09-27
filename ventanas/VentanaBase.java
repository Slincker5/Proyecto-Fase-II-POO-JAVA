package ventanas;

import javax.swing.*;

public class VentanaBase extends JFrame {

    public VentanaBase(String titulo, int ancho, int alto) {
        setTitle(titulo);
        setSize(ancho, alto);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }
}
