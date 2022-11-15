package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocator3 {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
//		By linkText locator
		
		WebElement link = driver.findElement(By.linkText("Already have an account?"));
	
		link.click();
		
//		WebElement signuplink = driver.findElement(By.linkText("Sign up for Facebook"));
//			
//		signuplink.click();
		
		
//		By partialLinkText():
		
		WebElement signuplink2 = driver.findElement(By.partialLinkText("Sign up fo"));
		
		signuplink2.click();
		
		
		
//		By tagname():
		
		 driver.findElement(By.tagName("input"));
		
		
		 
		 
		
	
	}

}
