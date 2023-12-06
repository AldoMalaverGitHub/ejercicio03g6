package sunat.gob.pe.ejercicio03g6.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Window;
import sunat.gob.pe.ejercicio03g6.App;

public class MenuController implements Initializable{
	
	@FXML
	private Button btnDashboard;
	
	@FXML
	private Button btnProductos;
	
	@FXML
	private Button btnCompras;
	
	@FXML
	private Button btnSalir;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		btnDashboard.setOnAction(p -> irDashboard());
		btnProductos.setOnAction(p -> irProductos());
		btnCompras.setOnAction(p -> irCompras());
		btnSalir.setOnAction(p -> irSalir());		
	}
	
	private void irDashboard() {
		try {
			App.setRoot("dashboard");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	private void irProductos() {
		try {
			App.setRoot("producto");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	private void irCompras() {
		try {
			App.setRoot("compras");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	private void irSalir() {
		try {
			App.setRoot("login");
			Window window = App.scene.getWindow();
			window.setHeight(200);
			window.setWidth(300);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

}
