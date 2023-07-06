package dataproviderconcept;

import org.testng.annotations.Test;

public class DpTest {

	@Test(dataProvider = "testdata", dataProviderClass = dataproviderconcept.DpClass.class)
	public void testCase(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

}
