package menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioComboBox1 extends JFrame {
	private JComboBox<String> comboBox;

	public EjercicioComboBox1() {
		setTitle("Ejemplo JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(300, 100);

		JLabel label = new JLabel("Selecciona un lenguaje:");
		label.setBounds(10, 10, 150, 20);
		add(label);

		String[] opciones = { "", "Java", "Kotlin", "PHP", "JAVASCRIPT" };
		comboBox = new JComboBox<>(opciones);
		comboBox.setBounds(160, 10, 120, 20);
		add(comboBox);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = comboBox.getSelectedIndex();
				comboBox.setSelectedIndex(0); // Establecer la selección en -1
				String seleccion = opciones[selectedIndex];
				mostrarMensaje("Indica el código", "Has elegido: " + seleccion);
			}
		});

		setLocationRelativeTo(null);
	}

	private void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioComboBox1().setVisible(true);
		});
	}
}