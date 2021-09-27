package ar.ede.unq.po2.tp3;

public class Cuadrado {
	
	private Rectangulo forma;
	
	public Cuadrado(Point punto, float lado) {
		super();
		this.forma = new Rectangulo(punto,lado,lado);
	}
	
	public float area() {
		return forma.area();
	}
	
	public float perimetro() {
		return forma.perimetro();
	}
	
	public Point getPunto() {
		return forma.getPuntoIzquierdoInferior();
	}
	
	public float getLargoDeLado() {
		return forma.getAlto();
	}
	
	
}
