package ventanas;

import javax.swing.*;
import java.awt.*;
import modelos.Desktop;
import modelos.Laptop;
import modelos.Tablet;

public class VentanaVerEquipos extends VentanaBase {
    private JTextArea area;

    public VentanaVerEquipos() {
        super("Equipos registrados", 650, 500);

        setLayout(new BorderLayout());
        area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 13));

        add(new JScrollPane(area), BorderLayout.CENTER);

        JButton cerrar = new JButton("Cerrar");
        cerrar.addActionListener(e -> dispose());
        add(cerrar, BorderLayout.SOUTH);

        cargar();
    }

    private void cargar() {
        StringBuilder sb = new StringBuilder();

        sb.append("===== DESKTOPS =====\n");
        for (Desktop d : VentanaPrincipal.listaDesktops) {
            sb.append("Fabricante: ").append(d.getFabricante())
              .append(", Modelo: ").append(d.getModelo())
              .append(", Proc: ").append(d.getProcesador())
              .append(", Mem: ").append(d.getMemoria())
              .append(", GPU: ").append(d.getTarjetaGrafica())
              .append(", Torre: ").append(d.getTamanoTorre())
              .append(", Almacen: ").append(d.getAlmacenamiento())
              .append("\n");
        }

        sb.append("\n===== LAPTOPS =====\n");
        for (Laptop l : VentanaPrincipal.listaLaptops) {
            sb.append("Fabricante: ").append(l.getFabricante())
              .append(", Modelo: ").append(l.getModelo())
              .append(", Proc: ").append(l.getProcesador())
              .append(", Mem: ").append(l.getMemoria())
              .append(", Pantalla: ").append(l.getTamanoPantalla())
              .append(", Disco: ").append(l.getAlmacenamiento())
              .append("\n");
        }

        sb.append("\n===== TABLETS =====\n");
        for (Tablet t : VentanaPrincipal.listaTablets) {
            sb.append("Fabricante: ").append(t.getFabricante())
              .append(", Modelo: ").append(t.getModelo())
              .append(", Proc: ").append(t.getProcesador())
              .append(", Pantalla: ").append(t.getTamanoPantalla())
              .append(", Tipo: ").append(t.getTipoPantalla())
              .append(", NAND: ").append(t.getMemoriaNAND())
              .append(", SO: ").append(t.getSistemaOperativo())
              .append("\n");
        }

        if (sb.toString().trim().isEmpty()) {
            sb.append("No hay equipos registrados todavía.");
        }

        area.setText(sb.toString());
    }
}
