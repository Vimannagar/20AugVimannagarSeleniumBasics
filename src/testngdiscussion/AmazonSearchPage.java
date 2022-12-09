package testngdiscussion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonSearchPage extends AmazonLoginPage
{
	
	
	@Test
	public void searchProduct()
	{
		driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']")).click();
		
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("abc123@hotmail.com");
	}

}
