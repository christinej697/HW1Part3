package hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String[] args) {
		
		try {
			//Construct scanner object with new File() for file input
			Scanner sc = new Scanner(new File("input.txt"));
			//Print out text
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
		//check that file can be located
		}catch(FileNotFoundException exc) {
			System.out.println("There was a problem opening the input file");
		}
	
	}
}
