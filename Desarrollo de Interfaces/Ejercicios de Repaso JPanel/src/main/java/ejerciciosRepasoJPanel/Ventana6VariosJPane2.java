package ejerciciosRepasoJPanel;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana6VariosJPane2 extends JFrame {
	private JLabel etiquetaMensaje;
	private JLabel etiquetaBienvenido;

	public Ventana6VariosJPane2() {

		setTitle("Ejemplo con dos contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel panelVentanas = new JPanel();

		etiquetaMensaje = new JLabel("Mensaje: ");
		etiquetaMensaje.setForeground(Color.red);
		etiquetaBienvenido = new JLabel("Bienvenido: ");
		etiquetaBienvenido.setForeground(Color.blue);

		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			boton.setBackground(Color.black);
			boton.setForeground(Color.white);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText("Mensaje: " + textoBoton);
					etiquetaBienvenido.setText("Bienvenido: " + textoBoton + " otra vez");
				}
			});
			panelBotones.add(boton);
		}
		
		JPanel panelVentanas2 = new JPanel();
		
		for(int i = 1; i<=3; i++) {
			JButton ventanaBoton = new JButton("Ventana " + i);
			ventanaBoton.setBackground(Color.red);
			ventanaBoton.setForeground(Color.cyan);
			final int ventanaIndex = i;
			ventanaBoton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText("Mensaje: " + textoBoton);
					etiquetaBienvenido.setText("Bienvenido: " + textoBoton + " otra vez");
					abrirVentanasSecundaria(ventanaIndex);
				}
			});
			panelVentanas2.add(ventanaBoton);
		}

        setLayout(new BorderLayout());
        add(panelBotones, BorderLayout.SOUTH);
        panelMensaje.setPreferredSize(new Dimension(500, 50));
        add(panelMensaje, BorderLayout.NORTH);
        panelMensaje.add(etiquetaMensaje);
        panelMensaje.add(etiquetaBienvenido);
        add(panelVentanas2, BorderLayout.CENTER);
        
        
        
        pack();
        setVisible(true);
    }
	
	public void abrirVentanasSecundaria(int ventanaIndex) {
		JFrame ventanaSecundaria = new JFrame ("Ventana " + ventanaIndex);
		ventanaSecundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);;
		
		JLabel mensajeVentana = new JLabel("Has pulsado la ventana " + ventanaIndex);
		ventanaSecundaria.add(mensajeVentana);
		
		ventanaSecundaria.pack();
		ventanaSecundaria.setVisible(true);
	}

    public static void main(String[] args) {
     SwingUtilities.invokeLater(new Runnable() {
         public void run() {
             new Ventana6VariosJPane2();
         }
     });

    }
}
