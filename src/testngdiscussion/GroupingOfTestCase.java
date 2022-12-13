package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase {
	@Test(groups = "sanity")
	public void login()
	{
		System.out.println("Login test case");
	}
	
	@Test(groups = "functional")
	public void home()
	{
		System.out.println("home test case");
	}
	
	
	@Test(groups = "sanity")
	public void timeline()
	{
		System.out.println("timeline test case");
	}
	
	@Test(groups = "Regression")
	public void profile()
	{
		System.out.println("profile test case");
	}
	
	@Test(groups = "sanity")
	public void logout()
	{
		System.out.println("logout test case");
	}
	
	@Test
	public void closeBrowser()
	{
		System.out.println("Close browser testcase");
	}


}
