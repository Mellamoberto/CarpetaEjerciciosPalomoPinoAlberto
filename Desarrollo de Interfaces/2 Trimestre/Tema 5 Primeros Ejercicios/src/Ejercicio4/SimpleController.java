package Ejercicio4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {

	@FXML
	private Button boton1, boton2, boton3, boton4;
	
	@FXML
	private void handleButtonClick(ActionEvent event) {
		String idBotonPulsado = ((Button)event.getSource()).getId();
		System.out.println("Boton pulsado: "+idBotonPulsado);
	
		switch(idBotonPulsado) {
		case "button1":
			System.out.println("Has pulsado el boton 1");
			System.out.println();
			break;
		case "button2":
			System.out.println("Has pulsado el boton 2");
			System.out.println();
			break;
		case "button3":
			System.out.println("Has pulsado el boton 3");
			System.out.println();
			break;
		case "button4":
			System.out.println("Has pulsado el boton 4");
			System.out.println();
			break;
			default:
				System.out.println("Boton no reconocido");
		}
	}

}
