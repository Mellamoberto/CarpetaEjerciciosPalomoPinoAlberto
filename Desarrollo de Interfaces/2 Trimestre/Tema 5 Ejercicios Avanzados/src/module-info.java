module EjerciciosAvanzados {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens Ejercicio1 to javafx.graphics, javafx.fxml;
	exports Ejercicio1;
	
	opens Ejercicio2 to javafx.graphics, javafx.fxml;
	exports Ejercicio2;
}
