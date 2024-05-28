package exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MusikNoten {
	
	private static final Pattern notes = Pattern.compile(
			"C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'"
			);
	

	public static void main(String[] args) {
		String file = "music.txt";
		String fileName = "writeDoc.txt";
		
		try {
			Scanner sc = new Scanner(Paths.get(file));
			PrintWriter writer = new PrintWriter (fileName);
			writer.write("M:C \n");
			writer.write("L:1/4 \n");
			writer.write("K:C \n");
			while(sc.hasNextLine()){
				String line = sc.nextLine().trim();
				if(!line.isEmpty()) {
					if(notes.matcher(line).matches()) {
						writer.print(line + " ");
					}
				}
			}	sc.close();
				writer.close();
			
			} catch(IOException e) {
				System.out.println("Fehler");
			
		}
					
		

	}

}

