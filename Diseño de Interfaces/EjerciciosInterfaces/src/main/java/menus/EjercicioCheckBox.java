package menus;

import javax.swing.*;

public class EjercicioCheckBox extends JFrame {
	public EjercicioCheckBox() {
		setTitle("Ejemplo JCheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JCheckBox checkBox = new JCheckBox("Aceptar términos y condiciones");
		add(checkBox);
		setSize(300, 200);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioCheckBox().setVisible(true);
		});
	}
}