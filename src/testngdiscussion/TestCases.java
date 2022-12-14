package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCases {
	
	 WebDriver driver;
	 
		@Test(priority = 1)
		public void navToLoginScreen()
		{
			 driver = new ChromeDriver();
			 		
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
			Actions act = new Actions(driver);
			
			act.moveToElement(hoverelement).perform();
		
		}
		
		@Test(priority = 2)
		public void loginToApp()
		{
			driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']")).click();
			
			driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("abc123@hotmail.com");
		}

}
