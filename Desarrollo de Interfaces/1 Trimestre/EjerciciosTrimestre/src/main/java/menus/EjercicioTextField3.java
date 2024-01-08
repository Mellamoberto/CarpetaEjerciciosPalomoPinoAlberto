package menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioTextField3 extends JFrame {
	private JTextField nombreTextField, edadTextField, direccionTextField, ciudadTextField, provinciaTextField;
	private JLabel nombreLabel, edadLabel, lblDireccion, ciudadLabel, provinciaLabel;

	public EjercicioTextField3() {
		setTitle("Ejemplo JTextField con nombre y apellidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(510, 259);

// Creación de label
		nombreLabel = new JLabel("Indica tu nombre:");
		nombreLabel.setBounds(10, 10, 150, 20);
		getContentPane().add(nombreLabel);

		edadLabel = new JLabel("Indica tu edad:");
		edadLabel.setBounds(10, 40, 120, 20);
		getContentPane().add(edadLabel);

		lblDireccion = new JLabel("Dirección");
		lblDireccion.setBounds(10, 71, 150, 20);
		getContentPane().add(lblDireccion);

		ciudadLabel = new JLabel("Ciudad");
		ciudadLabel.setBounds(10, 98, 150, 20);
		getContentPane().add(ciudadLabel);

		provinciaLabel = new JLabel("Provincia");
		provinciaLabel.setBounds(10, 129, 150, 20);
		getContentPane().add(provinciaLabel);

// Creación de text fields
		nombreTextField = new JTextField();
		nombreTextField.setBounds(160, 10, 175, 20);
		getContentPane().add(nombreTextField);

		edadTextField = new JTextField();
		edadTextField.setBounds(296, 40, 39, 20);
		getContentPane().add(edadTextField);

		direccionTextField = new JTextField();
		direccionTextField.setBounds(160, 71, 175, 20);
		getContentPane().add(direccionTextField);

		ciudadTextField = new JTextField();
		ciudadTextField.setBounds(160, 98, 175, 20);
		getContentPane().add(ciudadTextField);

		provinciaTextField = new JTextField();
		provinciaTextField.setBounds(160, 129, 175, 20);
		getContentPane().add(provinciaTextField);


		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(10, 160, 100, 30);
		getContentPane().add(btnAceptar);

		
		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarDialogo();
			}
		});

		setLocationRelativeTo(null);
	}


	private void mostrarDialogo() {
		String mensaje = "Datos introducidos:\n" + "Nombre: " + nombreTextField.getText() + "\n" + "Edad: "
				+ edadTextField.getText() + "\n" + "Dirección: " + direccionTextField.getText() + "\n" + "Ciudad: "
				+ ciudadTextField.getText() + "\n" + "Provincia: " + provinciaTextField.getText();

		JOptionPane.showMessageDialog(this, mensaje, "Datos Introducidos", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new EjercicioTextField3().setVisible(true);
		});
	}
}