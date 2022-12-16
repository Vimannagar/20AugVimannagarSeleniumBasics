package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelMethodExecution {
	
	@Test
	public void navToAmazonUrl()
	{
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		
		boolean isdisp = cart.isDisplayed();
		
		Assert.assertFalse(isdisp);
		
	}
	
	@Test
	public void navToGoogle()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
		
		searchbox.sendKeys("India");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}
	
	@Test
	public void navToFacebook()
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstname.sendKeys("Velocity");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	
		lastname.sendKeys("Corporate");
		
		
//		contains()
		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
		
		mobilenumber.sendKeys("99888776655");
		
		
		
	}
	
	
	
	
	
	
	

}
