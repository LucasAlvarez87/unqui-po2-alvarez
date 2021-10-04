package ar.ede.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {
	
	private Trabajador trabajador;
	private Ingreso enero;
	private Ingreso febrero;
	private Ingreso porHorasExtras;
	private Ingreso marzo;
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		enero = new Ingreso("Enero", "Aguinaldo", 30000);
		febrero = new Ingreso("Febrero", "Aguinaldo", 32000);
		porHorasExtras = new IngresoPorHorasExtras("Febrero", "Por horas extras", 16000, 16);
		marzo = new Ingreso("Marzo", "Aguinaldo", 35000);
		
		trabajador.añadirIngreso(enero);
		trabajador.añadirIngreso(febrero);
		trabajador.añadirIngreso(porHorasExtras);
		trabajador.añadirIngreso(marzo);
			
	}
	
	@Test
	public void testTotalPercibido() {
		double amount = trabajador.getTotalPercibido();
		assertEquals(amount,113000);
	}
	
	@Test
	public void testMontoImponible() {
		double amount = trabajador.getMontoImponible();
		assertEquals(amount,97000);
	}
	
	@Test
	public void testImpuestoAPagar() {
		double amount = trabajador.getImpuestoAPagar();
		assertEquals(amount,1940);
	}
	
	
	


}