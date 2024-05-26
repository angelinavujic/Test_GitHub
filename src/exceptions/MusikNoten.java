package exceptions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class MusikNoten {
	
	

	public static void main(String[] args) {
		String file = "bspfile.txt";
		try {
			Scanner sc = new Scanner(Paths.get(file));
			while(sc.hasNextLine()){
			}
			} catch(IOException e) {
				System.out.println("a, c, d");
			}
					
		

	}

}

