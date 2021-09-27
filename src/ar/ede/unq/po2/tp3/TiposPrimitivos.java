package ar.ede.unq.po2.tp3;

public class TiposPrimitivos {
	
	/*
	1. En java, los tipos primitivos son un tipo de dato heredado de lenguajes de programacion no orientada a objetos, como puede ser el C.

	Tienen ciertas particularidades, que no comparten con otras clases mas complejas, como por ejemplo que no necesitan ser declarados.
	
	2.Int es un tipo primitivo mientras que Integer es un tipo de clase

	*/
	
	static int a;
	static Integer b;
	
	
	/*public static void main(String[] args) {
		System.out.print(a);
		System.out.print(b);
	}
	
	 * 3.Si se instancia una variable de tipo int su valor predeterminado es 0 mientras que la de Integer es null
	 */
	
	public static int valorDeMetodoInt() {
		int a;
		return a;
	}
	
	public static Integer valorDeMetodoInteger() {
		Integer b;
		return b;
	}
	
	public static void main(String[] args) {
		System.out.print(valorDeMetodoInt());
		System.out.print(valorDeMetodoInteger());
	}
	
	//4. causa un error
}
