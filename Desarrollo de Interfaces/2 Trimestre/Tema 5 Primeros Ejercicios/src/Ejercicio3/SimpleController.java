package Ejercicio3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SimpleController {

	@FXML
	private void handleButtonClick(ActionEvent event) {
		System.out.println("¡Ha pulsado el boton!");
	}

	@FXML
	private void pulsame(ActionEvent event) {
		System.out.println("¡Ha pulsado el boton!");
	}

}
