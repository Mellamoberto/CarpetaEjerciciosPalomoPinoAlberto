module componentes {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens Ejercicio1 to javafx.graphics, javafx.fxml;
	exports Ejercicio2;
	
	opens Ejercicio3 to javafx.fxml;
    exports Ejercicio3;
    
    opens Ejercicio4 to javafx.fxml;
    exports Ejercicio4;
    
    opens Ejercicio6 to javafx.fxml;
    exports Ejercicio6;
    
    opens Ejercicio7 to javafx.fxml;
    exports Ejercicio7;
    
    opens Ejercicio8 to javafx.fxml;
    exports Ejercicio8;
    
    opens Ejercicio9 to javafx.fxml;
    exports Ejercicio9;
}
