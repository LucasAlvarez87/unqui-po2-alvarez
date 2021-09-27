package ar.ede.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Counter {
	
	 private ArrayList<Integer> nums = new ArrayList<Integer>();
	
	 public int getEvenOcurrences() {
		 List<Integer> pares = nums.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
		 return pares.size();
	 }
	  
	
	 public int getOddOcurrences() {
		 List<Integer> impares = nums.stream().filter(integer -> integer % 2 != 0).collect(Collectors.toList());
		 return impares.size();
	 }
	 
	 public int getMultiplesOff(int x) {
		 List<Integer> multiplos = nums.stream().filter(integer -> integer % x == 0).collect(Collectors.toList());
		 return multiplos.size();
	 }

	
	 public void addNumber(int x) {
		 nums.add(x);
	 }


	public Counter() {
		super();
	}
	
}
