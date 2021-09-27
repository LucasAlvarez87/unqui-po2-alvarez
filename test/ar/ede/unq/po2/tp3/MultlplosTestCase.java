package ar.ede.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MultlplosTestCase {
	
	
	@BeforeEach
	public void setUP() throws Exception {
			
	}
	
	public int mayorMultiplo(int x, int y) {
		int r = -1;
		for(int i = 1; i <= 1000; i++) {
			if ( (i % x == 0) && (i % y == 0) ) {
				r = i;
			}
		}
		return r;
	}
	

	
	@Test
	public void testMultiplos(){
		int amount = mayorMultiplo(3,9);
		assertEquals(amount,999);
	}

}

