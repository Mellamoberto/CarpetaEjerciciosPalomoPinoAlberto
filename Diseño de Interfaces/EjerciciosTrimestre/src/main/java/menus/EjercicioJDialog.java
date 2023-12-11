package menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioJDialog extends JFrame {

	public EjercicioJDialog() {
		JButton botonAbrirDialog = new JButton("Abrir Diálogo");
		botonAbrirDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirDialogo();

			}
		});

		setLayout(new FlowLayout());
		add(botonAbrirDialog);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void abrirDialogo() {
		JDialog dialogo = new JDialog(this, "Cuadro de Diálogo", true);

// Contenido del cuadro de diálogo
		JLabel etiqueta = new JLabel("Este es un cuadro de diálogo simple.");
		JButton botonCerrar = new JButton("Cerrar");
		botonCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogo.dispose(); // Cierra el diálogo
			}
		});

		dialogo.setLayout(new BorderLayout());
		dialogo.add(etiqueta, BorderLayout.CENTER);
		dialogo.add(botonCerrar, BorderLayout.SOUTH);
		dialogo.setSize(250, 100);
		dialogo.setLocationRelativeTo(this);
		dialogo.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EjercicioJDialog();
			}
		});
	}
}