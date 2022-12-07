package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
	}
	
	@Test(priority = 3)
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(priority = 3)
	public void timeline()
	{
		System.out.println("timeline test case");
	}
	
	@Test(priority = -40)
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
