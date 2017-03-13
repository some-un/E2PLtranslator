package testp;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.Random;

//import mainsrcp.MainProjectClass;
//import mainsrcp.AClassVersion01;

import mainsrcp.AClassVersion01;
import mainsrcp.MainProjectClass;

import org.junit.Test;


public class TestV01 {

	@Test
	public void testV01method01() {
		assertEquals(MainProjectClass.constantPigLatinOutputForV01 + MainProjectClass.translationSuffix, AClassVersion01.v01method01("any_word"));
		//assertEquals("No", AClassVersion01.v01method01("any_word"));
		System.out.println("Done with testV01method01");
	}
	
	@Test
	public void testNotTranslateAllCapitals() {
		assertEquals(MainProjectClass.noCapitalsSupportReturnString + MainProjectClass.translationSuffix,
				AClassVersion01.translateFromEnToPL(MainProjectClass.allCapitalsWord));
		//assertEquals("No", AClassVersion01.v01method01("any_word"));
		System.out.println("Done with testNotTranslateAllCapitals");
	}
	
	@Test
	public void testNotVowels() {
		assertEquals(MainProjectClass.noSupportVowelsReturnString + MainProjectClass.translationSuffix,
				AClassVersion01.translateFromEnToPL(MainProjectClass.beginWithVowels));
		System.out.println("Done with testNotVowels");
	}
	
	@Test
	public void testNotShortWords() {
		assertEquals(MainProjectClass.noSupportShortWordssReturnString + MainProjectClass.translationSuffix,
				AClassVersion01.translateFromEnToPL(MainProjectClass.ShortWord));
		System.out.println("Done with testNotShortWords");
	}

  @Test
	public void testNotTranslateCertainWords() {
	    assertEquals(MainProjectClass.noSupportForCertainWords + MainProjectClass.translationSuffix,
			 AClassVersion01.translateFromEnToPL(MainProjectClass.aCertainWord));
	    System.out.println("Done with testNotTranslateCertainWords");
	}
  
  @Test
	public void testExtendThePigLatinRules() {
	  int testIterationsCount = 1000;
	  Random rand = new Random();
	  int stringMaxLen = 15;
	  int stringLen = -1;
	  for (int i = 0; i < testIterationsCount; i++) {
		  stringLen= rand.nextInt(stringMaxLen) + 1;
		  String pigLatinTranslation = AClassVersion01.translateFromEnToPL(getRandomStringOfLength(stringLen));
		    assertTrue("The returned translation did not contain WASP name :(",
		    		pigLatinTranslation.contains(MainProjectClass.aCertainWord));
	  }
	    System.out.println("testExtendThePigLatinRules");
	}
  
  /*
   *   Below you'll find a test API for some of the tests we run.
   *   The API consists of some utility functions to make tests more interesting.
   */
  
  public String getRandomStringOfLength(int randomStringLength) {
	  byte[] array = new byte[randomStringLength]; // length is bounded by 7
	  new Random().nextBytes(array);
	  String generatedString = new String(array, Charset.forName("UTF-8"));
	  //
	  return generatedString;
  }
  
}
