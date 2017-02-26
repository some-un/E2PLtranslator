/**
 * 
 */
//package main;

import java.util.Scanner;

/**
 * @author some-un
 *
 */
public class Version01 {
	private static final String constantPigLatinOutputForV01 = "ello-hay";
	
	public static String v01method01(String word) {

	    System.out.println(String.format("You said: %s", word));
	    
	    // Print the constant word in Pig Latin (v0.1)
	    System.out.println(String.format("The Pig says: %s", getConstantpiglatinoutputforv01()));
	    
	    return getConstantpiglatinoutputforv01();
	}

	public static String getConstantpiglatinoutputforv01() {
		return constantPigLatinOutputForV01;
	}

}
