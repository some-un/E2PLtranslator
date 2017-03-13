package testp;

import static org.junit.Assert.*;

//import mainsrcp.MainProjectClass;
//import mainsrcp.AClassVersion01;

import mainsrcp.AClassVersion01;
import mainsrcp.MainProjectClass;

import org.junit.Test;


public class TestV01 {

	@Test
	public void testV01method01() {
		assertEquals(MainProjectClass.constantPigLatinOutputForV01, AClassVersion01.v01method01("any_word"));
		//assertEquals("No", AClassVersion01.v01method01("any_word"));
		System.out.println("Done with testV01method01");
	}
	
	@Test
	public void testNotTranslateAllCapitals() {
		assertEquals(MainProjectClass.noCapitalsSupportReturnString,
				AClassVersion01.translateFromEnToPL(MainProjectClass.allCapitalsWord));
		//assertEquals("No", AClassVersion01.v01method01("any_word"));
		System.out.println("Done with testNotTranslateAllCapitals");
	}
	
	@Test
	public void testNotVowels() {
		assertEquals(MainProjectClass.noSupportVowelsReturnString,
				AClassVersion01.translateFromEnToPL(MainProjectClass.BeginwithVowels));
		System.out.println("Done with testNotVowels");
	}

        @Test
	public void testNotTranslateCertainWords() {
	    assertEquals(MainProjectClass.noSupportForCertainWords,
			 AClassVersion01.translateFromEnToPL(MainProjectClass.aCertainWord));
	    System.out.println("Done with testNotTranslateCertainWords");
	}
}
