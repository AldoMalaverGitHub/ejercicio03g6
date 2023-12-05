package sunat.gob.pe.ejercicio03g6.model.entities;

public class UsuarioModel {
	
	private Long id;
	
	private String usuario;
	
	private String password;
	
	public UsuarioModel() {
		
	}

	public UsuarioModel(Long id, String usuario, String password) {
		
		this.id = id;
		this.usuario = usuario;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
