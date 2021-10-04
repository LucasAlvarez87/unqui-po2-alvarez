package ar.ede.unq.po2.tp4;

public class Ingreso {

	private String mes;
	private String concepto;
	private double monto;
	
	public Ingreso(String mes, String concepto, double monto) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public String getMes() {
		return mes;
	}


	public String getConcepto() {
		return concepto;
	}


	public double getMonto() {
		return monto;
	}

	public double getMontoImponible() {
		return this.getMonto();
	}
	
	
}
