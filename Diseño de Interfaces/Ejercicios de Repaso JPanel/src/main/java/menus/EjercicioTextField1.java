package menus;

import javax.swing.*;

import ejerciciosRepasoJPanel.Ventana6VariosJPane2;

public class EjercicioTextField1 extends JFrame {

	public EjercicioTextField1() {
		setTitle("Ejemplo JTextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setSize(300, 100);

		JLabel label = new JLabel("Indica tu nombre:");
		label.setBounds(10, 10, 150, 20);
		add(label);

		JTextField textField = new JTextField();
		textField.setBounds(160, 10, 120, 20);
		add(textField);

		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EjercicioTextField1().setVisible(true);;
			}
		});

	}
}
