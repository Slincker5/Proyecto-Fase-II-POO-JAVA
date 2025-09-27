package contenido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import ventanas.VentanaIngresarDesktop;
import ventanas.VentanaIngresarLaptop;

public class LaminaRegistrosDeElectronicos extends JPanel {
    JTextField input;
    JLabel etiqueta;
    JButton boton;

    public LaminaRegistrosDeElectronicos() {
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
            public void actionPerformed(ActionEvent e) {
                miMetodo(input.getText());
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
        g.drawString("Registro de equipos", 120, 40);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Cambria", Font.BOLD, 14));
        g.drawString("1) Desktop", 170, 100);
        g.drawString("2) Laptop", 170, 120);
        g.drawString("3) Tablet", 170, 140);
    }

    public void miMetodo(String seleccion) {
        switch (seleccion) {
            case "1":
                VentanaIngresarDesktop ventanaDesktop = new VentanaIngresarDesktop();
                ventanaDesktop.setVisible(true);
                break;
            case "2":
                VentanaIngresarLaptop ventanaLaptop = new VentanaIngresarLaptop();
                ventanaLaptop.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Opcion no valida");
        }
    }
}
