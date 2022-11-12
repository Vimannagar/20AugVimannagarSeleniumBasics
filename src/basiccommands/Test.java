package basiccommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main(String[] args) {
		
		
		String browser = "Edge";
		
		WebDriver driver;
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			 driver = new FirefoxDriver();
		}
		
		
	}

}
