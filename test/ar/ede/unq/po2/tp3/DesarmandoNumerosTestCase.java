package ar.ede.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class DesarmandoNumerosTestCase {
	private int[] arregloDeEnteros = new int[20];

	@BeforeEach
	public void setUP() throws Exception {
		 arregloDeEnteros[0] = 10;
		 arregloDeEnteros[1] = 22;
		 arregloDeEnteros[2] = 346;
		 arregloDeEnteros[3] = 4468;
		
	}
	
	public int desarmarNumeros(int[] ns) {
		int resultado = ns[0];
		for(int entero:ns) {
			if (cantPares(resultado) < cantPares(entero)) {
				resultado = entero;
			}
		}
		return resultado;
	}
	
	public int cantPares(int x) {
		int pares = 0;
		int divisor = 2;
		while (divisor < x ) {
			if ( x % divisor == 0) {
				pares ++;
			}
			divisor = divisor * 10;
			x = x - (x % divisor);
		}
		return pares;
	}

	
	@Test
	public void testDesarmarNumeros(){
		int amount =  desarmarNumeros(arregloDeEnteros) ;
		assertEquals(amount,4468);
	}

}