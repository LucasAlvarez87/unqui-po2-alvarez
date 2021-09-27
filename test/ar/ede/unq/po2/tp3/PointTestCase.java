package ar.ede.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

	
public class PointTestCase{
	private Point primero ;
	private Point segundo;
	private Point origen;
	
	
	@BeforeEach
	public void setUP() throws Exception {
		primero = new Point(4,5);
		segundo = new Point(7,2);
		origen = new Point();
	}
	
	@Test
	public void testPuedoObtenerX() {
		float amount = primero.getX();
		assertEquals(amount,4);
	}
	
	@Test
	public void testPuedoObtenerY() {
		float amount = primero.getY();
		assertEquals(amount,5);
	}
	
	@Test
	public void testPuntoOrigen() {
		float x = origen.getX();
		float y = origen.getY();
		assertEquals(x,0);
		assertEquals(y,0);
	}

	@Test
	public void testSumaDePuntos() {
		Point suma = primero.sumaCon(segundo);
		float x = suma.getX();
		float y = suma.getY();
		assertEquals(x,11);
		assertEquals(y,7);
	}
}