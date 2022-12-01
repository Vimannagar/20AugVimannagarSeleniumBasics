package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleWindowHandling {
	
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		String parentid2 = driver.getWindowHandle();
		
		System.out.println(parentid2);
		
		
		
		Set<String> allwinid = driver.getWindowHandles();
		
		
		for(String winid:allwinid)
		{
			if(!(winid.equals(parentid)))
			{
				driver.switchTo().window(winid);
			}
			System.out.println(winid);
		}
		
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("text to search");
		
		
		driver.switchTo().window(parentid);
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("lastname");
		
		
	}

}
