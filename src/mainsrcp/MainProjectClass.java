package mainsrcp;


import java.util.Scanner;

public class MainProjectClass {
	public static final String constantPigLatinOutputForV01 = "ello-hay";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    // create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    //  prompt for the word
	    System.out.print("Enter the word in English: ");

	    // get the input as a String
	    String inputString = scanner.next();
	    scanner.close(); // prevent resource leak
	    
	    // Invoke the method for v0.1
	    String s = AClassVersion01.v01method01(inputString);

	}

}
