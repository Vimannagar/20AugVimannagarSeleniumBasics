package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLoginPage {
	
	 WebDriver driver;
	 
	@Test
	public void login()
	{
		 driver = new ChromeDriver();
		 		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(hoverelement).perform();
	
	}
	
	
	

}
