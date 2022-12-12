package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDiscussion {
	WebDriver driver;
	
	@Test
	public void validateText()
	{
	 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		firstname.sendKeys("text to be written");
		
		String actualtypedtext = firstname.getAttribute("value");
		
		System.out.println(actualtypedtext);
		
		boolean ispresent = actualtypedtext.contains("too");
		
		Assert.assertEquals(ispresent, true);
		
		System.out.println("Test case got completed");
		
		
	}
	
	@Test
	public void verifyTitle()
	{
	String titleofpage = driver.getTitle();
	
	System.out.println(titleofpage);//Sign up for Facebook | Facebook
	
	Assert.assertEquals(titleofpage, "Sign up for Facebook | Facebook");
	}
	
	@Test
	public void verifyTextDisplayed()
	{
		WebElement text = driver.findElement(By.xpath("//*[text()='Create a new account']"));
	
		
		boolean isdisp = text.isDisplayed();
		
		Assert.assertTrue(isdisp, "Test case failed please raise a bug");
		
	
	
	}
	

}
