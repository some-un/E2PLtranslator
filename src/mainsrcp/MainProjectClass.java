package mainsrcp;


import java.util.Scanner;

public class MainProjectClass {
	public static final String constantPigLatinOutputForV01 = "ello-hay";
	public static final String allCapitalsWord = "WASPIE";
	public static final String noCapitalsSupportReturnString = "We do not support all-capitals words in this translator.";
	public static final String beginWithVowels = "autonomous system";
	public static final String noSupportVowelsReturnString = "We don't go for the autonomous systems.";
	public static String ShortWord = "ros";
	public static final String noSupportShortWordssReturnString = "Sorry, we do not support words shorter than 5 characters!";
    public static final String noSupportForCertainWords = "We do not support translation of this word, sorry dude.";
    public static final String aCertainWord = "WASP";
    public static final String translationSuffix = "_" + aCertainWord;
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