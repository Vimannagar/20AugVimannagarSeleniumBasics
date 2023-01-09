package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
		
	@FindBy(xpath = "//*[@id='twotabsearchtextbox123']")
	WebElement searchtextbox ;
	
	@FindBy(xpath ="//*[@id='nav-search-submit-button']")
	WebElement searchbutton;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchProduct()
	{
		searchtextbox.sendKeys("Mobile phone");
		
		searchbutton.click();
	}

}
