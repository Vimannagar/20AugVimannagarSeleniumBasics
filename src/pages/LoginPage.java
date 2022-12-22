package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
private	WebDriver driver;

private	By hoverelement = By.xpath("//*[@id='nav-link-accountList']");
	
private	By signinhover = By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']");

private	By mobilenumber = By.xpath("//*[@id='ap_email']");

private	By continueformobile = By.xpath("//*[@type='submit']");

private	By password = By.xpath("//*[@id='ap_password']");

private	By finalsignin = By.xpath("//*[@id='signInSubmit']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void enterUsername()
	{
		Actions act = new Actions(driver);
		
		WebElement element = driver.findElement(hoverelement);
		
		act.moveToElement(element).perform();
		
		driver.findElement(signinhover).click();
		
		driver.findElement(mobilenumber).sendKeys("8176867662");
		
		driver.findElement(continueformobile).click();
		
	}
	
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("123456");
		
		
	}
	
	public void clickOnSignIn()
	{
		driver.findElement(finalsignin).click();
	}
	
	
	public String getTitleOfPage()
	{
		String titleofpage = driver.getTitle();
		
		System.out.println(titleofpage);
		
		return titleofpage;
	
	}
	
	
	
	
}
