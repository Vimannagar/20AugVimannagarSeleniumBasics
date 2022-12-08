package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethodsKeyword {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		throw new NullPointerException();
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(priority = 3, dependsOnMethods = {"home", "login"})
	public void timeline()
	{
		System.out.println("timeline test case");
		
		
	}
	
	@Test(priority = 4, dependsOnMethods = "timeline")
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
