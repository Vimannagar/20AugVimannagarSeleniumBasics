package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.webaudio.WebAudio;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarouselHandiling {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement carouselElement = driver.findElement(By.xpath("(//*[@class='_2a3TMW'])[6]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.visibilityOf(carouselElement));
		
		carouselElement.click();
		
	}

}
