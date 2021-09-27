package ar.ede.unq.po2.tp3;

public class Point {
	
	private float x;
	private float y;
	
	
	public Point(float x, float y) {
		super();
		this.setXY(x,y);
	}
	
	public Point() {
		super();
		this.setXY(0,0);
	}

	public void setXY(float x,float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public void moverPuntoX(float x) {
		this.setX(x);
	}
	
	public void moverPuntoY(float x) {
		this.setY(y);
	}

	public Point sumaCon(Point xy) {
		float sumaX = this.getX() + xy.getX();
		float sumaY = this.getY() + xy.getY();
		Point nuevoPunto = new Point(sumaX,sumaY);
		return nuevoPunto;
	}
}
