package ejerciciosRepasoJPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaConBoton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame ventana = new JFrame("Ventana con Boton");
		String nombre = "Berto";
		String apellido = "Palomo";
		
		ventana.setSize(400, 200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cierra ventana
		
		JButton boton = new JButton("Haz clic aqui");
		ventana.add(boton);
		
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String nombre = JOptionPane.showInputDialog(ventana,
						"Dime tu nombre", "Datos personales",
						JOptionPane.QUESTION_MESSAGE);
				String apellido = JOptionPane.showInputDialog(ventana,
						"Ahora dime tu apellido", "Datos personales",
						JOptionPane.QUESTION_MESSAGE);	
			}	
		});
		ventana.setVisible(true);
		}

}