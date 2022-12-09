package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	
	
	@Test(dependsOnMethods = "testngdiscussion.DependsOnMethodsKeyword.profile")
	public void updateProfile()
	{
		System.out.println("update profile");
	}
	
	
	@Test
	public void tearDown()
	{
		System.out.println("Shutdown the browser");
	}
	
	

}
