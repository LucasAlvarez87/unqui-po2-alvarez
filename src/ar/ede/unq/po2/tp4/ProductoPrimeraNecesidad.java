package ar.ede.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean booleano) {
		super(nombre, precio, booleano);
	}
	
	public ProductoPrimeraNecesidad(String nombre,double precio) {
		super(nombre,precio);
	}

	@Override
	public double getPrecio() {
		return this.precio * 0.9 ;
	}
}
