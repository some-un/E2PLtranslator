import static org.junit.Assert.*;

import org.junit.Test;


public class TestV01 {

	@Test
	public void testV01method01() {
		assertEquals(Version01.getConstantpiglatinoutputforv01(), Version01.v01method01("any_word"));
		System.out.println("Done with testV01method01");
	}

}
