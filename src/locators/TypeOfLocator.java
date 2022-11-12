package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocator {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
//	 id locator
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys("Mobile phone");
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		
		
//		WebElement	searchbutton = driver.findElement(By.className("nav-input nav-progressive-attribute"));
		
		searchbutton.click();
		
//		class locator
		
		
		
		
	}

}
