package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {

        setSize(500, 500);
        setTitle("Buata Na Taee");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Cargar imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource("image.png"));

        // Fondo
        JLabel fondo = new JLabel(imagen);
        fondo.setBounds(0, 0, 500, 500);
        fondo.setLayout(null);
        add(fondo);

        // ******************************
        // TITULO

        JLabel titulo = new JLabel("Buata Na Taee");
        titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBounds(0, 30, 500, 50);
        fondo.add(titulo);

        // ******************************
        // FILA 1

        JButton btnSaludos = new JButton("Saludos");
        btnSaludos.setBounds(50, 120, 150, 40);
        btnSaludos.setBackground(new Color(71, 194, 191));
        btnSaludos.setForeground(Color.BLACK);
        btnSaludos.setFont(new Font("Arial", Font.BOLD, 12));
        btnSaludos.setFocusPainted(false);
        fondo.add(btnSaludos);

        JButton btnPartesCuerpo = new JButton("Partes del cuerpo");
        btnPartesCuerpo.setBounds(300, 120, 150, 40);
        btnPartesCuerpo.setBackground(new Color(71, 194, 191));
        btnPartesCuerpo.setForeground(Color.BLACK);
        btnPartesCuerpo.setFont(new Font("Arial", Font.BOLD, 12));
        btnPartesCuerpo.setFocusPainted(false);
        fondo.add(btnPartesCuerpo);

        // ******************************
        // FILA 2

        JButton btnNumeros = new JButton("Números");
        btnNumeros.setBounds(50, 180, 150, 40);
        btnNumeros.setBackground(new Color(71, 194, 191));
        btnNumeros.setForeground(Color.BLACK);
        btnNumeros.setFont(new Font("Arial", Font.BOLD, 12));
        btnNumeros.setFocusPainted(false);
        fondo.add(btnNumeros);

        JButton btnColores = new JButton("Colores");
        btnColores.setBounds(300, 180, 150, 40);
        btnColores.setBackground(new Color(71, 194, 191));
        btnColores.setForeground(Color.BLACK);
        btnColores.setFont(new Font("Arial", Font.BOLD, 12));
        btnColores.setFocusPainted(false);
        fondo.add(btnColores);

        // ******************************
        // FILA 3

        JButton btnAnimales = new JButton("Animales");
        btnAnimales.setBounds(50, 240, 150, 40);
        btnAnimales.setBackground(new Color(71, 194, 191));
        btnAnimales.setForeground(Color.BLACK);
        btnAnimales.setFont(new Font("Arial", Font.BOLD, 12));
        btnAnimales.setFocusPainted(false);
        fondo.add(btnAnimales);

        JButton btnJuegos = new JButton("Juegos");
        btnJuegos.setBounds(300, 240, 150, 40);
        btnJuegos.setBackground(new Color(71, 194, 191));
        btnJuegos.setForeground(Color.BLACK);
        btnJuegos.setFont(new Font("Arial", Font.BOLD, 12));
        btnJuegos.setFocusPainted(false);
        fondo.add(btnJuegos);

        // ******************************
        // BOTON FINAL

        JButton btnPresentacion = new JButton("Presentación");
        btnPresentacion.setBounds(175, 320, 150, 40);
        btnPresentacion.setBackground(new Color(71, 194, 191));
        btnPresentacion.setForeground(Color.BLACK);
        btnPresentacion.setFont(new Font("Arial", Font.BOLD, 12));
        btnPresentacion.setFocusPainted(false);
        fondo.add(btnPresentacion);
    }

}