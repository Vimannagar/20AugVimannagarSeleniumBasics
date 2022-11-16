package basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomeMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));

		username.sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		String urlofcurrentpage = driver.getCurrentUrl();
		
		System.out.println(urlofcurrentpage);
		
		String titleofpage = driver.getTitle();
		
		System.out.println(titleofpage);
		

	}

}
