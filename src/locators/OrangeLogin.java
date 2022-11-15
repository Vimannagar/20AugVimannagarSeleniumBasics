package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		
		username.sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(4000);
//		Clicking on Admin tab
		
		driver.findElement(By.xpath("(//*[@class='oxd-main-menu-item'])[1]")).click();
		
		Thread.sleep(2000);
		
	List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
	
		
			for(WebElement checkbox:checkboxes)
			{
				checkbox.click();
			}
	
	}	
	
	

}
