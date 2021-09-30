package ar.ede.unq.po2.tp4;

public class Producto {


	protected String nombre;
	protected double precio;
	protected boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean booleano) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = booleano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public void aumentarPrecio(double aumento) {
		this.precio = this.getPrecio() + aumento;
	}

	
	
	
}
