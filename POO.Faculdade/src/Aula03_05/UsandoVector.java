package Aula03_05;

import java.util.Vector;

@SuppressWarnings("unchecked")
public class UsandoVector {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Vector nomes = new Vector();

		nomes.add("Maria");
		nomes.add("João");

		@SuppressWarnings("rawtypes")
		Vector numDouble = new Vector();

		numDouble.add(3.4);

		@SuppressWarnings("rawtypes")
		Vector numInt = new Vector();

		numInt.add(56);
		
		String[] nomes2 = new String[nomes.size()];

		nomes.copyInto(nomes2);
		
		//==============================

		for (String aux : nomes2) {

			System.out.println(aux);
		}

		double varNumDouble = (double) numDouble.get(0);

		System.out.println(varNumDouble);
		System.out.println("Ceil: "+Math.ceil(varNumDouble)+"\nFloor: "+Math.floor(varNumDouble));

		int varNumInt = (int) numInt.get(0);

		System.out.println(varNumInt);

	}

}
