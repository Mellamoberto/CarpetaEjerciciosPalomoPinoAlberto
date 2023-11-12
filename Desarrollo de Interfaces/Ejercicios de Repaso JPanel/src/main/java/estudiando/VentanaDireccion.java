package estudiando;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaDireccion extends JFrame {
	private static final String[] direcciones = {"Arriba","Abajo","Izquierda","Derecha"};
	
	public VentanaDireccion() {
		
		JPanel botones = new JPanel();
		JPanel mensaje = new JPanel();
		JLabel elige = new JLabel("Elige la direccion");
		
		for (String direccion : direcciones) {
			JButton boton = new JButton("Boton "+direccion);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					moverVentana(direccion);
					String textoBoton = ((JButton) e.getSource()).getText();
					elige.setText("Has elegido la direccion => " + textoBoton);
				}
			});
			botones.add(boton);
		}
		

		getContentPane().add(botones);
		getContentPane().add(mensaje);
		mensaje.add(elige);
		
		setLayout(new BorderLayout());
		
		add(mensaje, BorderLayout.NORTH);
		add(botones, BorderLayout.CENTER);
		setTitle("Ejemplo con setLocation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocation(750,500);
		setVisible(true);
		
	}
	
	private void moverVentana(String direccion) {
		int x;
		int y;
		
		switch (direccion) {
		case "Arriba":
		setLocation(750,0);
			break;
		case "Abajo":
		setLocation(750,950);
			break;
		case "Izquierda":
		setLocation(0,500);
			break;
		case "Derecha":
		setLocation(1400,500);
			break;
		}
	}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaDireccion();
            }
        });

       }
   }
