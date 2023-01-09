package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoIbibo {
	
	@Test
	public void enterCityName()
	{
		WebDriver  driver = new ChromeDriver();
	 		
			driver.manage().window().maximize();
			
			driver.get("https://www.goibibo.com/");
					
			WebElement fromfield = driver.findElement(By.xpath("(//*[@data-id='flt-srch-wdgt']/descendant::p[text()='Enter city or airport'])[1]"));
		
			
			fromfield.click();
	}

}
