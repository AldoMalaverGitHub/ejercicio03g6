package sunat.gob.pe.ejercicio03g6.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sunat.gob.pe.ejercicio03g6.model.dao.ProductoDao;
import sunat.gob.pe.ejercicio03g6.model.entities.ProductoModel;
import sunat.gob.pe.ejercicio03g6.model.util.Conexion;

public class ProductoDaoImpl implements ProductoDao{

	@Override
	public List<ProductoModel> listarProductos() {
		
		Conexion conexion = new Conexion();
		Connection conn = conexion.getConexion();
		String sql = "Select id, nombre, descripcion, medida, estado from Producto";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ProductoModel> listaProductos = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				listaProductos.add(new ProductoModel(rs.getLong(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getInt(5)));
			}
			
		}catch(SQLException se) {
			try {
				
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				
			}catch(SQLException se1) {
				System.out.println(se1.getMessage());
			}
		}	
		
		return listaProductos;
	}

	@Override
	public ProductoModel listarProductoPorId(Long id) {
		Conexion conexion = new Conexion();
		Connection conn = conexion.getConexion();
		String sql = "Select id, nombre, descripcion, medida, estado from Producto where id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		ProductoModel productoModel = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				productoModel = new ProductoModel(rs.getLong(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getInt(5));
			}
			
		}catch(SQLException se) {
			try {
				
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
				
			}catch(SQLException se1) {
				System.out.println(se1.getMessage());
			}
		}	
		
		return productoModel;
	}

	@Override
	public void guardarProducto(ProductoModel productoModel) {
		Conexion conexion = new Conexion();
		Connection conn = conexion.getConexion();
		String sql = "Insert into Producto(nombre, descripcion, medida, estado) values(?,?,?,?)";
		PreparedStatement pstmt = null;			
				
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productoModel.getNombre());
			pstmt.setString(2, productoModel.getDescripcion());
			pstmt.setString(3, productoModel.getMedida());
			pstmt.setInt(4, productoModel.getEstado());
			
			pstmt.executeUpdate();			
			
		}catch(SQLException se) {
			try {
				
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
								
			}catch(SQLException se1) {
				System.out.println(se1.getMessage());
			}
		}		
		
	}

	@Override
	public void actualizarProducto(ProductoModel productoModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProducto(Long id) {
		// TODO Auto-generated method stub
		
	}

}
