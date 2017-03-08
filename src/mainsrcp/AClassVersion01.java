package mainsrcp;

import org.apache.commons.lang3.StringUtils;
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

	public static String translateFromEnToPL(String ENword) {
		if (StringUtils.isAllUpperCase(ENword))
			return MainProjectClass.noCapitalsSupportReturnString;
		char[] vowels_in_English = {'a', 'e', 'i', 'o', 'u'};
		char firstChar = ENword.charAt(0);
		for (int i = 0; i < vowels_in_English.length; i++)
		{
			if (firstChar == vowels_in_English[i])
				return MainProjectClass.noSupportVowelsReturnString;
			else return "TODO";
		}
		return "TODO";
	}
	
}
