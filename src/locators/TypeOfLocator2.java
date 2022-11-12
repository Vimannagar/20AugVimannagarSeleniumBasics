package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocator2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
//		By name locator
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("Velocity");
		
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("sgjhgdagdasd");
	
//		By class locator
		WebElement forgotlink = driver.findElement(By.className("orangehrm-login-forgot"));

		forgotlink.click();
	
	}

}
