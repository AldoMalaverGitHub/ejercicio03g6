package sunat.gob.pe.ejercicio03g6.model.entities;

public class ProductoModel {
	
	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	private String medida;
	
	private int estado;

	public ProductoModel() {
		
	}

	public ProductoModel(Long id, String nombre, String descripcion, String medida, int estado) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.medida = medida;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
