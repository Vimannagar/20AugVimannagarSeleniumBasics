package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationOfTestCase {
	
	@Parameters("webbrowser1")
	@Test
	public void chromeTestCase(String browser)
	{
		
		
		
		
		System.out.println(browser);
		if(browser.equals("Chrome"))
		{
		WebDriver driver = new ChromeDriver();
		
		}
		else
		{
			System.out.println("no match found");
		}
	
	}
	
	
	@Parameters({"webbrowser2", "environment"})
	@Test
	public void edgeTestCase(String browser, String env)
	{
		System.out.println(browser);
		System.out.println("Env value is "+env);
		if(browser.equals("edge"))
		{
		WebDriver driver = new EdgeDriver();
		
		}
		else
		{
			System.out.println("no match found");
		}
	
	}
	
	

}
