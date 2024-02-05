package Ejercicio3Controles;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SimpleController implements Initializable {

	@FXML
	private ComboBox<String> comboBox1;

	@FXML
	private RadioButton radioButtonParticular;

	@FXML
	private RadioButton radioButtonEmpresa;

	@FXML
	private ChoiceBox choiceBox1;
	@FXML
	private CheckBox checkBox1, checkBox2, checkBox3;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		if (comboBox1 == null) {
			System.out.println("El ComboBox es nulo y vamos a inicializarlo.");
			comboBox1 = new ComboBox<>();
		}

		ObservableList<String> items = FXCollections.observableArrayList("Opción 1", "Opción 2", "Opción 3");
		comboBox1.setItems(items);

		if (comboBox1.getValue() == null) {
			System.out.println("Estableciendo el valor predeterminado.");
			comboBox1.setValue("Opción 1");
		}

		System.out.println("El ComboBox se ha iniciado bien.");
		ToggleGroup toggleGroup = new ToggleGroup();
		radioButtonParticular.setToggleGroup(toggleGroup);
		radioButtonEmpresa.setToggleGroup(toggleGroup);

		ObservableList<String> items2 = FXCollections.observableArrayList("CONTADO", "TRANSFERENCIA", "PAYPAL");
		choiceBox1.setItems(items2);

	}

}


