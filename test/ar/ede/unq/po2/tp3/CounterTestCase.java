package ar.ede.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

	
public class CounterTestCase{
	private Counter counter;
	
	@BeforeEach
	public void setUP() throws Exception {
		counter = new Counter();
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		assertEquals(amount,1);
	}

	@Test
	public void testOddNumbers() {
		int amount = counter.getOddOcurrences();
		assertEquals(amount,9);
	}
	
	@Test 
	public void testMultiplesOf() {
		int amount = counter.getMultiplesOff(3);
		assertEquals(amount,2);
	}
}
