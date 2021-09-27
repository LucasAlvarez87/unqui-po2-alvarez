package ar.ede.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
		
	public int suma(ArrayList <Integer> ns) {
		int s = 0;
		for(Integer entero:ns) {
			s += entero;
		}
		return s;
	}
	
	public int resta (ArrayList <Integer> ns) {
		int r=0;
		for(Integer entero:ns) {
			r -= entero;
		}
		return r;
	}
	
	public int producto (ArrayList <Integer> ns) {
		int p=1;
		for(Integer entero:ns) {
			p *= entero;
		}
		return p;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
