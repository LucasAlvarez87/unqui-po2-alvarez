package ar.ede.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	
	private int horas;

	public IngresoPorHorasExtras(String mes, String concepto, double monto, int horas) {
		super(mes, concepto, monto);
		this.horas = horas;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}

}
