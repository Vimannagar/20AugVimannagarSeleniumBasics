package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleTestCaseInMultipleBrowser {
	
	
	@Parameters("webbrowser")
	@Test
	public void testCase(String browser)
	{		
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
		WebDriver driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
		WebDriver driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please check the name of browser");
		}
		
			
	}

}
