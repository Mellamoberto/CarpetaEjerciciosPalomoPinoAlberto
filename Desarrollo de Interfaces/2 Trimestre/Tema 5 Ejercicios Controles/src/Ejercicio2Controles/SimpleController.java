package Ejercicio2Controles;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SimpleController {
	
	@FXML
    private TextField importeTextField;


    @FXML
    private Label resultadoLabel;
    
    @FXML
    private void iva4() {
        double importe = Double.parseDouble(importeTextField.getText());
        double iva4 = importe*0.04;
        double resultado = importe + iva4;
        resultadoLabel.setText("Resultado: " + resultado);
    }
    
    @FXML
    private void iva10() {
        double importe = Double.parseDouble(importeTextField.getText());
        double iva10 = importe*0.10;
        double resultado = importe + iva10;
        resultadoLabel.setText("Resultado: " + resultado);
    }
    
    @FXML
    private void iva21() {
        double importe = Double.parseDouble(importeTextField.getText());
        double iva21 = importe*0.21;
        double resultado = importe + iva21;
        resultadoLabel.setText("Resultado: " + resultado);
    }
    
    @FXML
    private void limpiar() {
        importeTextField.clear();
        resultadoLabel.setText("Resultado: ");
    }


    @FXML
    private void salir() {
        System.exit(0);
    }
    
}
