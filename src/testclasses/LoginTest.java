package testclasses;

import org.testng.annotations.Test;



public class LoginTest extends BaseTest {
	
	
	@Test
	public void verifyLogin()
	{
		loginpage.enterUsername();
		
		loginpage.enterPassword();
		
		loginpage.clickOnSignIn();
	}

}
