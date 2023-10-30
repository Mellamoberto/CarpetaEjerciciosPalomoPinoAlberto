package ejerciciosRepasoJPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana6ConMetodos1 extends JFrame {
	private JPanel panel;

	public static void main(String[] args) {
		Ventana5ConMetodos ventana = new Ventana5ConMetodos();
		ventana.inicializarVentana();
		int y = 50;

		String[] botones = { "aceptar", "cancelar", "avanzar" };

		for (String nombreBoton : botones) {
			ventana.agregarBoton(nombreBoton, y, 100);
			y = y + 100;
		}

	}

	public void inicializarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}

	private void agregarBoton(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x, y, 100, 50);
		panel.add(boton);
	}
	

}
