package menus;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class EjercicioCheckBox2 extends JFrame {
    public EjercicioCheckBox2() {
        setTitle("Ejemplo JCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBoxDeseaRecibirPublicidad = new JCheckBox("Desea recibir publi");
        getContentPane().add(checkBoxDeseaRecibirPublicidad, BorderLayout.EAST);

        JCheckBox checkBox = new JCheckBox("Aceptar términos y condiciones");
        getContentPane().add(checkBox, BorderLayout.WEST);
        setSize(445, 213);
        setLocationRelativeTo(null);
        
        checkBoxDeseaRecibirPublicidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBoxDeseaRecibirPublicidad.isSelected()) {
                    mostrarMensaje("Indica el código", "Has aceptado aceptar publi");
                } else {
                    mostrarMensaje("Indica el código", "No recibiras publi");
                }
            }
        });
    

        checkBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    mostrarMensaje("Indica el codigo", "Has aceptado los terminos y condiciones");
                } else {
                    mostrarMensaje("Indica el codigo", "Has desmarcado los temrinos y condiciones");
                }
            }
        });
    }

    private void mostrarMensaje(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EjercicioCheckBox2().setVisible(true);
        });
    }
}