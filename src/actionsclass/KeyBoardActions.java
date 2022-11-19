package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		WebElement searchfield = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	
		Actions act = new Actions(driver);
		
		act.click(searchfield)
		.sendKeys("Mobile phones")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)												
		.sendKeys(Keys.ENTER)
		.build().perform();
	
		
		
	
	}

}
