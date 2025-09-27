package contenido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import ventanas.VentanaPrincipal;
import modelos.Tablet;

public class LaminaIngresarTablet extends JPanel {
    JTextField fabricante;
    JTextField modelo;
    JTextField procesador;
    JTextField tamanoPantalla;
    JTextField tipoPantalla;
    JTextField memoriaNAND;
    JTextField sistemaOperativo;
    JButton boton;

    public LaminaIngresarTablet() {
        setLayout(null);

        // Fabricante
        JLabel lblFabricante = editar("Fabricante:");
        lblFabricante.setBounds(50, 80, 150, 30);
        fabricante = new JTextField(15);
        fabricante.setBounds(200, 80, 200, 30);
        add(lblFabricante);
        add(fabricante);

        // Modelo
        JLabel lblModelo = editar("Modelo:");
        lblModelo.setBounds(50, 120, 150, 30);
        modelo = new JTextField(15);
        modelo.setBounds(200, 120, 200, 30);
        add(lblModelo);
        add(modelo);

        // Procesador
        JLabel lblProcesador = editar("Procesador:");
        lblProcesador.setBounds(50, 160, 150, 30);
        procesador = new JTextField(15);
        procesador.setBounds(200, 160, 200, 30);
        add(lblProcesador);
        add(procesador);

        // Tamaño de pantalla
        JLabel lblPantalla = editar("Pantalla (pulgadas):");
        lblPantalla.setBounds(50, 200, 150, 30);
        tamanoPantalla = new JTextField(15);
        tamanoPantalla.setBounds(200, 200, 200, 30);
        add(lblPantalla);
        add(tamanoPantalla);

        // Tipo de pantalla
        JLabel lblTipoPantalla = editar("Tipo de pantalla:");
        lblTipoPantalla.setBounds(50, 240, 150, 30);
        tipoPantalla = new JTextField(15);
        tipoPantalla.setBounds(200, 240, 200, 30);
        add(lblTipoPantalla);
        add(tipoPantalla);

        // Memoria NAND
        JLabel lblMemoria = editar("Memoria NAND:");
        lblMemoria.setBounds(50, 280, 150, 30);
        memoriaNAND = new JTextField(15);
        memoriaNAND.setBounds(200, 280, 200, 30);
        add(lblMemoria);
        add(memoriaNAND);

        // Sistema Operativo
        JLabel lblSO = editar("Sistema Operativo:");
        lblSO.setBounds(50, 320, 150, 30);
        sistemaOperativo = new JTextField(15);
        sistemaOperativo.setBounds(200, 320, 200, 30);
        add(lblSO);
        add(sistemaOperativo);

        // Botón Guardar
        boton = new JButton("Guardar");
        boton.setBounds(200, 370, 120, 35);
        boton.setBackground(Color.DARK_GRAY);
        boton.setForeground(Color.WHITE);
        add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tablet nuevo = new Tablet(
                        fabricante.getText(),
                        modelo.getText(),
                        procesador.getText(),
                        tamanoPantalla.getText(),
                        tipoPantalla.getText(),
                        memoriaNAND.getText(),
                        sistemaOperativo.getText()
                );

                VentanaPrincipal.listaTablets.add(nuevo);

                // cerrar ventanas secundarias
                for (Frame frame : Frame.getFrames()) {
                    if (!(frame instanceof VentanaPrincipal)) {
                        frame.dispose();
                    }
                }

                JOptionPane.showMessageDialog(null, "Tablet registrada exitosamente");
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Cambria", Font.BOLD, 18));
        g.drawString("Ingresar Tablet", 160, 40);
    }

    protected JLabel editar(String texto) {
        JLabel lbl = new JLabel(texto);
        lbl.setFont(new Font("Cambria", Font.BOLD, 14));
        return lbl;
    }
}
