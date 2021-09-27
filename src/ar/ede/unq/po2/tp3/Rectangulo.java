package ar.ede.unq.po2.tp3;

public class Rectangulo {
	private Point puntoIzquierdoInferior;
	private float alto;
	private float ancho;
	public Point getPuntoIzquierdoInferior() {
		return puntoIzquierdoInferior;
	}
	
	public float area() {
		return this.getAlto() * this.getAncho();
	}
	
	public float perimetro() {
		return  2 * ( this.getAlto() + this.getAncho() );
	}
	
	public Boolean esVertical() {
		return (this.getAlto()> this.getAncho());
	}
	
	public boolean esHorizontal() {
		return (this.getAlto()< this.getAncho());
	}
	
	public void setPuntoIzquierdoInferior(Point puntoIzquierdoInferior) {
		this.puntoIzquierdoInferior = puntoIzquierdoInferior;
	}
	public float getAlto() {
		return alto;
	}
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public float getAncho() {
		return ancho;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public Rectangulo(Point puntoIzquierdoInferior, float alto, float ancho) {
		super();
		this.puntoIzquierdoInferior = puntoIzquierdoInferior;
		this.alto = alto;
		this.ancho = ancho;
	}
	
	
	
	
	
	
}
