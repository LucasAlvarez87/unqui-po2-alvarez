package ar.ede.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	private static double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean booleano, double descuento) {
		super(nombre, precio, booleano);
		this.descuento = descuento / 100;
	}
	
	public ProductoPrimeraNecesidad(String nombre,double precio, double descuento) {
		super(nombre,precio);
		this.descuento = descuento / 100;
	}
	/*
	@Override
	public double getPrecio() {
		return precio * 0.9 ;
	}
	*/
	
	@Override
	public double getPrecio() {
		return precio * (1 - descuento) ;
	}
	
}

