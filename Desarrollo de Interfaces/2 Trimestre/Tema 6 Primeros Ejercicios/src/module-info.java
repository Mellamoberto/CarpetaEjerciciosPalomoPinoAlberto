module ProyectoDDBB {
    requires javafx.controls;
    requires java.sql;
    requires javafx.fxml;

    opens ejercicio1 to javafx.graphics, javafx.fxml;
    
    opens ejercicio2 to javafx.graphics, javafx.fxml;
    
    opens ejercicio3 to javafx.graphics, javafx.fxml;
}