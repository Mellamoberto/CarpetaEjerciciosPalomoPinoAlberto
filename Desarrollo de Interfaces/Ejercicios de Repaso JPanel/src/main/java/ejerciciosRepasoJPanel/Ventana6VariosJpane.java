package ejerciciosRepasoJPanel;


import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana6VariosJpane extends JFrame {
	private JLabel etiquetaMensaje;

	public Ventana6VariosJpane() {

		setTitle("Ejemplo con dos contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(null);

		etiquetaMensaje = new JLabel("Mensaje:");
		JPanel panelMensaje = new JPanel();
		
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					etiquetaMensaje.setText(etiquetaMensaje.getText() + " " + textoBoton);
				}
			});
			panelBotones.add(boton);
		}
	}
}