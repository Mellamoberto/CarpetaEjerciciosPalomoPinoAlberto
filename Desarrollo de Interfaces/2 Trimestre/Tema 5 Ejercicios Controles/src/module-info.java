module Controles {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens Ejercicio1Controles to javafx.graphics, javafx.fxml;
	exports Ejercicio1Controles;
	
	opens Ejercicio2Controles to javafx.graphics, javafx.fxml;
	exports Ejercicio2Controles;
}
