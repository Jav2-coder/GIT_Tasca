package net.jimenez;

import java.util.Scanner;
import java.util.*;

public class ExerciciGIT {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		Scanner lector = new Scanner(System.in);

		System.out.print("Escriu una frase: ");
		
		String frase = lector.nextLine();
		
		frase = frase.toLowerCase();
		
		frase = frase.replace(" ", "");
		
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
		
		lector.close();	
	}
}
