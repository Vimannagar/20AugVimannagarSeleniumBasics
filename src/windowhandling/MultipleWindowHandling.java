package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		
		Set<String> allwinid = driver.getWindowHandles();
		
		int numberofwindow = allwinid.size();// to get the count of number of window
		
		String [] id = new String [numberofwindow];
		
		
		int i =0;
		for(String winid :allwinid)
		{
			id[i]= winid;
			
			i++;
		}
		
		
		driver.switchTo().window(id[2]);
		
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("text to search");
		
		
		
	}

}
