package sunat.gob.pe.ejercicio03g6.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private Connection conexion;
	
	public Connection getConexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_db", "root", "mysql");
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	

}
