package sunat.gob.pe.ejercicio03g6.controller;

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
		
		/*btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				validarDatos();
				
			}
		});*/
		//-> arrow
		btnLogin.setOnAction(p -> validarDatos());
		//btnLogin.setOnAction(this::validarDatos);
		
	}
	
	private void validarDatos() {
		if(txtUsuario.getText().equals("")) {
			
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setContentText("Ingrese usuario válido");
			alerta.show();
			return;
		}
		
		if(txtPassword.getText().equals("")) {			
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setContentText("Ingrese password válido");
			alerta.show();
			return;
		}
		
		UsuarioDao usuarioDao = new UsuarioDao();
		List<UsuarioModel> listaUsuarios = usuarioDao.listarUsuarios();
		
		/*while() {
			
		}
		
		do {
			
		}while(1 < 2);
		*/
		
		/*for(int i = 0; i < 10; i++) {
			//codigo
		}*/
		
		for(UsuarioModel model :listaUsuarios) {
			if(txtUsuario.getText().equals(model.getUsuario()) && 
					txtPassword.getText().equals(model.getPassword())) {
				
				Alert alerta = new Alert(AlertType.INFORMATION);
				alerta.setContentText("Credenciales válidas");
				alerta.show();
				return;
			}
		}
		
		Alert alerta = new Alert(AlertType.ERROR);
		alerta.setContentText("Credenciales inválidas");
		alerta.show();
		
	}
	
	

}
