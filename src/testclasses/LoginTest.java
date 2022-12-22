package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest {
	
	
	@Test(priority = 2)
	public void verifyLogin()
	{
		loginpage.enterUsername();
		
		loginpage.enterPassword();
		
		loginpage.clickOnSignIn();
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String title = loginpage.getTitleOfPage();
		
		boolean ispresent = title.contains("Shopping");
		
		Assert.assertEquals(ispresent, true);
	}

}
