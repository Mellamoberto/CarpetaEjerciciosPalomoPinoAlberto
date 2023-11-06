package ejerciciosRepasoJPanel;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana6VariosJpane extends JFrame {
	private JLabel etiquetaMensaje;
	private JLabel etiquetaBienvenido;

	public Ventana6VariosJpane() {

		setTitle("Ejemplo con dos contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelBotones = new JPanel();
		JPanel panelBienvenido = new JPanel();
		JPanel panelMensaje = new JPanel();

		etiquetaMensaje = new JLabel("Mensaje: ");
		etiquetaBienvenido = new JLabel("Bienvenido: ");

		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText("Mensaje: " + textoBoton);
					etiquetaBienvenido.setText("Bienvenido: " + textoBoton + " otra vez");
				}
			});
			panelBotones.add(boton);
		}
		


        setLayout(new BorderLayout());
        add(panelBienvenido, BorderLayout.NORTH);
        panelBienvenido.add(etiquetaBienvenido);
        add(panelBotones, BorderLayout.CENTER);
        add(panelMensaje, BorderLayout.SOUTH);
        panelMensaje.add(etiquetaMensaje);
        
        

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
     SwingUtilities.invokeLater(new Runnable() {
         public void run() {
             new Ventana6VariosJpane();
         }
     });

    }
}