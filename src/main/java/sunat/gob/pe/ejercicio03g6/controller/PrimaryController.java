package sunat.gob.pe.ejercicio03g6.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import sunat.gob.pe.ejercicio03g6.App;

public class PrimaryController implements Initializable{
	
	@FXML
	private Label lblMensaje;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		lblMensaje.setText("Hola, bienvenido");
		
	}
}
