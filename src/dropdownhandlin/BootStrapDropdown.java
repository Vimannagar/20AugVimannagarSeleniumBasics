package dropdownhandlin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShot;

public class BootStrapDropdown {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://paytm.com/recharge");
		
//		driver.findElement(By.xpath("(//div[@class='dfy8']//div//ul//li//input)[2]")).click();
	
		
		driver.findElement(By.xpath("//*[@class='_1exI']//*[@type='text']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='_3xI1']//li//span[text()='BSNL']")).click();
		
		
		ScreenShot.captureScreenshot(driver, "paytmrecharge");
		
		
		
	
	}

}
