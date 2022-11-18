package dropdownhandlin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllElementsOfDropDown {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		
		List<WebElement> allmonths = driver.findElements(By.xpath("//*[@id='month']//option"));
	
		for(WebElement month:allmonths)
		{
			String value = month.getText();
			
			System.out.println(value);
		}
		
		
		
	}

}
