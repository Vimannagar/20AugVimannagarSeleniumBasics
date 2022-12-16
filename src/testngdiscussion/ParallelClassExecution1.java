package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelClassExecution1 {
	
static WebDriver driver;
	
	@Test(priority = 1)
	public void navToUrl()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		
		boolean isdisp = cart.isDisplayed();
		
		Assert.assertFalse(isdisp);
		
	}
	
	

	@Test(priority = 2)
	public void enterUsername()
	{
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));

		Actions act = new Actions(driver);

		act.moveToElement(hoverelement).perform();

		WebElement signinbutton = driver
				.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']"));
		signinbutton.click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='ap_email']"));
		
		email.sendKeys("8176867662");
		
		String enteredtext = email.getAttribute("value");
		
		Assert.assertEquals(enteredtext, "8176867662");
				
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
		
	}
	
	
	@Test(priority = 3)
	public void enterPassword()
	{
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	
	
	@Test(priority = 4)
	public void getTitleOfpage()
	{
		String title = driver.getTitle();
		
		boolean ispresent = title.contains("India");
		
		Assert.assertFalse(ispresent);
		
	}

}
