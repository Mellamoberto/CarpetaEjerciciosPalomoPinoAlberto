package ejerciciosRepasoJPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana5ConMetodos extends JFrame  {
	private JPanel panel;
	
	public static void main(String[] args) {
		Ventana5ConMetodos ventana = new Ventana5ConMetodos();
		ventana.inicializarVentana();
		int y=50;
		
		for(int i=1; i<=3; i++) {
			ventana.agregarBoton("Boton "+i, y, 100);
			y=y+100;
		}
		
	}

	private void inicializarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}
		
	void agregarBoton(String nombreBoton, int x, int y) {
		JButton botonBienvenido = new JButton(nombreBoton);
		botonBienvenido.setBounds(x, y, 100, 50);
		panel.add(botonBienvenido);
	}
	

}
