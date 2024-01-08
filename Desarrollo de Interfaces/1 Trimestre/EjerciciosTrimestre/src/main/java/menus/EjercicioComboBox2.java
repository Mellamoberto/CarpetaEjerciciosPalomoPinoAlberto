package menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioComboBox2 extends JFrame {
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox2;

	public EjercicioComboBox2() {
		setTitle("Ejemplo JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(300, 100);

		JLabel label = new JLabel("Selecciona un lenguaje:");
		label.setBounds(10, 10, 150, 20);
		add(label);
		
		JLabel label2 = new JLabel("Selecciona una ciudad:");
		label2.setBounds(10, 40, 150, 20);
		add(label2);

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
		
		String[] opciones2 = {"", "Barcelona", "Madrid", "Sevilla", "Bilbao"};
		comboBox2 = new JComboBox<>(opciones2);
		comboBox2.setBounds(160, 40, 120, 20);
		add(comboBox2);


		
		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex2 = comboBox2.getSelectedIndex();
				comboBox2.setSelectedIndex(0);
				String seleccion2 = opciones2[selectedIndex2];
				mostrarMensaje("Indica el código", "Has elegido: " + seleccion2);
			}
		});

		setLocationRelativeTo(null);
	}

	private void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioComboBox2().setVisible(true);
		});
	}
}