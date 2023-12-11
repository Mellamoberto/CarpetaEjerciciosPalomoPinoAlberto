package menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class EjercicioRadioButton2 extends JFrame {
	public EjercicioRadioButton2() {
		setTitle("Ejemplo JRadioButton");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JRadioButton radioButton1 = new JRadioButton("Pastilla Azul");
		JRadioButton radioButton2 = new JRadioButton("Pastilla Roja");

		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);

		ButtonGroup group1 = new ButtonGroup();

		JPanel panel = new JPanel();
		panel.add(radioButton1);

		panel.add(radioButton2);

		getContentPane().add(panel);

		pack();
		setLocationRelativeTo(null);

		radioButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMensaje("Eleccion realizada...", "Has elegido la pastilla azul");
			}
		});

		radioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarMensaje("Eleccion realizada...", "Has elegido la pastilla roja");
			}
		});
	}

	private void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioRadioButton2().setVisible(true);
		});
	}
}