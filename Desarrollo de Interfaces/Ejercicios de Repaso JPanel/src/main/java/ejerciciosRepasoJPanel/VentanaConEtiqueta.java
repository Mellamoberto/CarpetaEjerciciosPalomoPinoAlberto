package ejerciciosRepasoJPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaConEtiqueta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame("mi primera ventana");
		ventana.setSize(400, 200);

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel texto = new JLabel("Hola, Alberto");
		ventana.getContentPane().add(texto);

		ventana.setVisible(true);

	}

}