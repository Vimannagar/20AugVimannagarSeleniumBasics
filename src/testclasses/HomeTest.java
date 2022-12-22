package testclasses;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest
{
	
	@Test(priority = 3)
	public void verifySearch()
	{
		homepage.searchProduct();
	}

}
