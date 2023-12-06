package sunat.gob.pe.ejercicio03g6.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class DashboardController implements Initializable {
	
	@FXML
	private Label lblUsuario;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public void actualizarUsuario(String usuario) {
		lblUsuario.setText(usuario);
	}

}
