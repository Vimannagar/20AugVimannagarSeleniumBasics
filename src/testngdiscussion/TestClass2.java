package testngdiscussion;

import org.testng.annotations.Test;

public class TestClass2 extends TestClass1 {

	@Test(priority = 4)
	public void profile()
	{
		System.out.println("profile test case");
	}
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("logout test case");
	}
	
	
	
	
}
