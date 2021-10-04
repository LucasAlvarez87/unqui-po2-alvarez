package ar.ede.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List <Ingreso> ingresos = new ArrayList <Ingreso>();
	
	public Trabajador() {
		super();
	}
	

	public List<Ingreso> getIngresos() {
		return ingresos;
	}
	
	public void añadirIngreso(Ingreso ingreso) {
		this.getIngresos().add(ingreso);
	}

	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso ingreso:this.getIngresos()) {
			total += ingreso.getMonto();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0;
		for (Ingreso ingreso:this.getIngresos()) {
			total += ingreso.getMontoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
