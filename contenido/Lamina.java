package contenido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import ventanas.VentanaRegistroElectronicos;
import ventanas.VentanaVerEquipos;

public class Lamina extends JPanel {
    JTextField input;
    JLabel etiqueta;
    JButton boton;

    public Lamina() {
        setLayout(null);

        etiqueta = new JLabel("Selecciona una opcion:");
        etiqueta.setBounds(50, 210, 220, 30);

        input = new JTextField(15);
        input.setBounds(200, 210, 80, 30);

        boton = new JButton("Aceptar");
        boton.setBackground(Color.DARK_GRAY);
        boton.setForeground(Color.WHITE);
        boton.setBounds(300, 210, 100, 30);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = input.getText();
                miMetodo(texto);
            }
        });

        add(etiqueta);
        add(input);
        add(boton);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.setFont(new Font("Cambria", Font.BOLD, 18));
        g.drawString("Administracion de Equipos", 120, 40);

        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Cambria", Font.BOLD, 16));
        g.drawString("Registro de laptops, tablets y PCs", 110, 80);

        g.setFont(new Font("Cambria", Font.BOLD, 14));
        g.drawString("1) Registrar Equipos", 170, 120);
        g.drawString("2) Ver equipos", 170, 150);
        g.drawString("3) Cerrar programa", 170, 180);
    }

    public void miMetodo(String seleccion) {
        switch (seleccion) {
            case "1":
                VentanaRegistroElectronicos ventanaRegistroSeleccion = new VentanaRegistroElectronicos();
                ventanaRegistroSeleccion.setDefaultCloseOperation(3);
                ventanaRegistroSeleccion.setVisible(true);
                break;
            case "2":
                VentanaVerEquipos vista = new VentanaVerEquipos(); // o VentanaVerEquiposTabla
                vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vista.setVisible(true);
                break;
            case "3":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Opcion no valida");
                break;
        }
    }
}
