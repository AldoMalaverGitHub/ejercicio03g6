package sunat.gob.pe.ejercicio03g6.model.dao;

import java.util.List;

import sunat.gob.pe.ejercicio03g6.model.entities.ProductoModel;

public interface ProductoDao {
	
	List<ProductoModel> listarProductos();
	
	ProductoModel listarProductoPorId(Long id);
	
	void guardarProducto(ProductoModel productoModel);
	
	void actualizarProducto(ProductoModel productoModel);
	
	void eliminarProducto(Long id);

}
