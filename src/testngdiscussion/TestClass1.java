package testngdiscussion;

import org.testng.annotations.Test;

public class TestClass1 {
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
	}
	
	@Test(priority = 2)
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(priority = 3)
	public void timeline()
	{
		System.out.println("timeline test case");
	}
	
	
	
	
}
