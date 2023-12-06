package sunat.gob.pe.ejercicio03g6.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import sunat.gob.pe.ejercicio03g6.App;
import sunat.gob.pe.ejercicio03g6.model.dao.ProductoDao;
import sunat.gob.pe.ejercicio03g6.model.dao.UsuarioDao;
import sunat.gob.pe.ejercicio03g6.model.dao.impl.ProductoDaoImpl;
import sunat.gob.pe.ejercicio03g6.model.entities.ProductoModel;
import sunat.gob.pe.ejercicio03g6.model.entities.UsuarioModel;

public class LoginController implements Initializable{
	
	@FXML
	private TextField txtUsuario;
	
	@FXML
	private PasswordField txtPassword;
	
	@FXML
	private Button btnLogin;
	
	@FXML
	private Button btnCancelar;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		ProductoDao productoDao = new ProductoDaoImpl();
		List<ProductoModel> listaProductos = productoDao.listarProductos();
		
		for(ProductoModel productoModel: listaProductos) {
			System.out.println(productoModel.getId() + " " + productoModel.getNombre());
		}
		
		btnLogin.setOnAction(p -> validarDatos());
		
	}
	
	private void validarDatos() {
		if(txtUsuario.getText().equals("")) {
			mostrarAlerta(AlertType.ERROR, "Ingrese usuario válido");
			return;
		}
		
		if(txtPassword.getText().equals("")) {	
			mostrarAlerta(AlertType.ERROR, "Ingrese password válido");
			return;
		}
		
		UsuarioDao usuarioDao = new UsuarioDao();
		List<UsuarioModel> listaUsuarios = usuarioDao.listarUsuarios();
		
		for(UsuarioModel model :listaUsuarios) {
			if(txtUsuario.getText().equals(model.getUsuario()) && 
					txtPassword.getText().equals(model.getPassword())) {
				
				mostrarAlerta(AlertType.INFORMATION, "Credenciales válidas");
				
				try {
					App.setRoot("dashboard");
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				cambiarTamanioPantalla(730, 450);
				return;
			}
		}
		mostrarAlerta(AlertType.ERROR, "Credenciales inválidas");		
		
	}
	
	private void mostrarAlerta(AlertType tipoAlerta, String mensaje) {
		Alert alerta = new Alert(tipoAlerta);
		alerta.setContentText(mensaje);
		alerta.show();
	}
	
	private void cambiarTamanioPantalla(int largo, int ancho) {
		Window window = App.scene.getWindow();
		window.setHeight(ancho);
		window.setWidth(largo);
	}
	
	

}
