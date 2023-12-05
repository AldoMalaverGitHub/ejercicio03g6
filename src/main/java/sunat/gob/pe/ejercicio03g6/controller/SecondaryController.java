package sunat.gob.pe.ejercicio03g6.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import sunat.gob.pe.ejercicio03g6.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }    

}