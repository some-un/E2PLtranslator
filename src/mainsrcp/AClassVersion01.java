package mainsrcp;
/**
 * 
 */
//package main;


/**
 * @author some-un
 *
 */
public class AClassVersion01 {
	
	public static String v01method01(String word) {

	    System.out.println(String.format("You said: %s", word));
	    
	    // Print the constant word in Pig Latin (v0.1)
	    System.out.println(String.format("The Pig says: %s", MainProjectClass.constantPigLatinOutputForV01));
	    
	    return MainProjectClass.constantPigLatinOutputForV01;
	}
}
