package ejerciciosRepasoJPanel;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana5ConMetodos3 extends JFrame {
	private JPanel panel;
	
	public static void main(String[] args) {
		Ventana5ConMetodos3 ventana = new Ventana5ConMetodos3();
		ventana.inicializarVentana();
		int y = 50;

		String[] botones = { "aceptar", "cancelar", "avanzar", "redimensionar" };

		for (String nombreBoton : botones) {
			ventana.agregarBoton(nombreBoton, 50, y);
			y = y + 50;
		}

	}
	
	private void inicializarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}

	private void agregarBoton(String nombreBoton, int x, int y) {
		JButton boton = new JButton(nombreBoton);
		boton.setBounds(x, y, 150, 50);
		panel.add(boton);
		
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame ventanaNueva = new JFrame("Nueva ventana");
				if(nombreBoton.equals("redimensionar")) {
					ventanaNueva.setSize(400, 400);
					ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					ventanaNueva.add(new JLabel(" Has pulsado el boton "+nombreBoton));
					ventanaNueva.setVisible(true);
				} else
				ventanaNueva.setSize(200, 200);
				ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				ventanaNueva.add(new JLabel(" Has pulsado el boton "+nombreBoton));
				ventanaNueva.setVisible(true);	
			}
		});
	}

}
