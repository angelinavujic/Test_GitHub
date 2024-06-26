package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	//private - Sichtbarkeitsbereich auf Klasse beschr�nkt
	//static - von der Klasse abh�ngig und nicht vom Objekt
	//final - variable nach Initialisierung unver�nderbar
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Menlanzani"
			);
	
	public static void insertCheeseAroungVegetables(List<String>ingredients) {
		for(ListIterator<String>iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingredient = iterator.next();
			//matcher -> wird verwendet, um ingredient in unserem Muster zu finden
			//matches() -> f�r den direkten Vergleich
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
		}
	}
	
	public static void main(String[]args) {
		List<String>ingredients = new LinkesdList<String>();
		Collections.addAll(ingredients, "Gnocchi", "Paprika", "Tomate", "Pfeffer","Melanzani");
		insertCheeseAroungVegetables(ingredients);
		System.out.println(ingredients);
	}

}
