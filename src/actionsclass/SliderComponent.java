package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderComponent {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");

		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));

//		To switch inside an iframe

		driver.switchTo().frame(frame);

		WebElement sliderknob = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		Actions act = new Actions(driver);
		
		act.clickAndHold(sliderknob).moveByOffset(200, 0).release().build().perform();

		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//*[text()='Droppable']")).click();
		
		
	}

}
