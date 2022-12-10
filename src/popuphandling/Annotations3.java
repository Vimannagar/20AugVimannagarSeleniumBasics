package popuphandling;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	
	@Test
	public void testCase4()
	{
		System.out.println("Test case 4");
	}
	

}
