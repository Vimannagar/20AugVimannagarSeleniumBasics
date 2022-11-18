package dropdownhandlin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionHandlin {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> searchsuggestions = driver.findElements(By.xpath("//*[@jsname='bw4e9b']//div[@class='eIPGRd']//span[text()='selenium']"));
		
		
//		for(WebElement suggestion:searchsuggestions)
//		{
//			String actualvalue= suggestion.getText();
//			
//			System.out.println(actualvalue);
//		}
		
		int noOfSuggestions = searchsuggestions.size();
		
		System.out.println(noOfSuggestions);
		
		
		for(int i = 0; i<noOfSuggestions; i++)
		{
			WebElement element = searchsuggestions.get(i);
			
			String value = element.getText();
			
			System.out.println(value);
		}
		
		
		
	}

}
