package basiccommands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class EnterDataUsingExcelSheet {
	
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		ExcelReader er = new ExcelReader();
		
		String firstname = er.readData(2, 0);
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(er.readData(2, 1));
	}
	
	

}
