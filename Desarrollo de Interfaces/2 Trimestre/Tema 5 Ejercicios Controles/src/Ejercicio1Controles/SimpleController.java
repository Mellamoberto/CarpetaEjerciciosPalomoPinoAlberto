package Ejercicio1Controles;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SimpleController {


    @FXML
    private TextField operador1TextField;


    @FXML
    private TextField operador2TextField;


    @FXML
    private Label resultadoLabel;


    @FXML
    private void sumar() {
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double operando2 = Double.parseDouble(operador2TextField.getText());
        double resultado = operando1 + operando2;
        resultadoLabel.setText("Resultado: " + resultado);
    }


    @FXML
    private void restar() {
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double operando2 = Double.parseDouble(operador2TextField.getText());
        double resultado = operando1 - operando2;
        resultadoLabel.setText("Resultado: " + resultado);
    }


    @FXML
    private void multiplicar() {
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double operando2 = Double.parseDouble(operador2TextField.getText());
        double resultado = operando1 * operando2;
        resultadoLabel.setText("Resultado: " + resultado);
    }


    @FXML
    private void dividir() {
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double operando2 = Double.parseDouble(operador2TextField.getText());


        if (operando2 != 0) {
            double resultado = operando1 / operando2;
            resultadoLabel.setText("Resultado: " + resultado);
        } else {
            resultadoLabel.setText("Error: División por cero");
        }
    }


    @FXML
    private void limpiar() {
        operador1TextField.clear();
        operador2TextField.clear();
        resultadoLabel.setText("Resultado: ");
    }


    @FXML
    private void salir() {
        System.exit(0);
    }
}

