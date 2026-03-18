package VistaAmazonQr;

import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame{
       public VentanaPrincipal() {
        setSize(500, 500);
        setTitle("AmazonQR");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        ImageIcon imagen = new ImageIcon(getClass().getResource("QR2.png"));

        // Fondo
        JLabel fondo = new JLabel(imagen);
        fondo.setBounds(0, 0, 500, 500);
        fondo.setLayout(null);
        add(fondo);


        JLabel titulo = new JLabel("AmazonQR");
        titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
        titulo.setForeground(Color.DARK_GRAY);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBounds(0, 30, 500, 50);
        fondo.add(titulo);


        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(50, 120, 150, 40);
        btnBuscar.setBackground(new Color(71, 194, 191));
        btnBuscar.setForeground(Color.BLACK);
        btnBuscar.setFont(new Font("Arial", Font.BOLD, 12));
        btnBuscar.setFocusPainted(false);
        fondo.add(btnBuscar);



        JButton btnVer = new JButton("Ver lugares");
        btnVer.setBounds(200, 120, 150, 40);
        btnVer.setBackground(new Color(71, 194, 191));
        btnVer.setForeground(Color.BLACK);
        btnVer.setFont(new Font("Arial", Font.BOLD, 12));
        btnVer.setFocusPainted(false);
        fondo.add(btnVer);

        

       }


}
