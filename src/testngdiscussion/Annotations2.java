package testngdiscussion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	

	
	@Test
	public void testCase3()
	{
		System.out.println("Test case 3");
	}
	
	
	
}
