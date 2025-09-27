package contenido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import ventanas.VentanaPrincipal;
import modelos.Desktop;

public class LaminaIngresarDesktop extends JPanel {
    JTextField fabricante;
    JTextField modelo;
    JTextField procesador;
    JTextField memoria;
    JTextField tarjetaGrafica;
    JTextField tamanoDeTorre;
    JTextField almacenamiento;
    JButton boton;

    public LaminaIngresarDesktop() {
        setLayout(null);

        // Fabricante
        JLabel lblFabricante = editar("Fabricante:");
        lblFabricante.setBounds(50, 80, 120, 30);
        fabricante = new JTextField(15);
        fabricante.setBounds(180, 80, 200, 30);
        add(lblFabricante);
        add(fabricante);

        // Modelo
        JLabel lblModelo = editar("Modelo:");
        lblModelo.setBounds(50, 120, 120, 30);
        modelo = new JTextField(15);
        modelo.setBounds(180, 120, 200, 30);
        add(lblModelo);
        add(modelo);

        // Procesador
        JLabel lblProcesador = editar("Procesador:");
        lblProcesador.setBounds(50, 160, 120, 30);
        procesador = new JTextField(15);
        procesador.setBounds(180, 160, 200, 30);
        add(lblProcesador);
        add(procesador);

        // Memoria
        JLabel lblMemoria = editar("Memoria:");
        lblMemoria.setBounds(50, 200, 120, 30);
        memoria = new JTextField(15);
        memoria.setBounds(180, 200, 200, 30);
        add(lblMemoria);
        add(memoria);

        // Tarjeta gráfica
        JLabel lblTarjeta = editar("Tarjeta gráfica:");
        lblTarjeta.setBounds(50, 240, 120, 30);
        tarjetaGrafica = new JTextField(15);
        tarjetaGrafica.setBounds(180, 240, 200, 30);
        add(lblTarjeta);
        add(tarjetaGrafica);

        // Tamaño de torre
        JLabel lblTorre = editar("Tamaño de torre:");
        lblTorre.setBounds(50, 280, 120, 30);
        tamanoDeTorre = new JTextField(15);
        tamanoDeTorre.setBounds(180, 280, 200, 30);
        add(lblTorre);
        add(tamanoDeTorre);

        // Almacenamiento
        JLabel lblAlmacenamiento = editar("Almacenamiento:");
        lblAlmacenamiento.setBounds(50, 320, 120, 30);
        almacenamiento = new JTextField(15);
        almacenamiento.setBounds(180, 320, 200, 30);
        add(lblAlmacenamiento);
        add(almacenamiento);

        // Botón Guardar
        boton = new JButton("Guardar");
        boton.setBounds(200, 370, 120, 35);
        boton.setBackground(Color.DARK_GRAY);
        boton.setForeground(Color.WHITE);
        add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Desktop nuevo = new Desktop(
                        fabricante.getText(),
                        modelo.getText(),
                        procesador.getText(),
                        memoria.getText(),
                        tarjetaGrafica.getText(),
                        tamanoDeTorre.getText(),
                        almacenamiento.getText()
                );

                VentanaPrincipal.listaDesktops.add(nuevo);

                // cerrar las ventanas secundarias
                for (Frame frame : Frame.getFrames()) {
                    if (!(frame instanceof VentanaPrincipal)) {
                        frame.dispose();
                    }
                }

                JOptionPane.showMessageDialog(null, "Desktop registrada exitosamente");
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("Cambria", Font.BOLD, 18));
        g.drawString("Ingresar Desktop", 160, 40);
    }

    protected JLabel editar(String texto) {
        JLabel lbl = new JLabel(texto);
        lbl.setFont(new Font("Cambria", Font.BOLD, 14));
        return lbl;
    }
}
