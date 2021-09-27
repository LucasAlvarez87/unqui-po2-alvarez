package ar.ede.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

	
public class RectanguloTestCase{
	private Point puntoOrigen ;
	private Rectangulo rectangulo;
	
	@BeforeEach
	public void setUP() throws Exception {
		puntoOrigen = new Point();
		rectangulo = new Rectangulo(puntoOrigen,4,7);
		
	}

	@Test
	public void seCreaDeFormaApropiada() {
		float alto = rectangulo.getAlto();
		float ancho = rectangulo.getAncho();
		assertEquals(alto,4);
		assertEquals(ancho,7);
	}
	
	@Test
	public void obtenerElAreaTest() {
		float area = rectangulo.area();
		assertEquals(28,area);
	}
	
	@Test
	public void obtenerElPerimetroTest() {
		float perimetro = rectangulo.perimetro();
		assertEquals(22,perimetro);
	}
	
	@Test
	public void esHorizontalTest() {
		assertTrue(rectangulo.esHorizontal());
	}
	
	@Test
	public void esVerticalTest() {
		assertFalse(rectangulo.esVertical());
	}
	
}