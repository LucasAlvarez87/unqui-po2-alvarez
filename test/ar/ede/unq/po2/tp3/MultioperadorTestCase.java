package ar.ede.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class MultioperadorTestCase {
	private Multioperador multioperador;
	private ArrayList<Integer> enteros = new ArrayList<Integer>();
			
	@BeforeEach
	public void setUP() throws Exception {
		multioperador = new Multioperador();
		enteros.add(1);
		enteros.add(3);
		enteros.add(5);
		enteros.add(7);
		enteros.add(9);
		enteros.add(1);
		enteros.add(1);
		enteros.add(1);
		enteros.add(1);
		enteros.add(4);
	}
	
	@Test
	public void testDeLaSumas() {
		int amount = multioperador.suma(enteros);
		assertEquals(amount,33);
	}
	
	@Test
	public void testDeLaResta() {
		int amount = multioperador.resta(enteros);
		assertEquals(amount,-33);
	}
	
	@Test 
	public void testDeLaMultiplicacion() {
		int amount = multioperador.producto(enteros);
		assertEquals(amount,3780);
	}
}
