

import java.util.Scanner;

public class MainProjectClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String constantPigLatinOutputForV01 = "ello-hay";
		
	    // create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    //  prompt for the word
	    System.out.print("Enter the word in English: ");

	    // get the input as a String
	    String inputString = scanner.next();
	    
	    // Invoke the method for v0.1
	    String s = Version01.v01method01(inputString);

	}

}
