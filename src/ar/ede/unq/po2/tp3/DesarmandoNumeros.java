package ar.ede.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class DesarmandoNumeros {
	
	int[] arregloDeEnteros = new int[] {12,14,55,36,46,126,468,8462,21,11};

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

}


