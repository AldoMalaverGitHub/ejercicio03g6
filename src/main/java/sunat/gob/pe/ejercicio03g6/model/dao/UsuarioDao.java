package sunat.gob.pe.ejercicio03g6.model.dao;

import java.util.Arrays;
import java.util.List;

import sunat.gob.pe.ejercicio03g6.model.entities.UsuarioModel;

public class UsuarioDao {
	
	public List<UsuarioModel> listarUsuarios(){
		
		return Arrays.asList(new UsuarioModel(1L, "amalaver", "abcd.1234"),
				new UsuarioModel(2L, "rgomez", "123456789"),
				new UsuarioModel(3L, "nayala", "987654321"));
	}
	

}
