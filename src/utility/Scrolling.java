package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public void scrollToElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll by pixel value

		// js.executeScript("window.scrollBy(0, 1000)");

		WebElement element = driver.findElement(By.xpath("//*[text()='Switch Class']"));

//		scroll over the element

		js.executeScript("arguments[0].scrollIntoView();", element);

	}

}
