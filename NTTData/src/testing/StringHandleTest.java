package testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHandleTest {
	static StringHandle sh = null;

	@BeforeClass
	static public void createObject() {
		sh = new StringHandle();
		System.out.println("Object Created");
	}

	@Before
	public void displayMsg() {
		System.out.println("testing started!!!");

	}

	@Test
	public void testReverse() {
		System.out.println("test case 1");
		String actual = sh.reverseString("Pacchu");
		String expected = "uhccaP";
		assertEquals(actual, expected);
	}

	@Test
	public void testCaseChange() {
		System.out.println("test case 2");

		assertEquals(sh.caseChange("pacchu"), "PACCHU");

	}

	@After
	public void displayEndMsg() {
		System.out.println("testing for method ended");
	}

	@AfterClass
	static public void displayStopMsg() {
		System.out.println("All test cases run");

	}
}
