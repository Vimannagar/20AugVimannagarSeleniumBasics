package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));

		
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	
	
		Actions act = new Actions(driver);
		
//		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		
		act.dragAndDrop(drag, drop).perform();
	
	
	}

}
