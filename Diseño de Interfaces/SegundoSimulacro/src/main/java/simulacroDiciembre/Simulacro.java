package simulacroDiciembre;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Simulacro extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	public Simulacro() {
		setSize(200,300);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel formulario = new JPanel();
		formulario.setBackground(new Color(255, 255, 128));
		getContentPane().add(formulario, BorderLayout.NORTH);
		formulario.setLayout(new GridLayout(7, 5, 5, 5));

		
		JLabel lblNewLabel = new JLabel("Nombre");
		formulario.add(lblNewLabel);

		textField_1 = new JTextField();
		formulario.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		formulario.add(lblNewLabel_1);

		textField = new JTextField();
		formulario.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Ocupacion");
		formulario.add(lblNewLabel_2);
		
		JComboBox comboBox_ocupacion = new JComboBox();
		comboBox_ocupacion.setModel(new DefaultComboBoxModel(new String[] {"", "Desempleado", "Autonomo", "Contratado"}));
		formulario.add(comboBox_ocupacion);
		
		JLabel lblNewLabel_3 = new JLabel("Estudios");
		formulario.add(lblNewLabel_3);
		
		JComboBox comboBoxEstudios = new JComboBox();
		comboBoxEstudios.setModel(new DefaultComboBoxModel(new String[] {"Sin estudios", "Grado medio", "Grado superior", "Licenciado o grado"}));
		formulario.add(comboBoxEstudios);



		JLabel label = new JLabel("");
		formulario.add(label);

		JLabel label_1 = new JLabel("");
		formulario.add(label_1);

		JPanel botones = new JPanel();
		botones.setBackground(new Color(128, 255, 0));
		botones.setForeground(new Color(255, 128, 64));
		FlowLayout flowLayout = (FlowLayout) botones.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(botones, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarInformacion();
			}
		});
		botones.add(btnNewButton, BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
	
	private void mostrarInformacion() {
		String apellidos = textField.getText();
		String nombre = textField_1.getText();
		JOptionPane.showMessageDialog(this,"Nombre: "+nombre+
				"\nApellidos: " + apellidos, 
				"Informacion", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Simulacro();
			}
		});
	}
}
