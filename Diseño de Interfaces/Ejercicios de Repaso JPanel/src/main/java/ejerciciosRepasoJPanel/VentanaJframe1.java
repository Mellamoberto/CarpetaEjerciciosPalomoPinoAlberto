package ejerciciosRepasoJPanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class VentanaJframe1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJframe1 frame = new VentanaJframe1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaJframe1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton Boton1 = new JButton("Boton 1");
		Boton1.setBounds(5, 6, 212, 83);
		Boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(Boton1);

		JLabel label = new JLabel("");
		label.setBounds(217, 6, 212, 83);
		contentPane.add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(5, 89, 212, 83);
		contentPane.add(label_1);

		JButton Boton3 = new JButton("Boton 3");
		Boton3.setBounds(217, 89, 212, 83);
		contentPane.add(Boton3);

		JButton Boton2 = new JButton("Boton 2");
		Boton2.setBounds(5, 172, 212, 83);
		contentPane.add(Boton2);
	}
}

