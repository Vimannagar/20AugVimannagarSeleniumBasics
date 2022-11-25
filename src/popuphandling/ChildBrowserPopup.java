package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
	
			driver.manage().window().maximize();
	
			driver.get("https://groww.in/");
	
			driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
	
			Thread.sleep(2000);
	
			driver.findElement(By.xpath("//div//*[text()='Continue']")).click();
		}
	
	}
