package net.jimenez;

import java.util.Scanner;
import java.util.*;

//Copia del projecte 1

public class ExerciciGIT {
	
	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		Scanner lector = new Scanner(System.in);

		System.out.print("Escriu una frase: ");
		
		String frase = lector.nextLine();
		
		System.out.println();
		
		frase = frase.toLowerCase();
		
		frase = frase.replace(" ", "");
		
		int numeric = 0;
		
		for ( int i = 0; i < frase.length(); i++ ) {
		
			if ((int)frase.charAt(i) > 47 && (int)frase.charAt(i) < 58 ){
				
				numeric++;
				
			}	
		}
		
		for ( int i = 0; i < frase.length(); i++ ) {
			
			if (map.containsKey(frase.charAt(i))) {
				
				map.put(frase.charAt(i), map.get(frase.charAt(i)) + 1);
			
			} else {
				
				map.put(frase.charAt(i), 1);
				
			}
		}
		
        Set<Map.Entry<Character, Integer>> freq = map.entrySet();
		
		Iterator<Map.Entry<Character, Integer>> objecte = freq.iterator();
		
		while (objecte.hasNext()) {
			
			Map.Entry<Character, Integer> conjunt = objecte.next();
			
			System.out.println("Caràcter " + conjunt.getKey() + 
					" repetit " + conjunt.getValue() + " vegades.");
		}
		
		System.out.println();
		System.out.println("Hi ha un total de " + numeric + " caràcters que no son lletres dins la frase.");
		
		lector.close();	
	}
	
}
