package ar.ede.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List <Producto> productos = new ArrayList <Producto>();
	
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public void agregarProducto(Producto producto) {
		this.getProductos().add(producto);
		
	}

	public Double getPrecioTotal() {
		double sum = 0;
		for (Producto producto: productos) {
			sum += producto.getPrecio();
		}
		return sum;
	}
	
	
	
}