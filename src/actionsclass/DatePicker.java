package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/datepicker/");
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		while(true)
		{
		
		String monthyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
		System.out.println(monthyear);
		
		if(!(monthyear.equals("September 2021")))
		{
			driver.findElement(By.xpath("//*[@title='Prev']")).click();
		}
		else
		{
			break;
		}
		
		}
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']//*[text()='9']")).click();
		
		
		
	}

}
