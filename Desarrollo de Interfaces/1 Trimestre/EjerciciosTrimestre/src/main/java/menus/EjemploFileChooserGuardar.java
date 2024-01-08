package menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploFileChooserGuardar extends JFrame {

	public EjemploFileChooserGuardar() {
		JButton botonGuardar = new JButton("Guardar Archivo");
		botonGuardar.setBounds(66, 64, 162, 35);
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarArchivo();
			}
		});
		getContentPane().setLayout(null);

		getContentPane().add(botonGuardar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void guardarArchivo() {
		JFileChooser fileChooser = new JFileChooser();
		int resultado = fileChooser.showSaveDialog(this);

		if (resultado == JFileChooser.APPROVE_OPTION) {
// Guardar archivo
			String nombreArchivo = fileChooser.getSelectedFile().getName();
			JOptionPane.showMessageDialog(this, "Archivo guardado como: " + nombreArchivo);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EjemploFileChooserGuardar();
			}
		});
	}
}