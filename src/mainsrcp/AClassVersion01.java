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
	    
	    return MainProjectClass.constantPigLatinOutputForV01 + MainProjectClass.translationSuffix;
	}

	public static String translateFromEnToPL(String ENword) {
		String translation = "TODO";
		//MainProjectClass.aCertainWord;
		if (ENword.equals(MainProjectClass.aCertainWord)) {
			translation = MainProjectClass.noSupportForCertainWords;
			return translation + MainProjectClass.translationSuffix;
		}
		if (StringUtils.isAllUpperCase(ENword)) {
			translation = MainProjectClass.noCapitalsSupportReturnString;
			return translation + MainProjectClass.translationSuffix;
		}
		if (ENword.length() < 5) {
			translation = MainProjectClass.noSupportShortWordssReturnString;
			return translation + MainProjectClass.translationSuffix;
		}
		char[] vowels_in_English = {'a', 'e', 'i', 'o', 'u'};
		char firstChar = ENword.charAt(0);
		for (int i = 0; i < vowels_in_English.length; i++)
		{
			if (firstChar == vowels_in_English[i]) {
				translation = MainProjectClass.noSupportVowelsReturnString;
				return translation + MainProjectClass.translationSuffix;
			}
			else return translation + MainProjectClass.translationSuffix;
		}
		return translation + MainProjectClass.translationSuffix;
	}
	
}
