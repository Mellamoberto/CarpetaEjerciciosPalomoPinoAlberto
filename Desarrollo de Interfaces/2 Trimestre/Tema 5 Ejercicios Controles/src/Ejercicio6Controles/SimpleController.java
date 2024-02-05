package Ejercicio6Controles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class SimpleController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    private void handleMenuAction(ActionEvent event) {
        MenuItem sourceMenuItem = (MenuItem) event.getSource();
        System.out.println("Ha pulsado la opción: " + sourceMenuItem.getText());
    }
}

